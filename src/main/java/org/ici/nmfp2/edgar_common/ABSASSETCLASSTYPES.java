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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ABS_ASSET_CLASS_TYPES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ABS_ASSET_CLASS_TYPES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="absAssetClass" type="{http://www.sec.gov/edgar/common}ABS_ASSET_CLASS_TYPE" maxOccurs="17" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABS_ASSET_CLASS_TYPES", propOrder = {
    "absAssetClass"
})
public class ABSASSETCLASSTYPES {

    @XmlSchemaType(name = "token")
    protected List<ABSASSETCLASSTYPE> absAssetClass;

    /**
     * Gets the value of the absAssetClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absAssetClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsAssetClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ABSASSETCLASSTYPE }
     * 
     * 
     */
    public List<ABSASSETCLASSTYPE> getAbsAssetClass() {
        if (absAssetClass == null) {
            absAssetClass = new ArrayList<ABSASSETCLASSTYPE>();
        }
        return this.absAssetClass;
    }

}
