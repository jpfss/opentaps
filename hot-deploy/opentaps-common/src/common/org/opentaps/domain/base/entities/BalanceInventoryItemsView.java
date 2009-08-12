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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity BalanceInventoryItemsView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectBalanceInventoryItemsViews", query="SELECT INV.INVENTORY_ITEM_ID AS \"inventoryItemId\",INV.PRODUCT_ID AS \"productId\",INV.FACILITY_ID AS \"facilityId\",INV.INVENTORY_ITEM_TYPE_ID AS \"inventoryItemTypeId\",INV.AVAILABLE_TO_PROMISE_TOTAL AS \"availableToPromiseTotal\",INV.QUANTITY_ON_HAND_TOTAL AS \"quantityOnHandTotal\",RES.ORDER_ID AS \"orderId\",RES.SHIP_GROUP_SEQ_ID AS \"shipGroupSeqId\",RES.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",RES.QUANTITY AS \"quantity\",RES.QUANTITY_NOT_AVAILABLE AS \"quantityNotAvailable\",RES.RESERVE_ORDER_ENUM_ID AS \"reserveOrderEnumId\",RES.RESERVED_DATETIME AS \"reservedDatetime\",RES.SEQUENCE_ID AS \"sequenceId\" FROM INVENTORY_ITEM INV INNER JOIN ORDER_ITEM_SHIP_GRP_INV_RES RES ON INV.INVENTORY_ITEM_ID = RES.INVENTORY_ITEM_ID", resultSetMapping="BalanceInventoryItemsViewMapping")
@SqlResultSetMapping(name="BalanceInventoryItemsViewMapping", entities={
@EntityResult(entityClass=BalanceInventoryItemsView.class, fields = {
@FieldResult(name="inventoryItemId", column="inventoryItemId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="inventoryItemTypeId", column="inventoryItemTypeId")
,@FieldResult(name="availableToPromiseTotal", column="availableToPromiseTotal")
,@FieldResult(name="quantityOnHandTotal", column="quantityOnHandTotal")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="shipGroupSeqId", column="shipGroupSeqId")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="quantityNotAvailable", column="quantityNotAvailable")
,@FieldResult(name="reserveOrderEnumId", column="reserveOrderEnumId")
,@FieldResult(name="reservedDatetime", column="reservedDatetime")
,@FieldResult(name="sequenceId", column="sequenceId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class BalanceInventoryItemsView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("inventoryItemId", "INV.INVENTORY_ITEM_ID");
        fields.put("productId", "INV.PRODUCT_ID");
        fields.put("facilityId", "INV.FACILITY_ID");
        fields.put("inventoryItemTypeId", "INV.INVENTORY_ITEM_TYPE_ID");
        fields.put("availableToPromiseTotal", "INV.AVAILABLE_TO_PROMISE_TOTAL");
        fields.put("quantityOnHandTotal", "INV.QUANTITY_ON_HAND_TOTAL");
        fields.put("orderId", "RES.ORDER_ID");
        fields.put("shipGroupSeqId", "RES.SHIP_GROUP_SEQ_ID");
        fields.put("orderItemSeqId", "RES.ORDER_ITEM_SEQ_ID");
        fields.put("quantity", "RES.QUANTITY");
        fields.put("quantityNotAvailable", "RES.QUANTITY_NOT_AVAILABLE");
        fields.put("reserveOrderEnumId", "RES.RESERVE_ORDER_ENUM_ID");
        fields.put("reservedDatetime", "RES.RESERVED_DATETIME");
        fields.put("sequenceId", "RES.SEQUENCE_ID");
fieldMapColumns.put("BalanceInventoryItemsView", fields);
}
  public static enum Fields implements EntityFieldInterface<BalanceInventoryItemsView> {
    inventoryItemId("inventoryItemId"),
    productId("productId"),
    facilityId("facilityId"),
    inventoryItemTypeId("inventoryItemTypeId"),
    availableToPromiseTotal("availableToPromiseTotal"),
    quantityOnHandTotal("quantityOnHandTotal"),
    orderId("orderId"),
    shipGroupSeqId("shipGroupSeqId"),
    orderItemSeqId("orderItemSeqId"),
    quantity("quantity"),
    quantityNotAvailable("quantityNotAvailable"),
    reserveOrderEnumId("reserveOrderEnumId"),
    reservedDatetime("reservedDatetime"),
    sequenceId("sequenceId");
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
   private String inventoryItemId;
    
   private String productId;
    
   private String facilityId;
    
   private String inventoryItemTypeId;
    
   private BigDecimal availableToPromiseTotal;
    
   private BigDecimal quantityOnHandTotal;
    
   private String orderId;
    
   private String shipGroupSeqId;
    
   private String orderItemSeqId;
    
   private BigDecimal quantity;
    
   private BigDecimal quantityNotAvailable;
    
   private String reserveOrderEnumId;
    
   private Timestamp reservedDatetime;
    
   private Long sequenceId;

  /**
   * Default constructor.
   */
  public BalanceInventoryItemsView() {
      super();
      this.baseEntityName = "BalanceInventoryItemsView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("inventoryItemId");this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("shipGroupSeqId");this.primaryKeyNames.add("orderItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("productId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("inventoryItemTypeId");this.allFieldsNames.add("availableToPromiseTotal");this.allFieldsNames.add("quantityOnHandTotal");this.allFieldsNames.add("orderId");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("quantityNotAvailable");this.allFieldsNames.add("reserveOrderEnumId");this.allFieldsNames.add("reservedDatetime");this.allFieldsNames.add("sequenceId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BalanceInventoryItemsView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    private void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    private void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    private void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemTypeId the inventoryItemTypeId to set
     */
    private void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param availableToPromiseTotal the availableToPromiseTotal to set
     */
    private void setAvailableToPromiseTotal(BigDecimal availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }
    /**
     * Auto generated value setter.
     * @param quantityOnHandTotal the quantityOnHandTotal to set
     */
    private void setQuantityOnHandTotal(BigDecimal quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    private void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    private void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    private void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    private void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param quantityNotAvailable the quantityNotAvailable to set
     */
    private void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }
    /**
     * Auto generated value setter.
     * @param reserveOrderEnumId the reserveOrderEnumId to set
     */
    private void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
    }
    /**
     * Auto generated value setter.
     * @param reservedDatetime the reservedDatetime to set
     */
    private void setReservedDatetime(Timestamp reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }
    /**
     * Auto generated value setter.
     * @param sequenceId the sequenceId to set
     */
    private void setSequenceId(Long sequenceId) {
        this.sequenceId = sequenceId;
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
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemTypeId() {
        return this.inventoryItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAvailableToPromiseTotal() {
        return this.availableToPromiseTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOnHandTotal() {
        return this.quantityOnHandTotal;
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
    public String getShipGroupSeqId() {
        return this.shipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityNotAvailable() {
        return this.quantityNotAvailable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReserveOrderEnumId() {
        return this.reserveOrderEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReservedDatetime() {
        return this.reservedDatetime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceId() {
        return this.sequenceId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setProductId((String) mapValue.get("productId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setInventoryItemTypeId((String) mapValue.get("inventoryItemTypeId"));
        setAvailableToPromiseTotal(convertToBigDecimal(mapValue.get("availableToPromiseTotal")));
        setQuantityOnHandTotal(convertToBigDecimal(mapValue.get("quantityOnHandTotal")));
        setOrderId((String) mapValue.get("orderId"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setQuantityNotAvailable(convertToBigDecimal(mapValue.get("quantityNotAvailable")));
        setReserveOrderEnumId((String) mapValue.get("reserveOrderEnumId"));
        setReservedDatetime((Timestamp) mapValue.get("reservedDatetime"));
        setSequenceId((Long) mapValue.get("sequenceId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("productId", getProductId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("inventoryItemTypeId", getInventoryItemTypeId());
        mapValue.put("availableToPromiseTotal", getAvailableToPromiseTotal());
        mapValue.put("quantityOnHandTotal", getQuantityOnHandTotal());
        mapValue.put("orderId", getOrderId());
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("quantityNotAvailable", getQuantityNotAvailable());
        mapValue.put("reserveOrderEnumId", getReserveOrderEnumId());
        mapValue.put("reservedDatetime", getReservedDatetime());
        mapValue.put("sequenceId", getSequenceId());
        return mapValue;
    }


}
