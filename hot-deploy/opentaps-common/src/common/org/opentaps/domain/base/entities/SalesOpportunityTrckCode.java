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
import java.sql.Timestamp;

/**
 * Auto generated base entity SalesOpportunityTrckCode.
 */
@javax.persistence.Entity
@Table(name="SALES_OPPORTUNITY_TRCK_CODE")
public class SalesOpportunityTrckCode extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("salesOpportunityId", "SALES_OPPORTUNITY_ID");
        fields.put("trackingCodeId", "TRACKING_CODE_ID");
        fields.put("receivedDate", "RECEIVED_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SalesOpportunityTrckCode", fields);
}
  public static enum Fields implements EntityFieldInterface<SalesOpportunityTrckCode> {
    salesOpportunityId("salesOpportunityId"),
    trackingCodeId("trackingCodeId"),
    receivedDate("receivedDate"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.SalesOpportunityTrckCodePkBridge.class)
     private SalesOpportunityTrckCodePk id = new SalesOpportunityTrckCodePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>SalesOpportunityTrckCodePk</code>
     */
      public SalesOpportunityTrckCodePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>SalesOpportunityTrckCodePk</code> value to set
    */   
      public void setId(SalesOpportunityTrckCodePk id) {
         this.id = id;
      }
   @Column(name="RECEIVED_DATE")
   private Timestamp receivedDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SALES_OPPORTUNITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SalesOpportunity salesOpportunity = null;

  /**
   * Default constructor.
   */
  public SalesOpportunityTrckCode() {
      super();
      this.baseEntityName = "SalesOpportunityTrckCode";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("salesOpportunityId");this.primaryKeyNames.add("trackingCodeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("salesOpportunityId");this.allFieldsNames.add("trackingCodeId");this.allFieldsNames.add("receivedDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SalesOpportunityTrckCode(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param salesOpportunityId the salesOpportunityId to set
     */
    public void setSalesOpportunityId(String salesOpportunityId) {
        id.setSalesOpportunityId(salesOpportunityId);
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeId the trackingCodeId to set
     */
    public void setTrackingCodeId(String trackingCodeId) {
        id.setTrackingCodeId(trackingCodeId);
    }
    /**
     * Auto generated value setter.
     * @param receivedDate the receivedDate to set
     */
    public void setReceivedDate(Timestamp receivedDate) {
        this.receivedDate = receivedDate;
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
    public String getSalesOpportunityId() {
        return this.id.getSalesOpportunityId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeId() {
        return this.id.getTrackingCodeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReceivedDate() {
        return this.receivedDate;
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
     * Auto generated method that gets the related <code>SalesOpportunity</code> by the relation named <code>SalesOpportunity</code>.
     * @return the <code>SalesOpportunity</code>
     * @throws RepositoryException if an error occurs
     */
    public SalesOpportunity getSalesOpportunity() throws RepositoryException {
        if (this.salesOpportunity == null) {
            this.salesOpportunity = getRelatedOne(SalesOpportunity.class, "SalesOpportunity");
        }
        return this.salesOpportunity;
    }

    /**
     * Auto generated value setter.
     * @param salesOpportunity the salesOpportunity to set
    */
    public void setSalesOpportunity(SalesOpportunity salesOpportunity) {
        this.salesOpportunity = salesOpportunity;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSalesOpportunityId((String) mapValue.get("salesOpportunityId"));
        setTrackingCodeId((String) mapValue.get("trackingCodeId"));
        setReceivedDate((Timestamp) mapValue.get("receivedDate"));
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
        mapValue.put("salesOpportunityId", getSalesOpportunityId());
        mapValue.put("trackingCodeId", getTrackingCodeId());
        mapValue.put("receivedDate", getReceivedDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
