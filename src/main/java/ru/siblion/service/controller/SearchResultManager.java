package ru.siblion.service.controller;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import ru.siblion.CurrentList;
import ru.siblion.service.model.request.SignificantDateInterval;
import ru.siblion.service.model.response.CorrectionCheckResult;
import ru.siblion.service.model.response.LogSearchResult;
import ru.siblion.service.model.response.ResultLogs;
import ru.siblion.service.model.request.SearchInfo;
import ru.siblion.service.model.response.SearchInfoResult;
import ru.siblion.service.util.LogsComparator;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Named
@RequestScoped
public class SearchResultManager implements Serializable{

    @Inject
    private CorrectionCheckResult correctionCheckResult;

    @Inject
    private LogSearchResult logSearchResult;

    private SearchInfoResult searchInfoResult;

    @Produces
    @CurrentList
    public SearchInfoResult searchLogs(SearchInfo searchInfo) throws ConfigurationException, IOException {
        searchInfoResult = new SearchInfoResult();

        //загрузка регулярного выражения из .properties для фильтрования файлов логов в папке
        String location = searchInfo.getLocation();
        PropertiesConfiguration conf = new PropertiesConfiguration("C:/Java/LogsFinderEJB/src/main/resources/application.properties");
        //лист содержащий абсолютные пути к выбранным серверам
        String[] serversList = conf.getStringArray(location);
        ResultLogs resultLogs = new ResultLogs();
        String excludedFiles = conf.getString("excludedFilesRegEx");
        List<String> initialStringList = new ArrayList<>();
        List<String> correctStringList = new ArrayList<>();
        StringBuilder tempBuilder = new StringBuilder();
        String temp;
        Pattern excludedLogs = Pattern.compile(excludedFiles);
        if (correctionCheckResult.getErrorCode() != 0) {
            searchInfoResult.setErrorCode(correctionCheckResult.getErrorCode());
            searchInfoResult.setErrorMessage(logSearchResult.getResponse());
        } else {

            for (int i = 0; i < serversList.length; i++) {
                String[] filesList = new File(serversList[i]).list();
                String line;
                for (int j = 0; j < filesList.length; j++) {
                    Matcher matcher = excludedLogs.matcher(filesList[j]);
                    if (matcher.matches())
                        try (BufferedReader reader = new BufferedReader(
                                new InputStreamReader(
                                        new FileInputStream(serversList[i] + filesList[j]), StandardCharsets.UTF_8))) {

                            while ((line = reader.readLine()) != null) {
                                if (!line.endsWith("> ")) {
                                    tempBuilder.append(line).append("\n");
                                } else {
                                    tempBuilder.append(line).append("\n");
                                    temp = tempBuilder.toString();
                                    tempBuilder = new StringBuilder();
                                    if (isStringValid(temp, searchInfo)) {
                                        correctStringList.add(temp);
                                    }
                                }
                            }


                            // установка значений resultLogs и добавление в лист логов
                            for (int k = 0; k < correctStringList.size(); k++) {
                                String[] splittedString = correctStringList.get(k).split("> <");
                                String content = splittedString[splittedString.length - 1];
                                Date timeMoment = new Date(Long.parseLong(splittedString[9]));
                                resultLogs = new ResultLogs();
                                resultLogs.setContent(content);
                                resultLogs.setFileName(filesList[j]);
                                resultLogs.setTimeMoment(timeMoment);
                                searchInfoResult.addResultLogs(resultLogs);
                            }
                            correctStringList = new ArrayList<>();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                }
            }
            if (searchInfoResult.getResultLogsList().isEmpty()) {
                searchInfoResult.setEmptyResultMessage("No records found.");
            }
            searchInfoResult.getResultLogsList().sort(new LogsComparator());
        }
        return searchInfoResult;
    }

    public SearchResultManager() {
    }

    private boolean isStringValid(String string, SearchInfo searchInfo) {
        String regularExpression = searchInfo.getRegularExpression();
        List<SignificantDateInterval> significantDateIntervals = searchInfo.getDateInterval();
        for (int i = 0; i < significantDateIntervals.size(); ) {
            long beginInterval = significantDateIntervals.get(i).getDateFrom().getTime();
            long endInterval = significantDateIntervals.get(i).getDateTo().getTime();
            if (isStringsSatisfyDateIntervals(beginInterval, endInterval, string) && isStringsSatisfyRegularExpression(string, regularExpression)) {
                return true;
            } else {
                i++;
            }
        }
        return false;


    }

    private boolean isStringsSatisfyDateIntervals(long beginInterval, long endInterval, String log) {

        String[] splittedArray = log.split("> <");
        if (Long.parseLong(splittedArray[9]) <= endInterval && Long.parseLong(splittedArray[9]) >= beginInterval) {
            return true;
        }
        return false;
    }

    private boolean isStringsSatisfyRegularExpression(String log, String regularExpression) {
        if (regularExpression.isEmpty())
            return true;
        else {
            Pattern pattern = Pattern.compile(regularExpression);
            Matcher matcher = pattern.matcher(log);
            if (matcher.find())
                return true;
            return false;
        }
    }

    public Date exctractDate(String log) {
        String[] splittedLog = log.split("> <");
        Date date = new Date(Long.parseLong(splittedLog[9]));
        return date;
    }
}

