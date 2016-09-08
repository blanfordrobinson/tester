//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:42:33 AM EDT 
//


package org.ici.nmfp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INVESTMENT_CATEGORY_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="INVESTMENT_CATEGORY_TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="U.S. Treasury Debt"/&gt;
 *     &lt;enumeration value="U.S. Government Agency Debt"/&gt;
 *     &lt;enumeration value="Non-U.S. Sovereign, Sub-Sovereign and Supra-National debt"/&gt;
 *     &lt;enumeration value="Certificate of Deposit"/&gt;
 *     &lt;enumeration value="Non-Negotiable Time Deposit"/&gt;
 *     &lt;enumeration value="Variable Rate Demand Note"/&gt;
 *     &lt;enumeration value="Other Municipal Security"/&gt;
 *     &lt;enumeration value="Asset Backed Commercial Paper"/&gt;
 *     &lt;enumeration value="Other Asset Backed Securities"/&gt;
 *     &lt;enumeration value="U.S. Treasury Repurchase Agreement, if collateralized only by U.S. Treasuries (including Strips) and cash"/&gt;
 *     &lt;enumeration value="U.S. Government Agency Repurchase Agreement, collateralized only by U.S. Government Agency securities, U.S. Treasuries, and cash"/&gt;
 *     &lt;enumeration value="Other Repurchase Agreement, if any collateral falls outside Treasury, Government Agency and cash"/&gt;
 *     &lt;enumeration value="Insurance Company Funding Agreement"/&gt;
 *     &lt;enumeration value="Investment Company"/&gt;
 *     &lt;enumeration value="Financial Company Commercial Paper"/&gt;
 *     &lt;enumeration value="Non-Financial Company Commercial Paper"/&gt;
 *     &lt;enumeration value="Tender Option Bond"/&gt;
 *     &lt;enumeration value="Other Instrument"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "INVESTMENT_CATEGORY_TYPE")
@XmlEnum
public enum INVESTMENTCATEGORYTYPE {

