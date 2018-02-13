
package ru.siblion.client.soap;

import ru.siblion.client.soap.SearchInfo;
import ru.siblion.client.soap.LogSearchAsync;
import ru.siblion.client.soap.LogSearchAsyncResponse;
import ru.siblion.client.soap.LogSearchResult;
import ru.siblion.client.soap.LogSearchSync;
import ru.siblion.client.soap.LogSearchSyncResponse;
import ru.siblion.client.soap.ResultLogs;
import ru.siblion.client.soap.SearchInfoResult;
import ru.siblion.client.soap.SignificantDateInterval;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.siblion.client.soap package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LogSearchSyncResponse_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchSyncResponse");
    private final static QName _LogSearchAsync_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchAsync");
    private final static QName _LogSearchSync_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchSync");
    private final static QName _LogSearchAsyncResponse_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchAsyncResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.siblion.client.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.LogSearchAsync }
     * 
     */
    public ru.siblion.client.soap.LogSearchAsync createLogSearchAsync() {
        return new ru.siblion.client.soap.LogSearchAsync();
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.LogSearchSyncResponse }
     * 
     */
    public ru.siblion.client.soap.LogSearchSyncResponse createLogSearchSyncResponse() {
        return new ru.siblion.client.soap.LogSearchSyncResponse();
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.LogSearchAsyncResponse }
     * 
     */
    public ru.siblion.client.soap.LogSearchAsyncResponse createLogSearchAsyncResponse() {
        return new ru.siblion.client.soap.LogSearchAsyncResponse();
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.LogSearchSync }
     * 
     */
    public ru.siblion.client.soap.LogSearchSync createLogSearchSync() {
        return new ru.siblion.client.soap.LogSearchSync();
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.SignificantDateInterval }
     * 
     */
    public ru.siblion.client.soap.SignificantDateInterval createSignificantDateInterval() {
        return new SignificantDateInterval();
    }

    /**
     * Create an instance of {@link SearchInfo }
     * 
     */
    public SearchInfo createSearchInfo() {
        return new SearchInfo();
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.ResultLogs }
     * 
     */
    public ru.siblion.client.soap.ResultLogs createResultLogs() {
        return new ResultLogs();
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.LogSearchResult }
     * 
     */
    public ru.siblion.client.soap.LogSearchResult createLogSearchResult() {
        return new LogSearchResult();
    }

    /**
     * Create an instance of {@link ru.siblion.client.soap.SearchInfoResult }
     * 
     */
    public ru.siblion.client.soap.SearchInfoResult createSearchInfoResult() {
        return new SearchInfoResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ru.siblion.client.soap.LogSearchSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchSyncResponse")
    public JAXBElement<ru.siblion.client.soap.LogSearchSyncResponse> createLogSearchSyncResponse(ru.siblion.client.soap.LogSearchSyncResponse value) {
        return new JAXBElement<ru.siblion.client.soap.LogSearchSyncResponse>(_LogSearchSyncResponse_QNAME, LogSearchSyncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ru.siblion.client.soap.LogSearchAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchAsync")
    public JAXBElement<ru.siblion.client.soap.LogSearchAsync> createLogSearchAsync(ru.siblion.client.soap.LogSearchAsync value) {
        return new JAXBElement<ru.siblion.client.soap.LogSearchAsync>(_LogSearchAsync_QNAME, LogSearchAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ru.siblion.client.soap.LogSearchSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchSync")
    public JAXBElement<ru.siblion.client.soap.LogSearchSync> createLogSearchSync(ru.siblion.client.soap.LogSearchSync value) {
        return new JAXBElement<ru.siblion.client.soap.LogSearchSync>(_LogSearchSync_QNAME, LogSearchSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ru.siblion.client.soap.LogSearchAsyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchAsyncResponse")
    public JAXBElement<ru.siblion.client.soap.LogSearchAsyncResponse> createLogSearchAsyncResponse(ru.siblion.client.soap.LogSearchAsyncResponse value) {
        return new JAXBElement<ru.siblion.client.soap.LogSearchAsyncResponse>(_LogSearchAsyncResponse_QNAME, LogSearchAsyncResponse.class, null, value);
    }

}
