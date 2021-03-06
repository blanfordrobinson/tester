//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * These elements are part of the ENHANCEMENT_PROVIDER_TYPE group
 * 
 * <p>Java class for ENHANCEMENT_PROVIDER_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENHANCEMENT_PROVIDER_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identityOfTheEnhancementProvider" type="{http://www.sec.gov/edgar/nmfp2common}STRING_150_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="typeOfEnhancement" type="{http://www.sec.gov/edgar/nmfp2common}STRING_150_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="amountProvidedByEnhancement" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_5_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="enhancementRatingOrNRSRO" type="{http://www.sec.gov/edgar/nmfp2}NRSRO_TYPE" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENHANCEMENT_PROVIDER_TYPE", propOrder = {
    "identityOfTheEnhancementProvider",
    "typeOfEnhancement",
    "amountProvidedByEnhancement",
    "enhancementRatingOrNRSRO"
})
public class ENHANCEMENTPROVIDERTYPE {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityOfTheEnhancementProvider;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeOfEnhancement;
    protected BigDecimal amountProvidedByEnhancement;
    protected List<NRSROTYPE> enhancementRatingOrNRSRO;

    /**
     * Gets the value of the identityOfTheEnhancementProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityOfTheEnhancementProvider() {
        return identityOfTheEnhancementProvider;
    }

    /**
     * Sets the value of the identityOfTheEnhancementProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityOfTheEnhancementProvider(String value) {
        this.identityOfTheEnhancementProvider = value;
    }

    /**
     * Gets the value of the typeOfEnhancement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfEnhancement() {
        return typeOfEnhancement;
    }

    /**
     * Sets the value of the typeOfEnhancement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfEnhancement(String value) {
        this.typeOfEnhancement = value;
    }

    /**
     * Gets the value of the amountProvidedByEnhancement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountProvidedByEnhancement() {
        return amountProvidedByEnhancement;
    }

    /**
     * Sets the value of the amountProvidedByEnhancement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountProvidedByEnhancement(BigDecimal value) {
        this.amountProvidedByEnhancement = value;
    }

    /**
     * Gets the value of the enhancementRatingOrNRSRO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancementRatingOrNRSRO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancementRatingOrNRSRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NRSROTYPE }
     * 
     * 
     */
    public List<NRSROTYPE> getEnhancementRatingOrNRSRO() {
        if (enhancementRatingOrNRSRO == null) {
            enhancementRatingOrNRSRO = new ArrayList<NRSROTYPE>();
        }
        return this.enhancementRatingOrNRSRO;
    }

}
