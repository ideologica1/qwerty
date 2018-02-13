package ru.siblion.service.model.request;


import ru.siblion.util.FileExtension;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class SearchInfo implements Serializable {

    private String RegularExpression;

    private List<SignificantDateInterval> DateInterval;

    private String Location;

    private boolean realization;

    private FileExtension fileExtension;

    @Inject
    SignificantDateInterval significantDateInterval;

    public SearchInfo() {
    }

    public String getRegularExpression() {
        return RegularExpression;
    }

    public void setRegularExpression(String regularExpression) {
        RegularExpression = regularExpression;
    }

    public List<SignificantDateInterval> getDateInterval() {
        return DateInterval;
    }

    public void setDateInterval(List<SignificantDateInterval> dateInterval) {
        DateInterval = dateInterval;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public SignificantDateInterval getSignificantDateInterval() {
        return significantDateInterval;
    }

    public void setSignificantDateInterval(SignificantDateInterval significantDateInterval) {
        this.significantDateInterval = significantDateInterval;
    }

    public boolean getRealization() {
        return realization;
    }

    public void setRealization(boolean realization) {
        this.realization = realization;
    }

    public FileExtension getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(FileExtension fileExtension) {
        this.fileExtension = fileExtension;
    }

}
