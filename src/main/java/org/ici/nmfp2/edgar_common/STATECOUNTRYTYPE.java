//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2.edgar_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STATE_COUNTRY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STATE_COUNTRY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stateOrCountry" type="{http://www.sec.gov/edgar/statecodes}STATE_COUNTRY_CODE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STATE_COUNTRY_TYPE", propOrder = {
    "stateOrCountry"
})
public class STATECOUNTRYTYPE {

    @XmlElement(required = true)
    protected String stateOrCountry;

    /**
     * Gets the value of the stateOrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrCountry() {
        return stateOrCountry;
    }

    /**
     * Sets the value of the stateOrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrCountry(String value) {
        this.stateOrCountry = value;
    }

}
