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
 * Auto generated base entity UserLoginSecurityGroup.
 */
@javax.persistence.Entity
@Table(name="USER_LOGIN_SECURITY_GROUP")
public class UserLoginSecurityGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("userLoginId", "USER_LOGIN_ID");
        fields.put("groupId", "GROUP_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("UserLoginSecurityGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<UserLoginSecurityGroup> {
    userLoginId("userLoginId"),
    groupId("groupId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.UserLoginSecurityGroupPkBridge.class)
     private UserLoginSecurityGroupPk id = new UserLoginSecurityGroupPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>UserLoginSecurityGroupPk</code>
     */
      public UserLoginSecurityGroupPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>UserLoginSecurityGroupPk</code> value to set
    */   
      public void setId(UserLoginSecurityGroupPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin userLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SecurityGroup securityGroup = null;
   private transient List<SecurityGroupPermission> securityGroupPermissions = null;

  /**
   * Default constructor.
   */
  public UserLoginSecurityGroup() {
      super();
      this.baseEntityName = "UserLoginSecurityGroup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("userLoginId");this.primaryKeyNames.add("groupId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("groupId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UserLoginSecurityGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        id.setUserLoginId(userLoginId);
    }
    /**
     * Auto generated value setter.
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {
        id.setGroupId(groupId);
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
    public String getUserLoginId() {
        return this.id.getUserLoginId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupId() {
        return this.id.getGroupId();
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
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>UserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getUserLogin() throws RepositoryException {
        if (this.userLogin == null) {
            this.userLogin = getRelatedOne(UserLogin.class, "UserLogin");
        }
        return this.userLogin;
    }
    /**
     * Auto generated method that gets the related <code>SecurityGroup</code> by the relation named <code>SecurityGroup</code>.
     * @return the <code>SecurityGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public SecurityGroup getSecurityGroup() throws RepositoryException {
        if (this.securityGroup == null) {
            this.securityGroup = getRelatedOne(SecurityGroup.class, "SecurityGroup");
        }
        return this.securityGroup;
    }
    /**
     * Auto generated method that gets the related <code>SecurityGroupPermission</code> by the relation named <code>SecurityGroupPermission</code>.
     * @return the list of <code>SecurityGroupPermission</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SecurityGroupPermission> getSecurityGroupPermissions() throws RepositoryException {
        if (this.securityGroupPermissions == null) {
            this.securityGroupPermissions = getRelated(SecurityGroupPermission.class, "SecurityGroupPermission");
        }
        return this.securityGroupPermissions;
    }

    /**
     * Auto generated value setter.
     * @param userLogin the userLogin to set
    */
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    /**
     * Auto generated value setter.
     * @param securityGroup the securityGroup to set
    */
    public void setSecurityGroup(SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }
    /**
     * Auto generated value setter.
     * @param securityGroupPermissions the securityGroupPermissions to set
    */
    public void setSecurityGroupPermissions(List<SecurityGroupPermission> securityGroupPermissions) {
        this.securityGroupPermissions = securityGroupPermissions;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUserLoginId((String) mapValue.get("userLoginId"));
        setGroupId((String) mapValue.get("groupId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("groupId", getGroupId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
