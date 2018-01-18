package ru.siblion.service.controller;

import ru.siblion.service.model.request.SearchInfo;
import ru.siblion.service.model.request.SignificantDateInterval;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class SearchInfoService implements Serializable {

    @Inject
    private SearchInfo searchInfo;

    private SignificantDateInterval dateInterval = new SignificantDateInterval();

    private List<SignificantDateInterval> dateIntervalList = new ArrayList<>();

    @PostConstruct
    public void init() {
        dateIntervalList.add(dateInterval);
    }

    public void addAnotherInterval() {
        dateInterval = new SignificantDateInterval();
        dateIntervalList.add(dateInterval);
    }

    public SearchInfoService() {
    }

    public SignificantDateInterval getDateInterval() {

        return dateInterval;
    }

    public SearchInfo getSearchInfo() {

        return searchInfo;
    }

    public List<SignificantDateInterval> getDateIntervalList() {

        return dateIntervalList;
    }

    public void setDateInterval(SignificantDateInterval dateInterval) {

        this.dateInterval = dateInterval;
    }

    public void clean() {
        dateIntervalList = new ArrayList<SignificantDateInterval>();
        dateIntervalList.add(new SignificantDateInterval());
    }

    public void deleteInterval(SignificantDateInterval significantDateInterval) {
        dateIntervalList.remove(significantDateInterval);
    }

    public void setDateIntervalList(List<SignificantDateInterval> dateIntervalList) {
        this.dateIntervalList = dateIntervalList;
    }
}
