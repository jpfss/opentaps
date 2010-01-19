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
 * Auto generated base entity TrackingCodeOrderAndOrderHeader.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectTrackingCodeOrderAndOrderHeaders", query="SELECT TCO.ORDER_ID AS \"orderId\",TCO.TRACKING_CODE_ID AS \"trackingCodeId\",TCO.SITE_ID AS \"siteId\",TCO.HAS_EXPORTED AS \"hasExported\",TCO.AFFILIATE_REFERRED_TIME_STAMP AS \"affiliateReferredTimeStamp\",OH.STATUS_ID AS \"statusId\" FROM TRACKING_CODE_ORDER TCO INNER JOIN ORDER_HEADER OH ON TCO.ORDER_ID = OH.ORDER_ID", resultSetMapping="TrackingCodeOrderAndOrderHeaderMapping")
@SqlResultSetMapping(name="TrackingCodeOrderAndOrderHeaderMapping", entities={
@EntityResult(entityClass=TrackingCodeOrderAndOrderHeader.class, fields = {
@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="trackingCodeId", column="trackingCodeId")
,@FieldResult(name="siteId", column="siteId")
,@FieldResult(name="hasExported", column="hasExported")
,@FieldResult(name="affiliateReferredTimeStamp", column="affiliateReferredTimeStamp")
,@FieldResult(name="statusId", column="statusId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class TrackingCodeOrderAndOrderHeader extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "TCO.ORDER_ID");
        fields.put("trackingCodeId", "TCO.TRACKING_CODE_ID");
        fields.put("siteId", "TCO.SITE_ID");
        fields.put("hasExported", "TCO.HAS_EXPORTED");
        fields.put("affiliateReferredTimeStamp", "TCO.AFFILIATE_REFERRED_TIME_STAMP");
        fields.put("statusId", "OH.STATUS_ID");
fieldMapColumns.put("TrackingCodeOrderAndOrderHeader", fields);
}
  public static enum Fields implements EntityFieldInterface<TrackingCodeOrderAndOrderHeader> {
    orderId("orderId"),
    trackingCodeId("trackingCodeId"),
    siteId("siteId"),
    hasExported("hasExported"),
    affiliateReferredTimeStamp("affiliateReferredTimeStamp"),
    statusId("statusId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String orderId;
    
   private String trackingCodeId;
    
   private String siteId;
    
   private String hasExported;
    
   private Timestamp affiliateReferredTimeStamp;
    
   private String statusId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;

  /**
   * Default constructor.
   */
  public TrackingCodeOrderAndOrderHeader() {
      super();
      this.baseEntityName = "TrackingCodeOrderAndOrderHeader";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("trackingCodeId");this.allFieldsNames.add("siteId");this.allFieldsNames.add("hasExported");this.allFieldsNames.add("affiliateReferredTimeStamp");this.allFieldsNames.add("statusId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TrackingCodeOrderAndOrderHeader(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeId the trackingCodeId to set
     */
    public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }
    /**
     * Auto generated value setter.
     * @param siteId the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    /**
     * Auto generated value setter.
     * @param hasExported the hasExported to set
     */
    public void setHasExported(String hasExported) {
        this.hasExported = hasExported;
    }
    /**
     * Auto generated value setter.
     * @param affiliateReferredTimeStamp the affiliateReferredTimeStamp to set
     */
    public void setAffiliateReferredTimeStamp(Timestamp affiliateReferredTimeStamp) {
        this.affiliateReferredTimeStamp = affiliateReferredTimeStamp;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeId() {
        return this.trackingCodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasExported() {
        return this.hasExported;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAffiliateReferredTimeStamp() {
        return this.affiliateReferredTimeStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }

    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getOrderHeader() throws RepositoryException {
        if (this.orderHeader == null) {
            this.orderHeader = getRelatedOne(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeader;
    }

    /**
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setTrackingCodeId((String) mapValue.get("trackingCodeId"));
        setSiteId((String) mapValue.get("siteId"));
        setHasExported((String) mapValue.get("hasExported"));
        setAffiliateReferredTimeStamp((Timestamp) mapValue.get("affiliateReferredTimeStamp"));
        setStatusId((String) mapValue.get("statusId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderId", getOrderId());
        mapValue.put("trackingCodeId", getTrackingCodeId());
        mapValue.put("siteId", getSiteId());
        mapValue.put("hasExported", getHasExported());
        mapValue.put("affiliateReferredTimeStamp", getAffiliateReferredTimeStamp());
        mapValue.put("statusId", getStatusId());
        return mapValue;
    }


}
