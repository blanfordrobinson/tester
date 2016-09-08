//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2.edgar_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the investment company type of the
 * 				filer. Choose a value from the list displayed when the arrow is
 * 				selected.
 * 
 * <p>Java class for INVESTMENT_COMPANY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INVESTMENT_COMPANY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isImCompany" type="{http://www.sec.gov/edgar/common}TRUE_FALSE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="invCompanyType" type="{http://www.sec.gov/edgar/common}INV_COMPANY_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INVESTMENT_COMPANY_TYPE", propOrder = {
    "isImCompany",
    "invCompanyType"
})
public class INVESTMENTCOMPANYTYPE {

    protected Boolean isImCompany;
    @XmlSchemaType(name = "token")
    protected INVCOMPANYTYPE invCompanyType;

    /**
     * Gets the value of the isImCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImCompany() {
        return isImCompany;
    }

    /**
     * Sets the value of the isImCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImCompany(Boolean value) {
        this.isImCompany = value;
    }

    /**
     * Gets the value of the invCompanyType property.
     * 
     * @return
     *     possible object is
     *     {@link INVCOMPANYTYPE }
     *     
     */
    public INVCOMPANYTYPE getInvCompanyType() {
        return invCompanyType;
    }

    /**
     * Sets the value of the invCompanyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVCOMPANYTYPE }
     *     
     */
    public void setInvCompanyType(INVCOMPANYTYPE value) {
        this.invCompanyType = value;
    }

}