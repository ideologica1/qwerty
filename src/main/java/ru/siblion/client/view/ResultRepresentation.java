package ru.siblion.client.view;


import ru.siblion.client.soap.LogSearchResult;
import ru.siblion.service.model.response.CorrectionCheckResult;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;

@RequestScoped
public class ResultRepresentation implements Serializable{

    @Inject
    private CorrectionCheckResult correctionCheckResult;

    public void showMessage(LogSearchResult logSearchResult) {
        if (correctionCheckResult.getErrorCode() != 0)
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: "+logSearchResult.getResponse(), "Error"));
        else FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Путь до интересующих логов: "+logSearchResult.getResponse()));
    }
}
