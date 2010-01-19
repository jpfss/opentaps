package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity SalesForecastHistory.
 */
@javax.persistence.Entity
@Table(name="SALES_FORECAST_HISTORY")
public class SalesForecastHistory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("salesForecastHistoryId", "SALES_FORECAST_HISTORY_ID");
        fields.put("salesForecastId", "SALES_FORECAST_ID");
        fields.put("parentSalesForecastId", "PARENT_SALES_FORECAST_ID");
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("internalPartyId", "INTERNAL_PARTY_ID");
        fields.put("customTimePeriodId", "CUSTOM_TIME_PERIOD_ID");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("quotaAmount", "QUOTA_AMOUNT");
        fields.put("forecastAmount", "FORECAST_AMOUNT");
        fields.put("bestCaseAmount", "BEST_CASE_AMOUNT");
        fields.put("closedAmount", "CLOSED_AMOUNT");
        fields.put("percentOfQuotaForecast", "PERCENT_OF_QUOTA_FORECAST");
        fields.put("percentOfQuotaClosed", "PERCENT_OF_QUOTA_CLOSED");
        fields.put("changeNote", "CHANGE_NOTE");
        fields.put("modifiedByUserLoginId", "MODIFIED_BY_USER_LOGIN_ID");
        fields.put("modifiedTimestamp", "MODIFIED_TIMESTAMP");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SalesForecastHistory", fields);
}
  public static enum Fields implements EntityFieldInterface<SalesForecastHistory> {
    salesForecastHistoryId("salesForecastHistoryId"),
    salesForecastId("salesForecastId"),
    parentSalesForecastId("parentSalesForecastId"),
    organizationPartyId("organizationPartyId"),
    internalPartyId("internalPartyId"),
    customTimePeriodId("customTimePeriodId"),
    currencyUomId("currencyUomId"),
    quotaAmount("quotaAmount"),
    forecastAmount("forecastAmount"),
    bestCaseAmount("bestCaseAmount"),
    closedAmount("closedAmount"),
    percentOfQuotaForecast("percentOfQuotaForecast"),
    percentOfQuotaClosed("percentOfQuotaClosed"),
    changeNote("changeNote"),
    modifiedByUserLoginId("modifiedByUserLoginId"),
    modifiedTimestamp("modifiedTimestamp"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="SalesForecastHistory_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SalesForecastHistory_GEN")
   @Id
   @Column(name="SALES_FORECAST_HISTORY_ID")
   private String salesForecastHistoryId;
   @Column(name="SALES_FORECAST_ID")
   private String salesForecastId;
   @Column(name="PARENT_SALES_FORECAST_ID")
   private String parentSalesForecastId;
   @Column(name="ORGANIZATION_PARTY_ID")
   private String organizationPartyId;
   @Column(name="INTERNAL_PARTY_ID")
   private String internalPartyId;
   @Column(name="CUSTOM_TIME_PERIOD_ID")
   private String customTimePeriodId;
   @Column(name="CURRENCY_UOM_ID")
   private String currencyUomId;
   @Column(name="QUOTA_AMOUNT")
   private BigDecimal quotaAmount;
   @Column(name="FORECAST_AMOUNT")
   private BigDecimal forecastAmount;
   @Column(name="BEST_CASE_AMOUNT")
   private BigDecimal bestCaseAmount;
   @Column(name="CLOSED_AMOUNT")
   private BigDecimal closedAmount;
   @Column(name="PERCENT_OF_QUOTA_FORECAST")
   private BigDecimal percentOfQuotaForecast;
   @Column(name="PERCENT_OF_QUOTA_CLOSED")
   private BigDecimal percentOfQuotaClosed;
   @Column(name="CHANGE_NOTE")
   private String changeNote;
   @Column(name="MODIFIED_BY_USER_LOGIN_ID")
   private String modifiedByUserLoginId;
   @Column(name="MODIFIED_TIMESTAMP")
   private Timestamp modifiedTimestamp;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SALES_FORECAST_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SalesForecast salesForecast = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORGANIZATION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party organizationParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INTERNAL_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party internalParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUSTOM_TIME_PERIOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustomTimePeriod customTimePeriod = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="MODIFIED_BY_USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin modifiedByUserLogin = null;

  /**
   * Default constructor.
   */
  public SalesForecastHistory() {
      super();
      this.baseEntityName = "SalesForecastHistory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("salesForecastHistoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("salesForecastHistoryId");this.allFieldsNames.add("salesForecastId");this.allFieldsNames.add("parentSalesForecastId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("internalPartyId");this.allFieldsNames.add("customTimePeriodId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("quotaAmount");this.allFieldsNames.add("forecastAmount");this.allFieldsNames.add("bestCaseAmount");this.allFieldsNames.add("closedAmount");this.allFieldsNames.add("percentOfQuotaForecast");this.allFieldsNames.add("percentOfQuotaClosed");this.allFieldsNames.add("changeNote");this.allFieldsNames.add("modifiedByUserLoginId");this.allFieldsNames.add("modifiedTimestamp");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SalesForecastHistory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param salesForecastHistoryId the salesForecastHistoryId to set
     */
    public void setSalesForecastHistoryId(String salesForecastHistoryId) {
        this.salesForecastHistoryId = salesForecastHistoryId;
    }
    /**
     * Auto generated value setter.
     * @param salesForecastId the salesForecastId to set
     */
    public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }
    /**
     * Auto generated value setter.
     * @param parentSalesForecastId the parentSalesForecastId to set
     */
    public void setParentSalesForecastId(String parentSalesForecastId) {
        this.parentSalesForecastId = parentSalesForecastId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param internalPartyId the internalPartyId to set
     */
    public void setInternalPartyId(String internalPartyId) {
        this.internalPartyId = internalPartyId;
    }
    /**
     * Auto generated value setter.
     * @param customTimePeriodId the customTimePeriodId to set
     */
    public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param quotaAmount the quotaAmount to set
     */
    public void setQuotaAmount(BigDecimal quotaAmount) {
        this.quotaAmount = quotaAmount;
    }
    /**
     * Auto generated value setter.
     * @param forecastAmount the forecastAmount to set
     */
    public void setForecastAmount(BigDecimal forecastAmount) {
        this.forecastAmount = forecastAmount;
    }
    /**
     * Auto generated value setter.
     * @param bestCaseAmount the bestCaseAmount to set
     */
    public void setBestCaseAmount(BigDecimal bestCaseAmount) {
        this.bestCaseAmount = bestCaseAmount;
    }
    /**
     * Auto generated value setter.
     * @param closedAmount the closedAmount to set
     */
    public void setClosedAmount(BigDecimal closedAmount) {
        this.closedAmount = closedAmount;
    }
    /**
     * Auto generated value setter.
     * @param percentOfQuotaForecast the percentOfQuotaForecast to set
     */
    public void setPercentOfQuotaForecast(BigDecimal percentOfQuotaForecast) {
        this.percentOfQuotaForecast = percentOfQuotaForecast;
    }
    /**
     * Auto generated value setter.
     * @param percentOfQuotaClosed the percentOfQuotaClosed to set
     */
    public void setPercentOfQuotaClosed(BigDecimal percentOfQuotaClosed) {
        this.percentOfQuotaClosed = percentOfQuotaClosed;
    }
    /**
     * Auto generated value setter.
     * @param changeNote the changeNote to set
     */
    public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }
    /**
     * Auto generated value setter.
     * @param modifiedByUserLoginId the modifiedByUserLoginId to set
     */
    public void setModifiedByUserLoginId(String modifiedByUserLoginId) {
        this.modifiedByUserLoginId = modifiedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param modifiedTimestamp the modifiedTimestamp to set
     */
    public void setModifiedTimestamp(Timestamp modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesForecastHistoryId() {
        return this.salesForecastHistoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesForecastId() {
        return this.salesForecastId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentSalesForecastId() {
        return this.parentSalesForecastId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInternalPartyId() {
        return this.internalPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustomTimePeriodId() {
        return this.customTimePeriodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuotaAmount() {
        return this.quotaAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getForecastAmount() {
        return this.forecastAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getBestCaseAmount() {
        return this.bestCaseAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getClosedAmount() {
        return this.closedAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPercentOfQuotaForecast() {
        return this.percentOfQuotaForecast;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPercentOfQuotaClosed() {
        return this.percentOfQuotaClosed;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getChangeNote() {
        return this.changeNote;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getModifiedByUserLoginId() {
        return this.modifiedByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>SalesForecast</code> by the relation named <code>SalesForecast</code>.
     * @return the <code>SalesForecast</code>
     * @throws RepositoryException if an error occurs
     */
    public SalesForecast getSalesForecast() throws RepositoryException {
        if (this.salesForecast == null) {
            this.salesForecast = getRelatedOne(SalesForecast.class, "SalesForecast");
        }
        return this.salesForecast;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>OrganizationParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getOrganizationParty() throws RepositoryException {
        if (this.organizationParty == null) {
            this.organizationParty = getRelatedOne(Party.class, "OrganizationParty");
        }
        return this.organizationParty;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>InternalParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getInternalParty() throws RepositoryException {
        if (this.internalParty == null) {
            this.internalParty = getRelatedOne(Party.class, "InternalParty");
        }
        return this.internalParty;
    }
    /**
     * Auto generated method that gets the related <code>CustomTimePeriod</code> by the relation named <code>CustomTimePeriod</code>.
     * @return the <code>CustomTimePeriod</code>
     * @throws RepositoryException if an error occurs
     */
    public CustomTimePeriod getCustomTimePeriod() throws RepositoryException {
        if (this.customTimePeriod == null) {
            this.customTimePeriod = getRelatedOne(CustomTimePeriod.class, "CustomTimePeriod");
        }
        return this.customTimePeriod;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>ModifiedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getModifiedByUserLogin() throws RepositoryException {
        if (this.modifiedByUserLogin == null) {
            this.modifiedByUserLogin = getRelatedOne(UserLogin.class, "ModifiedByUserLogin");
        }
        return this.modifiedByUserLogin;
    }

    /**
     * Auto generated value setter.
     * @param salesForecast the salesForecast to set
    */
    public void setSalesForecast(SalesForecast salesForecast) {
        this.salesForecast = salesForecast;
    }
    /**
     * Auto generated value setter.
     * @param organizationParty the organizationParty to set
    */
    public void setOrganizationParty(Party organizationParty) {
        this.organizationParty = organizationParty;
    }
    /**
     * Auto generated value setter.
     * @param internalParty the internalParty to set
    */
    public void setInternalParty(Party internalParty) {
        this.internalParty = internalParty;
    }
    /**
     * Auto generated value setter.
     * @param customTimePeriod the customTimePeriod to set
    */
    public void setCustomTimePeriod(CustomTimePeriod customTimePeriod) {
        this.customTimePeriod = customTimePeriod;
    }
    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    /**
     * Auto generated value setter.
     * @param modifiedByUserLogin the modifiedByUserLogin to set
    */
    public void setModifiedByUserLogin(UserLogin modifiedByUserLogin) {
        this.modifiedByUserLogin = modifiedByUserLogin;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSalesForecastHistoryId((String) mapValue.get("salesForecastHistoryId"));
        setSalesForecastId((String) mapValue.get("salesForecastId"));
        setParentSalesForecastId((String) mapValue.get("parentSalesForecastId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setInternalPartyId((String) mapValue.get("internalPartyId"));
        setCustomTimePeriodId((String) mapValue.get("customTimePeriodId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setQuotaAmount(convertToBigDecimal(mapValue.get("quotaAmount")));
        setForecastAmount(convertToBigDecimal(mapValue.get("forecastAmount")));
        setBestCaseAmount(convertToBigDecimal(mapValue.get("bestCaseAmount")));
        setClosedAmount(convertToBigDecimal(mapValue.get("closedAmount")));
        setPercentOfQuotaForecast(convertToBigDecimal(mapValue.get("percentOfQuotaForecast")));
        setPercentOfQuotaClosed(convertToBigDecimal(mapValue.get("percentOfQuotaClosed")));
        setChangeNote((String) mapValue.get("changeNote"));
        setModifiedByUserLoginId((String) mapValue.get("modifiedByUserLoginId"));
        setModifiedTimestamp((Timestamp) mapValue.get("modifiedTimestamp"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("salesForecastHistoryId", getSalesForecastHistoryId());
        mapValue.put("salesForecastId", getSalesForecastId());
        mapValue.put("parentSalesForecastId", getParentSalesForecastId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("internalPartyId", getInternalPartyId());
        mapValue.put("customTimePeriodId", getCustomTimePeriodId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("quotaAmount", getQuotaAmount());
        mapValue.put("forecastAmount", getForecastAmount());
        mapValue.put("bestCaseAmount", getBestCaseAmount());
        mapValue.put("closedAmount", getClosedAmount());
        mapValue.put("percentOfQuotaForecast", getPercentOfQuotaForecast());
        mapValue.put("percentOfQuotaClosed", getPercentOfQuotaClosed());
        mapValue.put("changeNote", getChangeNote());
        mapValue.put("modifiedByUserLoginId", getModifiedByUserLoginId());
        mapValue.put("modifiedTimestamp", getModifiedTimestamp());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
