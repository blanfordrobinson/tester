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
 * <p>Java class for EXACT_OR_EXPLANATION_OPTIONS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EXACT_OR_EXPLANATION_OPTIONS"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Exact"/&gt;
 *     &lt;enumeration value="Explanation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EXACT_OR_EXPLANATION_OPTIONS")
@XmlEnum
public enum EXACTOREXPLANATIONOPTIONS {

    @XmlEnumValue("Exact")
    EXACT("Exact"),
    @XmlEnumValue("Explanation")
    EXPLANATION("Explanation");
    private final String value;

    EXACTOREXPLANATIONOPTIONS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EXACTOREXPLANATIONOPTIONS fromValue(String v) {
        for (EXACTOREXPLANATIONOPTIONS c: EXACTOREXPLANATIONOPTIONS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
