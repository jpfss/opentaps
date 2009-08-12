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
 * Auto generated base entity CustRequestAndRole.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCustRequestAndRoles", query="SELECT CR.CUST_REQUEST_ID AS \"custRequestId\",CR.CUST_REQUEST_TYPE_ID AS \"custRequestTypeId\",CR.STATUS_ID AS \"statusId\",CR.FROM_PARTY_ID AS \"fromPartyId\",CR.PRIORITY AS \"priority\",CR.CUST_REQUEST_DATE AS \"custRequestDate\",CR.RESPONSE_REQUIRED_DATE AS \"responseRequiredDate\",CR.CUST_REQUEST_NAME AS \"custRequestName\",CR.DESCRIPTION AS \"description\",CR.CREATED_DATE AS \"createdDate\",CR.LAST_MODIFIED_DATE AS \"lastModifiedDate\",CR.LAST_MODIFIED_BY_USER_LOGIN AS \"lastModifiedByUserLogin\",CRP.PARTY_ID AS \"partyId\",CRP.ROLE_TYPE_ID AS \"roleTypeId\",CRP.FROM_DATE AS \"fromDate\",CRP.THRU_DATE AS \"thruDate\" FROM CUST_REQUEST CR INNER JOIN CUST_REQUEST_PARTY CRP ON CR.CUST_REQUEST_ID = CRP.CUST_REQUEST_ID", resultSetMapping="CustRequestAndRoleMapping")
