//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 04:46:12 PM EDT 
//


package org.ici.nmfp.edgar_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONFIDENTIAL_DOCUMENTS_TYPE1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONFIDENTIAL_DOCUMENTS_TYPE1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="document" type="{http://www.sec.gov/edgar/common}CONFIDENTIAL_DOCUMENT_TYPE1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONFIDENTIAL_DOCUMENTS_TYPE1", propOrder = {
    "document"
})
public class CONFIDENTIALDOCUMENTSTYPE1 {

    @XmlElement(required = true)
    protected List<CONFIDENTIALDOCUMENTTYPE1> document;

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONFIDENTIALDOCUMENTTYPE1 }
     * 
     * 
     */
    public List<CONFIDENTIALDOCUMENTTYPE1> getDocument() {
        if (document == null) {
            document = new ArrayList<CONFIDENTIALDOCUMENTTYPE1>();
        }
        return this.document;
    }

}
