package ru.siblion.service.controller;

import org.apache.commons.configuration.ConfigurationException;
import org.xml.sax.SAXException;
import ru.siblion.service.model.request.SearchInfo;
import ru.siblion.service.model.response.LogSearchResult;
import ru.siblion.service.model.response.SearchInfoResult;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

@Stateless
@WebService
public class LogSearchWS {

    @Inject
    private SearchResultManager searchResultManager;

    @Inject
    private FileManager fileManager;

    @WebMethod
    public LogSearchResult logSearchAsync(SearchInfo searchInfo) {
        LogSearchResult logSearchResult = new LogSearchResult();
        if (fileSearch(searchInfo)) {
            logSearchResult.setResponse(fileManager.getFileAbsolutePath());
        } else {
            generateFile(searchInfo);
            logSearchResult.setResponse(fileManager.getFileAbsolutePath());
        }

        return logSearchResult;

    }

    @WebMethod
    public SearchInfoResult logSearchSync(SearchInfo searchInfo) {
        try {
            return searchResultManager.searchLogs(searchInfo);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @WebMethod(exclude = true)
    private boolean fileSearch(SearchInfo searchInfo) {
        return fileManager.fileSearch(searchInfo);
    }

    @WebMethod(exclude = true)
    private void generateFile(SearchInfo searchInfo) {
        String absolutePath = fileManager.generateFileAbsolutePath(searchInfo.getFileExtension().toString());
        fileManager.setFileAbsolutePath(absolutePath);
        fileManager.generateFile(searchInfo);
    }
}
