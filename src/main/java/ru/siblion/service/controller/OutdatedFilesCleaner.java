package ru.siblion.service.controller;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.*;
import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.SQLException;
import java.util.Date;

@Singleton
@Startup
public class OutdatedFilesCleaner {

    @Resource
    private TimerService timerService;

    @Inject
    private DataBaseManager dataBaseManager;

    @PostConstruct
    private void setCleaningTimer() {
        try {
            PropertiesConfiguration conf = new PropertiesConfiguration("resources/application.properties");
            long intervalValueMs = (conf.getLong("CleaningIntervalInHours") * 3600000);
            Timer timer = timerService.createIntervalTimer(0, intervalValueMs, new TimerConfig());
        } catch (ConfigurationException ignored) {

        }
    }


    @Timeout
    public void cleanOutdatedFiles() {
        try {
            PropertiesConfiguration conf = new PropertiesConfiguration("resources/application.properties");
            String filesDirectory = conf.getString("created_files");
            long availableLifeTime = (conf.getLong("AvailableLifeTimeInHours") * 3600000);
            String[] fileList = new File(filesDirectory).list();
            if (fileList != null) {
                for (String aFileList : fileList) {
                    System.out.println(aFileList);
                    Path path = FileSystems.getDefault().getPath(filesDirectory + aFileList);
                    BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
                    long creationTime = basicFileAttributes.creationTime().toMillis();
                    if ((new Date().getTime() - creationTime > availableLifeTime)) {
                        Files.delete(path);
                        dataBaseManager.removeCreatedFile(aFileList);
                        System.out.println(true);
                    } else System.out.println(false);
                }
            }
        } catch (ConfigurationException | IOException | SQLException ignored) {

        }
    }
}
