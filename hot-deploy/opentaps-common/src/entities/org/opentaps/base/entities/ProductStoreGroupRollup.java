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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductStoreGroupRollup.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_STORE_GROUP_ROLLUP")
public class ProductStoreGroupRollup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productStoreGroupId", "PRODUCT_STORE_GROUP_ID");
        fields.put("parentGroupId", "PARENT_GROUP_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductStoreGroupRollup", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStoreGroupRollup> {
    productStoreGroupId("productStoreGroupId"),
    parentGroupId("parentGroupId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    sequenceNum("sequenceNum"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductStoreGroupRollupPkBridge.class)
     private ProductStoreGroupRollupPk id = new ProductStoreGroupRollupPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductStoreGroupRollupPk</code>
     */
      public ProductStoreGroupRollupPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductStoreGroupRollupPk</code> value to set
    */   
      public void setId(ProductStoreGroupRollupPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStoreGroup currentProductStoreGroup = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStoreGroup parentProductStoreGroup = null;
   private transient List<ProductStoreGroupRollup> childProductStoreGroupRollups = null;
   private transient List<ProductStoreGroupRollup> parentProductStoreGroupRollups = null;
   private transient List<ProductStoreGroupRollup> siblingProductStoreGroupRollups = null;

  /**
   * Default constructor.
   */
  public ProductStoreGroupRollup() {
      super();
      this.baseEntityName = "ProductStoreGroupRollup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productStoreGroupId");this.primaryKeyNames.add("parentGroupId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productStoreGroupId");this.allFieldsNames.add("parentGroupId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStoreGroupRollup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productStoreGroupId the productStoreGroupId to set
     */
    public void setProductStoreGroupId(String productStoreGroupId) {
        id.setProductStoreGroupId(productStoreGroupId);
    }
    /**
     * Auto generated value setter.
     * @param parentGroupId the parentGroupId to set
     */
    public void setParentGroupId(String parentGroupId) {
        id.setParentGroupId(parentGroupId);
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public String getProductStoreGroupId() {
        return this.id.getProductStoreGroupId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentGroupId() {
        return this.id.getParentGroupId();
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
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
     * Auto generated method that gets the related <code>ProductStoreGroup</code> by the relation named <code>CurrentProductStoreGroup</code>.
     * @return the <code>ProductStoreGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStoreGroup getCurrentProductStoreGroup() throws RepositoryException {
        if (this.currentProductStoreGroup == null) {
            this.currentProductStoreGroup = getRelatedOne(ProductStoreGroup.class, "CurrentProductStoreGroup");
        }
        return this.currentProductStoreGroup;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroup</code> by the relation named <code>ParentProductStoreGroup</code>.
     * @return the <code>ProductStoreGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStoreGroup getParentProductStoreGroup() throws RepositoryException {
        if (this.parentProductStoreGroup == null) {
            this.parentProductStoreGroup = getRelatedOne(ProductStoreGroup.class, "ParentProductStoreGroup");
        }
        return this.parentProductStoreGroup;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroupRollup</code> by the relation named <code>ChildProductStoreGroupRollup</code>.
     * @return the list of <code>ProductStoreGroupRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreGroupRollup> getChildProductStoreGroupRollups() throws RepositoryException {
        if (this.childProductStoreGroupRollups == null) {
            this.childProductStoreGroupRollups = getRelated(ProductStoreGroupRollup.class, "ChildProductStoreGroupRollup");
        }
        return this.childProductStoreGroupRollups;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroupRollup</code> by the relation named <code>ParentProductStoreGroupRollup</code>.
     * @return the list of <code>ProductStoreGroupRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreGroupRollup> getParentProductStoreGroupRollups() throws RepositoryException {
        if (this.parentProductStoreGroupRollups == null) {
            this.parentProductStoreGroupRollups = getRelated(ProductStoreGroupRollup.class, "ParentProductStoreGroupRollup");
        }
        return this.parentProductStoreGroupRollups;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreGroupRollup</code> by the relation named <code>SiblingProductStoreGroupRollup</code>.
     * @return the list of <code>ProductStoreGroupRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreGroupRollup> getSiblingProductStoreGroupRollups() throws RepositoryException {
        if (this.siblingProductStoreGroupRollups == null) {
            this.siblingProductStoreGroupRollups = getRelated(ProductStoreGroupRollup.class, "SiblingProductStoreGroupRollup");
        }
        return this.siblingProductStoreGroupRollups;
    }

    /**
     * Auto generated value setter.
     * @param currentProductStoreGroup the currentProductStoreGroup to set
    */
    public void setCurrentProductStoreGroup(ProductStoreGroup currentProductStoreGroup) {
        this.currentProductStoreGroup = currentProductStoreGroup;
    }
    /**
     * Auto generated value setter.
     * @param parentProductStoreGroup the parentProductStoreGroup to set
    */
    public void setParentProductStoreGroup(ProductStoreGroup parentProductStoreGroup) {
        this.parentProductStoreGroup = parentProductStoreGroup;
    }
    /**
     * Auto generated value setter.
     * @param childProductStoreGroupRollups the childProductStoreGroupRollups to set
    */
    public void setChildProductStoreGroupRollups(List<ProductStoreGroupRollup> childProductStoreGroupRollups) {
        this.childProductStoreGroupRollups = childProductStoreGroupRollups;
    }
    /**
     * Auto generated value setter.
     * @param parentProductStoreGroupRollups the parentProductStoreGroupRollups to set
    */
    public void setParentProductStoreGroupRollups(List<ProductStoreGroupRollup> parentProductStoreGroupRollups) {
        this.parentProductStoreGroupRollups = parentProductStoreGroupRollups;
    }
    /**
     * Auto generated value setter.
     * @param siblingProductStoreGroupRollups the siblingProductStoreGroupRollups to set
    */
    public void setSiblingProductStoreGroupRollups(List<ProductStoreGroupRollup> siblingProductStoreGroupRollups) {
        this.siblingProductStoreGroupRollups = siblingProductStoreGroupRollups;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductStoreGroupId((String) mapValue.get("productStoreGroupId"));
        setParentGroupId((String) mapValue.get("parentGroupId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
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
        mapValue.put("productStoreGroupId", getProductStoreGroupId());
        mapValue.put("parentGroupId", getParentGroupId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
