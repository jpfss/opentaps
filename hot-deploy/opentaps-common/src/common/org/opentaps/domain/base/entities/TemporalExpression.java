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
 * Auto generated base entity TemporalExpression.
 */
@javax.persistence.Entity
@Table(name="TEMPORAL_EXPRESSION")
public class TemporalExpression extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("tempExprId", "TEMP_EXPR_ID");
        fields.put("tempExprTypeId", "TEMP_EXPR_TYPE_ID");
        fields.put("date1", "DATE1");
        fields.put("date2", "DATE2");
        fields.put("integer1", "INTEGER1");
        fields.put("integer2", "INTEGER2");
        fields.put("string1", "STRING1");
        fields.put("string2", "STRING2");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TemporalExpression", fields);
}
  public static enum Fields implements EntityFieldInterface<TemporalExpression> {
    tempExprId("tempExprId"),
    tempExprTypeId("tempExprTypeId"),
    date1("date1"),
    date2("date2"),
    integer1("integer1"),
    integer2("integer2"),
    string1("string1"),
    string2("string2"),
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

   @org.hibernate.annotations.GenericGenerator(name="TemporalExpression_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="TemporalExpression_GEN")
   @Id
   @Column(name="TEMP_EXPR_ID")
   private String tempExprId;
   @Column(name="TEMP_EXPR_TYPE_ID")
   private String tempExprTypeId;
   @Column(name="DATE1")
   private Timestamp date1;
   @Column(name="DATE2")
   private Timestamp date2;
   @Column(name="INTEGER1")
   private Long integer1;
   @Column(name="INTEGER2")
   private Long integer2;
   @Column(name="STRING1")
   private String string1;
   @Column(name="STRING2")
   private String string2;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="TEMP_EXPR_ID")
   
   private List<JobSandbox> jobSandboxes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="fromTemporalExpression", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FROM_TEMP_EXPR_ID")
   
   private List<TemporalExpressionAssoc> fromTemporalExpressionAssocs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="toTemporalExpression", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="TO_TEMP_EXPR_ID")
   
   private List<TemporalExpressionAssoc> toTemporalExpressionAssocs = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="TEMP_EXPR_ID")
   
   private List<WorkEffort> workEfforts = null;

  /**
   * Default constructor.
   */
  public TemporalExpression() {
      super();
      this.baseEntityName = "TemporalExpression";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("tempExprId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("tempExprId");this.allFieldsNames.add("tempExprTypeId");this.allFieldsNames.add("date1");this.allFieldsNames.add("date2");this.allFieldsNames.add("integer1");this.allFieldsNames.add("integer2");this.allFieldsNames.add("string1");this.allFieldsNames.add("string2");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TemporalExpression(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param tempExprId the tempExprId to set
     */
    public void setTempExprId(String tempExprId) {
        this.tempExprId = tempExprId;
    }
    /**
     * Auto generated value setter.
     * @param tempExprTypeId the tempExprTypeId to set
     */
    public void setTempExprTypeId(String tempExprTypeId) {
        this.tempExprTypeId = tempExprTypeId;
    }
    /**
     * Auto generated value setter.
     * @param date1 the date1 to set
     */
    public void setDate1(Timestamp date1) {
        this.date1 = date1;
    }
    /**
     * Auto generated value setter.
     * @param date2 the date2 to set
     */
    public void setDate2(Timestamp date2) {
        this.date2 = date2;
    }
    /**
     * Auto generated value setter.
     * @param integer1 the integer1 to set
     */
    public void setInteger1(Long integer1) {
        this.integer1 = integer1;
    }
    /**
     * Auto generated value setter.
     * @param integer2 the integer2 to set
     */
    public void setInteger2(Long integer2) {
        this.integer2 = integer2;
    }
    /**
     * Auto generated value setter.
     * @param string1 the string1 to set
     */
    public void setString1(String string1) {
        this.string1 = string1;
    }
    /**
     * Auto generated value setter.
     * @param string2 the string2 to set
     */
    public void setString2(String string2) {
        this.string2 = string2;
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
    public String getTempExprId() {
        return this.tempExprId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTempExprTypeId() {
        return this.tempExprTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDate1() {
        return this.date1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDate2() {
        return this.date2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getInteger1() {
        return this.integer1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getInteger2() {
        return this.integer2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getString1() {
        return this.string1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getString2() {
        return this.string2;
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
     * Auto generated method that gets the related <code>JobSandbox</code> by the relation named <code>JobSandbox</code>.
     * @return the list of <code>JobSandbox</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends JobSandbox> getJobSandboxes() throws RepositoryException {
        if (this.jobSandboxes == null) {
            this.jobSandboxes = getRelated(JobSandbox.class, "JobSandbox");
        }
        return this.jobSandboxes;
    }
    /**
     * Auto generated method that gets the related <code>TemporalExpressionAssoc</code> by the relation named <code>FromTemporalExpressionAssoc</code>.
     * @return the list of <code>TemporalExpressionAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TemporalExpressionAssoc> getFromTemporalExpressionAssocs() throws RepositoryException {
        if (this.fromTemporalExpressionAssocs == null) {
            this.fromTemporalExpressionAssocs = getRelated(TemporalExpressionAssoc.class, "FromTemporalExpressionAssoc");
        }
        return this.fromTemporalExpressionAssocs;
    }
    /**
     * Auto generated method that gets the related <code>TemporalExpressionAssoc</code> by the relation named <code>ToTemporalExpressionAssoc</code>.
     * @return the list of <code>TemporalExpressionAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TemporalExpressionAssoc> getToTemporalExpressionAssocs() throws RepositoryException {
        if (this.toTemporalExpressionAssocs == null) {
            this.toTemporalExpressionAssocs = getRelated(TemporalExpressionAssoc.class, "ToTemporalExpressionAssoc");
        }
        return this.toTemporalExpressionAssocs;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the list of <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffort> getWorkEfforts() throws RepositoryException {
        if (this.workEfforts == null) {
            this.workEfforts = getRelated(WorkEffort.class, "WorkEffort");
        }
        return this.workEfforts;
    }

    /**
     * Auto generated value setter.
     * @param jobSandboxes the jobSandboxes to set
    */
    public void setJobSandboxes(List<JobSandbox> jobSandboxes) {
        this.jobSandboxes = jobSandboxes;
    }
    /**
     * Auto generated value setter.
     * @param fromTemporalExpressionAssocs the fromTemporalExpressionAssocs to set
    */
    public void setFromTemporalExpressionAssocs(List<TemporalExpressionAssoc> fromTemporalExpressionAssocs) {
        this.fromTemporalExpressionAssocs = fromTemporalExpressionAssocs;
    }
    /**
     * Auto generated value setter.
     * @param toTemporalExpressionAssocs the toTemporalExpressionAssocs to set
    */
    public void setToTemporalExpressionAssocs(List<TemporalExpressionAssoc> toTemporalExpressionAssocs) {
        this.toTemporalExpressionAssocs = toTemporalExpressionAssocs;
    }
    /**
     * Auto generated value setter.
     * @param workEfforts the workEfforts to set
    */
    public void setWorkEfforts(List<WorkEffort> workEfforts) {
        this.workEfforts = workEfforts;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addFromTemporalExpressionAssoc(TemporalExpressionAssoc fromTemporalExpressionAssoc) {
        if (this.fromTemporalExpressionAssocs == null) {
            this.fromTemporalExpressionAssocs = new ArrayList<TemporalExpressionAssoc>();
        }
        this.fromTemporalExpressionAssocs.add(fromTemporalExpressionAssoc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFromTemporalExpressionAssoc(TemporalExpressionAssoc fromTemporalExpressionAssoc) {
        if (this.fromTemporalExpressionAssocs == null) {
            return;
        }
        this.fromTemporalExpressionAssocs.remove(fromTemporalExpressionAssoc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFromTemporalExpressionAssoc() {
        if (this.fromTemporalExpressionAssocs == null) {
            return;
        }
        this.fromTemporalExpressionAssocs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addToTemporalExpressionAssoc(TemporalExpressionAssoc toTemporalExpressionAssoc) {
        if (this.toTemporalExpressionAssocs == null) {
            this.toTemporalExpressionAssocs = new ArrayList<TemporalExpressionAssoc>();
        }
        this.toTemporalExpressionAssocs.add(toTemporalExpressionAssoc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeToTemporalExpressionAssoc(TemporalExpressionAssoc toTemporalExpressionAssoc) {
        if (this.toTemporalExpressionAssocs == null) {
            return;
        }
        this.toTemporalExpressionAssocs.remove(toTemporalExpressionAssoc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearToTemporalExpressionAssoc() {
        if (this.toTemporalExpressionAssocs == null) {
            return;
        }
        this.toTemporalExpressionAssocs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTempExprId((String) mapValue.get("tempExprId"));
        setTempExprTypeId((String) mapValue.get("tempExprTypeId"));
        setDate1((Timestamp) mapValue.get("date1"));
        setDate2((Timestamp) mapValue.get("date2"));
        setInteger1((Long) mapValue.get("integer1"));
        setInteger2((Long) mapValue.get("integer2"));
        setString1((String) mapValue.get("string1"));
        setString2((String) mapValue.get("string2"));
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
        mapValue.put("tempExprId", getTempExprId());
        mapValue.put("tempExprTypeId", getTempExprTypeId());
        mapValue.put("date1", getDate1());
        mapValue.put("date2", getDate2());
        mapValue.put("integer1", getInteger1());
        mapValue.put("integer2", getInteger2());
        mapValue.put("string1", getString1());
        mapValue.put("string2", getString2());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
