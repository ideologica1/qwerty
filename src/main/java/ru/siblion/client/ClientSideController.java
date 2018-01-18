package ru.siblion.client;


import ru.siblion.client.controller.InputDataChecker;
import ru.siblion.service.controller.SearchInfoService;
import ru.siblion.service.model.request.SearchInfo;
import ru.siblion.service.model.response.CorrectionCheckResult;
import ru.siblion.service.model.response.LogSearchResult;
import ru.siblion.service.model.response.SearchInfoResult;
import ru.siblion.service.soap.*;
import ru.siblion.client.view.ResultRepresentation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ClientSideController {

    @Inject
    private SearchInfo searchInfo;

    @Inject
    private CorrectionCheckResult correctionCheckResult;

    @Inject
    private ResultRepresentation resultRepresentation;

    @Inject
    private SearchInfoService searchInfoService;

    @Inject
    private LogSearchResult logSearchResult;

    @Inject
    private InputDataChecker inputDataChecker;

    private SearchInfoResult searchInfoResult;

    public String getResponse() {
        setDateIntervals();
        correctionCheckResult = corectionCheck(searchInfo);
        if (isErrorOccured(correctionCheckResult)) {
            resultRepresentation.showMessage(logSearchResult);
        }
        else {
            if (searchInfo.getRealization()) {
                searchInfoResult = logSearchSync(searchInfo);
                return "searchResult.xhtml";
            }
            else {
                logSearchResult = logSearchAsync(searchInfo);
                resultRepresentation.showMessage(logSearchResult);
            }

        }
        return null;
    }

    private SearchInfoResult logSearchSync(SearchInfo searchInfo)  {
        LogSearchWS service;
        service = new LogSearchWSService().getLogSearchWSPort();
        return service.logSearchSync(searchInfo);
    }

    private LogSearchResult logSearchAsync(SearchInfo searchInfo) {
        LogSearchWS service;
        service = new LogSearchWSService().getLogSearchWSPort();
        return service.logSearchAsync(searchInfo);
    }

    private CorrectionCheckResult corectionCheck(SearchInfo searchInfo) {
        return inputDataChecker.correctionCheck(searchInfo);
    }

    private boolean isErrorOccured(CorrectionCheckResult correctionCheckResult) {
        return correctionCheckResult.getErrorCode() != 0;
    }

    private void setDateIntervals()  {
        searchInfo.setDateInterval(searchInfoService.getDateIntervalList());
    }

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public SearchInfoResult getSearchInfoResult() {
        return searchInfoResult;
    }

    public void setSearchInfoResult(SearchInfoResult searchInfoResult) {
        this.searchInfoResult = searchInfoResult;
    }
}
