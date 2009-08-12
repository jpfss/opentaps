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
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity BudgetItem.
 */
@javax.persistence.Entity
@Table(name="BUDGET_ITEM")
public class BudgetItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("budgetId", "BUDGET_ID");
        fields.put("budgetItemSeqId", "BUDGET_ITEM_SEQ_ID");
        fields.put("budgetItemTypeId", "BUDGET_ITEM_TYPE_ID");
        fields.put("amount", "AMOUNT");
        fields.put("purpose", "PURPOSE");
        fields.put("justification", "JUSTIFICATION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("BudgetItem", fields);
}
  public static enum Fields implements EntityFieldInterface<BudgetItem> {
    budgetId("budgetId"),
    budgetItemSeqId("budgetItemSeqId"),
    budgetItemTypeId("budgetItemTypeId"),
    amount("amount"),
    purpose("purpose"),
    justification("justification"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.BudgetItemPkBridge.class)
     private BudgetItemPk id = new BudgetItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>BudgetItemPk</code>
     */
      public BudgetItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>BudgetItemPk</code> value to set
    */   
      public void setId(BudgetItemPk id) {
         this.id = id;
      }
   @Column(name="BUDGET_ITEM_TYPE_ID")
   private String budgetItemTypeId;
   @Column(name="AMOUNT")
   private BigDecimal amount;
   @Column(name="PURPOSE")
   private String purpose;
   @Column(name="JUSTIFICATION")
   private String justification;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BUDGET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Budget budget = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BUDGET_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private BudgetItemType budgetItemType = null;
   private transient List<BudgetItemTypeAttr> budgetItemTypeAttrs = null;
   private transient List<BudgetItemAttribute> budgetItemAttributes = null;
   private transient List<BudgetRevisionImpact> budgetRevisionImpacts = null;
   private transient List<BudgetScenarioApplication> budgetScenarioApplications = null;
   private transient List<EmplPosition> emplPositions = null;
   private transient List<PaymentBudgetAllocation> paymentBudgetAllocations = null;
   private transient List<RequirementBudgetAllocation> requirementBudgetAllocations = null;

  /**
   * Default constructor.
   */
  public BudgetItem() {
      super();
      this.baseEntityName = "BudgetItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("budgetId");this.primaryKeyNames.add("budgetItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("budgetId");this.allFieldsNames.add("budgetItemSeqId");this.allFieldsNames.add("budgetItemTypeId");this.allFieldsNames.add("amount");this.allFieldsNames.add("purpose");this.allFieldsNames.add("justification");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BudgetItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param budgetId the budgetId to set
     */
    public void setBudgetId(String budgetId) {
        id.setBudgetId(budgetId);
    }
    /**
     * Auto generated value setter.
     * @param budgetItemSeqId the budgetItemSeqId to set
     */
    public void setBudgetItemSeqId(String budgetItemSeqId) {
        id.setBudgetItemSeqId(budgetItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param budgetItemTypeId the budgetItemTypeId to set
     */
    public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param purpose the purpose to set
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    /**
     * Auto generated value setter.
     * @param justification the justification to set
     */
    public void setJustification(String justification) {
        this.justification = justification;
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
    public String getBudgetId() {
        return this.id.getBudgetId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBudgetItemSeqId() {
        return this.id.getBudgetItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBudgetItemTypeId() {
        return this.budgetItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPurpose() {
        return this.purpose;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getJustification() {
        return this.justification;
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
     * Auto generated method that gets the related <code>Budget</code> by the relation named <code>Budget</code>.
     * @return the <code>Budget</code>
     * @throws RepositoryException if an error occurs
     */
    public Budget getBudget() throws RepositoryException {
        if (this.budget == null) {
            this.budget = getRelatedOne(Budget.class, "Budget");
        }
        return this.budget;
    }
    /**
     * Auto generated method that gets the related <code>BudgetItemType</code> by the relation named <code>BudgetItemType</code>.
     * @return the <code>BudgetItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public BudgetItemType getBudgetItemType() throws RepositoryException {
        if (this.budgetItemType == null) {
            this.budgetItemType = getRelatedOne(BudgetItemType.class, "BudgetItemType");
        }
        return this.budgetItemType;
    }
    /**
     * Auto generated method that gets the related <code>BudgetItemTypeAttr</code> by the relation named <code>BudgetItemTypeAttr</code>.
     * @return the list of <code>BudgetItemTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetItemTypeAttr> getBudgetItemTypeAttrs() throws RepositoryException {
        if (this.budgetItemTypeAttrs == null) {
            this.budgetItemTypeAttrs = getRelated(BudgetItemTypeAttr.class, "BudgetItemTypeAttr");
        }
        return this.budgetItemTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>BudgetItemAttribute</code> by the relation named <code>BudgetItemAttribute</code>.
     * @return the list of <code>BudgetItemAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetItemAttribute> getBudgetItemAttributes() throws RepositoryException {
        if (this.budgetItemAttributes == null) {
            this.budgetItemAttributes = getRelated(BudgetItemAttribute.class, "BudgetItemAttribute");
        }
        return this.budgetItemAttributes;
    }
    /**
     * Auto generated method that gets the related <code>BudgetRevisionImpact</code> by the relation named <code>BudgetRevisionImpact</code>.
     * @return the list of <code>BudgetRevisionImpact</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetRevisionImpact> getBudgetRevisionImpacts() throws RepositoryException {
        if (this.budgetRevisionImpacts == null) {
            this.budgetRevisionImpacts = getRelated(BudgetRevisionImpact.class, "BudgetRevisionImpact");
        }
        return this.budgetRevisionImpacts;
    }
    /**
     * Auto generated method that gets the related <code>BudgetScenarioApplication</code> by the relation named <code>BudgetScenarioApplication</code>.
     * @return the list of <code>BudgetScenarioApplication</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetScenarioApplication> getBudgetScenarioApplications() throws RepositoryException {
        if (this.budgetScenarioApplications == null) {
            this.budgetScenarioApplications = getRelated(BudgetScenarioApplication.class, "BudgetScenarioApplication");
        }
        return this.budgetScenarioApplications;
    }
    /**
     * Auto generated method that gets the related <code>EmplPosition</code> by the relation named <code>EmplPosition</code>.
     * @return the list of <code>EmplPosition</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPosition> getEmplPositions() throws RepositoryException {
        if (this.emplPositions == null) {
            this.emplPositions = getRelated(EmplPosition.class, "EmplPosition");
        }
        return this.emplPositions;
    }
    /**
     * Auto generated method that gets the related <code>PaymentBudgetAllocation</code> by the relation named <code>PaymentBudgetAllocation</code>.
     * @return the list of <code>PaymentBudgetAllocation</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentBudgetAllocation> getPaymentBudgetAllocations() throws RepositoryException {
        if (this.paymentBudgetAllocations == null) {
            this.paymentBudgetAllocations = getRelated(PaymentBudgetAllocation.class, "PaymentBudgetAllocation");
        }
        return this.paymentBudgetAllocations;
    }
    /**
     * Auto generated method that gets the related <code>RequirementBudgetAllocation</code> by the relation named <code>RequirementBudgetAllocation</code>.
     * @return the list of <code>RequirementBudgetAllocation</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends RequirementBudgetAllocation> getRequirementBudgetAllocations() throws RepositoryException {
        if (this.requirementBudgetAllocations == null) {
            this.requirementBudgetAllocations = getRelated(RequirementBudgetAllocation.class, "RequirementBudgetAllocation");
        }
        return this.requirementBudgetAllocations;
    }

    /**
     * Auto generated value setter.
     * @param budget the budget to set
    */
    public void setBudget(Budget budget) {
        this.budget = budget;
    }
    /**
     * Auto generated value setter.
     * @param budgetItemType the budgetItemType to set
    */
    public void setBudgetItemType(BudgetItemType budgetItemType) {
        this.budgetItemType = budgetItemType;
    }
    /**
     * Auto generated value setter.
     * @param budgetItemTypeAttrs the budgetItemTypeAttrs to set
    */
    public void setBudgetItemTypeAttrs(List<BudgetItemTypeAttr> budgetItemTypeAttrs) {
        this.budgetItemTypeAttrs = budgetItemTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param budgetItemAttributes the budgetItemAttributes to set
    */
    public void setBudgetItemAttributes(List<BudgetItemAttribute> budgetItemAttributes) {
        this.budgetItemAttributes = budgetItemAttributes;
    }
    /**
     * Auto generated value setter.
     * @param budgetRevisionImpacts the budgetRevisionImpacts to set
    */
    public void setBudgetRevisionImpacts(List<BudgetRevisionImpact> budgetRevisionImpacts) {
        this.budgetRevisionImpacts = budgetRevisionImpacts;
    }
    /**
     * Auto generated value setter.
     * @param budgetScenarioApplications the budgetScenarioApplications to set
    */
    public void setBudgetScenarioApplications(List<BudgetScenarioApplication> budgetScenarioApplications) {
        this.budgetScenarioApplications = budgetScenarioApplications;
    }
    /**
     * Auto generated value setter.
     * @param emplPositions the emplPositions to set
    */
    public void setEmplPositions(List<EmplPosition> emplPositions) {
        this.emplPositions = emplPositions;
    }
    /**
     * Auto generated value setter.
     * @param paymentBudgetAllocations the paymentBudgetAllocations to set
    */
    public void setPaymentBudgetAllocations(List<PaymentBudgetAllocation> paymentBudgetAllocations) {
        this.paymentBudgetAllocations = paymentBudgetAllocations;
    }
    /**
     * Auto generated value setter.
     * @param requirementBudgetAllocations the requirementBudgetAllocations to set
    */
    public void setRequirementBudgetAllocations(List<RequirementBudgetAllocation> requirementBudgetAllocations) {
        this.requirementBudgetAllocations = requirementBudgetAllocations;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBudgetId((String) mapValue.get("budgetId"));
        setBudgetItemSeqId((String) mapValue.get("budgetItemSeqId"));
        setBudgetItemTypeId((String) mapValue.get("budgetItemTypeId"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setPurpose((String) mapValue.get("purpose"));
        setJustification((String) mapValue.get("justification"));
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
        mapValue.put("budgetId", getBudgetId());
        mapValue.put("budgetItemSeqId", getBudgetItemSeqId());
        mapValue.put("budgetItemTypeId", getBudgetItemTypeId());
        mapValue.put("amount", getAmount());
        mapValue.put("purpose", getPurpose());
        mapValue.put("justification", getJustification());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
