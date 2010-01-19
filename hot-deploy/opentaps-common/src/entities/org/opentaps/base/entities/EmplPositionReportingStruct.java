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
 * Auto generated base entity EmplPositionReportingStruct.
 */
@javax.persistence.Entity
@Table(name="EMPL_POSITION_REPORTING_STRUCT")
public class EmplPositionReportingStruct extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("emplPositionIdReportingTo", "EMPL_POSITION_ID_REPORTING_TO");
        fields.put("emplPositionIdManagedBy", "EMPL_POSITION_ID_MANAGED_BY");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("comments", "COMMENTS");
        fields.put("primaryFlag", "PRIMARY_FLAG");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EmplPositionReportingStruct", fields);
}
  public static enum Fields implements EntityFieldInterface<EmplPositionReportingStruct> {
    emplPositionIdReportingTo("emplPositionIdReportingTo"),
    emplPositionIdManagedBy("emplPositionIdManagedBy"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    comments("comments"),
    primaryFlag("primaryFlag"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.EmplPositionReportingStructPkBridge.class)
     private EmplPositionReportingStructPk id = new EmplPositionReportingStructPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>EmplPositionReportingStructPk</code>
     */
      public EmplPositionReportingStructPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>EmplPositionReportingStructPk</code> value to set
    */   
      public void setId(EmplPositionReportingStructPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="PRIMARY_FLAG")
   private String primaryFlag;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMPL_POSITION_ID_REPORTING_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private EmplPosition reportingToEmplPosition = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMPL_POSITION_ID_MANAGED_BY", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private EmplPosition managedByEmplPosition = null;

  /**
   * Default constructor.
   */
  public EmplPositionReportingStruct() {
      super();
      this.baseEntityName = "EmplPositionReportingStruct";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("emplPositionIdReportingTo");this.primaryKeyNames.add("emplPositionIdManagedBy");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("emplPositionIdReportingTo");this.allFieldsNames.add("emplPositionIdManagedBy");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("comments");this.allFieldsNames.add("primaryFlag");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EmplPositionReportingStruct(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param emplPositionIdReportingTo the emplPositionIdReportingTo to set
     */
    public void setEmplPositionIdReportingTo(String emplPositionIdReportingTo) {
        id.setEmplPositionIdReportingTo(emplPositionIdReportingTo);
    }
    /**
     * Auto generated value setter.
     * @param emplPositionIdManagedBy the emplPositionIdManagedBy to set
     */
    public void setEmplPositionIdManagedBy(String emplPositionIdManagedBy) {
        id.setEmplPositionIdManagedBy(emplPositionIdManagedBy);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
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
     * @param primaryFlag the primaryFlag to set
     */
    public void setPrimaryFlag(String primaryFlag) {
        this.primaryFlag = primaryFlag;
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
    public String getEmplPositionIdReportingTo() {
        return this.id.getEmplPositionIdReportingTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEmplPositionIdManagedBy() {
        return this.id.getEmplPositionIdManagedBy();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
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
     * @return <code>String</code>
     */
    public String getPrimaryFlag() {
        return this.primaryFlag;
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
     * Auto generated method that gets the related <code>EmplPosition</code> by the relation named <code>ReportingToEmplPosition</code>.
     * @return the <code>EmplPosition</code>
     * @throws RepositoryException if an error occurs
     */
    public EmplPosition getReportingToEmplPosition() throws RepositoryException {
        if (this.reportingToEmplPosition == null) {
            this.reportingToEmplPosition = getRelatedOne(EmplPosition.class, "ReportingToEmplPosition");
        }
        return this.reportingToEmplPosition;
    }
    /**
     * Auto generated method that gets the related <code>EmplPosition</code> by the relation named <code>ManagedByEmplPosition</code>.
     * @return the <code>EmplPosition</code>
     * @throws RepositoryException if an error occurs
     */
    public EmplPosition getManagedByEmplPosition() throws RepositoryException {
        if (this.managedByEmplPosition == null) {
            this.managedByEmplPosition = getRelatedOne(EmplPosition.class, "ManagedByEmplPosition");
        }
        return this.managedByEmplPosition;
    }

    /**
     * Auto generated value setter.
     * @param reportingToEmplPosition the reportingToEmplPosition to set
    */
    public void setReportingToEmplPosition(EmplPosition reportingToEmplPosition) {
        this.reportingToEmplPosition = reportingToEmplPosition;
    }
    /**
     * Auto generated value setter.
     * @param managedByEmplPosition the managedByEmplPosition to set
    */
    public void setManagedByEmplPosition(EmplPosition managedByEmplPosition) {
        this.managedByEmplPosition = managedByEmplPosition;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEmplPositionIdReportingTo((String) mapValue.get("emplPositionIdReportingTo"));
        setEmplPositionIdManagedBy((String) mapValue.get("emplPositionIdManagedBy"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setComments((String) mapValue.get("comments"));
        setPrimaryFlag((String) mapValue.get("primaryFlag"));
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
        mapValue.put("emplPositionIdReportingTo", getEmplPositionIdReportingTo());
        mapValue.put("emplPositionIdManagedBy", getEmplPositionIdManagedBy());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("comments", getComments());
        mapValue.put("primaryFlag", getPrimaryFlag());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
