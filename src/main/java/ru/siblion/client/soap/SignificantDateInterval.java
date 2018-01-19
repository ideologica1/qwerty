
package ru.siblion.client.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * <p>Java class for significantDateInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="significantDateInterval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFromString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateToString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "significantDateInterval", propOrder = {
    "dateFrom",
    "dateFromString",
    "dateTo",
    "dateToString"
})
public class SignificantDateInterval {

    protected Date dateFrom;
    protected String dateFromString;
    protected Date dateTo;
    protected String dateToString;

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(Date value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateFromString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFromString() {
        return dateFromString;
    }


    public void setDateFromString(String dateFromString) {
        if (dateFromString == null || dateFromString.isEmpty()) {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            this.dateFromString = df.format(new Date(0L));
        }
        else
            this.dateFromString = dateFromString;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(Date value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the dateToString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateToString() {
        return dateToString;
    }


    public void setDateToString(String dateToString) {
        if (dateToString == null || dateToString.isEmpty()) {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            this.dateToString = df.format(new Date());
        }
        else
            this.dateToString = dateToString;
    }

}
