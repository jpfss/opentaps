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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity SupplierProduct.
 */
@javax.persistence.Entity
@Table(name="SUPPLIER_PRODUCT")
public class SupplierProduct extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("availableFromDate", "AVAILABLE_FROM_DATE");
        fields.put("availableThruDate", "AVAILABLE_THRU_DATE");
        fields.put("supplierPrefOrderId", "SUPPLIER_PREF_ORDER_ID");
        fields.put("supplierRatingTypeId", "SUPPLIER_RATING_TYPE_ID");
        fields.put("standardLeadTimeDays", "STANDARD_LEAD_TIME_DAYS");
        fields.put("minimumOrderQuantity", "MINIMUM_ORDER_QUANTITY");
        fields.put("orderQtyIncrements", "ORDER_QTY_INCREMENTS");
        fields.put("unitsIncluded", "UNITS_INCLUDED");
        fields.put("quantityUomId", "QUANTITY_UOM_ID");
        fields.put("agreementId", "AGREEMENT_ID");
        fields.put("agreementItemSeqId", "AGREEMENT_ITEM_SEQ_ID");
        fields.put("lastPrice", "LAST_PRICE");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("supplierProductName", "SUPPLIER_PRODUCT_NAME");
        fields.put("supplierProductId", "SUPPLIER_PRODUCT_ID");
        fields.put("canDropShip", "CAN_DROP_SHIP");
        fields.put("supplierCommissionPerc", "SUPPLIER_COMMISSION_PERC");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SupplierProduct", fields);
}
  public static enum Fields implements EntityFieldInterface<SupplierProduct> {
    productId("productId"),
    partyId("partyId"),
    availableFromDate("availableFromDate"),
    availableThruDate("availableThruDate"),
    supplierPrefOrderId("supplierPrefOrderId"),
    supplierRatingTypeId("supplierRatingTypeId"),
    standardLeadTimeDays("standardLeadTimeDays"),
    minimumOrderQuantity("minimumOrderQuantity"),
    orderQtyIncrements("orderQtyIncrements"),
    unitsIncluded("unitsIncluded"),
    quantityUomId("quantityUomId"),
    agreementId("agreementId"),
    agreementItemSeqId("agreementItemSeqId"),
    lastPrice("lastPrice"),
    currencyUomId("currencyUomId"),
    supplierProductName("supplierProductName"),
    supplierProductId("supplierProductId"),
    canDropShip("canDropShip"),
    supplierCommissionPerc("supplierCommissionPerc"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.SupplierProductPkBridge.class)
     private SupplierProductPk id = new SupplierProductPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>SupplierProductPk</code>
     */
      public SupplierProductPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>SupplierProductPk</code> value to set
    */   
      public void setId(SupplierProductPk id) {
         this.id = id;
      }
   @Column(name="AVAILABLE_THRU_DATE")
   private Timestamp availableThruDate;
   @Column(name="SUPPLIER_PREF_ORDER_ID")
   private String supplierPrefOrderId;
   @Column(name="SUPPLIER_RATING_TYPE_ID")
   private String supplierRatingTypeId;
   @Column(name="STANDARD_LEAD_TIME_DAYS")
   private BigDecimal standardLeadTimeDays;
   @Column(name="ORDER_QTY_INCREMENTS")
   private BigDecimal orderQtyIncrements;
   @Column(name="UNITS_INCLUDED")
   private BigDecimal unitsIncluded;
   @Column(name="QUANTITY_UOM_ID")
   private String quantityUomId;
   @Column(name="AGREEMENT_ID")
   private String agreementId;
   @Column(name="AGREEMENT_ITEM_SEQ_ID")
   private String agreementItemSeqId;
   @Column(name="LAST_PRICE")
   private BigDecimal lastPrice;
   @Column(name="SUPPLIER_PRODUCT_NAME")
   private String supplierProductName;
   @Column(name="SUPPLIER_PRODUCT_ID")
   private String supplierProductId;
   @Column(name="CAN_DROP_SHIP")
   private String canDropShip;
   @Column(name="SUPPLIER_COMMISSION_PERC")
   private BigDecimal supplierCommissionPerc;
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
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SUPPLIER_PREF_ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SupplierPrefOrder supplierPrefOrder = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SUPPLIER_RATING_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SupplierRatingType supplierRatingType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom currencyUom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="QUANTITY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom quantityUom = null;
   private transient AgreementItem agreementItem = null;

  /**
   * Default constructor.
   */
  public SupplierProduct() {
      super();
      this.baseEntityName = "SupplierProduct";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("currencyUomId");this.primaryKeyNames.add("minimumOrderQuantity");this.primaryKeyNames.add("availableFromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("availableFromDate");this.allFieldsNames.add("availableThruDate");this.allFieldsNames.add("supplierPrefOrderId");this.allFieldsNames.add("supplierRatingTypeId");this.allFieldsNames.add("standardLeadTimeDays");this.allFieldsNames.add("minimumOrderQuantity");this.allFieldsNames.add("orderQtyIncrements");this.allFieldsNames.add("unitsIncluded");this.allFieldsNames.add("quantityUomId");this.allFieldsNames.add("agreementId");this.allFieldsNames.add("agreementItemSeqId");this.allFieldsNames.add("lastPrice");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("supplierProductName");this.allFieldsNames.add("supplierProductId");this.allFieldsNames.add("canDropShip");this.allFieldsNames.add("supplierCommissionPerc");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SupplierProduct(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        id.setProductId(productId);
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        id.setPartyId(partyId);
    }
    /**
     * Auto generated value setter.
     * @param availableFromDate the availableFromDate to set
     */
    public void setAvailableFromDate(Timestamp availableFromDate) {
        id.setAvailableFromDate(availableFromDate);
    }
    /**
     * Auto generated value setter.
     * @param availableThruDate the availableThruDate to set
     */
    public void setAvailableThruDate(Timestamp availableThruDate) {
        this.availableThruDate = availableThruDate;
    }
    /**
     * Auto generated value setter.
     * @param supplierPrefOrderId the supplierPrefOrderId to set
     */
    public void setSupplierPrefOrderId(String supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId;
    }
    /**
     * Auto generated value setter.
     * @param supplierRatingTypeId the supplierRatingTypeId to set
     */
    public void setSupplierRatingTypeId(String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId;
    }
    /**
     * Auto generated value setter.
     * @param standardLeadTimeDays the standardLeadTimeDays to set
     */
    public void setStandardLeadTimeDays(BigDecimal standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }
    /**
     * Auto generated value setter.
     * @param minimumOrderQuantity the minimumOrderQuantity to set
     */
    public void setMinimumOrderQuantity(BigDecimal minimumOrderQuantity) {
        id.setMinimumOrderQuantity(minimumOrderQuantity);
    }
    /**
     * Auto generated value setter.
     * @param orderQtyIncrements the orderQtyIncrements to set
     */
    public void setOrderQtyIncrements(BigDecimal orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }
    /**
     * Auto generated value setter.
     * @param unitsIncluded the unitsIncluded to set
     */
    public void setUnitsIncluded(BigDecimal unitsIncluded) {
        this.unitsIncluded = unitsIncluded;
    }
    /**
     * Auto generated value setter.
     * @param quantityUomId the quantityUomId to set
     */
    public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }
    /**
     * Auto generated value setter.
     * @param agreementId the agreementId to set
     */
    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
    /**
     * Auto generated value setter.
     * @param agreementItemSeqId the agreementItemSeqId to set
     */
    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param lastPrice the lastPrice to set
     */
    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        id.setCurrencyUomId(currencyUomId);
    }
    /**
     * Auto generated value setter.
     * @param supplierProductName the supplierProductName to set
     */
    public void setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName;
    }
    /**
     * Auto generated value setter.
     * @param supplierProductId the supplierProductId to set
     */
    public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }
    /**
     * Auto generated value setter.
     * @param canDropShip the canDropShip to set
     */
    public void setCanDropShip(String canDropShip) {
        this.canDropShip = canDropShip;
    }
    /**
     * Auto generated value setter.
     * @param supplierCommissionPerc the supplierCommissionPerc to set
     */
    public void setSupplierCommissionPerc(BigDecimal supplierCommissionPerc) {
        this.supplierCommissionPerc = supplierCommissionPerc;
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
    public String getProductId() {
        return this.id.getProductId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.id.getPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAvailableFromDate() {
        return this.id.getAvailableFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAvailableThruDate() {
        return this.availableThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSupplierPrefOrderId() {
        return this.supplierPrefOrderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSupplierRatingTypeId() {
        return this.supplierRatingTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getStandardLeadTimeDays() {
        return this.standardLeadTimeDays;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinimumOrderQuantity() {
        return this.id.getMinimumOrderQuantity();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOrderQtyIncrements() {
        return this.orderQtyIncrements;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitsIncluded() {
        return this.unitsIncluded;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuantityUomId() {
        return this.quantityUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementId() {
        return this.agreementId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementItemSeqId() {
        return this.agreementItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getLastPrice() {
        return this.lastPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.id.getCurrencyUomId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSupplierProductName() {
        return this.supplierProductName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSupplierProductId() {
        return this.supplierProductId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCanDropShip() {
        return this.canDropShip;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getSupplierCommissionPerc() {
        return this.supplierCommissionPerc;
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
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
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
     * Auto generated method that gets the related <code>SupplierPrefOrder</code> by the relation named <code>SupplierPrefOrder</code>.
     * @return the <code>SupplierPrefOrder</code>
     * @throws RepositoryException if an error occurs
     */
    public SupplierPrefOrder getSupplierPrefOrder() throws RepositoryException {
        if (this.supplierPrefOrder == null) {
            this.supplierPrefOrder = getRelatedOne(SupplierPrefOrder.class, "SupplierPrefOrder");
        }
        return this.supplierPrefOrder;
    }
    /**
     * Auto generated method that gets the related <code>SupplierRatingType</code> by the relation named <code>SupplierRatingType</code>.
     * @return the <code>SupplierRatingType</code>
     * @throws RepositoryException if an error occurs
     */
    public SupplierRatingType getSupplierRatingType() throws RepositoryException {
        if (this.supplierRatingType == null) {
            this.supplierRatingType = getRelatedOne(SupplierRatingType.class, "SupplierRatingType");
        }
        return this.supplierRatingType;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>CurrencyUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getCurrencyUom() throws RepositoryException {
        if (this.currencyUom == null) {
            this.currencyUom = getRelatedOne(Uom.class, "CurrencyUom");
        }
        return this.currencyUom;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>QuantityUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getQuantityUom() throws RepositoryException {
        if (this.quantityUom == null) {
            this.quantityUom = getRelatedOne(Uom.class, "QuantityUom");
        }
        return this.quantityUom;
    }
    /**
     * Auto generated method that gets the related <code>AgreementItem</code> by the relation named <code>AgreementItem</code>.
     * @return the <code>AgreementItem</code>
     * @throws RepositoryException if an error occurs
     */
    public AgreementItem getAgreementItem() throws RepositoryException {
        if (this.agreementItem == null) {
            this.agreementItem = getRelatedOne(AgreementItem.class, "AgreementItem");
        }
        return this.agreementItem;
    }

    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
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
     * @param supplierPrefOrder the supplierPrefOrder to set
    */
    public void setSupplierPrefOrder(SupplierPrefOrder supplierPrefOrder) {
        this.supplierPrefOrder = supplierPrefOrder;
    }
    /**
     * Auto generated value setter.
     * @param supplierRatingType the supplierRatingType to set
    */
    public void setSupplierRatingType(SupplierRatingType supplierRatingType) {
        this.supplierRatingType = supplierRatingType;
    }
    /**
     * Auto generated value setter.
     * @param currencyUom the currencyUom to set
    */
    public void setCurrencyUom(Uom currencyUom) {
        this.currencyUom = currencyUom;
    }
    /**
     * Auto generated value setter.
     * @param quantityUom the quantityUom to set
    */
    public void setQuantityUom(Uom quantityUom) {
        this.quantityUom = quantityUom;
    }
    /**
     * Auto generated value setter.
     * @param agreementItem the agreementItem to set
    */
    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setPartyId((String) mapValue.get("partyId"));
        setAvailableFromDate((Timestamp) mapValue.get("availableFromDate"));
        setAvailableThruDate((Timestamp) mapValue.get("availableThruDate"));
        setSupplierPrefOrderId((String) mapValue.get("supplierPrefOrderId"));
        setSupplierRatingTypeId((String) mapValue.get("supplierRatingTypeId"));
        setStandardLeadTimeDays(convertToBigDecimal(mapValue.get("standardLeadTimeDays")));
        setMinimumOrderQuantity(convertToBigDecimal(mapValue.get("minimumOrderQuantity")));
        setOrderQtyIncrements(convertToBigDecimal(mapValue.get("orderQtyIncrements")));
        setUnitsIncluded(convertToBigDecimal(mapValue.get("unitsIncluded")));
        setQuantityUomId((String) mapValue.get("quantityUomId"));
        setAgreementId((String) mapValue.get("agreementId"));
        setAgreementItemSeqId((String) mapValue.get("agreementItemSeqId"));
        setLastPrice(convertToBigDecimal(mapValue.get("lastPrice")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setSupplierProductName((String) mapValue.get("supplierProductName"));
        setSupplierProductId((String) mapValue.get("supplierProductId"));
        setCanDropShip((String) mapValue.get("canDropShip"));
        setSupplierCommissionPerc(convertToBigDecimal(mapValue.get("supplierCommissionPerc")));
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
        mapValue.put("productId", getProductId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("availableFromDate", getAvailableFromDate());
        mapValue.put("availableThruDate", getAvailableThruDate());
        mapValue.put("supplierPrefOrderId", getSupplierPrefOrderId());
        mapValue.put("supplierRatingTypeId", getSupplierRatingTypeId());
        mapValue.put("standardLeadTimeDays", getStandardLeadTimeDays());
        mapValue.put("minimumOrderQuantity", getMinimumOrderQuantity());
        mapValue.put("orderQtyIncrements", getOrderQtyIncrements());
        mapValue.put("unitsIncluded", getUnitsIncluded());
        mapValue.put("quantityUomId", getQuantityUomId());
        mapValue.put("agreementId", getAgreementId());
        mapValue.put("agreementItemSeqId", getAgreementItemSeqId());
        mapValue.put("lastPrice", getLastPrice());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("supplierProductName", getSupplierProductName());
        mapValue.put("supplierProductId", getSupplierProductId());
        mapValue.put("canDropShip", getCanDropShip());
        mapValue.put("supplierCommissionPerc", getSupplierCommissionPerc());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
