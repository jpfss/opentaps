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
 * Auto generated base entity CustRequestAndPartyRelationshipAndRole.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCustRequestAndPartyRelationshipAndRoles", query="SELECT SI.DESCRIPTION AS \"description\",SI.STATUS_CODE AS \"statusCode\",CRT.DESCRIPTION AS \"description\",CRC.DESCRIPTION AS \"description\",CRR.PARTY_ID AS \"partyId\",CRR.ROLE_TYPE_ID AS \"roleTypeId\",PR.PARTY_ID_TO AS \"partyIdTo\",PR.PARTY_ID_FROM AS \"partyIdFrom\",PR.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",PR.FROM_DATE AS \"fromDate\",PR.THRU_DATE AS \"thruDate\",CR.CUST_REQUEST_ID AS \"custRequestId\",CR.CUST_REQUEST_TYPE_ID AS \"custRequestTypeId\",CR.CUST_REQUEST_CATEGORY_ID AS \"custRequestCategoryId\",CR.STATUS_ID AS \"statusId\",CR.FROM_PARTY_ID AS \"fromPartyId\",CR.PRIORITY AS \"priority\",CR.CUST_REQUEST_DATE AS \"custRequestDate\",CR.RESPONSE_REQUIRED_DATE AS \"responseRequiredDate\",CR.CUST_REQUEST_NAME AS \"custRequestName\",CR.DESCRIPTION AS \"description\",CR.MAXIMUM_AMOUNT_UOM_ID AS \"maximumAmountUomId\",CR.PRODUCT_STORE_ID AS \"productStoreId\",CR.SALES_CHANNEL_ENUM_ID AS \"salesChannelEnumId\",CR.FULFILL_CONTACT_MECH_ID AS \"fulfillContactMechId\",CR.CURRENCY_UOM_ID AS \"currencyUomId\",CR.OPEN_DATE_TIME AS \"openDateTime\",CR.CLOSED_DATE_TIME AS \"closedDateTime\",CR.INTERNAL_COMMENT AS \"internalComment\",CR.CREATED_DATE AS \"createdDate\",CR.CREATED_BY_USER_LOGIN AS \"createdByUserLogin\",CR.LAST_MODIFIED_DATE AS \"lastModifiedDate\",CR.LAST_MODIFIED_BY_USER_LOGIN AS \"lastModifiedByUserLogin\",CR.FULFILLED_DATE_TIME AS \"fulfilledDateTime\" FROM CUST_REQUEST CR LEFT JOIN STATUS_ITEM SI ON CR.STATUS_ID = SI.STATUS_ID LEFT JOIN CUST_REQUEST_TYPE CRT ON CR.CUST_REQUEST_TYPE_ID = CRT.CUST_REQUEST_TYPE_ID LEFT JOIN CUST_REQUEST_CATEGORY CRC ON CR.CUST_REQUEST_CATEGORY_ID = CRC.CUST_REQUEST_CATEGORY_ID INNER JOIN CUST_REQUEST_ROLE CRR ON CR.CUST_REQUEST_ID = CRR.CUST_REQUEST_ID LEFT JOIN PARTY_RELATIONSHIP PR ON CRR.PARTY_ID = PR.PARTY_ID_FROM", resultSetMapping="CustRequestAndPartyRelationshipAndRoleMapping")
