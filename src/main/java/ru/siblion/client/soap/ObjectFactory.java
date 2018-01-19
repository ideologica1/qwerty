
package ru.siblion.client.soap;

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

    private final static QName _IOException_QNAME = new QName("http://controller.service.siblion.ru/", "IOException");
    private final static QName _LogSearchSyncResponse_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchSyncResponse");
    private final static QName _ParseException_QNAME = new QName("http://controller.service.siblion.ru/", "ParseException");
    private final static QName _LogSearchAsync_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchAsync");
    private final static QName _SAXException_QNAME = new QName("http://controller.service.siblion.ru/", "SAXException");
    private final static QName _TransformerException_QNAME = new QName("http://controller.service.siblion.ru/", "TransformerException");
    private final static QName _LogSearchSync_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchSync");
    private final static QName _LogSearchAsyncResponse_QNAME = new QName("http://controller.service.siblion.ru/", "logSearchAsyncResponse");
    private final static QName _JAXBException_QNAME = new QName("http://controller.service.siblion.ru/", "JAXBException");
    private final static QName _ConfigurationException_QNAME = new QName("http://controller.service.siblion.ru/", "ConfigurationException");
    private final static QName _SQLException_QNAME = new QName("http://controller.service.siblion.ru/", "SQLException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.siblion.client.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigurationException }
     * 
     */
    public ConfigurationException createConfigurationException() {
        return new ConfigurationException();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link LogSearchAsync }
     * 
     */
    public LogSearchAsync createLogSearchAsync() {
        return new LogSearchAsync();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link LogSearchSyncResponse }
     * 
     */
    public LogSearchSyncResponse createLogSearchSyncResponse() {
        return new LogSearchSyncResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link LogSearchAsyncResponse }
     * 
     */
    public LogSearchAsyncResponse createLogSearchAsyncResponse() {
        return new LogSearchAsyncResponse();
    }

    /**
     * Create an instance of {@link LogSearchSync }
     * 
     */
    public LogSearchSync createLogSearchSync() {
        return new LogSearchSync();
    }

    /**
     * Create an instance of {@link TransformerException }
     * 
     */
    public TransformerException createTransformerException() {
        return new TransformerException();
    }

    /**
     * Create an instance of {@link SAXException }
     * 
     */
    public SAXException createSAXException() {
        return new SAXException();
    }

    /**
     * Create an instance of {@link ResultLogs }
     * 
     */
    public ResultLogs createResultLogs() {
        return new ResultLogs();
    }

    /**
     * Create an instance of {@link LogSearchResult }
     * 
     */
    public LogSearchResult createLogSearchResult() {
        return new LogSearchResult();
    }

    /**
     * Create an instance of {@link SignificantDateInterval }
     * 
     */
    public SignificantDateInterval createSignificantDateInterval() {
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
     * Create an instance of {@link SearchInfoResult }
     * 
     */
    public SearchInfoResult createSearchInfoResult() {
        return new SearchInfoResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogSearchSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchSyncResponse")
    public JAXBElement<LogSearchSyncResponse> createLogSearchSyncResponse(LogSearchSyncResponse value) {
        return new JAXBElement<LogSearchSyncResponse>(_LogSearchSyncResponse_QNAME, LogSearchSyncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogSearchAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchAsync")
    public JAXBElement<LogSearchAsync> createLogSearchAsync(LogSearchAsync value) {
        return new JAXBElement<LogSearchAsync>(_LogSearchAsync_QNAME, LogSearchAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAXException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "SAXException")
    public JAXBElement<SAXException> createSAXException(SAXException value) {
        return new JAXBElement<SAXException>(_SAXException_QNAME, SAXException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "TransformerException")
    public JAXBElement<TransformerException> createTransformerException(TransformerException value) {
        return new JAXBElement<TransformerException>(_TransformerException_QNAME, TransformerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogSearchSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchSync")
    public JAXBElement<LogSearchSync> createLogSearchSync(LogSearchSync value) {
        return new JAXBElement<LogSearchSync>(_LogSearchSync_QNAME, LogSearchSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogSearchAsyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "logSearchAsyncResponse")
    public JAXBElement<LogSearchAsyncResponse> createLogSearchAsyncResponse(LogSearchAsyncResponse value) {
        return new JAXBElement<LogSearchAsyncResponse>(_LogSearchAsyncResponse_QNAME, LogSearchAsyncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "ConfigurationException")
    public JAXBElement<ConfigurationException> createConfigurationException(ConfigurationException value) {
        return new JAXBElement<ConfigurationException>(_ConfigurationException_QNAME, ConfigurationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.service.siblion.ru/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

}
