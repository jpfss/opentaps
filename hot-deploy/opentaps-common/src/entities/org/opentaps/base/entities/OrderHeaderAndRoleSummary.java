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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity OrderHeaderAndRoleSummary.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderHeaderAndRoleSummarys", query="SELECT ORLE.PARTY_ID AS \"partyId\",ORLE.ROLE_TYPE_ID AS \"roleTypeId\",OH.ORDER_ID AS \"orderId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",OH.ORDER_DATE AS \"orderDate\",OH.STATUS_ID AS \"statusId\",OH.GRAND_TOTAL AS \"grandTotal\",OH.REMAINING_SUB_TOTAL AS \"remainingSubTotal\",OH.ORDER_ID AS \"orderId\" FROM ORDER_ROLE ORLE INNER JOIN ORDER_HEADER OH ON ORLE.ORDER_ID = OH.ORDER_ID", resultSetMapping="OrderHeaderAndRoleSummaryMapping")
@SqlResultSetMapping(name="OrderHeaderAndRoleSummaryMapping", entities={
@EntityResult(entityClass=OrderHeaderAndRoleSummary.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="totalGrandAmount", column="totalGrandAmount")
,@FieldResult(name="totalSubRemainingAmount", column="totalSubRemainingAmount")
,@FieldResult(name="totalOrders", column="totalOrders")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderHeaderAndRoleSummary extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "ORLE.PARTY_ID");
        fields.put("roleTypeId", "ORLE.ROLE_TYPE_ID");
        fields.put("orderId", "OH.ORDER_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("statusId", "OH.STATUS_ID");
        fields.put("totalGrandAmount", "OH.GRAND_TOTAL");
        fields.put("totalSubRemainingAmount", "OH.REMAINING_SUB_TOTAL");
        fields.put("totalOrders", "OH.ORDER_ID");
fieldMapColumns.put("OrderHeaderAndRoleSummary", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderHeaderAndRoleSummary> {
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    orderId("orderId"),
    orderTypeId("orderTypeId"),
    orderDate("orderDate"),
    statusId("statusId"),
    totalGrandAmount("totalGrandAmount"),
    totalSubRemainingAmount("totalSubRemainingAmount"),
    totalOrders("totalOrders");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String partyId;
    
   private String roleTypeId;
    @Id
   private String orderId;
    
   private String orderTypeId;
    
   private Timestamp orderDate;
    
   private String statusId;
    
   private BigDecimal totalGrandAmount;
    
   private BigDecimal totalSubRemainingAmount;
    
   private Long totalOrders;

  /**
   * Default constructor.
   */
  public OrderHeaderAndRoleSummary() {
      super();
      this.baseEntityName = "OrderHeaderAndRoleSummary";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("totalOrders");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("statusId");this.allFieldsNames.add("totalGrandAmount");this.allFieldsNames.add("totalSubRemainingAmount");this.allFieldsNames.add("totalOrders");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderHeaderAndRoleSummary(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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
     * @param orderTypeId the orderTypeId to set
     */
    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param totalGrandAmount the totalGrandAmount to set
     */
    public void setTotalGrandAmount(BigDecimal totalGrandAmount) {
        this.totalGrandAmount = totalGrandAmount;
    }
    /**
     * Auto generated value setter.
     * @param totalSubRemainingAmount the totalSubRemainingAmount to set
     */
    public void setTotalSubRemainingAmount(BigDecimal totalSubRemainingAmount) {
        this.totalSubRemainingAmount = totalSubRemainingAmount;
    }
    /**
     * Auto generated value setter.
     * @param totalOrders the totalOrders to set
     */
    public void setTotalOrders(Long totalOrders) {
        this.totalOrders = totalOrders;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
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
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTotalGrandAmount() {
        return this.totalGrandAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTotalSubRemainingAmount() {
        return this.totalSubRemainingAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTotalOrders() {
        return this.totalOrders;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setStatusId((String) mapValue.get("statusId"));
        setTotalGrandAmount(convertToBigDecimal(mapValue.get("totalGrandAmount")));
        setTotalSubRemainingAmount(convertToBigDecimal(mapValue.get("totalSubRemainingAmount")));
        setTotalOrders((Long) mapValue.get("totalOrders"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("statusId", getStatusId());
        mapValue.put("totalGrandAmount", getTotalGrandAmount());
        mapValue.put("totalSubRemainingAmount", getTotalSubRemainingAmount());
        mapValue.put("totalOrders", getTotalOrders());
        return mapValue;
    }


}
