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
 * Auto generated base entity SecurityGroup.
 */
@javax.persistence.Entity
@Table(name="SECURITY_GROUP")
public class SecurityGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("groupId", "GROUP_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SecurityGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<SecurityGroup> {
    groupId("groupId"),
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

   @org.hibernate.annotations.GenericGenerator(name="SecurityGroup_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SecurityGroup_GEN")
   @Id
   @Column(name="GROUP_ID")
   private String groupId;
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
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FacilityTeamRoleSecurity facilityTeamRoleSecurity = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SECURITY_GROUP_ID")
   
   private List<PartyRelationship> partyRelationships = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SECURITY_GROUP_ID")
   
   private List<PortalPage> portalPages = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="securityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="GROUP_ID")
   
   private List<ProtectedView> protectedViews = null;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GROUP_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SalesTeamRoleSecurity salesTeamRoleSecurity = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="securityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="GROUP_ID")
   
   private List<SecurityGroupPermission> securityGroupPermissions = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="securityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="GROUP_ID")
   
   private List<UserLoginSecurityGroup> userLoginSecurityGroups = null;

  /**
   * Default constructor.
   */
  public SecurityGroup() {
      super();
      this.baseEntityName = "SecurityGroup";
      this.isView = false;
      this.resourceName = "SecurityEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("groupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("groupId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SecurityGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
    public String getGroupId() {
        return this.groupId;
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
     * Auto generated method that gets the related <code>FacilityTeamRoleSecurity</code> by the relation named <code>FacilityTeamRoleSecurity</code>.
     * @return the <code>FacilityTeamRoleSecurity</code>
     * @throws RepositoryException if an error occurs
     */
    public FacilityTeamRoleSecurity getFacilityTeamRoleSecurity() throws RepositoryException {
        if (this.facilityTeamRoleSecurity == null) {
            this.facilityTeamRoleSecurity = getRelatedOne(FacilityTeamRoleSecurity.class, "FacilityTeamRoleSecurity");
        }
        return this.facilityTeamRoleSecurity;
    }
    /**
     * Auto generated method that gets the related <code>PartyRelationship</code> by the relation named <code>PartyRelationship</code>.
     * @return the list of <code>PartyRelationship</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyRelationship> getPartyRelationships() throws RepositoryException {
        if (this.partyRelationships == null) {
            this.partyRelationships = getRelated(PartyRelationship.class, "PartyRelationship");
        }
        return this.partyRelationships;
    }
    /**
     * Auto generated method that gets the related <code>PortalPage</code> by the relation named <code>PortalPage</code>.
     * @return the list of <code>PortalPage</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PortalPage> getPortalPages() throws RepositoryException {
        if (this.portalPages == null) {
            this.portalPages = getRelated(PortalPage.class, "PortalPage");
        }
        return this.portalPages;
    }
    /**
     * Auto generated method that gets the related <code>ProtectedView</code> by the relation named <code>ProtectedView</code>.
     * @return the list of <code>ProtectedView</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProtectedView> getProtectedViews() throws RepositoryException {
        if (this.protectedViews == null) {
            this.protectedViews = getRelated(ProtectedView.class, "ProtectedView");
        }
        return this.protectedViews;
    }
    /**
     * Auto generated method that gets the related <code>SalesTeamRoleSecurity</code> by the relation named <code>SalesTeamRoleSecurity</code>.
     * @return the <code>SalesTeamRoleSecurity</code>
     * @throws RepositoryException if an error occurs
     */
    public SalesTeamRoleSecurity getSalesTeamRoleSecurity() throws RepositoryException {
        if (this.salesTeamRoleSecurity == null) {
            this.salesTeamRoleSecurity = getRelatedOne(SalesTeamRoleSecurity.class, "SalesTeamRoleSecurity");
        }
        return this.salesTeamRoleSecurity;
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
     * Auto generated method that gets the related <code>UserLoginSecurityGroup</code> by the relation named <code>UserLoginSecurityGroup</code>.
     * @return the list of <code>UserLoginSecurityGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends UserLoginSecurityGroup> getUserLoginSecurityGroups() throws RepositoryException {
        if (this.userLoginSecurityGroups == null) {
            this.userLoginSecurityGroups = getRelated(UserLoginSecurityGroup.class, "UserLoginSecurityGroup");
        }
        return this.userLoginSecurityGroups;
    }

    /**
     * Auto generated value setter.
     * @param facilityTeamRoleSecurity the facilityTeamRoleSecurity to set
    */
    public void setFacilityTeamRoleSecurity(FacilityTeamRoleSecurity facilityTeamRoleSecurity) {
        this.facilityTeamRoleSecurity = facilityTeamRoleSecurity;
    }
    /**
     * Auto generated value setter.
     * @param partyRelationships the partyRelationships to set
    */
    public void setPartyRelationships(List<PartyRelationship> partyRelationships) {
        this.partyRelationships = partyRelationships;
    }
    /**
     * Auto generated value setter.
     * @param portalPages the portalPages to set
    */
    public void setPortalPages(List<PortalPage> portalPages) {
        this.portalPages = portalPages;
    }
    /**
     * Auto generated value setter.
     * @param protectedViews the protectedViews to set
    */
    public void setProtectedViews(List<ProtectedView> protectedViews) {
        this.protectedViews = protectedViews;
    }
    /**
     * Auto generated value setter.
     * @param salesTeamRoleSecurity the salesTeamRoleSecurity to set
    */
    public void setSalesTeamRoleSecurity(SalesTeamRoleSecurity salesTeamRoleSecurity) {
        this.salesTeamRoleSecurity = salesTeamRoleSecurity;
    }
    /**
     * Auto generated value setter.
     * @param securityGroupPermissions the securityGroupPermissions to set
    */
    public void setSecurityGroupPermissions(List<SecurityGroupPermission> securityGroupPermissions) {
        this.securityGroupPermissions = securityGroupPermissions;
    }
    /**
     * Auto generated value setter.
     * @param userLoginSecurityGroups the userLoginSecurityGroups to set
    */
    public void setUserLoginSecurityGroups(List<UserLoginSecurityGroup> userLoginSecurityGroups) {
        this.userLoginSecurityGroups = userLoginSecurityGroups;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addProtectedView(ProtectedView protectedView) {
        if (this.protectedViews == null) {
            this.protectedViews = new ArrayList<ProtectedView>();
        }
        this.protectedViews.add(protectedView);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProtectedView(ProtectedView protectedView) {
        if (this.protectedViews == null) {
            return;
        }
        this.protectedViews.remove(protectedView);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProtectedView() {
        if (this.protectedViews == null) {
            return;
        }
        this.protectedViews.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addSecurityGroupPermission(SecurityGroupPermission securityGroupPermission) {
        if (this.securityGroupPermissions == null) {
            this.securityGroupPermissions = new ArrayList<SecurityGroupPermission>();
        }
        this.securityGroupPermissions.add(securityGroupPermission);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSecurityGroupPermission(SecurityGroupPermission securityGroupPermission) {
        if (this.securityGroupPermissions == null) {
            return;
        }
        this.securityGroupPermissions.remove(securityGroupPermission);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSecurityGroupPermission() {
        if (this.securityGroupPermissions == null) {
            return;
        }
        this.securityGroupPermissions.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addUserLoginSecurityGroup(UserLoginSecurityGroup userLoginSecurityGroup) {
        if (this.userLoginSecurityGroups == null) {
            this.userLoginSecurityGroups = new ArrayList<UserLoginSecurityGroup>();
        }
        this.userLoginSecurityGroups.add(userLoginSecurityGroup);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeUserLoginSecurityGroup(UserLoginSecurityGroup userLoginSecurityGroup) {
        if (this.userLoginSecurityGroups == null) {
            return;
        }
        this.userLoginSecurityGroups.remove(userLoginSecurityGroup);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearUserLoginSecurityGroup() {
        if (this.userLoginSecurityGroups == null) {
            return;
        }
        this.userLoginSecurityGroups.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGroupId((String) mapValue.get("groupId"));
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
        mapValue.put("groupId", getGroupId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
