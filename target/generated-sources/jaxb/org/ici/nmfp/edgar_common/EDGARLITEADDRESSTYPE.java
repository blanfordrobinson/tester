//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 04:46:12 PM EDT 
//


package org.ici.nmfp.edgar_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EDGARLITE_ADDRESS_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDGARLITE_ADDRESS_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="street1" type="{http://www.sec.gov/edgar/common}STREET_TYPE"/&gt;
 *         &lt;element name="street2" type="{http://www.sec.gov/edgar/common}STREET_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.sec.gov/edgar/common}STRING_30_TYPE"/&gt;
 *         &lt;element name="stateOrCountryCode" type="{http://www.sec.gov/edgar/statecodes}STATE_COUNTRY_CODE"/&gt;
 *         &lt;element name="stateOrCountry" type="{http://www.sec.gov/edgar/common}STRING_50_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.sec.gov/edgar/common}ZIP_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDGARLITE_ADDRESS_TYPE", propOrder = {
    "street1",
    "street2",
    "city",
    "stateOrCountryCode",
    "stateOrCountry",
    "zipCode"
})
public class EDGARLITEADDRESSTYPE {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String street1;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String street2;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String city;
    @XmlElement(required = true)
    protected String stateOrCountryCode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String stateOrCountry;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zipCode;

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateOrCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrCountryCode() {
        return stateOrCountryCode;
    }

    /**
     * Sets the value of the stateOrCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrCountryCode(String value) {
        this.stateOrCountryCode = value;
    }

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

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