    /*
    @XmlEnumValue("U.S. Treasury Debt")
    U_S_TREASURY_DEBT("U.S. Treasury Debt"),
    @XmlEnumValue("U.S. Government Agency Debt")
    U_S_GOVERNMENT_AGENCY_DEBT("U.S. Government Agency Debt"),
    @XmlEnumValue("Non-U.S. Sovereign, Sub-Sovereign and Supra-National debt")
    NON_U_S_SOVEREIGN_SUB_SOVEREIGN_AND_SUPRA_NATIONAL_DEBT("Non-U.S. Sovereign, Sub-Sovereign and Supra-National debt"),
    @XmlEnumValue("Certificate of Deposit")
    CERTIFICATE_OF_DEPOSIT("Certificate of Deposit"),
    @XmlEnumValue("Non-Negotiable Time Deposit")
    NON_NEGOTIABLE_TIME_DEPOSIT("Non-Negotiable Time Deposit"),
    @XmlEnumValue("Variable Rate Demand Note")
    VARIABLE_RATE_DEMAND_NOTE("Variable Rate Demand Note"),
    @XmlEnumValue("Other Municipal Security")
    OTHER_MUNICIPAL_SECURITY("Other Municipal Security"),
    @XmlEnumValue("Asset Backed Commercial Paper")
    ASSET_BACKED_COMMERCIAL_PAPER("Asset Backed Commercial Paper"),
    @XmlEnumValue("Other Asset Backed Securities")
    OTHER_ASSET_BACKED_SECURITIES("Other Asset Backed Securities"),
    @XmlEnumValue("U.S. Treasury Repurchase Agreement, if collateralized only by U.S. Treasuries (including Strips) and cash")
    U_S_TREASURY_REPURCHASE_AGREEMENT_IF_COLLATERALIZED_ONLY_BY_U_S_TREASURIES_INCLUDING_STRIPS_AND_CASH("U.S. Treasury Repurchase Agreement, if collateralized only by U.S. Treasuries (including Strips) and cash"),
    @XmlEnumValue("U.S. Government Agency Repurchase Agreement, collateralized only by U.S. Government Agency securities, U.S. Treasuries, and cash")
    U_S_GOVERNMENT_AGENCY_REPURCHASE_AGREEMENT_COLLATERALIZED_ONLY_BY_U_S_GOVERNMENT_AGENCY_SECURITIES_U_S_TREASURIES_AND_CASH("U.S. Government Agency Repurchase Agreement, collateralized only by U.S. Government Agency securities, U.S. Treasuries, and cash"),
    @XmlEnumValue("Other Repurchase Agreement, if any collateral falls outside Treasury, Government Agency and cash")
    OTHER_REPURCHASE_AGREEMENT_IF_ANY_COLLATERAL_FALLS_OUTSIDE_TREASURY_GOVERNMENT_AGENCY_AND_CASH("Other Repurchase Agreement, if any collateral falls outside Treasury, Government Agency and cash"),
    @XmlEnumValue("Insurance Company Funding Agreement")
    INSURANCE_COMPANY_FUNDING_AGREEMENT("Insurance Company Funding Agreement"),
    @XmlEnumValue("Investment Company")
    INVESTMENT_COMPANY("Investment Company"),
    @XmlEnumValue("Financial Company Commercial Paper")
    FINANCIAL_COMPANY_COMMERCIAL_PAPER("Financial Company Commercial Paper"),
    @XmlEnumValue("Non-Financial Company Commercial Paper")
    NON_FINANCIAL_COMPANY_COMMERCIAL_PAPER("Non-Financial Company Commercial Paper"),
    @XmlEnumValue("Tender Option Bond")
    TENDER_OPTION_BOND("Tender Option Bond"),
    @XmlEnumValue("Other Instrument")
    OTHER_INSTRUMENT("Other Instrument");
*/

