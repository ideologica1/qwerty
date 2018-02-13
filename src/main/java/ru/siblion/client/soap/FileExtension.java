
package ru.siblion.client.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileExtension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fileExtension">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="LOG"/>
 *     &lt;enumeration value="DOC"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="RTF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fileExtension")
@XmlEnum
public enum FileExtension {

    PDF,
    LOG,
    DOC,
    XML,
    HTML,
    RTF;

    public String value() {
        return name();
    }

    public static FileExtension fromValue(String v) {
        return valueOf(v);
    }

}
