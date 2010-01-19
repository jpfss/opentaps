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
 * Auto generated base entity OrderItemType.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_TYPE")
public class OrderItemType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderItemTypeId", "ORDER_ITEM_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderItemType", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemType> {
    orderItemTypeId("orderItemTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="OrderItemType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="OrderItemType_GEN")
   @Id
   @Column(name="ORDER_ITEM_TYPE_ID")
   private String orderItemTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderItemType parentOrderItemType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ITEM_TYPE_ID")
   
   private List<OrderItem> orderItems = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<OrderItemType> childOrderItemTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="orderItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ORDER_ITEM_TYPE_ID")
   
   private List<OrderItemTypeAttr> orderItemTypeAttrs = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ITEM_TYPE_ID")
   
   private List<Requirement> requirements = null;

  /**
   * Default constructor.
   */
  public OrderItemType() {
      super();
      this.baseEntityName = "OrderItemType";
      this.isView = false;
      this.resourceName = "OrderEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderItemTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderItemTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderItemTypeId the orderItemTypeId to set
     */
    public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
    public String getOrderItemTypeId() {
        return this.orderItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
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
     * Auto generated method that gets the related <code>OrderItemType</code> by the relation named <code>ParentOrderItemType</code>.
     * @return the <code>OrderItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemType getParentOrderItemType() throws RepositoryException {
        if (this.parentOrderItemType == null) {
            this.parentOrderItemType = getRelatedOne(OrderItemType.class, "ParentOrderItemType");
        }
        return this.parentOrderItemType;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the list of <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItem> getOrderItems() throws RepositoryException {
        if (this.orderItems == null) {
            this.orderItems = getRelated(OrderItem.class, "OrderItem");
        }
        return this.orderItems;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemType</code> by the relation named <code>ChildOrderItemType</code>.
     * @return the list of <code>OrderItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemType> getChildOrderItemTypes() throws RepositoryException {
        if (this.childOrderItemTypes == null) {
            this.childOrderItemTypes = getRelated(OrderItemType.class, "ChildOrderItemType");
        }
        return this.childOrderItemTypes;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemTypeAttr</code> by the relation named <code>OrderItemTypeAttr</code>.
     * @return the list of <code>OrderItemTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemTypeAttr> getOrderItemTypeAttrs() throws RepositoryException {
        if (this.orderItemTypeAttrs == null) {
            this.orderItemTypeAttrs = getRelated(OrderItemTypeAttr.class, "OrderItemTypeAttr");
        }
        return this.orderItemTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>Requirement</code> by the relation named <code>Requirement</code>.
     * @return the list of <code>Requirement</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Requirement> getRequirements() throws RepositoryException {
        if (this.requirements == null) {
            this.requirements = getRelated(Requirement.class, "Requirement");
        }
        return this.requirements;
    }

    /**
     * Auto generated value setter.
     * @param parentOrderItemType the parentOrderItemType to set
    */
    public void setParentOrderItemType(OrderItemType parentOrderItemType) {
        this.parentOrderItemType = parentOrderItemType;
    }
    /**
     * Auto generated value setter.
     * @param orderItems the orderItems to set
    */
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    /**
     * Auto generated value setter.
     * @param childOrderItemTypes the childOrderItemTypes to set
    */
    public void setChildOrderItemTypes(List<OrderItemType> childOrderItemTypes) {
        this.childOrderItemTypes = childOrderItemTypes;
    }
    /**
     * Auto generated value setter.
     * @param orderItemTypeAttrs the orderItemTypeAttrs to set
    */
    public void setOrderItemTypeAttrs(List<OrderItemTypeAttr> orderItemTypeAttrs) {
        this.orderItemTypeAttrs = orderItemTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param requirements the requirements to set
    */
    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addOrderItemTypeAttr(OrderItemTypeAttr orderItemTypeAttr) {
        if (this.orderItemTypeAttrs == null) {
            this.orderItemTypeAttrs = new ArrayList<OrderItemTypeAttr>();
        }
        this.orderItemTypeAttrs.add(orderItemTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeOrderItemTypeAttr(OrderItemTypeAttr orderItemTypeAttr) {
        if (this.orderItemTypeAttrs == null) {
            return;
        }
        this.orderItemTypeAttrs.remove(orderItemTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearOrderItemTypeAttr() {
        if (this.orderItemTypeAttrs == null) {
            return;
        }
        this.orderItemTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderItemTypeId((String) mapValue.get("orderItemTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("orderItemTypeId", getOrderItemTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
