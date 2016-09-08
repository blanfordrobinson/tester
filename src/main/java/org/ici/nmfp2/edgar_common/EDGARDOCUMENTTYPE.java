//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2.edgar_common;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * Document names must be lower case and no longer
 * 				than thirty-two (32) characters in length. The names must start with
 * 				a letter (a-z) and may contain numbers (0-9) with no spaces.
 * 				Document names may contain one period (.), one hyphen (-), and one
 * 				underscore (_) character and must end with *.htm, *.txt, *.pdf,
 * 				*.fil, *.jpg, *.gif, *.xml or *.xsd extensions.
 * 
 * <p>Java class for EDGAR_DOCUMENT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDGAR_DOCUMENT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conformedName" type="{http://www.sec.gov/edgar/common}DOCUMENT_NAME_TYPE"/&gt;
 *         &lt;element name="conformedDocumentType" type="{http://www.sec.gov/edgar/common}SUB_DOCUMENT_TYPE"/&gt;
 *         &lt;element name="description" type="{http://www.sec.gov/edgar/common}DOCUMENT_DESCRIPTION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="contents" type="{http://www.sec.gov/edgar/common}DOCUMENT_MIME_BLOCK_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDGAR_DOCUMENT_TYPE", propOrder = {
    "conformedName",
    "conformedDocumentType",
    "description",
    "contents"
})
public class EDGARDOCUMENTTYPE {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conformedName;
    @XmlList
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> conformedDocumentType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String description;
    @XmlElement(required = true)
    protected String contents;

    /**
     * Gets the value of the conformedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformedName() {
        return conformedName;
    }

    /**
     * Sets the value of the conformedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformedName(String value) {
        this.conformedName = value;
    }

    /**
     * Gets the value of the conformedDocumentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conformedDocumentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConformedDocumentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConformedDocumentType() {
        if (conformedDocumentType == null) {
            conformedDocumentType = new ArrayList<String>();
        }
        return this.conformedDocumentType;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

}
