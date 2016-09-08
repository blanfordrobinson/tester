//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 04:46:12 PM EDT 
//


package org.ici.nmfp.edgar_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DEPOSITOR_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEPOSITOR_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depositorId" type="{http://www.sec.gov/edgar/common}CIK_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="depositorFileNumber" type="{http://www.sec.gov/edgar/common}FILE_NUMBER_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEPOSITOR_TYPE", propOrder = {
    "depositorId",
    "depositorFileNumber"
})
public class DEPOSITORTYPE {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String depositorId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String depositorFileNumber;

    /**
     * Gets the value of the depositorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositorId() {
        return depositorId;
    }

    /**
     * Sets the value of the depositorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositorId(String value) {
        this.depositorId = value;
    }

    /**
     * Gets the value of the depositorFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositorFileNumber() {
        return depositorFileNumber;
    }

    /**
     * Sets the value of the depositorFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositorFileNumber(String value) {
        this.depositorFileNumber = value;
    }

}