@SqlResultSetMapping(name="CustRequestAndPartyRelationshipAndRoleMapping", entities={
@EntityResult(entityClass=CustRequestAndPartyRelationshipAndRole.class, fields = {
@FieldResult(name="status", column="status")
,@FieldResult(name="updated", column="updated")
,@FieldResult(name="custRequestType", column="custRequestType")
,@FieldResult(name="reason", column="reason")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="roleTypeIdFrom", column="roleTypeIdFrom")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="custRequestId", column="custRequestId")
,@FieldResult(name="custRequestTypeId", column="custRequestTypeId")
,@FieldResult(name="custRequestCategoryId", column="custRequestCategoryId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="fromPartyId", column="fromPartyId")
,@FieldResult(name="priority", column="priority")
,@FieldResult(name="custRequestDate", column="custRequestDate")
,@FieldResult(name="responseRequiredDate", column="responseRequiredDate")
,@FieldResult(name="custRequestName", column="custRequestName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="maximumAmountUomId", column="maximumAmountUomId")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="salesChannelEnumId", column="salesChannelEnumId")
,@FieldResult(name="fulfillContactMechId", column="fulfillContactMechId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="openDateTime", column="openDateTime")
,@FieldResult(name="closedDateTime", column="closedDateTime")
,@FieldResult(name="internalComment", column="internalComment")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="createdByUserLogin", column="createdByUserLogin")
,@FieldResult(name="lastModifiedDate", column="lastModifiedDate")
,@FieldResult(name="lastModifiedByUserLogin", column="lastModifiedByUserLogin")
,@FieldResult(name="fulfilledDateTime", column="fulfilledDateTime")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CustRequestAndPartyRelationshipAndRole extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("status", "SI.DESCRIPTION");
        fields.put("updated", "SI.STATUS_CODE");
        fields.put("custRequestType", "CRT.DESCRIPTION");
        fields.put("reason", "CRC.DESCRIPTION");
        fields.put("partyId", "CRR.PARTY_ID");
        fields.put("roleTypeId", "CRR.ROLE_TYPE_ID");
        fields.put("partyIdTo", "PR.PARTY_ID_TO");
        fields.put("partyIdFrom", "PR.PARTY_ID_FROM");
        fields.put("roleTypeIdFrom", "PR.ROLE_TYPE_ID_FROM");
        fields.put("fromDate", "PR.FROM_DATE");
        fields.put("thruDate", "PR.THRU_DATE");
        fields.put("custRequestId", "CR.CUST_REQUEST_ID");
        fields.put("custRequestTypeId", "CR.CUST_REQUEST_TYPE_ID");
        fields.put("custRequestCategoryId", "CR.CUST_REQUEST_CATEGORY_ID");
        fields.put("statusId", "CR.STATUS_ID");
        fields.put("fromPartyId", "CR.FROM_PARTY_ID");
        fields.put("priority", "CR.PRIORITY");
        fields.put("custRequestDate", "CR.CUST_REQUEST_DATE");
        fields.put("responseRequiredDate", "CR.RESPONSE_REQUIRED_DATE");
        fields.put("custRequestName", "CR.CUST_REQUEST_NAME");
        fields.put("description", "CR.DESCRIPTION");
        fields.put("maximumAmountUomId", "CR.MAXIMUM_AMOUNT_UOM_ID");
        fields.put("productStoreId", "CR.PRODUCT_STORE_ID");
        fields.put("salesChannelEnumId", "CR.SALES_CHANNEL_ENUM_ID");
        fields.put("fulfillContactMechId", "CR.FULFILL_CONTACT_MECH_ID");
        fields.put("currencyUomId", "CR.CURRENCY_UOM_ID");
        fields.put("openDateTime", "CR.OPEN_DATE_TIME");
        fields.put("closedDateTime", "CR.CLOSED_DATE_TIME");
        fields.put("internalComment", "CR.INTERNAL_COMMENT");
        fields.put("createdDate", "CR.CREATED_DATE");
        fields.put("createdByUserLogin", "CR.CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "CR.LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "CR.LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("fulfilledDateTime", "CR.FULFILLED_DATE_TIME");
fieldMapColumns.put("CustRequestAndPartyRelationshipAndRole", fields);
}
  public static enum Fields implements EntityFieldInterface<CustRequestAndPartyRelationshipAndRole> {
    status("status"),
    updated("updated"),
    custRequestType("custRequestType"),
    reason("reason"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    partyIdTo("partyIdTo"),
    partyIdFrom("partyIdFrom"),
    roleTypeIdFrom("roleTypeIdFrom"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    custRequestId("custRequestId"),
    custRequestTypeId("custRequestTypeId"),
    custRequestCategoryId("custRequestCategoryId"),
    statusId("statusId"),
    fromPartyId("fromPartyId"),
    priority("priority"),
    custRequestDate("custRequestDate"),
    responseRequiredDate("responseRequiredDate"),
    custRequestName("custRequestName"),
    description("description"),
    maximumAmountUomId("maximumAmountUomId"),
    productStoreId("productStoreId"),
    salesChannelEnumId("salesChannelEnumId"),
    fulfillContactMechId("fulfillContactMechId"),
    currencyUomId("currencyUomId"),
    openDateTime("openDateTime"),
    closedDateTime("closedDateTime"),
    internalComment("internalComment"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    fulfilledDateTime("fulfilledDateTime");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String status;
    
   private String updated;
    
   private String custRequestType;
    
   private String reason;
    
   private String partyId;
    
   private String roleTypeId;
    
   private String partyIdTo;
    
   private String partyIdFrom;
    
   private String roleTypeIdFrom;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    @Id
   private String custRequestId;
    
   private String custRequestTypeId;
    
   private String custRequestCategoryId;
    
   private String statusId;
    
   private String fromPartyId;
    
   private Long priority;
    
   private Timestamp custRequestDate;
    
   private Timestamp responseRequiredDate;
    
   private String custRequestName;
    
   private String description;
    
   private String maximumAmountUomId;
    
   private String productStoreId;
    
   private String salesChannelEnumId;
    
   private String fulfillContactMechId;
    
   private String currencyUomId;
    
   private Timestamp openDateTime;
    
   private Timestamp closedDateTime;
    
   private String internalComment;
    
   private Timestamp createdDate;
    
   private String createdByUserLogin;
    
   private Timestamp lastModifiedDate;
    
   private String lastModifiedByUserLogin;
    
   private Timestamp fulfilledDateTime;

  /**
   * Default constructor.
   */
  public CustRequestAndPartyRelationshipAndRole() {
      super();
      this.baseEntityName = "CustRequestAndPartyRelationshipAndRole";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("partyIdTo");this.primaryKeyNames.add("partyIdFrom");this.primaryKeyNames.add("roleTypeIdFrom");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("custRequestId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("status");this.allFieldsNames.add("updated");this.allFieldsNames.add("custRequestType");this.allFieldsNames.add("reason");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("custRequestId");this.allFieldsNames.add("custRequestTypeId");this.allFieldsNames.add("custRequestCategoryId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("fromPartyId");this.allFieldsNames.add("priority");this.allFieldsNames.add("custRequestDate");this.allFieldsNames.add("responseRequiredDate");this.allFieldsNames.add("custRequestName");this.allFieldsNames.add("description");this.allFieldsNames.add("maximumAmountUomId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("salesChannelEnumId");this.allFieldsNames.add("fulfillContactMechId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("openDateTime");this.allFieldsNames.add("closedDateTime");this.allFieldsNames.add("internalComment");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("fulfilledDateTime");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustRequestAndPartyRelationshipAndRole(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * Auto generated value setter.
     * @param updated the updated to set
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }
    /**
     * Auto generated value setter.
     * @param custRequestType the custRequestType to set
     */
    public void setCustRequestType(String custRequestType) {
        this.custRequestType = custRequestType;
    }
    /**
     * Auto generated value setter.
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
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
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
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
     * @param custRequestId the custRequestId to set
     */
    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
    /**
     * Auto generated value setter.
     * @param custRequestTypeId the custRequestTypeId to set
     */
    public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }
    /**
     * Auto generated value setter.
     * @param custRequestCategoryId the custRequestCategoryId to set
     */
    public void setCustRequestCategoryId(String custRequestCategoryId) {
        this.custRequestCategoryId = custRequestCategoryId;
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
     * @param fromPartyId the fromPartyId to set
     */
    public void setFromPartyId(String fromPartyId) {
        this.fromPartyId = fromPartyId;
    }
    /**
     * Auto generated value setter.
     * @param priority the priority to set
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }
    /**
     * Auto generated value setter.
     * @param custRequestDate the custRequestDate to set
     */
    public void setCustRequestDate(Timestamp custRequestDate) {
        this.custRequestDate = custRequestDate;
    }
    /**
     * Auto generated value setter.
     * @param responseRequiredDate the responseRequiredDate to set
     */
    public void setResponseRequiredDate(Timestamp responseRequiredDate) {
        this.responseRequiredDate = responseRequiredDate;
    }
    /**
     * Auto generated value setter.
     * @param custRequestName the custRequestName to set
     */
    public void setCustRequestName(String custRequestName) {
        this.custRequestName = custRequestName;
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
     * @param maximumAmountUomId the maximumAmountUomId to set
     */
    public void setMaximumAmountUomId(String maximumAmountUomId) {
        this.maximumAmountUomId = maximumAmountUomId;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param salesChannelEnumId the salesChannelEnumId to set
     */
    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }
    /**
     * Auto generated value setter.
     * @param fulfillContactMechId the fulfillContactMechId to set
     */
    public void setFulfillContactMechId(String fulfillContactMechId) {
        this.fulfillContactMechId = fulfillContactMechId;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param openDateTime the openDateTime to set
     */
    public void setOpenDateTime(Timestamp openDateTime) {
        this.openDateTime = openDateTime;
    }
    /**
     * Auto generated value setter.
     * @param closedDateTime the closedDateTime to set
     */
    public void setClosedDateTime(Timestamp closedDateTime) {
        this.closedDateTime = closedDateTime;
    }
    /**
     * Auto generated value setter.
     * @param internalComment the internalComment to set
     */
    public void setInternalComment(String internalComment) {
        this.internalComment = internalComment;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param fulfilledDateTime the fulfilledDateTime to set
     */
    public void setFulfilledDateTime(Timestamp fulfilledDateTime) {
        this.fulfilledDateTime = fulfilledDateTime;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUpdated() {
        return this.updated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestType() {
        return this.custRequestType;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReason() {
        return this.reason;
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
    public String getPartyIdTo() {
        return this.partyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdFrom() {
        return this.roleTypeIdFrom;
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
     * @return <code>String</code>
     */
    public String getCustRequestId() {
        return this.custRequestId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestTypeId() {
        return this.custRequestTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestCategoryId() {
        return this.custRequestCategoryId;
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
     * @return <code>String</code>
     */
    public String getFromPartyId() {
        return this.fromPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPriority() {
        return this.priority;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCustRequestDate() {
        return this.custRequestDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getResponseRequiredDate() {
        return this.responseRequiredDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestName() {
        return this.custRequestName;
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
     * @return <code>String</code>
     */
    public String getMaximumAmountUomId() {
        return this.maximumAmountUomId;
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
    public String getSalesChannelEnumId() {
        return this.salesChannelEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFulfillContactMechId() {
        return this.fulfillContactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOpenDateTime() {
        return this.openDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getClosedDateTime() {
        return this.closedDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInternalComment() {
        return this.internalComment;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFulfilledDateTime() {
        return this.fulfilledDateTime;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setStatus((String) mapValue.get("status"));
        setUpdated((String) mapValue.get("updated"));
        setCustRequestType((String) mapValue.get("custRequestType"));
        setReason((String) mapValue.get("reason"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setCustRequestId((String) mapValue.get("custRequestId"));
        setCustRequestTypeId((String) mapValue.get("custRequestTypeId"));
        setCustRequestCategoryId((String) mapValue.get("custRequestCategoryId"));
        setStatusId((String) mapValue.get("statusId"));
        setFromPartyId((String) mapValue.get("fromPartyId"));
        setPriority((Long) mapValue.get("priority"));
        setCustRequestDate((Timestamp) mapValue.get("custRequestDate"));
        setResponseRequiredDate((Timestamp) mapValue.get("responseRequiredDate"));
        setCustRequestName((String) mapValue.get("custRequestName"));
        setDescription((String) mapValue.get("description"));
        setMaximumAmountUomId((String) mapValue.get("maximumAmountUomId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setSalesChannelEnumId((String) mapValue.get("salesChannelEnumId"));
        setFulfillContactMechId((String) mapValue.get("fulfillContactMechId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setOpenDateTime((Timestamp) mapValue.get("openDateTime"));
        setClosedDateTime((Timestamp) mapValue.get("closedDateTime"));
        setInternalComment((String) mapValue.get("internalComment"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setFulfilledDateTime((Timestamp) mapValue.get("fulfilledDateTime"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("status", getStatus());
        mapValue.put("updated", getUpdated());
        mapValue.put("custRequestType", getCustRequestType());
        mapValue.put("reason", getReason());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("custRequestId", getCustRequestId());
        mapValue.put("custRequestTypeId", getCustRequestTypeId());
        mapValue.put("custRequestCategoryId", getCustRequestCategoryId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("fromPartyId", getFromPartyId());
        mapValue.put("priority", getPriority());
        mapValue.put("custRequestDate", getCustRequestDate());
        mapValue.put("responseRequiredDate", getResponseRequiredDate());
        mapValue.put("custRequestName", getCustRequestName());
        mapValue.put("description", getDescription());
        mapValue.put("maximumAmountUomId", getMaximumAmountUomId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("salesChannelEnumId", getSalesChannelEnumId());
        mapValue.put("fulfillContactMechId", getFulfillContactMechId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("openDateTime", getOpenDateTime());
        mapValue.put("closedDateTime", getClosedDateTime());
        mapValue.put("internalComment", getInternalComment());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("fulfilledDateTime", getFulfilledDateTime());
        return mapValue;
    }


}
