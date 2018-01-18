package ru.siblion.service.model.response;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class SearchInfoResult implements Serializable {
    private long ErrorCode;
    private String ErrorMessage;
    private String EmptyResultMessage;

    private List<ResultLogs> resultLogsList = new ArrayList<>();

    public SearchInfoResult() {
    }

    public long getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(long errorCode) {
        ErrorCode = errorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public String getEmptyResultMessage() {
        return EmptyResultMessage;
    }

    public void setEmptyResultMessage(String emptyResultMessage) {
        EmptyResultMessage = emptyResultMessage;
    }

    public List<ResultLogs> getResultLogsList() {
        return resultLogsList;
    }

    public void setResultLogsList(List<ResultLogs> resultLogsList) {
        this.resultLogsList = resultLogsList;
    }

    public void addResultLogs(ResultLogs resultLogs) {
        resultLogsList.add(resultLogs);
    }

}
