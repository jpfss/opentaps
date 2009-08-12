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
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductStorePromoAndAppl.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductStorePromoAndAppls", query="SELECT PP.PROMO_NAME AS \"promoName\",PP.USER_ENTERED AS \"userEntered\",PSPA.PRODUCT_STORE_ID AS \"productStoreId\",PSPA.PRODUCT_PROMO_ID AS \"productPromoId\",PSPA.FROM_DATE AS \"fromDate\",PSPA.THRU_DATE AS \"thruDate\",PSPA.SEQUENCE_NUM AS \"sequenceNum\",PSPA.MANUAL_ONLY AS \"manualOnly\" FROM PRODUCT_STORE_PROMO_APPL PSPA INNER JOIN PRODUCT_PROMO PP ON PSPA.PRODUCT_PROMO_ID = PP.PRODUCT_PROMO_ID", resultSetMapping="ProductStorePromoAndApplMapping")
@SqlResultSetMapping(name="ProductStorePromoAndApplMapping", entities={
@EntityResult(entityClass=ProductStorePromoAndAppl.class, fields = {
@FieldResult(name="promoName", column="promoName")
,@FieldResult(name="userEntered", column="userEntered")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="productPromoId", column="productPromoId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="sequenceNum", column="sequenceNum")
,@FieldResult(name="manualOnly", column="manualOnly")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductStorePromoAndAppl extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("promoName", "PP.PROMO_NAME");
        fields.put("userEntered", "PP.USER_ENTERED");
        fields.put("productStoreId", "PSPA.PRODUCT_STORE_ID");
        fields.put("productPromoId", "PSPA.PRODUCT_PROMO_ID");
        fields.put("fromDate", "PSPA.FROM_DATE");
        fields.put("thruDate", "PSPA.THRU_DATE");
        fields.put("sequenceNum", "PSPA.SEQUENCE_NUM");
        fields.put("manualOnly", "PSPA.MANUAL_ONLY");
fieldMapColumns.put("ProductStorePromoAndAppl", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStorePromoAndAppl> {
    promoName("promoName"),
    userEntered("userEntered"),
    productStoreId("productStoreId"),
    productPromoId("productPromoId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    sequenceNum("sequenceNum"),
    manualOnly("manualOnly");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String promoName;
    
   private String userEntered;
    @Id
   private String productStoreId;
    
   private String productPromoId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private Long sequenceNum;
    
   private String manualOnly;

  /**
   * Default constructor.
   */
  public ProductStorePromoAndAppl() {
      super();
      this.baseEntityName = "ProductStorePromoAndAppl";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productStoreId");this.primaryKeyNames.add("productPromoId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("promoName");this.allFieldsNames.add("userEntered");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("productPromoId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("manualOnly");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStorePromoAndAppl(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param promoName the promoName to set
     */
    private void setPromoName(String promoName) {
        this.promoName = promoName;
    }
    /**
     * Auto generated value setter.
     * @param userEntered the userEntered to set
     */
    private void setUserEntered(String userEntered) {
        this.userEntered = userEntered;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    private void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param productPromoId the productPromoId to set
     */
    private void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    private void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    private void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    private void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param manualOnly the manualOnly to set
     */
    private void setManualOnly(String manualOnly) {
        this.manualOnly = manualOnly;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPromoName() {
        return this.promoName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserEntered() {
        return this.userEntered;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoId() {
        return this.productPromoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
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
     * @return <code>String</code>
     */
    public String getManualOnly() {
        return this.manualOnly;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPromoName((String) mapValue.get("promoName"));
        setUserEntered((String) mapValue.get("userEntered"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setProductPromoId((String) mapValue.get("productPromoId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setManualOnly((String) mapValue.get("manualOnly"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("promoName", getPromoName());
        mapValue.put("userEntered", getUserEntered());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("productPromoId", getProductPromoId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("manualOnly", getManualOnly());
        return mapValue;
    }


}
