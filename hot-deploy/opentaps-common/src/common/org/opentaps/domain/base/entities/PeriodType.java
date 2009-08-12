package org.opentaps.domain.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the Honest Public License.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* Honest Public License for more details.
*
* You should have received a copy of the Honest Public License
* along with this program; if not, write to Funambol,
* 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity PeriodType.
 */
@javax.persistence.Entity
@Table(name="PERIOD_TYPE")
public class PeriodType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("periodTypeId", "PERIOD_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("periodLength", "PERIOD_LENGTH");
        fields.put("uomId", "UOM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PeriodType", fields);
}
  public static enum Fields implements EntityFieldInterface<PeriodType> {
    periodTypeId("periodTypeId"),
    description("description"),
    periodLength("periodLength"),
    uomId("uomId"),
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

   @org.hibernate.annotations.GenericGenerator(name="PeriodType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PeriodType_GEN")
   @Id
   @Column(name="PERIOD_TYPE_ID")
   private String periodTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="PERIOD_LENGTH")
   private Long periodLength;
   @Column(name="UOM_ID")
   private String uomId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PERIOD_TYPE_ID")
   
   private List<CustomTimePeriod> customTimePeriods = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="periodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PERIOD_TYPE_ID")
   
   private List<OldEmplPositionTypeRate> oldEmplPositionTypeRates = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PERIOD_TYPE_ID")
   
   private List<PartyBenefit> partyBenefits = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PERIOD_TYPE_ID")
   
   private List<PayHistory> payHistorys = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PERIOD_TYPE_ID")
   
   private List<PayrollPreference> payrollPreferences = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="periodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PERIOD_TYPE_ID")
   
   private List<RateAmount> rateAmounts = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PERIOD_TYPE_ID")
   
   private List<StandardTimePeriod> standardTimePeriods = null;

  /**
   * Default constructor.
   */
  public PeriodType() {
      super();
      this.baseEntityName = "PeriodType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("periodTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("periodTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("periodLength");this.allFieldsNames.add("uomId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PeriodType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param periodTypeId the periodTypeId to set
     */
    public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param periodLength the periodLength to set
     */
    public void setPeriodLength(Long periodLength) {
        this.periodLength = periodLength;
    }
    /**
     * Auto generated value setter.
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        this.uomId = uomId;
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
    public String getPeriodTypeId() {
        return this.periodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPeriodLength() {
        return this.periodLength;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUomId() {
        return this.uomId;
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
     * Auto generated method that gets the related <code>CustomTimePeriod</code> by the relation named <code>CustomTimePeriod</code>.
     * @return the list of <code>CustomTimePeriod</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CustomTimePeriod> getCustomTimePeriods() throws RepositoryException {
        if (this.customTimePeriods == null) {
            this.customTimePeriods = getRelated(CustomTimePeriod.class, "CustomTimePeriod");
        }
        return this.customTimePeriods;
    }
    /**
     * Auto generated method that gets the related <code>OldEmplPositionTypeRate</code> by the relation named <code>OldEmplPositionTypeRate</code>.
     * @return the list of <code>OldEmplPositionTypeRate</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OldEmplPositionTypeRate> getOldEmplPositionTypeRates() throws RepositoryException {
        if (this.oldEmplPositionTypeRates == null) {
            this.oldEmplPositionTypeRates = getRelated(OldEmplPositionTypeRate.class, "OldEmplPositionTypeRate");
        }
        return this.oldEmplPositionTypeRates;
    }
    /**
     * Auto generated method that gets the related <code>PartyBenefit</code> by the relation named <code>PartyBenefit</code>.
     * @return the list of <code>PartyBenefit</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyBenefit> getPartyBenefits() throws RepositoryException {
        if (this.partyBenefits == null) {
            this.partyBenefits = getRelated(PartyBenefit.class, "PartyBenefit");
        }
        return this.partyBenefits;
    }
    /**
     * Auto generated method that gets the related <code>PayHistory</code> by the relation named <code>PayHistory</code>.
     * @return the list of <code>PayHistory</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PayHistory> getPayHistorys() throws RepositoryException {
        if (this.payHistorys == null) {
            this.payHistorys = getRelated(PayHistory.class, "PayHistory");
        }
        return this.payHistorys;
    }
    /**
     * Auto generated method that gets the related <code>PayrollPreference</code> by the relation named <code>PayrollPreference</code>.
     * @return the list of <code>PayrollPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PayrollPreference> getPayrollPreferences() throws RepositoryException {
        if (this.payrollPreferences == null) {
            this.payrollPreferences = getRelated(PayrollPreference.class, "PayrollPreference");
        }
        return this.payrollPreferences;
    }
    /**
     * Auto generated method that gets the related <code>RateAmount</code> by the relation named <code>RateAmount</code>.
     * @return the list of <code>RateAmount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends RateAmount> getRateAmounts() throws RepositoryException {
        if (this.rateAmounts == null) {
            this.rateAmounts = getRelated(RateAmount.class, "RateAmount");
        }
        return this.rateAmounts;
    }
    /**
     * Auto generated method that gets the related <code>StandardTimePeriod</code> by the relation named <code>StandardTimePeriod</code>.
     * @return the list of <code>StandardTimePeriod</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends StandardTimePeriod> getStandardTimePeriods() throws RepositoryException {
        if (this.standardTimePeriods == null) {
            this.standardTimePeriods = getRelated(StandardTimePeriod.class, "StandardTimePeriod");
        }
        return this.standardTimePeriods;
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
     * @param customTimePeriods the customTimePeriods to set
    */
    public void setCustomTimePeriods(List<CustomTimePeriod> customTimePeriods) {
        this.customTimePeriods = customTimePeriods;
    }
    /**
     * Auto generated value setter.
     * @param oldEmplPositionTypeRates the oldEmplPositionTypeRates to set
    */
    public void setOldEmplPositionTypeRates(List<OldEmplPositionTypeRate> oldEmplPositionTypeRates) {
        this.oldEmplPositionTypeRates = oldEmplPositionTypeRates;
    }
    /**
     * Auto generated value setter.
     * @param partyBenefits the partyBenefits to set
    */
    public void setPartyBenefits(List<PartyBenefit> partyBenefits) {
        this.partyBenefits = partyBenefits;
    }
    /**
     * Auto generated value setter.
     * @param payHistorys the payHistorys to set
    */
    public void setPayHistorys(List<PayHistory> payHistorys) {
        this.payHistorys = payHistorys;
    }
    /**
     * Auto generated value setter.
     * @param payrollPreferences the payrollPreferences to set
    */
    public void setPayrollPreferences(List<PayrollPreference> payrollPreferences) {
        this.payrollPreferences = payrollPreferences;
    }
    /**
     * Auto generated value setter.
     * @param rateAmounts the rateAmounts to set
    */
    public void setRateAmounts(List<RateAmount> rateAmounts) {
        this.rateAmounts = rateAmounts;
    }
    /**
     * Auto generated value setter.
     * @param standardTimePeriods the standardTimePeriods to set
    */
    public void setStandardTimePeriods(List<StandardTimePeriod> standardTimePeriods) {
        this.standardTimePeriods = standardTimePeriods;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addOldEmplPositionTypeRate(OldEmplPositionTypeRate oldEmplPositionTypeRate) {
        if (this.oldEmplPositionTypeRates == null) {
            this.oldEmplPositionTypeRates = new ArrayList<OldEmplPositionTypeRate>();
        }
        this.oldEmplPositionTypeRates.add(oldEmplPositionTypeRate);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeOldEmplPositionTypeRate(OldEmplPositionTypeRate oldEmplPositionTypeRate) {
        if (this.oldEmplPositionTypeRates == null) {
            return;
        }
        this.oldEmplPositionTypeRates.remove(oldEmplPositionTypeRate);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearOldEmplPositionTypeRate() {
        if (this.oldEmplPositionTypeRates == null) {
            return;
        }
        this.oldEmplPositionTypeRates.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addRateAmount(RateAmount rateAmount) {
        if (this.rateAmounts == null) {
            this.rateAmounts = new ArrayList<RateAmount>();
        }
        this.rateAmounts.add(rateAmount);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeRateAmount(RateAmount rateAmount) {
        if (this.rateAmounts == null) {
            return;
        }
        this.rateAmounts.remove(rateAmount);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearRateAmount() {
        if (this.rateAmounts == null) {
            return;
        }
        this.rateAmounts.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPeriodTypeId((String) mapValue.get("periodTypeId"));
        setDescription((String) mapValue.get("description"));
        setPeriodLength((Long) mapValue.get("periodLength"));
        setUomId((String) mapValue.get("uomId"));
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
        mapValue.put("periodTypeId", getPeriodTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("periodLength", getPeriodLength());
        mapValue.put("uomId", getUomId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
