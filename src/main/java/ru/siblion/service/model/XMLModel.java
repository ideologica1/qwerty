package ru.siblion.service.model;

import ru.siblion.service.model.response.SearchInfoResult;
import ru.siblion.service.model.request.SearchInfo;

import javax.enterprise.context.RequestScoped;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@RequestScoped
public class XMLModel implements Serializable {

    @XmlElement
    private final String author = "Андрей Иванов";

    @XmlElement
    private final String applicationName = "Logs Finder";

    private SearchInfo searchInfo;

    private SearchInfoResult searchInfoResult;

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public SearchInfoResult getSearchInfoResult() {
        return searchInfoResult;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public void setSearchInfoResult(SearchInfoResult searchInfoResult) {
        this.searchInfoResult = searchInfoResult;
    }

    public String getAuthor() {
        return author;
    }

    public String getApplicationName() {
        return applicationName;
    }
}
