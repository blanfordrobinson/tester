//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 04:46:12 PM EDT 
//


package org.ici.nmfp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.ici.nmfp.edgar_common.YESNOTYPE;


/**
 * These elements are part of the DEMAND_FEATURE_TYPE group
 * 
 * <p>Java class for DEMAND_FEATURE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEMAND_FEATURE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identityOfDemandFeatureIssuer" type="{http://www.sec.gov/edgar/nmfp2common}STRING_150_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="amountProvidedByDemandFeatureIssuer" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_5_TYPE2" minOccurs="0"/&gt;
 *         &lt;element name="remainingPeriodDemandFeature" type="{http://www.sec.gov/edgar/nmfp2common}INT_3_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="demandFeatureConditionalFlag" type="{http://www.sec.gov/edgar/common}YES_NO_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="demandFeatureRatingOrNRSRO" type="{http://www.sec.gov/edgar/nmfp2}NRSRO_TYPE" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEMAND_FEATURE_TYPE", propOrder = {
    "identityOfDemandFeatureIssuer",
    "amountProvidedByDemandFeatureIssuer",
    "remainingPeriodDemandFeature",
    "demandFeatureConditionalFlag",
    "demandFeatureRatingOrNRSRO"
})
public class DEMANDFEATURETYPE {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityOfDemandFeatureIssuer;
    protected BigDecimal amountProvidedByDemandFeatureIssuer;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger remainingPeriodDemandFeature;
    @XmlSchemaType(name = "token")
    protected YESNOTYPE demandFeatureConditionalFlag;
    protected List<NRSROTYPE> demandFeatureRatingOrNRSRO;

    /**
     * Gets the value of the identityOfDemandFeatureIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityOfDemandFeatureIssuer() {
        return identityOfDemandFeatureIssuer;
    }

    /**
     * Sets the value of the identityOfDemandFeatureIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityOfDemandFeatureIssuer(String value) {
        this.identityOfDemandFeatureIssuer = value;
    }

    /**
     * Gets the value of the amountProvidedByDemandFeatureIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountProvidedByDemandFeatureIssuer() {
        return amountProvidedByDemandFeatureIssuer;
    }

    /**
     * Sets the value of the amountProvidedByDemandFeatureIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountProvidedByDemandFeatureIssuer(BigDecimal value) {
        this.amountProvidedByDemandFeatureIssuer = value;
    }

    /**
     * Gets the value of the remainingPeriodDemandFeature property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemainingPeriodDemandFeature() {
        return remainingPeriodDemandFeature;
    }

    /**
     * Sets the value of the remainingPeriodDemandFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemainingPeriodDemandFeature(BigInteger value) {
        this.remainingPeriodDemandFeature = value;
    }

    /**
     * Gets the value of the demandFeatureConditionalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YESNOTYPE }
     *     
     */
    public YESNOTYPE getDemandFeatureConditionalFlag() {
        return demandFeatureConditionalFlag;
    }

    /**
     * Sets the value of the demandFeatureConditionalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YESNOTYPE }
     *     
     */
    public void setDemandFeatureConditionalFlag(YESNOTYPE value) {
        this.demandFeatureConditionalFlag = value;
    }

    /**
     * Gets the value of the demandFeatureRatingOrNRSRO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandFeatureRatingOrNRSRO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandFeatureRatingOrNRSRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NRSROTYPE }
     * 
     * 
     */
    public List<NRSROTYPE> getDemandFeatureRatingOrNRSRO() {
        if (demandFeatureRatingOrNRSRO == null) {
            demandFeatureRatingOrNRSRO = new ArrayList<NRSROTYPE>();
        }
        return this.demandFeatureRatingOrNRSRO;
    }

}
