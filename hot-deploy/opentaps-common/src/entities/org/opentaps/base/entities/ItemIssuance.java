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
 * Auto generated base entity ItemIssuance.
 */
@javax.persistence.Entity
@Table(name="ITEM_ISSUANCE")
public class ItemIssuance extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("itemIssuanceId", "ITEM_ISSUANCE_ID");
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("shipGroupSeqId", "SHIP_GROUP_SEQ_ID");
        fields.put("inventoryItemId", "INVENTORY_ITEM_ID");
        fields.put("shipmentId", "SHIPMENT_ID");
        fields.put("shipmentItemSeqId", "SHIPMENT_ITEM_SEQ_ID");
        fields.put("fixedAssetId", "FIXED_ASSET_ID");
        fields.put("maintHistSeqId", "MAINT_HIST_SEQ_ID");
        fields.put("issuedDateTime", "ISSUED_DATE_TIME");
        fields.put("issuedByUserLoginId", "ISSUED_BY_USER_LOGIN_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("cancelQuantity", "CANCEL_QUANTITY");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ItemIssuance", fields);
}
  public static enum Fields implements EntityFieldInterface<ItemIssuance> {
    itemIssuanceId("itemIssuanceId"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    shipGroupSeqId("shipGroupSeqId"),
    inventoryItemId("inventoryItemId"),
    shipmentId("shipmentId"),
    shipmentItemSeqId("shipmentItemSeqId"),
    fixedAssetId("fixedAssetId"),
    maintHistSeqId("maintHistSeqId"),
    issuedDateTime("issuedDateTime"),
    issuedByUserLoginId("issuedByUserLoginId"),
    quantity("quantity"),
    cancelQuantity("cancelQuantity"),
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

   @org.hibernate.annotations.GenericGenerator(name="ItemIssuance_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ItemIssuance_GEN")
   @Id
   @Column(name="ITEM_ISSUANCE_ID")
   private String itemIssuanceId;
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="ORDER_ITEM_SEQ_ID")
   private String orderItemSeqId;
   @Column(name="SHIP_GROUP_SEQ_ID")
   private String shipGroupSeqId;
   @Column(name="INVENTORY_ITEM_ID")
   private String inventoryItemId;
   @Column(name="SHIPMENT_ID")
   private String shipmentId;
   @Column(name="SHIPMENT_ITEM_SEQ_ID")
   private String shipmentItemSeqId;
   @Column(name="FIXED_ASSET_ID")
   private String fixedAssetId;
   @Column(name="MAINT_HIST_SEQ_ID")
   private String maintHistSeqId;
   @Column(name="ISSUED_DATE_TIME")
   private Timestamp issuedDateTime;
   @Column(name="ISSUED_BY_USER_LOGIN_ID")
   private String issuedByUserLoginId;
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="CANCEL_QUANTITY")
   private BigDecimal cancelQuantity;
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
   private transient OrderItemShipGrpInvRes orderItemShipGrpInvRes = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Shipment shipment = null;
   private transient ShipmentItem shipmentItem = null;
   private transient FixedAssetMaint fixedAssetMaint = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   private transient OrderItem orderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ISSUED_BY_USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin issuedByUserLogin = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ITEM_ISSUANCE_ID")
   
   private List<InventoryItemDetail> inventoryItemDetails = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ITEM_ISSUANCE_ID")
   
   private List<InventoryItemTraceDetail> inventoryItemTraceDetails = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ITEM_ISSUANCE_ID")
   
   private List<InventoryTransfer> inventoryTransfers = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="itemIssuance", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ITEM_ISSUANCE_ID")
   
   private List<ItemIssuanceRole> itemIssuanceRoles = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ITEM_ISSUANCE_ID")
   
   private List<OrderItemBilling> orderItemBillings = null;

  /**
   * Default constructor.
   */
  public ItemIssuance() {
      super();
      this.baseEntityName = "ItemIssuance";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("itemIssuanceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("itemIssuanceId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipmentItemSeqId");this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("maintHistSeqId");this.allFieldsNames.add("issuedDateTime");this.allFieldsNames.add("issuedByUserLoginId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("cancelQuantity");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ItemIssuance(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param itemIssuanceId the itemIssuanceId to set
     */
    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
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
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentItemSeqId the shipmentItemSeqId to set
     */
    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetId the fixedAssetId to set
     */
    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
    /**
     * Auto generated value setter.
     * @param maintHistSeqId the maintHistSeqId to set
     */
    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
    /**
     * Auto generated value setter.
     * @param issuedDateTime the issuedDateTime to set
     */
    public void setIssuedDateTime(Timestamp issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }
    /**
     * Auto generated value setter.
     * @param issuedByUserLoginId the issuedByUserLoginId to set
     */
    public void setIssuedByUserLoginId(String issuedByUserLoginId) {
        this.issuedByUserLoginId = issuedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param cancelQuantity the cancelQuantity to set
     */
    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
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
    public String getItemIssuanceId() {
        return this.itemIssuanceId;
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
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
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
    public String getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentItemSeqId() {
        return this.shipmentItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFixedAssetId() {
        return this.fixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaintHistSeqId() {
        return this.maintHistSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getIssuedDateTime() {
        return this.issuedDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIssuedByUserLoginId() {
        return this.issuedByUserLoginId;
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
    public BigDecimal getCancelQuantity() {
        return this.cancelQuantity;
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
     * Auto generated method that gets the related <code>OrderItemShipGrpInvRes</code> by the relation named <code>OrderItemShipGrpInvRes</code>.
     * @return the <code>OrderItemShipGrpInvRes</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemShipGrpInvRes getOrderItemShipGrpInvRes() throws RepositoryException {
        if (this.orderItemShipGrpInvRes == null) {
            this.orderItemShipGrpInvRes = getRelatedOne(OrderItemShipGrpInvRes.class, "OrderItemShipGrpInvRes");
        }
        return this.orderItemShipGrpInvRes;
    }
    /**
     * Auto generated method that gets the related <code>Shipment</code> by the relation named <code>Shipment</code>.
     * @return the <code>Shipment</code>
     * @throws RepositoryException if an error occurs
     */
    public Shipment getShipment() throws RepositoryException {
        if (this.shipment == null) {
            this.shipment = getRelatedOne(Shipment.class, "Shipment");
        }
        return this.shipment;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentItem</code> by the relation named <code>ShipmentItem</code>.
     * @return the <code>ShipmentItem</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentItem getShipmentItem() throws RepositoryException {
        if (this.shipmentItem == null) {
            this.shipmentItem = getRelatedOne(ShipmentItem.class, "ShipmentItem");
        }
        return this.shipmentItem;
    }
    /**
     * Auto generated method that gets the related <code>FixedAssetMaint</code> by the relation named <code>FixedAssetMaint</code>.
     * @return the <code>FixedAssetMaint</code>
     * @throws RepositoryException if an error occurs
     */
    public FixedAssetMaint getFixedAssetMaint() throws RepositoryException {
        if (this.fixedAssetMaint == null) {
            this.fixedAssetMaint = getRelatedOne(FixedAssetMaint.class, "FixedAssetMaint");
        }
        return this.fixedAssetMaint;
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
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getOrderItem() throws RepositoryException {
        if (this.orderItem == null) {
            this.orderItem = getRelatedOne(OrderItem.class, "OrderItem");
        }
        return this.orderItem;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>IssuedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getIssuedByUserLogin() throws RepositoryException {
        if (this.issuedByUserLogin == null) {
            this.issuedByUserLogin = getRelatedOne(UserLogin.class, "IssuedByUserLogin");
        }
        return this.issuedByUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemDetail</code> by the relation named <code>InventoryItemDetail</code>.
     * @return the list of <code>InventoryItemDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemDetail> getInventoryItemDetails() throws RepositoryException {
        if (this.inventoryItemDetails == null) {
            this.inventoryItemDetails = getRelated(InventoryItemDetail.class, "InventoryItemDetail");
        }
        return this.inventoryItemDetails;
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
     * Auto generated method that gets the related <code>InventoryTransfer</code> by the relation named <code>InventoryTransfer</code>.
     * @return the list of <code>InventoryTransfer</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryTransfer> getInventoryTransfers() throws RepositoryException {
        if (this.inventoryTransfers == null) {
            this.inventoryTransfers = getRelated(InventoryTransfer.class, "InventoryTransfer");
        }
        return this.inventoryTransfers;
    }
    /**
     * Auto generated method that gets the related <code>ItemIssuanceRole</code> by the relation named <code>ItemIssuanceRole</code>.
     * @return the list of <code>ItemIssuanceRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ItemIssuanceRole> getItemIssuanceRoles() throws RepositoryException {
        if (this.itemIssuanceRoles == null) {
            this.itemIssuanceRoles = getRelated(ItemIssuanceRole.class, "ItemIssuanceRole");
        }
        return this.itemIssuanceRoles;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemBilling</code> by the relation named <code>OrderItemBilling</code>.
     * @return the list of <code>OrderItemBilling</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemBilling> getOrderItemBillings() throws RepositoryException {
        if (this.orderItemBillings == null) {
            this.orderItemBillings = getRelated(OrderItemBilling.class, "OrderItemBilling");
        }
        return this.orderItemBillings;
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
     * @param orderItemShipGrpInvRes the orderItemShipGrpInvRes to set
    */
    public void setOrderItemShipGrpInvRes(OrderItemShipGrpInvRes orderItemShipGrpInvRes) {
        this.orderItemShipGrpInvRes = orderItemShipGrpInvRes;
    }
    /**
     * Auto generated value setter.
     * @param shipment the shipment to set
    */
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
    /**
     * Auto generated value setter.
     * @param shipmentItem the shipmentItem to set
    */
    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetMaint the fixedAssetMaint to set
    */
    public void setFixedAssetMaint(FixedAssetMaint fixedAssetMaint) {
        this.fixedAssetMaint = fixedAssetMaint;
    }
    /**
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
    /**
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
    /**
     * Auto generated value setter.
     * @param issuedByUserLogin the issuedByUserLogin to set
    */
    public void setIssuedByUserLogin(UserLogin issuedByUserLogin) {
        this.issuedByUserLogin = issuedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemDetails the inventoryItemDetails to set
    */
    public void setInventoryItemDetails(List<InventoryItemDetail> inventoryItemDetails) {
        this.inventoryItemDetails = inventoryItemDetails;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemTraceDetails the inventoryItemTraceDetails to set
    */
    public void setInventoryItemTraceDetails(List<InventoryItemTraceDetail> inventoryItemTraceDetails) {
        this.inventoryItemTraceDetails = inventoryItemTraceDetails;
    }
    /**
     * Auto generated value setter.
     * @param inventoryTransfers the inventoryTransfers to set
    */
    public void setInventoryTransfers(List<InventoryTransfer> inventoryTransfers) {
        this.inventoryTransfers = inventoryTransfers;
    }
    /**
     * Auto generated value setter.
     * @param itemIssuanceRoles the itemIssuanceRoles to set
    */
    public void setItemIssuanceRoles(List<ItemIssuanceRole> itemIssuanceRoles) {
        this.itemIssuanceRoles = itemIssuanceRoles;
    }
    /**
     * Auto generated value setter.
     * @param orderItemBillings the orderItemBillings to set
    */
    public void setOrderItemBillings(List<OrderItemBilling> orderItemBillings) {
        this.orderItemBillings = orderItemBillings;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addItemIssuanceRole(ItemIssuanceRole itemIssuanceRole) {
        if (this.itemIssuanceRoles == null) {
            this.itemIssuanceRoles = new ArrayList<ItemIssuanceRole>();
        }
        this.itemIssuanceRoles.add(itemIssuanceRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeItemIssuanceRole(ItemIssuanceRole itemIssuanceRole) {
        if (this.itemIssuanceRoles == null) {
            return;
        }
        this.itemIssuanceRoles.remove(itemIssuanceRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearItemIssuanceRole() {
        if (this.itemIssuanceRoles == null) {
            return;
        }
        this.itemIssuanceRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setItemIssuanceId((String) mapValue.get("itemIssuanceId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setShipmentId((String) mapValue.get("shipmentId"));
        setShipmentItemSeqId((String) mapValue.get("shipmentItemSeqId"));
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setMaintHistSeqId((String) mapValue.get("maintHistSeqId"));
        setIssuedDateTime((Timestamp) mapValue.get("issuedDateTime"));
        setIssuedByUserLoginId((String) mapValue.get("issuedByUserLoginId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setCancelQuantity(convertToBigDecimal(mapValue.get("cancelQuantity")));
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
        mapValue.put("itemIssuanceId", getItemIssuanceId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("shipmentItemSeqId", getShipmentItemSeqId());
        mapValue.put("fixedAssetId", getFixedAssetId());
        mapValue.put("maintHistSeqId", getMaintHistSeqId());
        mapValue.put("issuedDateTime", getIssuedDateTime());
        mapValue.put("issuedByUserLoginId", getIssuedByUserLoginId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("cancelQuantity", getCancelQuantity());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
