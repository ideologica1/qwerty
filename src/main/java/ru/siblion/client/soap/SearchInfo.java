
package ru.siblion.client.soap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateInterval" type="{http://controller.service.siblion.ru/}significantDateInterval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileExtention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="regularExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="significantDateInterval" type="{http://controller.service.siblion.ru/}significantDateInterval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchInfo", propOrder = {
    "dateInterval",
    "fileExtention",
    "location",
    "realization",
    "regularExpression",
    "significantDateInterval"
})
public class SearchInfo implements Serializable {

    @XmlElement(nillable = true)
    protected List<SignificantDateInterval> dateInterval;
    protected String fileExtention;
    protected String location;
    protected boolean realization;
    protected String regularExpression;
    protected SignificantDateInterval significantDateInterval;

    /**
     * Gets the value of the dateInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignificantDateInterval }
     * 
     * 
     */
    public List<SignificantDateInterval> getDateInterval() {
        if (dateInterval == null) {
            dateInterval = new ArrayList<SignificantDateInterval>();
        }
        return this.dateInterval;
    }

    public void setDateInterval(List<SignificantDateInterval> significantDateIntervalList) {
        this.dateInterval = significantDateIntervalList;
    }

    /**
     * Gets the value of the fileExtention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtention() {
        return fileExtention;
    }

    /**
     * Sets the value of the fileExtention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtention(String value) {
        this.fileExtention = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the realization property.
     * 
     */
    public boolean isRealization() {
        return realization;
    }

    /**
     * Sets the value of the realization property.
     * 
     */
    public void setRealization(boolean value) {
        this.realization = value;
    }

    /**
     * Gets the value of the regularExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    /**
     * Sets the value of the regularExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularExpression(String value) {
        this.regularExpression = value;
    }

    /**
     * Gets the value of the significantDateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantDateInterval }
     *     
     */
    public SignificantDateInterval getSignificantDateInterval() {
        return significantDateInterval;
    }

    /**
     * Sets the value of the significantDateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantDateInterval }
     *     
     */
    public void setSignificantDateInterval(SignificantDateInterval value) {
        this.significantDateInterval = value;
    }

}
