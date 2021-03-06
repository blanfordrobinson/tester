//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for NET_ASSET_VALUE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NET_ASSET_VALUE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fridayWeek1" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_8_TYPE"/&gt;
 *         &lt;element name="fridayWeek2" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_8_TYPE"/&gt;
 *         &lt;element name="fridayWeek3" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_8_TYPE"/&gt;
 *         &lt;element name="fridayWeek4" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_8_TYPE"/&gt;
 *         &lt;element name="fridayWeek5" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_8_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NET_ASSET_VALUE", propOrder = {
    "fridayWeek1",
    "fridayWeek2",
    "fridayWeek3",
    "fridayWeek4",
    "fridayWeek5"
})
public class NETASSETVALUE {

    @XmlElement(required = true)
    protected BigDecimal fridayWeek1;
    @XmlElement(required = true)
    protected BigDecimal fridayWeek2;
    @XmlElement(required = true)
    protected BigDecimal fridayWeek3;
    @XmlElement(required = true)
    protected BigDecimal fridayWeek4;
    protected BigDecimal fridayWeek5;

    /**
     * Gets the value of the fridayWeek1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFridayWeek1() {
        return fridayWeek1;
    }

    /**
     * Sets the value of the fridayWeek1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFridayWeek1(BigDecimal value) {
        this.fridayWeek1 = value;
    }

    /**
     * Gets the value of the fridayWeek2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFridayWeek2() {
        return fridayWeek2;
    }

    /**
     * Sets the value of the fridayWeek2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFridayWeek2(BigDecimal value) {
        this.fridayWeek2 = value;
    }

    /**
     * Gets the value of the fridayWeek3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFridayWeek3() {
        return fridayWeek3;
    }

    /**
     * Sets the value of the fridayWeek3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFridayWeek3(BigDecimal value) {
        this.fridayWeek3 = value;
    }

    /**
     * Gets the value of the fridayWeek4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFridayWeek4() {
        return fridayWeek4;
    }

    /**
     * Sets the value of the fridayWeek4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFridayWeek4(BigDecimal value) {
        this.fridayWeek4 = value;
    }

    /**
     * Gets the value of the fridayWeek5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFridayWeek5() {
        return fridayWeek5;
    }

    /**
     * Sets the value of the fridayWeek5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFridayWeek5(BigDecimal value) {
        this.fridayWeek5 = value;
    }

}
