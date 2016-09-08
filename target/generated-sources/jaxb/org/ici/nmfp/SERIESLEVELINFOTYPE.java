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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.ici.nmfp.common.NETASSETVALUE;
import org.ici.nmfp.common.PERCENTAGEOFTOTALASSETINVESTED;
import org.ici.nmfp.common.PERCENTAGEOFTOTALASSETINVESTEDDAILY;
import org.ici.nmfp.common.TOTALVALUEOFLIQUIDASSET;
import org.ici.nmfp.common.TOTALVALUEOFLIQUIDASSETDAILY;
import org.ici.nmfp.edgar_common.YESNOTYPE;


/**
 * These elements are part of the SERIES_LEVEL_INFO_TYPE group
 * 
 * <p>Java class for SERIES_LEVEL_INFO_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERIES_LEVEL_INFO_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="securitiesActFileNumber" type="{http://www.sec.gov/edgar/common}FILE_NUMBER_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="adviser" type="{http://www.sec.gov/edgar/nmfp2}ADVISER_TYPE" maxOccurs="10"/&gt;
 *         &lt;element name="subAdviser" type="{http://www.sec.gov/edgar/nmfp2}ADVISER_TYPE" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="indpPubAccountant" type="{http://www.sec.gov/edgar/nmfp2}INDP_PUB_ACCOUNTANT_TYPE"/&gt;
 *         &lt;element name="administrator" type="{http://www.sec.gov/edgar/nmfp2}ADMINISTRATOR_TYPE" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="transferAgent" type="{http://www.sec.gov/edgar/nmfp2}TRANSFER_AGENT_TYPE" maxOccurs="10"/&gt;
 *         &lt;element name="feederFundFlag" type="{http://www.sec.gov/edgar/common}YES_NO_TYPE"/&gt;
 *         &lt;element name="masterFeederFund" type="{http://www.sec.gov/edgar/nmfp2}FEEDER_FUND_INFO_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="masterFundFlag" type="{http://www.sec.gov/edgar/common}YES_NO_TYPE"/&gt;
 *         &lt;element name="feederFund" type="{http://www.sec.gov/edgar/nmfp2}FEEDER_FUND_INFO_TYPE" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element name="seriesFundInsuCmpnySepAccntFlag" type="{http://www.sec.gov/edgar/common}YES_NO_TYPE"/&gt;
 *         &lt;element name="moneyMarketFundCategory" type="{http://www.sec.gov/edgar/nmfp2}MARKET_FUND_CATEGORY_TYPE"/&gt;
 *         &lt;element name="fundExemptRetailFlag" type="{http://www.sec.gov/edgar/common}YES_NO_TYPE"/&gt;
 *         &lt;element name="averagePortfolioMaturity" type="{http://www.sec.gov/edgar/nmfp2common}INT_2_TYPE"/&gt;
 *         &lt;element name="averageLifeMaturity" type="{http://www.sec.gov/edgar/nmfp2common}INT_3_TYPE"/&gt;
 *         &lt;element name="totalValueDailyLiquidAssets" type="{http://www.sec.gov/edgar/nmfp2common}TOTAL_VALUE_OF_LIQUID_ASSET_DAILY" minOccurs="0"/&gt;
 *         &lt;element name="totalValueWeeklyLiquidAssets" type="{http://www.sec.gov/edgar/nmfp2common}TOTAL_VALUE_OF_LIQUID_ASSET"/&gt;
 *         &lt;element name="percentageDailyLiquidAssets" type="{http://www.sec.gov/edgar/nmfp2common}PERCENTAGE_OF_TOTAL_ASSET_INVESTED_DAILY" minOccurs="0"/&gt;
 *         &lt;element name="percentageWeeklyLiquidAssets" type="{http://www.sec.gov/edgar/nmfp2common}PERCENTAGE_OF_TOTAL_ASSET_INVESTED"/&gt;
 *         &lt;element name="cash" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_14_TYPE"/&gt;
 *         &lt;element name="totalValuePortfolioSecurities" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_14_TYPE"/&gt;
 *         &lt;element name="amortizedCostPortfolioSecurities" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_14_TYPE"/&gt;
 *         &lt;element name="totalValueOtherAssets" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_14_TYPE2"/&gt;
 *         &lt;element name="totalValueLiabilities" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_14_TYPE"/&gt;
 *         &lt;element name="netAssetOfSeries" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_14_TYPE"/&gt;
 *         &lt;element name="numberOfSharesOutstanding" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_16_TYPE"/&gt;
 *         &lt;element name="stablePricePerShare" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_8_TYPE2" minOccurs="0"/&gt;
 *         &lt;element name="sevenDayGrossYield" type="{http://www.sec.gov/edgar/nmfp2common}DECIMAL_5_TYPE3"/&gt;
 *         &lt;element name="netAssetValue" type="{http://www.sec.gov/edgar/nmfp2common}NET_ASSET_VALUE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERIES_LEVEL_INFO_TYPE", propOrder = {
    "securitiesActFileNumber",
    "adviser",
    "subAdviser",
    "indpPubAccountant",
    "administrator",
    "transferAgent",
    "feederFundFlag",
    "masterFeederFund",
    "masterFundFlag",
    "feederFund",
    "seriesFundInsuCmpnySepAccntFlag",
    "moneyMarketFundCategory",
    "fundExemptRetailFlag",
    "averagePortfolioMaturity",
    "averageLifeMaturity",
    "totalValueDailyLiquidAssets",
    "totalValueWeeklyLiquidAssets",
    "percentageDailyLiquidAssets",
    "percentageWeeklyLiquidAssets",
    "cash",
    "totalValuePortfolioSecurities",
    "amortizedCostPortfolioSecurities",
    "totalValueOtherAssets",
    "totalValueLiabilities",
    "netAssetOfSeries",
    "numberOfSharesOutstanding",
    "stablePricePerShare",
    "sevenDayGrossYield",
    "netAssetValue"
})
public class SERIESLEVELINFOTYPE {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securitiesActFileNumber;
    @XmlElement(required = true)
    protected List<ADVISERTYPE> adviser;
    protected List<ADVISERTYPE> subAdviser;
    @XmlElement(required = true)
    protected INDPPUBACCOUNTANTTYPE indpPubAccountant;
    protected List<ADMINISTRATORTYPE> administrator;
    @XmlElement(required = true)
    protected List<TRANSFERAGENTTYPE> transferAgent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected YESNOTYPE feederFundFlag;
    protected FEEDERFUNDINFOTYPE masterFeederFund;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected YESNOTYPE masterFundFlag;
    protected List<FEEDERFUNDINFOTYPE> feederFund;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected YESNOTYPE seriesFundInsuCmpnySepAccntFlag;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected MARKETFUNDCATEGORYTYPE moneyMarketFundCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected YESNOTYPE fundExemptRetailFlag;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger averagePortfolioMaturity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger averageLifeMaturity;
    protected TOTALVALUEOFLIQUIDASSETDAILY totalValueDailyLiquidAssets;
    @XmlElement(required = true)
    protected TOTALVALUEOFLIQUIDASSET totalValueWeeklyLiquidAssets;
    protected PERCENTAGEOFTOTALASSETINVESTEDDAILY percentageDailyLiquidAssets;
    @XmlElement(required = true)
    protected PERCENTAGEOFTOTALASSETINVESTED percentageWeeklyLiquidAssets;
    @XmlElement(required = true)
    protected BigDecimal cash;
    @XmlElement(required = true)
    protected BigDecimal totalValuePortfolioSecurities;
    @XmlElement(required = true)
    protected BigDecimal amortizedCostPortfolioSecurities;
    @XmlElement(required = true)
    protected BigDecimal totalValueOtherAssets;
    @XmlElement(required = true)
    protected BigDecimal totalValueLiabilities;
    @XmlElement(required = true)
    protected BigDecimal netAssetOfSeries;
    @XmlElement(required = true)
    protected BigDecimal numberOfSharesOutstanding;
    protected BigDecimal stablePricePerShare;
    @XmlElement(required = true)
    protected BigDecimal sevenDayGrossYield;
    @XmlElement(required = true)
    protected NETASSETVALUE netAssetValue;

    /**
     * Gets the value of the securitiesActFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritiesActFileNumber() {
        return securitiesActFileNumber;
    }

    /**
     * Sets the value of the securitiesActFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritiesActFileNumber(String value) {
        this.securitiesActFileNumber = value;
    }

    /**
     * Gets the value of the adviser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adviser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdviser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADVISERTYPE }
     * 
     * 
     */
    public List<ADVISERTYPE> getAdviser() {
        if (adviser == null) {
            adviser = new ArrayList<ADVISERTYPE>();
        }
        return this.adviser;
    }

    /**
     * Gets the value of the subAdviser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAdviser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAdviser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADVISERTYPE }
     * 
     * 
     */
    public List<ADVISERTYPE> getSubAdviser() {
        if (subAdviser == null) {
            subAdviser = new ArrayList<ADVISERTYPE>();
        }
        return this.subAdviser;
    }

    /**
     * Gets the value of the indpPubAccountant property.
     * 
     * @return
     *     possible object is
     *     {@link INDPPUBACCOUNTANTTYPE }
     *     
     */
    public INDPPUBACCOUNTANTTYPE getIndpPubAccountant() {
        return indpPubAccountant;
    }

    /**
     * Sets the value of the indpPubAccountant property.
     * 
     * @param value
     *     allowed object is
     *     {@link INDPPUBACCOUNTANTTYPE }
     *     
     */
    public void setIndpPubAccountant(INDPPUBACCOUNTANTTYPE value) {
        this.indpPubAccountant = value;
    }

    /**
     * Gets the value of the administrator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADMINISTRATORTYPE }
     * 
     * 
     */
    public List<ADMINISTRATORTYPE> getAdministrator() {
        if (administrator == null) {
            administrator = new ArrayList<ADMINISTRATORTYPE>();
        }
        return this.administrator;
    }

    /**
     * Gets the value of the transferAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRANSFERAGENTTYPE }
     * 
     * 
     */
    public List<TRANSFERAGENTTYPE> getTransferAgent() {
        if (transferAgent == null) {
            transferAgent = new ArrayList<TRANSFERAGENTTYPE>();
        }
        return this.transferAgent;
    }

    /**
     * Gets the value of the feederFundFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YESNOTYPE }
     *     
     */
    public YESNOTYPE getFeederFundFlag() {
        return feederFundFlag;
    }

    /**
     * Sets the value of the feederFundFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YESNOTYPE }
     *     
     */
    public void setFeederFundFlag(YESNOTYPE value) {
        this.feederFundFlag = value;
    }

    /**
     * Gets the value of the masterFeederFund property.
     * 
     * @return
     *     possible object is
     *     {@link FEEDERFUNDINFOTYPE }
     *     
     */
    public FEEDERFUNDINFOTYPE getMasterFeederFund() {
        return masterFeederFund;
    }

    /**
     * Sets the value of the masterFeederFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEDERFUNDINFOTYPE }
     *     
     */
    public void setMasterFeederFund(FEEDERFUNDINFOTYPE value) {
        this.masterFeederFund = value;
    }

    /**
     * Gets the value of the masterFundFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YESNOTYPE }
     *     
     */
    public YESNOTYPE getMasterFundFlag() {
        return masterFundFlag;
    }

    /**
     * Sets the value of the masterFundFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YESNOTYPE }
     *     
     */
    public void setMasterFundFlag(YESNOTYPE value) {
        this.masterFundFlag = value;
    }

    /**
     * Gets the value of the feederFund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feederFund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeederFund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEEDERFUNDINFOTYPE }
     * 
     * 
     */
    public List<FEEDERFUNDINFOTYPE> getFeederFund() {
        if (feederFund == null) {
            feederFund = new ArrayList<FEEDERFUNDINFOTYPE>();
        }
        return this.feederFund;
    }

    /**
     * Gets the value of the seriesFundInsuCmpnySepAccntFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YESNOTYPE }
     *     
     */
    public YESNOTYPE getSeriesFundInsuCmpnySepAccntFlag() {
        return seriesFundInsuCmpnySepAccntFlag;
    }

    /**
     * Sets the value of the seriesFundInsuCmpnySepAccntFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YESNOTYPE }
     *     
     */
    public void setSeriesFundInsuCmpnySepAccntFlag(YESNOTYPE value) {
        this.seriesFundInsuCmpnySepAccntFlag = value;
    }

    /**
     * Gets the value of the moneyMarketFundCategory property.
     * 
     * @return
     *     possible object is
     *     {@link MARKETFUNDCATEGORYTYPE }
     *     
     */
    public MARKETFUNDCATEGORYTYPE getMoneyMarketFundCategory() {
        return moneyMarketFundCategory;
    }

    /**
     * Sets the value of the moneyMarketFundCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKETFUNDCATEGORYTYPE }
     *     
     */
    public void setMoneyMarketFundCategory(MARKETFUNDCATEGORYTYPE value) {
        this.moneyMarketFundCategory = value;
    }

    /**
     * Gets the value of the fundExemptRetailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YESNOTYPE }
     *     
     */
    public YESNOTYPE getFundExemptRetailFlag() {
        return fundExemptRetailFlag;
    }

    /**
     * Sets the value of the fundExemptRetailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YESNOTYPE }
     *     
     */
    public void setFundExemptRetailFlag(YESNOTYPE value) {
        this.fundExemptRetailFlag = value;
    }

    /**
     * Gets the value of the averagePortfolioMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAveragePortfolioMaturity() {
        return averagePortfolioMaturity;
    }

    /**
     * Sets the value of the averagePortfolioMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAveragePortfolioMaturity(BigInteger value) {
        this.averagePortfolioMaturity = value;
    }

    /**
     * Gets the value of the averageLifeMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageLifeMaturity() {
        return averageLifeMaturity;
    }

    /**
     * Sets the value of the averageLifeMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageLifeMaturity(BigInteger value) {
        this.averageLifeMaturity = value;
    }

    /**
     * Gets the value of the totalValueDailyLiquidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link TOTALVALUEOFLIQUIDASSETDAILY }
     *     
     */
    public TOTALVALUEOFLIQUIDASSETDAILY getTotalValueDailyLiquidAssets() {
        return totalValueDailyLiquidAssets;
    }

    /**
     * Sets the value of the totalValueDailyLiquidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOTALVALUEOFLIQUIDASSETDAILY }
     *     
     */
    public void setTotalValueDailyLiquidAssets(TOTALVALUEOFLIQUIDASSETDAILY value) {
        this.totalValueDailyLiquidAssets = value;
    }

    /**
     * Gets the value of the totalValueWeeklyLiquidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link TOTALVALUEOFLIQUIDASSET }
     *     
     */
    public TOTALVALUEOFLIQUIDASSET getTotalValueWeeklyLiquidAssets() {
        return totalValueWeeklyLiquidAssets;
    }

    /**
     * Sets the value of the totalValueWeeklyLiquidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOTALVALUEOFLIQUIDASSET }
     *     
     */
    public void setTotalValueWeeklyLiquidAssets(TOTALVALUEOFLIQUIDASSET value) {
        this.totalValueWeeklyLiquidAssets = value;
    }

    /**
     * Gets the value of the percentageDailyLiquidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link PERCENTAGEOFTOTALASSETINVESTEDDAILY }
     *     
     */
    public PERCENTAGEOFTOTALASSETINVESTEDDAILY getPercentageDailyLiquidAssets() {
        return percentageDailyLiquidAssets;
    }

    /**
     * Sets the value of the percentageDailyLiquidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERCENTAGEOFTOTALASSETINVESTEDDAILY }
     *     
     */
    public void setPercentageDailyLiquidAssets(PERCENTAGEOFTOTALASSETINVESTEDDAILY value) {
        this.percentageDailyLiquidAssets = value;
    }

    /**
     * Gets the value of the percentageWeeklyLiquidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link PERCENTAGEOFTOTALASSETINVESTED }
     *     
     */
    public PERCENTAGEOFTOTALASSETINVESTED getPercentageWeeklyLiquidAssets() {
        return percentageWeeklyLiquidAssets;
    }

    /**
     * Sets the value of the percentageWeeklyLiquidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERCENTAGEOFTOTALASSETINVESTED }
     *     
     */
    public void setPercentageWeeklyLiquidAssets(PERCENTAGEOFTOTALASSETINVESTED value) {
        this.percentageWeeklyLiquidAssets = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCash(BigDecimal value) {
        this.cash = value;
    }

    /**
     * Gets the value of the totalValuePortfolioSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValuePortfolioSecurities() {
        return totalValuePortfolioSecurities;
    }

    /**
     * Sets the value of the totalValuePortfolioSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValuePortfolioSecurities(BigDecimal value) {
        this.totalValuePortfolioSecurities = value;
    }

    /**
     * Gets the value of the amortizedCostPortfolioSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmortizedCostPortfolioSecurities() {
        return amortizedCostPortfolioSecurities;
    }

    /**
     * Sets the value of the amortizedCostPortfolioSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmortizedCostPortfolioSecurities(BigDecimal value) {
        this.amortizedCostPortfolioSecurities = value;
    }

    /**
     * Gets the value of the totalValueOtherAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValueOtherAssets() {
        return totalValueOtherAssets;
    }

    /**
     * Sets the value of the totalValueOtherAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValueOtherAssets(BigDecimal value) {
        this.totalValueOtherAssets = value;
    }

    /**
     * Gets the value of the totalValueLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValueLiabilities() {
        return totalValueLiabilities;
    }

    /**
     * Sets the value of the totalValueLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValueLiabilities(BigDecimal value) {
        this.totalValueLiabilities = value;
    }

    /**
     * Gets the value of the netAssetOfSeries property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAssetOfSeries() {
        return netAssetOfSeries;
    }

    /**
     * Sets the value of the netAssetOfSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAssetOfSeries(BigDecimal value) {
        this.netAssetOfSeries = value;
    }

    /**
     * Gets the value of the numberOfSharesOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfSharesOutstanding() {
        return numberOfSharesOutstanding;
    }

    /**
     * Sets the value of the numberOfSharesOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfSharesOutstanding(BigDecimal value) {
        this.numberOfSharesOutstanding = value;
    }

    /**
     * Gets the value of the stablePricePerShare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStablePricePerShare() {
        return stablePricePerShare;
    }

    /**
     * Sets the value of the stablePricePerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStablePricePerShare(BigDecimal value) {
        this.stablePricePerShare = value;
    }

    /**
     * Gets the value of the sevenDayGrossYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSevenDayGrossYield() {
        return sevenDayGrossYield;
    }

    /**
     * Sets the value of the sevenDayGrossYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSevenDayGrossYield(BigDecimal value) {
        this.sevenDayGrossYield = value;
    }

    /**
     * Gets the value of the netAssetValue property.
     * 
     * @return
     *     possible object is
     *     {@link NETASSETVALUE }
     *     
     */
    public NETASSETVALUE getNetAssetValue() {
        return netAssetValue;
    }

    /**
     * Sets the value of the netAssetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NETASSETVALUE }
     *     
     */
    public void setNetAssetValue(NETASSETVALUE value) {
        this.netAssetValue = value;
    }

}
