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
import java.util.ArrayList;
import java.util.List;


/**
 * Group of module segment type elements
 * 			
 * 
 * <p>Java class for MODULES_SEGMENT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MODULES_SEGMENT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleSegment" type="{http://www.sec.gov/edgar/common}MODULE_SEGMENT_TYPE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODULES_SEGMENT_TYPE", propOrder = {
    "moduleSegment"
})
public class MODULESSEGMENTTYPE {

    @XmlElement(required = true)
    protected List<MODULESEGMENTTYPE> moduleSegment;

    /**
     * Gets the value of the moduleSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODULESEGMENTTYPE }
     * 
     * 
     */
    public List<MODULESEGMENTTYPE> getModuleSegment() {
        if (moduleSegment == null) {
            moduleSegment = new ArrayList<MODULESEGMENTTYPE>();
        }
        return this.moduleSegment;
    }

}