
package ru.siblion.service.soap;

import ru.siblion.service.model.request.SearchInfo;
import ru.siblion.service.model.response.LogSearchResult;
import ru.siblion.service.model.response.SearchInfoResult;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LogSearchWS", targetNamespace = "http://controller.siblion.ru/")
public interface LogSearchWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns ru.siblion.service.soap.LogSearchResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logSearchAsync", targetNamespace = "http://controller.siblion.ru/", className = "ru.siblion.service.soap.LogSearchAsync")
    @ResponseWrapper(localName = "logSearchAsyncResponse", targetNamespace = "http://controller.siblion.ru/", className = "ru.siblion.service.soap.LogSearchAsyncResponse")
    @Action(input = "http://controller.siblion.ru/LogSearchWS/logSearchAsyncRequest", output = "http://controller.siblion.ru/LogSearchWS/logSearchAsyncResponse", fault = {
    })
    public LogSearchResult logSearchAsync(
        @WebParam(name = "arg0", targetNamespace = "")
                SearchInfo arg0)
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns ru.siblion.service.soap.SearchInfoResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logSearchSync", targetNamespace = "http://controller.siblion.ru/", className = "ru.siblion.service.soap.LogSearchSync")
    @ResponseWrapper(localName = "logSearchSyncResponse", targetNamespace = "http://controller.siblion.ru/", className = "ru.siblion.service.soap.LogSearchSyncResponse")
    @Action(input = "http://controller.siblion.ru/LogSearchWS/logSearchSyncRequest", output = "http://controller.siblion.ru/LogSearchWS/logSearchSyncResponse", fault = {
    })
    public SearchInfoResult logSearchSync(
        @WebParam(name = "arg0", targetNamespace = "")
        SearchInfo arg0)
    ;

}