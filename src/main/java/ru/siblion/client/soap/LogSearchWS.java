
package ru.siblion.client.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LogSearchWS", targetNamespace = "http://controller.service.siblion.ru/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LogSearchWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns ru.siblion.client.soap.SearchInfoResult
     * @throws ConfigurationException_Exception
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logSearchSync", targetNamespace = "http://controller.service.siblion.ru/", className = "ru.siblion.client.soap.LogSearchSync")
    @ResponseWrapper(localName = "logSearchSyncResponse", targetNamespace = "http://controller.service.siblion.ru/", className = "ru.siblion.client.soap.LogSearchSyncResponse")
    @Action(input = "http://controller.service.siblion.ru/LogSearchWS/logSearchSyncRequest", output = "http://controller.service.siblion.ru/LogSearchWS/logSearchSyncResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchSync/Fault/IOException"),
        @FaultAction(className = ConfigurationException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchSync/Fault/ConfigurationException")
    })
    public SearchInfoResult logSearchSync(
        @WebParam(name = "arg0", targetNamespace = "")
        SearchInfo arg0)
        throws ConfigurationException_Exception, IOException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns ru.siblion.client.soap.LogSearchResult
     * @throws JAXBException_Exception
     * @throws SQLException_Exception
     * @throws TransformerException_Exception
     * @throws SAXException_Exception
     * @throws ConfigurationException_Exception
     * @throws IOException_Exception
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logSearchAsync", targetNamespace = "http://controller.service.siblion.ru/", className = "ru.siblion.client.soap.LogSearchAsync")
    @ResponseWrapper(localName = "logSearchAsyncResponse", targetNamespace = "http://controller.service.siblion.ru/", className = "ru.siblion.client.soap.LogSearchAsyncResponse")
    @Action(input = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsyncRequest", output = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsyncResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsync/Fault/ParseException"),
        @FaultAction(className = TransformerException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsync/Fault/TransformerException"),
        @FaultAction(className = IOException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsync/Fault/IOException"),
        @FaultAction(className = JAXBException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsync/Fault/JAXBException"),
        @FaultAction(className = SQLException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsync/Fault/SQLException"),
        @FaultAction(className = SAXException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsync/Fault/SAXException"),
        @FaultAction(className = ConfigurationException_Exception.class, value = "http://controller.service.siblion.ru/LogSearchWS/logSearchAsync/Fault/ConfigurationException")
    })
    public LogSearchResult logSearchAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        SearchInfo arg0)
        throws ConfigurationException_Exception, IOException_Exception, JAXBException_Exception, ParseException_Exception, SAXException_Exception, SQLException_Exception, TransformerException_Exception
    ;

}