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
 * Auto generated base entity DataImportOrderItem.
 */
@javax.persistence.Entity
@Table(name="DATA_IMPORT_ORDER_ITEM")
public class DataImportOrderItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("quantityShipped", "QUANTITY_SHIPPED");
        fields.put("price", "PRICE");
        fields.put("itemTax", "ITEM_TAX");
        fields.put("taxAuthPartyId", "TAX_AUTH_PARTY_ID");
        fields.put("itemAdjustmentsTotal", "ITEM_ADJUSTMENTS_TOTAL");
        fields.put("customerPo", "CUSTOMER_PO");
        fields.put("comments", "COMMENTS");
        fields.put("importStatusId", "IMPORT_STATUS_ID");
        fields.put("importError", "IMPORT_ERROR");
        fields.put("processedTimestamp", "PROCESSED_TIMESTAMP");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DataImportOrderItem", fields);
}
  public static enum Fields implements EntityFieldInterface<DataImportOrderItem> {
    orderId("orderId"),
    productId("productId"),
    quantity("quantity"),
    quantityShipped("quantityShipped"),
    price("price"),
    itemTax("itemTax"),
    taxAuthPartyId("taxAuthPartyId"),
    itemAdjustmentsTotal("itemAdjustmentsTotal"),
    customerPo("customerPo"),
    comments("comments"),
    importStatusId("importStatusId"),
    importError("importError"),
    processedTimestamp("processedTimestamp"),
    orderItemSeqId("orderItemSeqId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.DataImportOrderItemPkBridge.class)
     private DataImportOrderItemPk id = new DataImportOrderItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>DataImportOrderItemPk</code>
     */
      public DataImportOrderItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>DataImportOrderItemPk</code> value to set
    */   
      public void setId(DataImportOrderItemPk id) {
         this.id = id;
      }
   @Column(name="QUANTITY_SHIPPED")
   private BigDecimal quantityShipped;
   @Column(name="ITEM_TAX")
   private BigDecimal itemTax;
   @Column(name="TAX_AUTH_PARTY_ID")
   private String taxAuthPartyId;
   @Column(name="ITEM_ADJUSTMENTS_TOTAL")
   private BigDecimal itemAdjustmentsTotal;
   @Column(name="CUSTOMER_PO")
   private String customerPo;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="IMPORT_STATUS_ID")
   private String importStatusId;
   @Column(name="IMPORT_ERROR")
   private String importError;
   @Column(name="PROCESSED_TIMESTAMP")
   private Timestamp processedTimestamp;
   @Column(name="ORDER_ITEM_SEQ_ID")
   private String orderItemSeqId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DataImportOrderHeader dataImportOrderHeader = null;

  /**
   * Default constructor.
   */
  public DataImportOrderItem() {
      super();
      this.baseEntityName = "DataImportOrderItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("productId");this.primaryKeyNames.add("quantity");this.primaryKeyNames.add("price");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("productId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("quantityShipped");this.allFieldsNames.add("price");this.allFieldsNames.add("itemTax");this.allFieldsNames.add("taxAuthPartyId");this.allFieldsNames.add("itemAdjustmentsTotal");this.allFieldsNames.add("customerPo");this.allFieldsNames.add("comments");this.allFieldsNames.add("importStatusId");this.allFieldsNames.add("importError");this.allFieldsNames.add("processedTimestamp");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DataImportOrderItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        id.setOrderId(orderId);
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
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        id.setQuantity(quantity);
    }
    /**
     * Auto generated value setter.
     * @param quantityShipped the quantityShipped to set
     */
    public void setQuantityShipped(BigDecimal quantityShipped) {
        this.quantityShipped = quantityShipped;
    }
    /**
     * Auto generated value setter.
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        id.setPrice(price);
    }
    /**
     * Auto generated value setter.
     * @param itemTax the itemTax to set
     */
    public void setItemTax(BigDecimal itemTax) {
        this.itemTax = itemTax;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthPartyId the taxAuthPartyId to set
     */
    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
    /**
     * Auto generated value setter.
     * @param itemAdjustmentsTotal the itemAdjustmentsTotal to set
     */
    public void setItemAdjustmentsTotal(BigDecimal itemAdjustmentsTotal) {
        this.itemAdjustmentsTotal = itemAdjustmentsTotal;
    }
    /**
     * Auto generated value setter.
     * @param customerPo the customerPo to set
     */
    public void setCustomerPo(String customerPo) {
        this.customerPo = customerPo;
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
     * @param importStatusId the importStatusId to set
     */
    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }
    /**
     * Auto generated value setter.
     * @param importError the importError to set
     */
    public void setImportError(String importError) {
        this.importError = importError;
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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
    public String getOrderId() {
        return this.id.getOrderId();
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.id.getQuantity();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityShipped() {
        return this.quantityShipped;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPrice() {
        return this.id.getPrice();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getItemTax() {
        return this.itemTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthPartyId() {
        return this.taxAuthPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getItemAdjustmentsTotal() {
        return this.itemAdjustmentsTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustomerPo() {
        return this.customerPo;
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
    public String getImportStatusId() {
        return this.importStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getImportError() {
        return this.importError;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
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
     * Auto generated method that gets the related <code>DataImportOrderHeader</code> by the relation named <code>DataImportOrderHeader</code>.
     * @return the <code>DataImportOrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public DataImportOrderHeader getDataImportOrderHeader() throws RepositoryException {
        if (this.dataImportOrderHeader == null) {
            this.dataImportOrderHeader = getRelatedOne(DataImportOrderHeader.class, "DataImportOrderHeader");
        }
        return this.dataImportOrderHeader;
    }

    /**
     * Auto generated value setter.
     * @param dataImportOrderHeader the dataImportOrderHeader to set
    */
    public void setDataImportOrderHeader(DataImportOrderHeader dataImportOrderHeader) {
        this.dataImportOrderHeader = dataImportOrderHeader;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setProductId((String) mapValue.get("productId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setQuantityShipped(convertToBigDecimal(mapValue.get("quantityShipped")));
        setPrice(convertToBigDecimal(mapValue.get("price")));
        setItemTax(convertToBigDecimal(mapValue.get("itemTax")));
        setTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        setItemAdjustmentsTotal(convertToBigDecimal(mapValue.get("itemAdjustmentsTotal")));
        setCustomerPo((String) mapValue.get("customerPo"));
        setComments((String) mapValue.get("comments"));
        setImportStatusId((String) mapValue.get("importStatusId"));
        setImportError((String) mapValue.get("importError"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
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
        mapValue.put("orderId", getOrderId());
        mapValue.put("productId", getProductId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("quantityShipped", getQuantityShipped());
        mapValue.put("price", getPrice());
        mapValue.put("itemTax", getItemTax());
        mapValue.put("taxAuthPartyId", getTaxAuthPartyId());
        mapValue.put("itemAdjustmentsTotal", getItemAdjustmentsTotal());
        mapValue.put("customerPo", getCustomerPo());
        mapValue.put("comments", getComments());
        mapValue.put("importStatusId", getImportStatusId());
        mapValue.put("importError", getImportError());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
