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
import java.sql.Timestamp;

/**
 * Auto generated base entity PartyRelationshipAndPermission.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyRelationshipAndPermissions", query="SELECT PR.PARTY_ID_FROM AS \"partyIdFrom\",PR.PARTY_ID_TO AS \"partyIdTo\",PR.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",PR.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",PR.FROM_DATE AS \"fromDate\",PR.THRU_DATE AS \"thruDate\",PR.STATUS_ID AS \"statusId\",PR.RELATIONSHIP_NAME AS \"relationshipName\",PR.SECURITY_GROUP_ID AS \"securityGroupId\",PR.PRIORITY_TYPE_ID AS \"priorityTypeId\",PR.PARTY_RELATIONSHIP_TYPE_ID AS \"partyRelationshipTypeId\",PR.PERMISSIONS_ENUM_ID AS \"permissionsEnumId\",PR.POSITION_TITLE AS \"positionTitle\",PR.COMMENTS AS \"comments\",SGP.GROUP_ID AS \"groupId\",SGP.PERMISSION_ID AS \"permissionId\" FROM PARTY_RELATIONSHIP PR INNER JOIN SECURITY_GROUP_PERMISSION SGP ON PR.SECURITY_GROUP_ID = SGP.GROUP_ID", resultSetMapping="PartyRelationshipAndPermissionMapping")
@SqlResultSetMapping(name="PartyRelationshipAndPermissionMapping", entities={
@EntityResult(entityClass=PartyRelationshipAndPermission.class, fields = {
@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="roleTypeIdFrom", column="roleTypeIdFrom")
,@FieldResult(name="roleTypeIdTo", column="roleTypeIdTo")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="relationshipName", column="relationshipName")
,@FieldResult(name="securityGroupId", column="securityGroupId")
,@FieldResult(name="priorityTypeId", column="priorityTypeId")
,@FieldResult(name="partyRelationshipTypeId", column="partyRelationshipTypeId")
,@FieldResult(name="permissionsEnumId", column="permissionsEnumId")
,@FieldResult(name="positionTitle", column="positionTitle")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="groupId", column="groupId")
,@FieldResult(name="permissionId", column="permissionId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyRelationshipAndPermission extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyIdFrom", "PR.PARTY_ID_FROM");
        fields.put("partyIdTo", "PR.PARTY_ID_TO");
        fields.put("roleTypeIdFrom", "PR.ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "PR.ROLE_TYPE_ID_TO");
        fields.put("fromDate", "PR.FROM_DATE");
        fields.put("thruDate", "PR.THRU_DATE");
        fields.put("statusId", "PR.STATUS_ID");
        fields.put("relationshipName", "PR.RELATIONSHIP_NAME");
        fields.put("securityGroupId", "PR.SECURITY_GROUP_ID");
        fields.put("priorityTypeId", "PR.PRIORITY_TYPE_ID");
        fields.put("partyRelationshipTypeId", "PR.PARTY_RELATIONSHIP_TYPE_ID");
        fields.put("permissionsEnumId", "PR.PERMISSIONS_ENUM_ID");
        fields.put("positionTitle", "PR.POSITION_TITLE");
        fields.put("comments", "PR.COMMENTS");
        fields.put("groupId", "SGP.GROUP_ID");
        fields.put("permissionId", "SGP.PERMISSION_ID");
fieldMapColumns.put("PartyRelationshipAndPermission", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyRelationshipAndPermission> {
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    statusId("statusId"),
    relationshipName("relationshipName"),
    securityGroupId("securityGroupId"),
    priorityTypeId("priorityTypeId"),
    partyRelationshipTypeId("partyRelationshipTypeId"),
    permissionsEnumId("permissionsEnumId"),
    positionTitle("positionTitle"),
    comments("comments"),
    groupId("groupId"),
    permissionId("permissionId");
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
   private String partyIdFrom;
    
   private String partyIdTo;
    
   private String roleTypeIdFrom;
    
   private String roleTypeIdTo;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String statusId;
    
   private String relationshipName;
    
   private String securityGroupId;
    
   private String priorityTypeId;
    
   private String partyRelationshipTypeId;
    
   private String permissionsEnumId;
    
   private String positionTitle;
    
   private String comments;
    
   private String groupId;
    
   private String permissionId;

  /**
   * Default constructor.
   */
  public PartyRelationshipAndPermission() {
      super();
      this.baseEntityName = "PartyRelationshipAndPermission";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyIdFrom");this.primaryKeyNames.add("partyIdTo");this.primaryKeyNames.add("roleTypeIdFrom");this.primaryKeyNames.add("roleTypeIdTo");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("groupId");this.primaryKeyNames.add("permissionId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("statusId");this.allFieldsNames.add("relationshipName");this.allFieldsNames.add("securityGroupId");this.allFieldsNames.add("priorityTypeId");this.allFieldsNames.add("partyRelationshipTypeId");this.allFieldsNames.add("permissionsEnumId");this.allFieldsNames.add("positionTitle");this.allFieldsNames.add("comments");this.allFieldsNames.add("groupId");this.allFieldsNames.add("permissionId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyRelationshipAndPermission(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    private void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    private void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    private void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    private void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
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
     * @param statusId the statusId to set
     */
    private void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param relationshipName the relationshipName to set
     */
    private void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }
    /**
     * Auto generated value setter.
     * @param securityGroupId the securityGroupId to set
     */
    private void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
    /**
     * Auto generated value setter.
     * @param priorityTypeId the priorityTypeId to set
     */
    private void setPriorityTypeId(String priorityTypeId) {
        this.priorityTypeId = priorityTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyRelationshipTypeId the partyRelationshipTypeId to set
     */
    private void setPartyRelationshipTypeId(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }
    /**
     * Auto generated value setter.
     * @param permissionsEnumId the permissionsEnumId to set
     */
    private void setPermissionsEnumId(String permissionsEnumId) {
        this.permissionsEnumId = permissionsEnumId;
    }
    /**
     * Auto generated value setter.
     * @param positionTitle the positionTitle to set
     */
    private void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    private void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param groupId the groupId to set
     */
    private void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    /**
     * Auto generated value setter.
     * @param permissionId the permissionId to set
     */
    private void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
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
    public String getPartyIdTo() {
        return this.partyIdTo;
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
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.roleTypeIdTo;
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
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRelationshipName() {
        return this.relationshipName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPriorityTypeId() {
        return this.priorityTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyRelationshipTypeId() {
        return this.partyRelationshipTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPermissionsEnumId() {
        return this.permissionsEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPositionTitle() {
        return this.positionTitle;
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
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPermissionId() {
        return this.permissionId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setStatusId((String) mapValue.get("statusId"));
        setRelationshipName((String) mapValue.get("relationshipName"));
        setSecurityGroupId((String) mapValue.get("securityGroupId"));
        setPriorityTypeId((String) mapValue.get("priorityTypeId"));
        setPartyRelationshipTypeId((String) mapValue.get("partyRelationshipTypeId"));
        setPermissionsEnumId((String) mapValue.get("permissionsEnumId"));
        setPositionTitle((String) mapValue.get("positionTitle"));
        setComments((String) mapValue.get("comments"));
        setGroupId((String) mapValue.get("groupId"));
        setPermissionId((String) mapValue.get("permissionId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("statusId", getStatusId());
        mapValue.put("relationshipName", getRelationshipName());
        mapValue.put("securityGroupId", getSecurityGroupId());
        mapValue.put("priorityTypeId", getPriorityTypeId());
        mapValue.put("partyRelationshipTypeId", getPartyRelationshipTypeId());
        mapValue.put("permissionsEnumId", getPermissionsEnumId());
        mapValue.put("positionTitle", getPositionTitle());
        mapValue.put("comments", getComments());
        mapValue.put("groupId", getGroupId());
        mapValue.put("permissionId", getPermissionId());
        return mapValue;
    }


}
