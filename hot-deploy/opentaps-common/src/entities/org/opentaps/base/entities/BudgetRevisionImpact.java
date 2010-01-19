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
 * Auto generated base entity BudgetRevisionImpact.
 */
@javax.persistence.Entity
@Table(name="BUDGET_REVISION_IMPACT")
public class BudgetRevisionImpact extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("budgetId", "BUDGET_ID");
        fields.put("budgetItemSeqId", "BUDGET_ITEM_SEQ_ID");
        fields.put("revisionSeqId", "REVISION_SEQ_ID");
        fields.put("revisedAmount", "REVISED_AMOUNT");
        fields.put("addDeleteFlag", "ADD_DELETE_FLAG");
        fields.put("revisionReason", "REVISION_REASON");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("BudgetRevisionImpact", fields);
}
  public static enum Fields implements EntityFieldInterface<BudgetRevisionImpact> {
    budgetId("budgetId"),
    budgetItemSeqId("budgetItemSeqId"),
    revisionSeqId("revisionSeqId"),
    revisedAmount("revisedAmount"),
    addDeleteFlag("addDeleteFlag"),
    revisionReason("revisionReason"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.BudgetRevisionImpactPkBridge.class)
     private BudgetRevisionImpactPk id = new BudgetRevisionImpactPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>BudgetRevisionImpactPk</code>
     */
      public BudgetRevisionImpactPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>BudgetRevisionImpactPk</code> value to set
    */   
      public void setId(BudgetRevisionImpactPk id) {
         this.id = id;
      }
   @Column(name="REVISED_AMOUNT")
   private BigDecimal revisedAmount;
   @Column(name="ADD_DELETE_FLAG")
   private String addDeleteFlag;
   @Column(name="REVISION_REASON")
   private String revisionReason;
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
   private transient BudgetItem budgetItem = null;
   private transient BudgetRevision budgetRevision = null;

  /**
   * Default constructor.
   */
  public BudgetRevisionImpact() {
      super();
      this.baseEntityName = "BudgetRevisionImpact";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("budgetId");this.primaryKeyNames.add("budgetItemSeqId");this.primaryKeyNames.add("revisionSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("budgetId");this.allFieldsNames.add("budgetItemSeqId");this.allFieldsNames.add("revisionSeqId");this.allFieldsNames.add("revisedAmount");this.allFieldsNames.add("addDeleteFlag");this.allFieldsNames.add("revisionReason");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BudgetRevisionImpact(RepositoryInterface repository) {
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
     * @param revisionSeqId the revisionSeqId to set
     */
    public void setRevisionSeqId(String revisionSeqId) {
        id.setRevisionSeqId(revisionSeqId);
    }
    /**
     * Auto generated value setter.
     * @param revisedAmount the revisedAmount to set
     */
    public void setRevisedAmount(BigDecimal revisedAmount) {
        this.revisedAmount = revisedAmount;
    }
    /**
     * Auto generated value setter.
     * @param addDeleteFlag the addDeleteFlag to set
     */
    public void setAddDeleteFlag(String addDeleteFlag) {
        this.addDeleteFlag = addDeleteFlag;
    }
    /**
     * Auto generated value setter.
     * @param revisionReason the revisionReason to set
     */
    public void setRevisionReason(String revisionReason) {
        this.revisionReason = revisionReason;
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
    public String getRevisionSeqId() {
        return this.id.getRevisionSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getRevisedAmount() {
        return this.revisedAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAddDeleteFlag() {
        return this.addDeleteFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRevisionReason() {
        return this.revisionReason;
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
     * Auto generated method that gets the related <code>BudgetItem</code> by the relation named <code>BudgetItem</code>.
     * @return the <code>BudgetItem</code>
     * @throws RepositoryException if an error occurs
     */
    public BudgetItem getBudgetItem() throws RepositoryException {
        if (this.budgetItem == null) {
            this.budgetItem = getRelatedOne(BudgetItem.class, "BudgetItem");
        }
        return this.budgetItem;
    }
    /**
     * Auto generated method that gets the related <code>BudgetRevision</code> by the relation named <code>BudgetRevision</code>.
     * @return the <code>BudgetRevision</code>
     * @throws RepositoryException if an error occurs
     */
    public BudgetRevision getBudgetRevision() throws RepositoryException {
        if (this.budgetRevision == null) {
            this.budgetRevision = getRelatedOne(BudgetRevision.class, "BudgetRevision");
        }
        return this.budgetRevision;
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
     * @param budgetItem the budgetItem to set
    */
    public void setBudgetItem(BudgetItem budgetItem) {
        this.budgetItem = budgetItem;
    }
    /**
     * Auto generated value setter.
     * @param budgetRevision the budgetRevision to set
    */
    public void setBudgetRevision(BudgetRevision budgetRevision) {
        this.budgetRevision = budgetRevision;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBudgetId((String) mapValue.get("budgetId"));
        setBudgetItemSeqId((String) mapValue.get("budgetItemSeqId"));
        setRevisionSeqId((String) mapValue.get("revisionSeqId"));
        setRevisedAmount(convertToBigDecimal(mapValue.get("revisedAmount")));
        setAddDeleteFlag((String) mapValue.get("addDeleteFlag"));
        setRevisionReason((String) mapValue.get("revisionReason"));
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
        mapValue.put("revisionSeqId", getRevisionSeqId());
        mapValue.put("revisedAmount", getRevisedAmount());
        mapValue.put("addDeleteFlag", getAddDeleteFlag());
        mapValue.put("revisionReason", getRevisionReason());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
