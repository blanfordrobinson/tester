//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 04:46:12 PM EDT 
//


package org.ici.nmfp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * These elements are part of the GUARANTOR_TYPE group
 * 
 * <p>Java class for GUARANTOR_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GUARANTOR_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identityOfTheGuarantor" type="{http://www.sec.gov/edgar/nmfp2common}STRING_150_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="amountProvidedByGuarantor" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_5_TYPE2" minOccurs="0"/&gt;
 *         &lt;element name="guarantorRatingOrNRSRO" type="{http://www.sec.gov/edgar/nmfp2}NRSRO_TYPE" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GUARANTOR_TYPE", propOrder = {
    "identityOfTheGuarantor",
    "amountProvidedByGuarantor",
    "guarantorRatingOrNRSRO"
})
public class GUARANTORTYPE {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityOfTheGuarantor;
    protected BigDecimal amountProvidedByGuarantor;
    protected List<NRSROTYPE> guarantorRatingOrNRSRO;

    /**
     * Gets the value of the identityOfTheGuarantor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityOfTheGuarantor() {
        return identityOfTheGuarantor;
    }

    /**
     * Sets the value of the identityOfTheGuarantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityOfTheGuarantor(String value) {
        this.identityOfTheGuarantor = value;
    }

    /**
     * Gets the value of the amountProvidedByGuarantor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountProvidedByGuarantor() {
        return amountProvidedByGuarantor;
    }

    /**
     * Sets the value of the amountProvidedByGuarantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountProvidedByGuarantor(BigDecimal value) {
        this.amountProvidedByGuarantor = value;
    }

    /**
     * Gets the value of the guarantorRatingOrNRSRO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorRatingOrNRSRO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorRatingOrNRSRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NRSROTYPE }
     * 
     * 
     */
    public List<NRSROTYPE> getGuarantorRatingOrNRSRO() {
        if (guarantorRatingOrNRSRO == null) {
            guarantorRatingOrNRSRO = new ArrayList<NRSROTYPE>();
        }
        return this.guarantorRatingOrNRSRO;
    }

}
