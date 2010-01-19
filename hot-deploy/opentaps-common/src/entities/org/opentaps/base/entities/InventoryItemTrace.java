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
 * Auto generated base entity InventoryItemTrace.
 */
@javax.persistence.Entity
@Table(name="INVENTORY_ITEM_TRACE")
public class InventoryItemTrace extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("inventoryItemTraceId", "INVENTORY_ITEM_TRACE_ID");
        fields.put("runDatetime", "RUN_DATETIME");
        fields.put("runByUserLogin", "RUN_BY_USER_LOGIN");
        fields.put("inventoryItemId", "INVENTORY_ITEM_ID");
        fields.put("lotId", "LOT_ID");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InventoryItemTrace", fields);
}
  public static enum Fields implements EntityFieldInterface<InventoryItemTrace> {
    inventoryItemTraceId("inventoryItemTraceId"),
    runDatetime("runDatetime"),
    runByUserLogin("runByUserLogin"),
    inventoryItemId("inventoryItemId"),
    lotId("lotId"),
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

   @org.hibernate.annotations.GenericGenerator(name="InventoryItemTrace_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="InventoryItemTrace_GEN")
   @Id
   @Column(name="INVENTORY_ITEM_TRACE_ID")
   private String inventoryItemTraceId;
   @Column(name="RUN_DATETIME")
   private Timestamp runDatetime;
   @Column(name="RUN_BY_USER_LOGIN")
   private String runByUserLogin;
   @Column(name="INVENTORY_ITEM_ID")
   private String inventoryItemId;
   @Column(name="LOT_ID")
   private String lotId;
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
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItem inventoryItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RUN_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin userLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="LOT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Lot lot = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="inventoryItemTrace", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="INVENTORY_ITEM_TRACE_ID")
   
   private List<InventoryItemTraceDetail> inventoryItemTraceDetails = null;

  /**
   * Default constructor.
   */
  public InventoryItemTrace() {
      super();
      this.baseEntityName = "InventoryItemTrace";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("inventoryItemTraceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("inventoryItemTraceId");this.allFieldsNames.add("runDatetime");this.allFieldsNames.add("runByUserLogin");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("lotId");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InventoryItemTrace(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param inventoryItemTraceId the inventoryItemTraceId to set
     */
    public void setInventoryItemTraceId(String inventoryItemTraceId) {
        this.inventoryItemTraceId = inventoryItemTraceId;
    }
    /**
     * Auto generated value setter.
     * @param runDatetime the runDatetime to set
     */
    public void setRunDatetime(Timestamp runDatetime) {
        this.runDatetime = runDatetime;
    }
    /**
     * Auto generated value setter.
     * @param runByUserLogin the runByUserLogin to set
     */
    public void setRunByUserLogin(String runByUserLogin) {
        this.runByUserLogin = runByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
    /**
     * Auto generated value setter.
     * @param lotId the lotId to set
     */
    public void setLotId(String lotId) {
        this.lotId = lotId;
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
    public String getInventoryItemTraceId() {
        return this.inventoryItemTraceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRunDatetime() {
        return this.runDatetime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRunByUserLogin() {
        return this.runByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLotId() {
        return this.lotId;
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
     * Auto generated method that gets the related <code>InventoryItem</code> by the relation named <code>InventoryItem</code>.
     * @return the <code>InventoryItem</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItem getInventoryItem() throws RepositoryException {
        if (this.inventoryItem == null) {
            this.inventoryItem = getRelatedOne(InventoryItem.class, "InventoryItem");
        }
        return this.inventoryItem;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>UserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getUserLogin() throws RepositoryException {
        if (this.userLogin == null) {
            this.userLogin = getRelatedOne(UserLogin.class, "UserLogin");
        }
        return this.userLogin;
    }
    /**
     * Auto generated method that gets the related <code>Lot</code> by the relation named <code>Lot</code>.
     * @return the <code>Lot</code>
     * @throws RepositoryException if an error occurs
     */
    public Lot getLot() throws RepositoryException {
        if (this.lot == null) {
            this.lot = getRelatedOne(Lot.class, "Lot");
        }
        return this.lot;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemTraceDetail</code> by the relation named <code>InventoryItemTraceDetail</code>.
     * @return the list of <code>InventoryItemTraceDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemTraceDetail> getInventoryItemTraceDetails() throws RepositoryException {
        if (this.inventoryItemTraceDetails == null) {
            this.inventoryItemTraceDetails = getRelated(InventoryItemTraceDetail.class, "InventoryItemTraceDetail");
        }
        return this.inventoryItemTraceDetails;
    }

    /**
     * Auto generated value setter.
     * @param inventoryItem the inventoryItem to set
    */
    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    /**
     * Auto generated value setter.
     * @param userLogin the userLogin to set
    */
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    /**
     * Auto generated value setter.
     * @param lot the lot to set
    */
    public void setLot(Lot lot) {
        this.lot = lot;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemTraceDetails the inventoryItemTraceDetails to set
    */
    public void setInventoryItemTraceDetails(List<InventoryItemTraceDetail> inventoryItemTraceDetails) {
        this.inventoryItemTraceDetails = inventoryItemTraceDetails;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addInventoryItemTraceDetail(InventoryItemTraceDetail inventoryItemTraceDetail) {
        if (this.inventoryItemTraceDetails == null) {
            this.inventoryItemTraceDetails = new ArrayList<InventoryItemTraceDetail>();
        }
        this.inventoryItemTraceDetails.add(inventoryItemTraceDetail);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeInventoryItemTraceDetail(InventoryItemTraceDetail inventoryItemTraceDetail) {
        if (this.inventoryItemTraceDetails == null) {
            return;
        }
        this.inventoryItemTraceDetails.remove(inventoryItemTraceDetail);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearInventoryItemTraceDetail() {
        if (this.inventoryItemTraceDetails == null) {
            return;
        }
        this.inventoryItemTraceDetails.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInventoryItemTraceId((String) mapValue.get("inventoryItemTraceId"));
        setRunDatetime((Timestamp) mapValue.get("runDatetime"));
        setRunByUserLogin((String) mapValue.get("runByUserLogin"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setLotId((String) mapValue.get("lotId"));
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
        mapValue.put("inventoryItemTraceId", getInventoryItemTraceId());
        mapValue.put("runDatetime", getRunDatetime());
        mapValue.put("runByUserLogin", getRunByUserLogin());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("lotId", getLotId());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
