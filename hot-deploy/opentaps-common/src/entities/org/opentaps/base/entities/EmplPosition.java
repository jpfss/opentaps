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
 * Auto generated base entity EmplPosition.
 */
@javax.persistence.Entity
@Table(name="EMPL_POSITION")
public class EmplPosition extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("emplPositionId", "EMPL_POSITION_ID");
        fields.put("statusId", "STATUS_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("budgetId", "BUDGET_ID");
        fields.put("budgetItemSeqId", "BUDGET_ITEM_SEQ_ID");
        fields.put("emplPositionTypeId", "EMPL_POSITION_TYPE_ID");
        fields.put("estimatedFromDate", "ESTIMATED_FROM_DATE");
        fields.put("estimatedThruDate", "ESTIMATED_THRU_DATE");
        fields.put("salaryFlag", "SALARY_FLAG");
        fields.put("exemptFlag", "EXEMPT_FLAG");
        fields.put("fulltimeFlag", "FULLTIME_FLAG");
        fields.put("temporaryFlag", "TEMPORARY_FLAG");
        fields.put("actualFromDate", "ACTUAL_FROM_DATE");
        fields.put("actualThruDate", "ACTUAL_THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EmplPosition", fields);
}
  public static enum Fields implements EntityFieldInterface<EmplPosition> {
    emplPositionId("emplPositionId"),
    statusId("statusId"),
    partyId("partyId"),
    budgetId("budgetId"),
    budgetItemSeqId("budgetItemSeqId"),
    emplPositionTypeId("emplPositionTypeId"),
    estimatedFromDate("estimatedFromDate"),
    estimatedThruDate("estimatedThruDate"),
    salaryFlag("salaryFlag"),
    exemptFlag("exemptFlag"),
    fulltimeFlag("fulltimeFlag"),
    temporaryFlag("temporaryFlag"),
    actualFromDate("actualFromDate"),
    actualThruDate("actualThruDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="EmplPosition_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="EmplPosition_GEN")
   @Id
   @Column(name="EMPL_POSITION_ID")
   private String emplPositionId;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="BUDGET_ID")
   private String budgetId;
   @Column(name="BUDGET_ITEM_SEQ_ID")
   private String budgetItemSeqId;
   @Column(name="EMPL_POSITION_TYPE_ID")
   private String emplPositionTypeId;
   @Column(name="ESTIMATED_FROM_DATE")
   private Timestamp estimatedFromDate;
   @Column(name="ESTIMATED_THRU_DATE")
   private Timestamp estimatedThruDate;
   @Column(name="SALARY_FLAG")
   private String salaryFlag;
   @Column(name="EXEMPT_FLAG")
   private String exemptFlag;
   @Column(name="FULLTIME_FLAG")
   private String fulltimeFlag;
   @Column(name="TEMPORARY_FLAG")
   private String temporaryFlag;
   @Column(name="ACTUAL_FROM_DATE")
   private Timestamp actualFromDate;
   @Column(name="ACTUAL_THRU_DATE")
   private Timestamp actualThruDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   private transient BudgetItem budgetItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMPL_POSITION_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private EmplPositionType emplPositionType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="emplPosition", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EMPL_POSITION_ID")
   
   private List<EmplPositionFulfillment> emplPositionFulfillments = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="reportingToEmplPosition", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EMPL_POSITION_ID_REPORTING_TO")
   
   private List<EmplPositionReportingStruct> reportingToEmplPositionReportingStructs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="managedByEmplPosition", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EMPL_POSITION_ID_MANAGED_BY")
   
   private List<EmplPositionReportingStruct> managedByEmplPositionReportingStructs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="emplPosition", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EMPL_POSITION_ID")
   
   private List<EmplPositionResponsibility> emplPositionResponsibilitys = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="EMPL_POSITION_ID")
   
   private List<EmploymentApp> employmentApps = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="EMPL_POSITION_ID")
   
   private List<PerfReview> perfReviews = null;

  /**
   * Default constructor.
   */
  public EmplPosition() {
      super();
      this.baseEntityName = "EmplPosition";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("emplPositionId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("emplPositionId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("budgetId");this.allFieldsNames.add("budgetItemSeqId");this.allFieldsNames.add("emplPositionTypeId");this.allFieldsNames.add("estimatedFromDate");this.allFieldsNames.add("estimatedThruDate");this.allFieldsNames.add("salaryFlag");this.allFieldsNames.add("exemptFlag");this.allFieldsNames.add("fulltimeFlag");this.allFieldsNames.add("temporaryFlag");this.allFieldsNames.add("actualFromDate");this.allFieldsNames.add("actualThruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EmplPosition(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param emplPositionId the emplPositionId to set
     */
    public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param budgetId the budgetId to set
     */
    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
    /**
     * Auto generated value setter.
     * @param budgetItemSeqId the budgetItemSeqId to set
     */
    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param emplPositionTypeId the emplPositionTypeId to set
     */
    public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }
    /**
     * Auto generated value setter.
     * @param estimatedFromDate the estimatedFromDate to set
     */
    public void setEstimatedFromDate(Timestamp estimatedFromDate) {
        this.estimatedFromDate = estimatedFromDate;
    }
    /**
     * Auto generated value setter.
     * @param estimatedThruDate the estimatedThruDate to set
     */
    public void setEstimatedThruDate(Timestamp estimatedThruDate) {
        this.estimatedThruDate = estimatedThruDate;
    }
    /**
     * Auto generated value setter.
     * @param salaryFlag the salaryFlag to set
     */
    public void setSalaryFlag(String salaryFlag) {
        this.salaryFlag = salaryFlag;
    }
    /**
     * Auto generated value setter.
     * @param exemptFlag the exemptFlag to set
     */
    public void setExemptFlag(String exemptFlag) {
        this.exemptFlag = exemptFlag;
    }
    /**
     * Auto generated value setter.
     * @param fulltimeFlag the fulltimeFlag to set
     */
    public void setFulltimeFlag(String fulltimeFlag) {
        this.fulltimeFlag = fulltimeFlag;
    }
    /**
     * Auto generated value setter.
     * @param temporaryFlag the temporaryFlag to set
     */
    public void setTemporaryFlag(String temporaryFlag) {
        this.temporaryFlag = temporaryFlag;
    }
    /**
     * Auto generated value setter.
     * @param actualFromDate the actualFromDate to set
     */
    public void setActualFromDate(Timestamp actualFromDate) {
        this.actualFromDate = actualFromDate;
    }
    /**
     * Auto generated value setter.
     * @param actualThruDate the actualThruDate to set
     */
    public void setActualThruDate(Timestamp actualThruDate) {
        this.actualThruDate = actualThruDate;
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
    public String getEmplPositionId() {
        return this.emplPositionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBudgetId() {
        return this.budgetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBudgetItemSeqId() {
        return this.budgetItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEmplPositionTypeId() {
        return this.emplPositionTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEstimatedFromDate() {
        return this.estimatedFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEstimatedThruDate() {
        return this.estimatedThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalaryFlag() {
        return this.salaryFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExemptFlag() {
        return this.exemptFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFulltimeFlag() {
        return this.fulltimeFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTemporaryFlag() {
        return this.temporaryFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getActualFromDate() {
        return this.actualFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getActualThruDate() {
        return this.actualThruDate;
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
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
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
     * Auto generated method that gets the related <code>EmplPositionType</code> by the relation named <code>EmplPositionType</code>.
     * @return the <code>EmplPositionType</code>
     * @throws RepositoryException if an error occurs
     */
    public EmplPositionType getEmplPositionType() throws RepositoryException {
        if (this.emplPositionType == null) {
            this.emplPositionType = getRelatedOne(EmplPositionType.class, "EmplPositionType");
        }
        return this.emplPositionType;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionFulfillment</code> by the relation named <code>EmplPositionFulfillment</code>.
     * @return the list of <code>EmplPositionFulfillment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionFulfillment> getEmplPositionFulfillments() throws RepositoryException {
        if (this.emplPositionFulfillments == null) {
            this.emplPositionFulfillments = getRelated(EmplPositionFulfillment.class, "EmplPositionFulfillment");
        }
        return this.emplPositionFulfillments;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionReportingStruct</code> by the relation named <code>ReportingToEmplPositionReportingStruct</code>.
     * @return the list of <code>EmplPositionReportingStruct</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionReportingStruct> getReportingToEmplPositionReportingStructs() throws RepositoryException {
        if (this.reportingToEmplPositionReportingStructs == null) {
            this.reportingToEmplPositionReportingStructs = getRelated(EmplPositionReportingStruct.class, "ReportingToEmplPositionReportingStruct");
        }
        return this.reportingToEmplPositionReportingStructs;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionReportingStruct</code> by the relation named <code>ManagedByEmplPositionReportingStruct</code>.
     * @return the list of <code>EmplPositionReportingStruct</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionReportingStruct> getManagedByEmplPositionReportingStructs() throws RepositoryException {
        if (this.managedByEmplPositionReportingStructs == null) {
            this.managedByEmplPositionReportingStructs = getRelated(EmplPositionReportingStruct.class, "ManagedByEmplPositionReportingStruct");
        }
        return this.managedByEmplPositionReportingStructs;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionResponsibility</code> by the relation named <code>EmplPositionResponsibility</code>.
     * @return the list of <code>EmplPositionResponsibility</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionResponsibility> getEmplPositionResponsibilitys() throws RepositoryException {
        if (this.emplPositionResponsibilitys == null) {
            this.emplPositionResponsibilitys = getRelated(EmplPositionResponsibility.class, "EmplPositionResponsibility");
        }
        return this.emplPositionResponsibilitys;
    }
    /**
     * Auto generated method that gets the related <code>EmploymentApp</code> by the relation named <code>EmploymentApp</code>.
     * @return the list of <code>EmploymentApp</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmploymentApp> getEmploymentApps() throws RepositoryException {
        if (this.employmentApps == null) {
            this.employmentApps = getRelated(EmploymentApp.class, "EmploymentApp");
        }
        return this.employmentApps;
    }
    /**
     * Auto generated method that gets the related <code>PerfReview</code> by the relation named <code>PerfReview</code>.
     * @return the list of <code>PerfReview</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PerfReview> getPerfReviews() throws RepositoryException {
        if (this.perfReviews == null) {
            this.perfReviews = getRelated(PerfReview.class, "PerfReview");
        }
        return this.perfReviews;
    }

    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
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
     * @param emplPositionType the emplPositionType to set
    */
    public void setEmplPositionType(EmplPositionType emplPositionType) {
        this.emplPositionType = emplPositionType;
    }
    /**
     * Auto generated value setter.
     * @param emplPositionFulfillments the emplPositionFulfillments to set
    */
    public void setEmplPositionFulfillments(List<EmplPositionFulfillment> emplPositionFulfillments) {
        this.emplPositionFulfillments = emplPositionFulfillments;
    }
    /**
     * Auto generated value setter.
     * @param reportingToEmplPositionReportingStructs the reportingToEmplPositionReportingStructs to set
    */
    public void setReportingToEmplPositionReportingStructs(List<EmplPositionReportingStruct> reportingToEmplPositionReportingStructs) {
        this.reportingToEmplPositionReportingStructs = reportingToEmplPositionReportingStructs;
    }
    /**
     * Auto generated value setter.
     * @param managedByEmplPositionReportingStructs the managedByEmplPositionReportingStructs to set
    */
    public void setManagedByEmplPositionReportingStructs(List<EmplPositionReportingStruct> managedByEmplPositionReportingStructs) {
        this.managedByEmplPositionReportingStructs = managedByEmplPositionReportingStructs;
    }
    /**
     * Auto generated value setter.
     * @param emplPositionResponsibilitys the emplPositionResponsibilitys to set
    */
    public void setEmplPositionResponsibilitys(List<EmplPositionResponsibility> emplPositionResponsibilitys) {
        this.emplPositionResponsibilitys = emplPositionResponsibilitys;
    }
    /**
     * Auto generated value setter.
     * @param employmentApps the employmentApps to set
    */
    public void setEmploymentApps(List<EmploymentApp> employmentApps) {
        this.employmentApps = employmentApps;
    }
    /**
     * Auto generated value setter.
     * @param perfReviews the perfReviews to set
    */
    public void setPerfReviews(List<PerfReview> perfReviews) {
        this.perfReviews = perfReviews;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addEmplPositionFulfillment(EmplPositionFulfillment emplPositionFulfillment) {
        if (this.emplPositionFulfillments == null) {
            this.emplPositionFulfillments = new ArrayList<EmplPositionFulfillment>();
        }
        this.emplPositionFulfillments.add(emplPositionFulfillment);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEmplPositionFulfillment(EmplPositionFulfillment emplPositionFulfillment) {
        if (this.emplPositionFulfillments == null) {
            return;
        }
        this.emplPositionFulfillments.remove(emplPositionFulfillment);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEmplPositionFulfillment() {
        if (this.emplPositionFulfillments == null) {
            return;
        }
        this.emplPositionFulfillments.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addReportingToEmplPositionReportingStruct(EmplPositionReportingStruct reportingToEmplPositionReportingStruct) {
        if (this.reportingToEmplPositionReportingStructs == null) {
            this.reportingToEmplPositionReportingStructs = new ArrayList<EmplPositionReportingStruct>();
        }
        this.reportingToEmplPositionReportingStructs.add(reportingToEmplPositionReportingStruct);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeReportingToEmplPositionReportingStruct(EmplPositionReportingStruct reportingToEmplPositionReportingStruct) {
        if (this.reportingToEmplPositionReportingStructs == null) {
            return;
        }
        this.reportingToEmplPositionReportingStructs.remove(reportingToEmplPositionReportingStruct);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearReportingToEmplPositionReportingStruct() {
        if (this.reportingToEmplPositionReportingStructs == null) {
            return;
        }
        this.reportingToEmplPositionReportingStructs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addManagedByEmplPositionReportingStruct(EmplPositionReportingStruct managedByEmplPositionReportingStruct) {
        if (this.managedByEmplPositionReportingStructs == null) {
            this.managedByEmplPositionReportingStructs = new ArrayList<EmplPositionReportingStruct>();
        }
        this.managedByEmplPositionReportingStructs.add(managedByEmplPositionReportingStruct);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeManagedByEmplPositionReportingStruct(EmplPositionReportingStruct managedByEmplPositionReportingStruct) {
        if (this.managedByEmplPositionReportingStructs == null) {
            return;
        }
        this.managedByEmplPositionReportingStructs.remove(managedByEmplPositionReportingStruct);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearManagedByEmplPositionReportingStruct() {
        if (this.managedByEmplPositionReportingStructs == null) {
            return;
        }
        this.managedByEmplPositionReportingStructs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addEmplPositionResponsibility(EmplPositionResponsibility emplPositionResponsibility) {
        if (this.emplPositionResponsibilitys == null) {
            this.emplPositionResponsibilitys = new ArrayList<EmplPositionResponsibility>();
        }
        this.emplPositionResponsibilitys.add(emplPositionResponsibility);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEmplPositionResponsibility(EmplPositionResponsibility emplPositionResponsibility) {
        if (this.emplPositionResponsibilitys == null) {
            return;
        }
        this.emplPositionResponsibilitys.remove(emplPositionResponsibility);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEmplPositionResponsibility() {
        if (this.emplPositionResponsibilitys == null) {
            return;
        }
        this.emplPositionResponsibilitys.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEmplPositionId((String) mapValue.get("emplPositionId"));
        setStatusId((String) mapValue.get("statusId"));
        setPartyId((String) mapValue.get("partyId"));
        setBudgetId((String) mapValue.get("budgetId"));
        setBudgetItemSeqId((String) mapValue.get("budgetItemSeqId"));
        setEmplPositionTypeId((String) mapValue.get("emplPositionTypeId"));
        setEstimatedFromDate((Timestamp) mapValue.get("estimatedFromDate"));
        setEstimatedThruDate((Timestamp) mapValue.get("estimatedThruDate"));
        setSalaryFlag((String) mapValue.get("salaryFlag"));
        setExemptFlag((String) mapValue.get("exemptFlag"));
        setFulltimeFlag((String) mapValue.get("fulltimeFlag"));
        setTemporaryFlag((String) mapValue.get("temporaryFlag"));
        setActualFromDate((Timestamp) mapValue.get("actualFromDate"));
        setActualThruDate((Timestamp) mapValue.get("actualThruDate"));
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
        mapValue.put("emplPositionId", getEmplPositionId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("budgetId", getBudgetId());
        mapValue.put("budgetItemSeqId", getBudgetItemSeqId());
        mapValue.put("emplPositionTypeId", getEmplPositionTypeId());
        mapValue.put("estimatedFromDate", getEstimatedFromDate());
        mapValue.put("estimatedThruDate", getEstimatedThruDate());
        mapValue.put("salaryFlag", getSalaryFlag());
        mapValue.put("exemptFlag", getExemptFlag());
        mapValue.put("fulltimeFlag", getFulltimeFlag());
        mapValue.put("temporaryFlag", getTemporaryFlag());
        mapValue.put("actualFromDate", getActualFromDate());
        mapValue.put("actualThruDate", getActualThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
