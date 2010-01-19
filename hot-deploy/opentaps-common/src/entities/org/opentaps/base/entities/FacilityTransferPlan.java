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
 * Auto generated base entity FacilityTransferPlan.
 */
@javax.persistence.Entity
@Table(name="FACILITY_TRANSFER_PLAN")
public class FacilityTransferPlan extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityTransferPlanId", "FACILITY_TRANSFER_PLAN_ID");
        fields.put("facilityIdFrom", "FACILITY_ID_FROM");
        fields.put("facilityIdTo", "FACILITY_ID_TO");
        fields.put("scheduledTransferDatetime", "SCHEDULED_TRANSFER_DATETIME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FacilityTransferPlan", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityTransferPlan> {
    facilityTransferPlanId("facilityTransferPlanId"),
    facilityIdFrom("facilityIdFrom"),
    facilityIdTo("facilityIdTo"),
    scheduledTransferDatetime("scheduledTransferDatetime"),
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

   @org.hibernate.annotations.GenericGenerator(name="FacilityTransferPlan_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="FacilityTransferPlan_GEN")
   @Id
   @Column(name="FACILITY_TRANSFER_PLAN_ID")
   private String facilityTransferPlanId;
   @Column(name="FACILITY_ID_FROM")
   private String facilityIdFrom;
   @Column(name="FACILITY_ID_TO")
   private String facilityIdTo;
   @Column(name="SCHEDULED_TRANSFER_DATETIME")
   private Timestamp scheduledTransferDatetime;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_ID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Facility fromFacility = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Facility toFacility = null;

  /**
   * Default constructor.
   */
  public FacilityTransferPlan() {
      super();
      this.baseEntityName = "FacilityTransferPlan";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityTransferPlanId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityTransferPlanId");this.allFieldsNames.add("facilityIdFrom");this.allFieldsNames.add("facilityIdTo");this.allFieldsNames.add("scheduledTransferDatetime");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityTransferPlan(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param facilityTransferPlanId the facilityTransferPlanId to set
     */
    public void setFacilityTransferPlanId(String facilityTransferPlanId) {
        this.facilityTransferPlanId = facilityTransferPlanId;
    }
    /**
     * Auto generated value setter.
     * @param facilityIdFrom the facilityIdFrom to set
     */
    public void setFacilityIdFrom(String facilityIdFrom) {
        this.facilityIdFrom = facilityIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param facilityIdTo the facilityIdTo to set
     */
    public void setFacilityIdTo(String facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }
    /**
     * Auto generated value setter.
     * @param scheduledTransferDatetime the scheduledTransferDatetime to set
     */
    public void setScheduledTransferDatetime(Timestamp scheduledTransferDatetime) {
        this.scheduledTransferDatetime = scheduledTransferDatetime;
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
    public String getFacilityTransferPlanId() {
        return this.facilityTransferPlanId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityIdFrom() {
        return this.facilityIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityIdTo() {
        return this.facilityIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getScheduledTransferDatetime() {
        return this.scheduledTransferDatetime;
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
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>FromFacility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getFromFacility() throws RepositoryException {
        if (this.fromFacility == null) {
            this.fromFacility = getRelatedOne(Facility.class, "FromFacility");
        }
        return this.fromFacility;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>ToFacility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getToFacility() throws RepositoryException {
        if (this.toFacility == null) {
            this.toFacility = getRelatedOne(Facility.class, "ToFacility");
        }
        return this.toFacility;
    }

    /**
     * Auto generated value setter.
     * @param fromFacility the fromFacility to set
    */
    public void setFromFacility(Facility fromFacility) {
        this.fromFacility = fromFacility;
    }
    /**
     * Auto generated value setter.
     * @param toFacility the toFacility to set
    */
    public void setToFacility(Facility toFacility) {
        this.toFacility = toFacility;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityTransferPlanId((String) mapValue.get("facilityTransferPlanId"));
        setFacilityIdFrom((String) mapValue.get("facilityIdFrom"));
        setFacilityIdTo((String) mapValue.get("facilityIdTo"));
        setScheduledTransferDatetime((Timestamp) mapValue.get("scheduledTransferDatetime"));
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
        mapValue.put("facilityTransferPlanId", getFacilityTransferPlanId());
        mapValue.put("facilityIdFrom", getFacilityIdFrom());
        mapValue.put("facilityIdTo", getFacilityIdTo());
        mapValue.put("scheduledTransferDatetime", getScheduledTransferDatetime());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
