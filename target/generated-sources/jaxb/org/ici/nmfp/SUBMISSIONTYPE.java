//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 04:46:12 PM EDT 
//


package org.ici.nmfp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBMISSION_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SUBMISSION_TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="N-MFP2"/&gt;
 *     &lt;enumeration value="N-MFP2/A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SUBMISSION_TYPE")
@XmlEnum
public enum SUBMISSIONTYPE {

    @XmlEnumValue("N-MFP2")
    N_MFP_2("N-MFP2"),
    @XmlEnumValue("N-MFP2/A")
    N_MFP_2_A("N-MFP2/A");
    private final String value;

    SUBMISSIONTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SUBMISSIONTYPE fromValue(String v) {
        for (SUBMISSIONTYPE c: SUBMISSIONTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