    @XmlEnumValue("Treasury Debt")
    TREASURY_DEBT(1, "Treasury Debt"),
    @XmlEnumValue("U.S. Treasury Debt")
    U_S_TREASURY_DEBT(1, "U.S. Treasury Debt"),
    @XmlEnumValue("Government Agency Debt")
    GOVERNMENT_AGENCY_DEBT(2, "Government Agency Debt"),
    @XmlEnumValue("U.S. Government Agency Debt")
    U_S_GOVERNMENT_AGENCY_DEBT(2, "U.S. Government Agency Debt"),
    @XmlEnumValue("Non-U.S. Sovereign, Sub-Sovereign and Supra-National debt")
    NON_U_S_SOVEREIGN_SUB_SOVEREIGN_AND_SUPRA_NATIONAL_DEBT(17, "Non-U.S. Sovereign, Sub-Sovereign and Supra-National debt"),
    @XmlEnumValue("Certificate of Deposit")
    CERTIFICATE_OF_DEPOSIT(8, "Certificate of Deposit"),
    @XmlEnumValue("Non-Negotiable Time Deposit")
    NON_NEGOTIABLE_TIME_DEPOSIT(18, "Non-Negotiable Time Deposit"),
    @XmlEnumValue("Variable Rate Demand Note")
    VARIABLE_RATE_DEMAND_NOTE(3, "Variable Rate Demand Note"),
    @XmlEnumValue("Other Municipal Security")
    OTHER_MUNICIPAL_SECURITY(4, "Other Municipal Security"),
    @XmlEnumValue("Asset Backed Commercial Paper")
    ASSET_BACKED_COMMERCIAL_PAPER(6, "Asset Backed Commercial Paper"),
    @XmlEnumValue("Other Asset Backed Securities")
    OTHER_ASSET_BACKED_SECURITIES(19, "Other Asset Backed Securities"),
    @XmlEnumValue("U.S. Treasury Repurchase Agreement, if collateralized only by U.S. Treasuries (including Strips) and cash")
    U_S_TREASURY_REPURCHASE_AGREEMENT_IF_COLLATERALIZED_ONLY_BY_U_S_TREASURIES_INCLUDING_STRIPS_AND_CASH(11, "U.S. Treasury Repurchase Agreement, if collateralized only by U.S. Treasuries (including Strips) and cash"),
    @XmlEnumValue("U.S. Treasury Repurchase Agreement, if collateralized only by U.S. Treasuries (including Strips) and cash")
    TREASURY_REPURCHASE_AGREEMENT(11, "Treasury Repurchase Agreement"),
    @XmlEnumValue("U.S. Government Agency Repurchase Agreement, collateralized only by U.S. Government Agency securities, U.S. Treasuries, and cash")
    U_S_GOVERNMENT_AGENCY_REPURCHASE_AGREEMENT_COLLATERALIZED_ONLY_BY_U_S_GOVERNMENT_AGENCY_SECURITIES_U_S_TREASURIES_AND_CASH(12, "U.S. Government Agency Repurchase Agreement, collateralized only by U.S. Government Agency securities, U.S. Treasuries, and cash"),
    @XmlEnumValue("U.S. Government Agency Repurchase Agreement")
    GOVERNMENT_AGENCY_REPURCHASE_AGREEMENT(12, "Government Agency Repurchase Agreement"),
    @XmlEnumValue("Other Repurchase Agreement, if any collateral falls outside Treasury, Government Agency and cash")
    OTHER_REPURCHASE_AGREEMENT_IF_ANY_COLLATERAL_FALLS_OUTSIDE_TREASURY_GOVERNMENT_AGENCY_AND_CASH(13, "Other Repurchase Agreement, if any collateral falls outside Treasury, Government Agency and cash"),
    @XmlEnumValue("Insurance Company Funding Agreement")
    OTHER_REPURCHASE_AGREEMENT(13, "Other Repurchase Agreement"),
    @XmlEnumValue("Insurance Company Funding Agreement")
    INSURANCE_COMPANY_FUNDING_AGREEMENT(14, "Insurance Company Funding Agreement"),
    @XmlEnumValue("Investment Company")
    INVESTMENT_COMPANY(15, "Investment Company"),
    @XmlEnumValue("Financial Company Commercial Paper")
    FINANCIAL_COMPANY_COMMERCIAL_PAPER(5, "Financial Company Commercial Paper"),
    @XmlEnumValue("Non-Financial Company Commercial Paper")
    NON_FINANCIAL_COMPANY_COMMERCIAL_PAPER(21, "Non-Financial Company Commercial Paper"),
    @XmlEnumValue("Tender Option Bond")
    TENDER_OPTION_BOND(20, "Tender Option Bond"),
    @XmlEnumValue("Other Instrument")
    OTHER_INSTRUMENT(16, "Other Instrument"),
    @XmlEnumValue("Non-US Sovereign, Supranational")
    SUPRA(17, "Non-US Sovereign, Supranational"),
    @XmlEnumValue("Non Negotiable Time Deposit")
    TIME_DEP(18, "Non Negotiable Time Deposit"),
    @XmlEnumValue("Other Asset Backed Securities")
    OTHER_ABS(19, "Other Asset Backed Securities"),
    @XmlEnumValue("Tender Option Bond")
    TOB(20, "Tender Option Bond"),
    @XmlEnumValue("Non Financial Commercial Paper")
    NON_FIN_CP(21, "Non Financial Commercial Paper");

    private final int id;
    private final String value;

    INVESTMENTCATEGORYTYPE(int id, String v) {
        this.id = id;
        value = v;
    }

    public Integer id() {
        return id;
    }
    public String value() {
        return value;
    }

    public static INVESTMENTCATEGORYTYPE fromValue(String v) {
        for (INVESTMENTCATEGORYTYPE c: INVESTMENTCATEGORYTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
