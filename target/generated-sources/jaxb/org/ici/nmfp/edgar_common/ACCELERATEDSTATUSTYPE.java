//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 04:46:12 PM EDT 
//


package org.ici.nmfp.edgar_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCELERATED_STATUS_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACCELERATED_STATUS_TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Non-Accelerated Filer"/&gt;
 *     &lt;enumeration value="Accelerated Filer"/&gt;
 *     &lt;enumeration value="Large Accelerated Filer"/&gt;
 *     &lt;enumeration value="Not Applicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ACCELERATED_STATUS_TYPE")
@XmlEnum
public enum ACCELERATEDSTATUSTYPE {

    @XmlEnumValue("Non-Accelerated Filer")
    NON_ACCELERATED_FILER("Non-Accelerated Filer"),
    @XmlEnumValue("Accelerated Filer")
    ACCELERATED_FILER("Accelerated Filer"),
    @XmlEnumValue("Large Accelerated Filer")
    LARGE_ACCELERATED_FILER("Large Accelerated Filer"),
    @XmlEnumValue("Not Applicable")
    NOT_APPLICABLE("Not Applicable");
    private final String value;

    ACCELERATEDSTATUSTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACCELERATEDSTATUSTYPE fromValue(String v) {
        for (ACCELERATEDSTATUSTYPE c: ACCELERATEDSTATUSTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
