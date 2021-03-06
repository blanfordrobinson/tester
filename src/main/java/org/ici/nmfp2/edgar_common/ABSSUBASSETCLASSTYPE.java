//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2.edgar_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ABS_SUB_ASSET_CLASS_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ABS_SUB_ASSET_CLASS_TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Residential mortgages - Prime"/&gt;
 *     &lt;enumeration value="Residential mortgages - Non-Prime"/&gt;
 *     &lt;enumeration value="Residential mortgages - HELOC"/&gt;
 *     &lt;enumeration value="Residential mortgages - Reverse Mortgages"/&gt;
 *     &lt;enumeration value="Residential mortgages - Manufactured Housing"/&gt;
 *     &lt;enumeration value="Residential mortgages - Other/Combined"/&gt;
 *     &lt;enumeration value="Commercial mortgages"/&gt;
 *     &lt;enumeration value="Auto loans"/&gt;
 *     &lt;enumeration value="Auto leases"/&gt;
 *     &lt;enumeration value="Equipment leases"/&gt;
 *     &lt;enumeration value="Equipment loans"/&gt;
 *     &lt;enumeration value="Student loans"/&gt;
 *     &lt;enumeration value="Floorplan financings"/&gt;
 *     &lt;enumeration value="Debt Securities"/&gt;
 *     &lt;enumeration value="Credit card"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ABS_SUB_ASSET_CLASS_TYPE")
@XmlEnum
public enum ABSSUBASSETCLASSTYPE {

    @XmlEnumValue("Residential mortgages - Prime")
    RESIDENTIAL_MORTGAGES_PRIME("Residential mortgages - Prime"),
    @XmlEnumValue("Residential mortgages - Non-Prime")
    RESIDENTIAL_MORTGAGES_NON_PRIME("Residential mortgages - Non-Prime"),
    @XmlEnumValue("Residential mortgages - HELOC")
    RESIDENTIAL_MORTGAGES_HELOC("Residential mortgages - HELOC"),
    @XmlEnumValue("Residential mortgages - Reverse Mortgages")
    RESIDENTIAL_MORTGAGES_REVERSE_MORTGAGES("Residential mortgages - Reverse Mortgages"),
    @XmlEnumValue("Residential mortgages - Manufactured Housing")
    RESIDENTIAL_MORTGAGES_MANUFACTURED_HOUSING("Residential mortgages - Manufactured Housing"),
    @XmlEnumValue("Residential mortgages - Other/Combined")
    RESIDENTIAL_MORTGAGES_OTHER_COMBINED("Residential mortgages - Other/Combined"),
    @XmlEnumValue("Commercial mortgages")
    COMMERCIAL_MORTGAGES("Commercial mortgages"),
    @XmlEnumValue("Auto loans")
    AUTO_LOANS("Auto loans"),
    @XmlEnumValue("Auto leases")
    AUTO_LEASES("Auto leases"),
    @XmlEnumValue("Equipment leases")
    EQUIPMENT_LEASES("Equipment leases"),
    @XmlEnumValue("Equipment loans")
    EQUIPMENT_LOANS("Equipment loans"),
    @XmlEnumValue("Student loans")
    STUDENT_LOANS("Student loans"),
    @XmlEnumValue("Floorplan financings")
    FLOORPLAN_FINANCINGS("Floorplan financings"),
    @XmlEnumValue("Debt Securities")
    DEBT_SECURITIES("Debt Securities"),
    @XmlEnumValue("Credit card")
    CREDIT_CARD("Credit card"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ABSSUBASSETCLASSTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ABSSUBASSETCLASSTYPE fromValue(String v) {
        for (ABSSUBASSETCLASSTYPE c: ABSSUBASSETCLASSTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
