package ru.siblion.service.controller;

import ru.siblion.client.soap.LogSearchResult;
import ru.siblion.service.model.response.CorrectionCheckResult;
import ru.siblion.service.util.Errors;

import javax.inject.Inject;

public class LogSearchResultService {

    @Inject
    private LogSearchResult logSearchResult;

    public void setLogSearchResultResponse(CorrectionCheckResult correctionCheckResult) {
        long errorCode = correctionCheckResult.getErrorCode();
        if (errorCode != 0)
            logSearchResult.setResponse(Errors.getDescriptionByCode(errorCode));
    }
}
