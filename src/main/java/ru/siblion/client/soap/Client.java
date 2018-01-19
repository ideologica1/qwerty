package ru.siblion.client.soap;

import org.apache.commons.configuration.ConfigurationException;
import ru.siblion.client.controller.ClientInputDataChecker;
import ru.siblion.client.view.ResultRepresentation;
import ru.siblion.service.controller.SearchInfoService;
import ru.siblion.service.model.response.CorrectionCheckResult;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Client {

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
  private ClientInputDataChecker clientInputDataChecker;


  @Inject
  private SearchInfoResult searchInfoResult;

  public String getResponse() throws ConfigurationException, ConfigurationException_Exception, IOException_Exception, JAXBException_Exception, SQLException_Exception, TransformerException_Exception, ParseException_Exception, SAXException_Exception {
    setDateIntervals();
    corectionCheck(searchInfo);
    if (isErrorOccured(correctionCheckResult)) {
      resultRepresentation.showMessage(logSearchResult);
    }
    else {
      if (searchInfo.isRealization()) {
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

  private SearchInfoResult logSearchSync(SearchInfo searchInfo) throws ConfigurationException_Exception, IOException_Exception {
    LogSearchWS soap;
    soap = new LogSearchWSService().getLogSearchWSPort();
    return soap.logSearchSync(searchInfo);
  }

  private LogSearchResult logSearchAsync(SearchInfo searchInfo) throws IOException_Exception, JAXBException_Exception, ParseException_Exception, SAXException_Exception, ConfigurationException_Exception, SQLException_Exception, TransformerException_Exception {
    LogSearchWS soap;
    soap = new LogSearchWSService().getLogSearchWSPort();
    return soap.logSearchAsync(searchInfo);
  }

  private void corectionCheck(SearchInfo searchInfo) throws ConfigurationException {
    clientInputDataChecker.correctionCheck(searchInfo);
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
