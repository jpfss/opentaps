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
import java.sql.Timestamp;

/**
 * Auto generated base entity PayGrade.
 */
@javax.persistence.Entity
@Table(name="PAY_GRADE")
public class PayGrade extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("payGradeId", "PAY_GRADE_ID");
        fields.put("payGradeName", "PAY_GRADE_NAME");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PayGrade", fields);
}
  public static enum Fields implements EntityFieldInterface<PayGrade> {
    payGradeId("payGradeId"),
    payGradeName("payGradeName"),
    comments("comments"),
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

   @org.hibernate.annotations.GenericGenerator(name="PayGrade_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PayGrade_GEN")
   @Id
   @Column(name="PAY_GRADE_ID")
   private String payGradeId;
   @Column(name="PAY_GRADE_NAME")
   private String payGradeName;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAY_GRADE_ID")
   
   private List<PayHistory> payHistorys = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="payGrade", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAY_GRADE_ID")
   
   private List<SalaryStep> salarySteps = null;

  /**
   * Default constructor.
   */
  public PayGrade() {
      super();
      this.baseEntityName = "PayGrade";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("payGradeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("payGradeId");this.allFieldsNames.add("payGradeName");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PayGrade(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param payGradeId the payGradeId to set
     */
    public void setPayGradeId(String payGradeId) {
        this.payGradeId = payGradeId;
    }
    /**
     * Auto generated value setter.
     * @param payGradeName the payGradeName to set
     */
    public void setPayGradeName(String payGradeName) {
        this.payGradeName = payGradeName;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
    public String getPayGradeId() {
        return this.payGradeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPayGradeName() {
        return this.payGradeName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
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
     * Auto generated method that gets the related <code>SalaryStep</code> by the relation named <code>SalaryStep</code>.
     * @return the list of <code>SalaryStep</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SalaryStep> getSalarySteps() throws RepositoryException {
        if (this.salarySteps == null) {
            this.salarySteps = getRelated(SalaryStep.class, "SalaryStep");
        }
        return this.salarySteps;
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
     * @param salarySteps the salarySteps to set
    */
    public void setSalarySteps(List<SalaryStep> salarySteps) {
        this.salarySteps = salarySteps;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addSalaryStep(SalaryStep salaryStep) {
        if (this.salarySteps == null) {
            this.salarySteps = new ArrayList<SalaryStep>();
        }
        this.salarySteps.add(salaryStep);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSalaryStep(SalaryStep salaryStep) {
        if (this.salarySteps == null) {
            return;
        }
        this.salarySteps.remove(salaryStep);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSalaryStep() {
        if (this.salarySteps == null) {
            return;
        }
        this.salarySteps.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPayGradeId((String) mapValue.get("payGradeId"));
        setPayGradeName((String) mapValue.get("payGradeName"));
        setComments((String) mapValue.get("comments"));
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
        mapValue.put("payGradeId", getPayGradeId());
        mapValue.put("payGradeName", getPayGradeName());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
