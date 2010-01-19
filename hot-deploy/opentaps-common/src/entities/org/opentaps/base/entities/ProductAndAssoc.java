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
 * Auto generated base entity ProductAndAssoc.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductAndAssocs", query="SELECT PD.PRODUCT_ID AS \"productId\",PD.INTERNAL_NAME AS \"internalName\",PDA.PRODUCT_ID_TO AS \"productIdTo\",PDA.PRODUCT_ASSOC_TYPE_ID AS \"productAssocTypeId\",PDA.QUANTITY AS \"quantity\",PDA.FROM_DATE AS \"fromDate\" FROM PRODUCT PD INNER JOIN PRODUCT_ASSOC PDA ON PD.PRODUCT_ID = PDA.PRODUCT_ID", resultSetMapping="ProductAndAssocMapping")
@SqlResultSetMapping(name="ProductAndAssocMapping", entities={
@EntityResult(entityClass=ProductAndAssoc.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="internalName", column="internalName")
,@FieldResult(name="productIdTo", column="productIdTo")
,@FieldResult(name="productAssocTypeId", column="productAssocTypeId")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="fromDate", column="fromDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductAndAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PD.PRODUCT_ID");
        fields.put("internalName", "PD.INTERNAL_NAME");
        fields.put("productIdTo", "PDA.PRODUCT_ID_TO");
        fields.put("productAssocTypeId", "PDA.PRODUCT_ASSOC_TYPE_ID");
        fields.put("quantity", "PDA.QUANTITY");
        fields.put("fromDate", "PDA.FROM_DATE");
fieldMapColumns.put("ProductAndAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductAndAssoc> {
    productId("productId"),
    internalName("internalName"),
    productIdTo("productIdTo"),
    productAssocTypeId("productAssocTypeId"),
    quantity("quantity"),
    fromDate("fromDate");
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
   private String productId;
    
   private String internalName;
    
   private String productIdTo;
    
   private String productAssocTypeId;
    
   private BigDecimal quantity;
    
   private Timestamp fromDate;

  /**
   * Default constructor.
   */
  public ProductAndAssoc() {
      super();
      this.baseEntityName = "ProductAndAssoc";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productIdTo");this.primaryKeyNames.add("productAssocTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("internalName");this.allFieldsNames.add("productIdTo");this.allFieldsNames.add("productAssocTypeId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("fromDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductAndAssoc(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param internalName the internalName to set
     */
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
    /**
     * Auto generated value setter.
     * @param productIdTo the productIdTo to set
     */
    public void setProductIdTo(String productIdTo) {
        this.productIdTo = productIdTo;
    }
    /**
     * Auto generated value setter.
     * @param productAssocTypeId the productAssocTypeId to set
     */
    public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
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
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
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
    public String getInternalName() {
        return this.internalName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductIdTo() {
        return this.productIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductAssocTypeId() {
        return this.productAssocTypeId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setInternalName((String) mapValue.get("internalName"));
        setProductIdTo((String) mapValue.get("productIdTo"));
        setProductAssocTypeId((String) mapValue.get("productAssocTypeId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("internalName", getInternalName());
        mapValue.put("productIdTo", getProductIdTo());
        mapValue.put("productAssocTypeId", getProductAssocTypeId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("fromDate", getFromDate());
        return mapValue;
    }


}