@SqlResultSetMapping(name="CustRequestAndRoleMapping", entities={
@EntityResult(entityClass=CustRequestAndRole.class, fields = {
@FieldResult(name="custRequestId", column="custRequestId")
,@FieldResult(name="custRequestTypeId", column="custRequestTypeId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="fromPartyId", column="fromPartyId")
,@FieldResult(name="priority", column="priority")
,@FieldResult(name="custRequestDate", column="custRequestDate")
,@FieldResult(name="responseRequiredDate", column="responseRequiredDate")
,@FieldResult(name="custRequestName", column="custRequestName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="lastModifiedDate", column="lastModifiedDate")
,@FieldResult(name="lastModifiedByUserLogin", column="lastModifiedByUserLogin")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CustRequestAndRole extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("custRequestId", "CR.CUST_REQUEST_ID");
        fields.put("custRequestTypeId", "CR.CUST_REQUEST_TYPE_ID");
        fields.put("statusId", "CR.STATUS_ID");
        fields.put("fromPartyId", "CR.FROM_PARTY_ID");
        fields.put("priority", "CR.PRIORITY");
        fields.put("custRequestDate", "CR.CUST_REQUEST_DATE");
        fields.put("responseRequiredDate", "CR.RESPONSE_REQUIRED_DATE");
        fields.put("custRequestName", "CR.CUST_REQUEST_NAME");
        fields.put("description", "CR.DESCRIPTION");
        fields.put("createdDate", "CR.CREATED_DATE");
        fields.put("lastModifiedDate", "CR.LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "CR.LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("partyId", "CRP.PARTY_ID");
        fields.put("roleTypeId", "CRP.ROLE_TYPE_ID");
        fields.put("fromDate", "CRP.FROM_DATE");
        fields.put("thruDate", "CRP.THRU_DATE");
fieldMapColumns.put("CustRequestAndRole", fields);
}
  public static enum Fields implements EntityFieldInterface<CustRequestAndRole> {
    custRequestId("custRequestId"),
    custRequestTypeId("custRequestTypeId"),
    statusId("statusId"),
    fromPartyId("fromPartyId"),
    priority("priority"),
    custRequestDate("custRequestDate"),
    responseRequiredDate("responseRequiredDate"),
    custRequestName("custRequestName"),
    description("description"),
    createdDate("createdDate"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate");
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
   private String custRequestId;
    
   private String custRequestTypeId;
    
   private String statusId;
    
   private String fromPartyId;
    
   private Long priority;
    
   private Timestamp custRequestDate;
    
   private Timestamp responseRequiredDate;
    
   private String custRequestName;
    
   private String description;
    
   private Timestamp createdDate;
    
   private Timestamp lastModifiedDate;
    
   private String lastModifiedByUserLogin;
    
   private String partyId;
    
   private String roleTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUST_REQUEST_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustRequest custRequest = null;
   private transient CustRequestParty custRequestParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   private transient Person person = null;
   private transient PartyRole partyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType roleType = null;

  /**
   * Default constructor.
   */
  public CustRequestAndRole() {
      super();
      this.baseEntityName = "CustRequestAndRole";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("custRequestId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("custRequestId");this.allFieldsNames.add("custRequestTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("fromPartyId");this.allFieldsNames.add("priority");this.allFieldsNames.add("custRequestDate");this.allFieldsNames.add("responseRequiredDate");this.allFieldsNames.add("custRequestName");this.allFieldsNames.add("description");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustRequestAndRole(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param custRequestId the custRequestId to set
     */
    private void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
    /**
     * Auto generated value setter.
     * @param custRequestTypeId the custRequestTypeId to set
     */
    private void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    private void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param fromPartyId the fromPartyId to set
     */
    private void setFromPartyId(String fromPartyId) {
        this.fromPartyId = fromPartyId;
    }
    /**
     * Auto generated value setter.
     * @param priority the priority to set
     */
    private void setPriority(Long priority) {
        this.priority = priority;
    }
    /**
     * Auto generated value setter.
     * @param custRequestDate the custRequestDate to set
     */
    private void setCustRequestDate(Timestamp custRequestDate) {
        this.custRequestDate = custRequestDate;
    }
    /**
     * Auto generated value setter.
     * @param responseRequiredDate the responseRequiredDate to set
     */
    private void setResponseRequiredDate(Timestamp responseRequiredDate) {
        this.responseRequiredDate = responseRequiredDate;
    }
    /**
     * Auto generated value setter.
     * @param custRequestName the custRequestName to set
     */
    private void setCustRequestName(String custRequestName) {
        this.custRequestName = custRequestName;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    private void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    private void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    private void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    private void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    private void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    private void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
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
     * Auto generated method that gets the related <code>CustRequest</code> by the relation named <code>CustRequest</code>.
     * @return the <code>CustRequest</code>
     * @throws RepositoryException if an error occurs
     */
    public CustRequest getCustRequest() throws RepositoryException {
        if (this.custRequest == null) {
            this.custRequest = getRelatedOne(CustRequest.class, "CustRequest");
        }
        return this.custRequest;
    }
    /**
     * Auto generated method that gets the related <code>CustRequestParty</code> by the relation named <code>CustRequestParty</code>.
     * @return the <code>CustRequestParty</code>
     * @throws RepositoryException if an error occurs
     */
    public CustRequestParty getCustRequestParty() throws RepositoryException {
        if (this.custRequestParty == null) {
            this.custRequestParty = getRelatedOne(CustRequestParty.class, "CustRequestParty");
        }
        return this.custRequestParty;
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
     * Auto generated method that gets the related <code>Person</code> by the relation named <code>Person</code>.
     * @return the <code>Person</code>
     * @throws RepositoryException if an error occurs
     */
    public Person getPerson() throws RepositoryException {
        if (this.person == null) {
            this.person = getRelatedOne(Person.class, "Person");
        }
        return this.person;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>PartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getPartyRole() throws RepositoryException {
        if (this.partyRole == null) {
            this.partyRole = getRelatedOne(PartyRole.class, "PartyRole");
        }
        return this.partyRole;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>RoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getRoleType() throws RepositoryException {
        if (this.roleType == null) {
            this.roleType = getRelatedOne(RoleType.class, "RoleType");
        }
        return this.roleType;
    }

    /**
     * Auto generated value setter.
     * @param custRequest the custRequest to set
    */
    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
    }
    /**
     * Auto generated value setter.
     * @param custRequestParty the custRequestParty to set
    */
    public void setCustRequestParty(CustRequestParty custRequestParty) {
        this.custRequestParty = custRequestParty;
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
     * @param person the person to set
    */
    public void setPerson(Person person) {
        this.person = person;
    }
    /**
     * Auto generated value setter.
     * @param partyRole the partyRole to set
    */
    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }
    /**
     * Auto generated value setter.
     * @param roleType the roleType to set
    */
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustRequestId((String) mapValue.get("custRequestId"));
        setCustRequestTypeId((String) mapValue.get("custRequestTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setFromPartyId((String) mapValue.get("fromPartyId"));
        setPriority((Long) mapValue.get("priority"));
        setCustRequestDate((Timestamp) mapValue.get("custRequestDate"));
        setResponseRequiredDate((Timestamp) mapValue.get("responseRequiredDate"));
        setCustRequestName((String) mapValue.get("custRequestName"));
        setDescription((String) mapValue.get("description"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("custRequestId", getCustRequestId());
        mapValue.put("custRequestTypeId", getCustRequestTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("fromPartyId", getFromPartyId());
        mapValue.put("priority", getPriority());
        mapValue.put("custRequestDate", getCustRequestDate());
        mapValue.put("responseRequiredDate", getResponseRequiredDate());
        mapValue.put("custRequestName", getCustRequestName());
        mapValue.put("description", getDescription());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        return mapValue;
    }


}
