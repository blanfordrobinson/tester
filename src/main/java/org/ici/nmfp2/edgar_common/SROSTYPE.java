//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2.edgar_common;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * If none applies, select the value "None".
 * 			
 * 
 * <p>Java class for SROS_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SROS_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sroId" type="{http://www.sec.gov/edgar/common}SRO_TYPE" maxOccurs="13"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SROS_TYPE", propOrder = {
    "sroId"
})
public class SROSTYPE {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected List<SROTYPE> sroId;

    /**
     * Gets the value of the sroId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sroId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSroId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SROTYPE }
     * 
     * 
     */
    public List<SROTYPE> getSroId() {
        if (sroId == null) {
            sroId = new ArrayList<SROTYPE>();
        }
        return this.sroId;
    }

}
