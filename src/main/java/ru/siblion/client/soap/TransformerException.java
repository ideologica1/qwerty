
package ru.siblion.client.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransformerException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformerException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exception" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="locationAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageAndLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformerException", propOrder = {
    "exception",
    "locationAsString",
    "locator",
    "message",
    "messageAndLocation"
})
public class TransformerException {

    protected Object exception;
    protected String locationAsString;
    protected Object locator;
    protected String message;
    protected String messageAndLocation;

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setException(Object value) {
        this.exception = value;
    }

    /**
     * Gets the value of the locationAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAsString() {
        return locationAsString;
    }

    /**
     * Sets the value of the locationAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAsString(String value) {
        this.locationAsString = value;
    }

    /**
     * Gets the value of the locator property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocator() {
        return locator;
    }

    /**
     * Sets the value of the locator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocator(Object value) {
        this.locator = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageAndLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageAndLocation() {
        return messageAndLocation;
    }

    /**
     * Sets the value of the messageAndLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageAndLocation(String value) {
        this.messageAndLocation = value;
    }

}