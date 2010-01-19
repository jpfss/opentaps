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
 * Auto generated base entity ContactMechType.
 */
@javax.persistence.Entity
@Table(name="CONTACT_MECH_TYPE")
public class ContactMechType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contactMechTypeId", "CONTACT_MECH_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ContactMechType", fields);
}
  public static enum Fields implements EntityFieldInterface<ContactMechType> {
    contactMechTypeId("contactMechTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="ContactMechType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ContactMechType_GEN")
   @Id
   @Column(name="CONTACT_MECH_TYPE_ID")
   private String contactMechTypeId;
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
   
   private ContactMechType parentContactMechType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_TYPE_ID")
   
   private List<CommunicationEvent> communicationEvents = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_TYPE_ID")
   
   private List<ContactList> contactLists = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_TYPE_ID")
   
   private List<ContactMech> contactMeches = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<ContactMechType> childContactMechTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="contactMechType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONTACT_MECH_TYPE_ID")
   
   private List<ContactMechTypeAttr> contactMechTypeAttrs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="contactMechType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONTACT_MECH_TYPE_ID")
   
   private List<ContactMechTypePurpose> contactMechTypePurposes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="contactMechType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONTACT_MECH_TYPE_ID")
   
   private List<ValidContactMechRole> validContactMechRoles = null;

  /**
   * Default constructor.
   */
  public ContactMechType() {
      super();
      this.baseEntityName = "ContactMechType";
      this.isView = false;
      this.resourceName = "PartyEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contactMechTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contactMechTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ContactMechType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
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
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
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
     * Auto generated method that gets the related <code>ContactMechType</code> by the relation named <code>ParentContactMechType</code>.
     * @return the <code>ContactMechType</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMechType getParentContactMechType() throws RepositoryException {
        if (this.parentContactMechType == null) {
            this.parentContactMechType = getRelatedOne(ContactMechType.class, "ParentContactMechType");
        }
        return this.parentContactMechType;
    }
    /**
     * Auto generated method that gets the related <code>CommunicationEvent</code> by the relation named <code>CommunicationEvent</code>.
     * @return the list of <code>CommunicationEvent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CommunicationEvent> getCommunicationEvents() throws RepositoryException {
        if (this.communicationEvents == null) {
            this.communicationEvents = getRelated(CommunicationEvent.class, "CommunicationEvent");
        }
        return this.communicationEvents;
    }
    /**
     * Auto generated method that gets the related <code>ContactList</code> by the relation named <code>ContactList</code>.
     * @return the list of <code>ContactList</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContactList> getContactLists() throws RepositoryException {
        if (this.contactLists == null) {
            this.contactLists = getRelated(ContactList.class, "ContactList");
        }
        return this.contactLists;
    }
    /**
     * Auto generated method that gets the related <code>ContactMech</code> by the relation named <code>ContactMech</code>.
     * @return the list of <code>ContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContactMech> getContactMeches() throws RepositoryException {
        if (this.contactMeches == null) {
            this.contactMeches = getRelated(ContactMech.class, "ContactMech");
        }
        return this.contactMeches;
    }
    /**
     * Auto generated method that gets the related <code>ContactMechType</code> by the relation named <code>ChildContactMechType</code>.
     * @return the list of <code>ContactMechType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContactMechType> getChildContactMechTypes() throws RepositoryException {
        if (this.childContactMechTypes == null) {
            this.childContactMechTypes = getRelated(ContactMechType.class, "ChildContactMechType");
        }
        return this.childContactMechTypes;
    }
    /**
     * Auto generated method that gets the related <code>ContactMechTypeAttr</code> by the relation named <code>ContactMechTypeAttr</code>.
     * @return the list of <code>ContactMechTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContactMechTypeAttr> getContactMechTypeAttrs() throws RepositoryException {
        if (this.contactMechTypeAttrs == null) {
            this.contactMechTypeAttrs = getRelated(ContactMechTypeAttr.class, "ContactMechTypeAttr");
        }
        return this.contactMechTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>ContactMechTypePurpose</code> by the relation named <code>ContactMechTypePurpose</code>.
     * @return the list of <code>ContactMechTypePurpose</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContactMechTypePurpose> getContactMechTypePurposes() throws RepositoryException {
        if (this.contactMechTypePurposes == null) {
            this.contactMechTypePurposes = getRelated(ContactMechTypePurpose.class, "ContactMechTypePurpose");
        }
        return this.contactMechTypePurposes;
    }
    /**
     * Auto generated method that gets the related <code>ValidContactMechRole</code> by the relation named <code>ValidContactMechRole</code>.
     * @return the list of <code>ValidContactMechRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ValidContactMechRole> getValidContactMechRoles() throws RepositoryException {
        if (this.validContactMechRoles == null) {
            this.validContactMechRoles = getRelated(ValidContactMechRole.class, "ValidContactMechRole");
        }
        return this.validContactMechRoles;
    }

    /**
     * Auto generated value setter.
     * @param parentContactMechType the parentContactMechType to set
    */
    public void setParentContactMechType(ContactMechType parentContactMechType) {
        this.parentContactMechType = parentContactMechType;
    }
    /**
     * Auto generated value setter.
     * @param communicationEvents the communicationEvents to set
    */
    public void setCommunicationEvents(List<CommunicationEvent> communicationEvents) {
        this.communicationEvents = communicationEvents;
    }
    /**
     * Auto generated value setter.
     * @param contactLists the contactLists to set
    */
    public void setContactLists(List<ContactList> contactLists) {
        this.contactLists = contactLists;
    }
    /**
     * Auto generated value setter.
     * @param contactMeches the contactMeches to set
    */
    public void setContactMeches(List<ContactMech> contactMeches) {
        this.contactMeches = contactMeches;
    }
    /**
     * Auto generated value setter.
     * @param childContactMechTypes the childContactMechTypes to set
    */
    public void setChildContactMechTypes(List<ContactMechType> childContactMechTypes) {
        this.childContactMechTypes = childContactMechTypes;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypeAttrs the contactMechTypeAttrs to set
    */
    public void setContactMechTypeAttrs(List<ContactMechTypeAttr> contactMechTypeAttrs) {
        this.contactMechTypeAttrs = contactMechTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypePurposes the contactMechTypePurposes to set
    */
    public void setContactMechTypePurposes(List<ContactMechTypePurpose> contactMechTypePurposes) {
        this.contactMechTypePurposes = contactMechTypePurposes;
    }
    /**
     * Auto generated value setter.
     * @param validContactMechRoles the validContactMechRoles to set
    */
    public void setValidContactMechRoles(List<ValidContactMechRole> validContactMechRoles) {
        this.validContactMechRoles = validContactMechRoles;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addContactMechTypeAttr(ContactMechTypeAttr contactMechTypeAttr) {
        if (this.contactMechTypeAttrs == null) {
            this.contactMechTypeAttrs = new ArrayList<ContactMechTypeAttr>();
        }
        this.contactMechTypeAttrs.add(contactMechTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeContactMechTypeAttr(ContactMechTypeAttr contactMechTypeAttr) {
        if (this.contactMechTypeAttrs == null) {
            return;
        }
        this.contactMechTypeAttrs.remove(contactMechTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearContactMechTypeAttr() {
        if (this.contactMechTypeAttrs == null) {
            return;
        }
        this.contactMechTypeAttrs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addContactMechTypePurpose(ContactMechTypePurpose contactMechTypePurpose) {
        if (this.contactMechTypePurposes == null) {
            this.contactMechTypePurposes = new ArrayList<ContactMechTypePurpose>();
        }
        this.contactMechTypePurposes.add(contactMechTypePurpose);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeContactMechTypePurpose(ContactMechTypePurpose contactMechTypePurpose) {
        if (this.contactMechTypePurposes == null) {
            return;
        }
        this.contactMechTypePurposes.remove(contactMechTypePurpose);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearContactMechTypePurpose() {
        if (this.contactMechTypePurposes == null) {
            return;
        }
        this.contactMechTypePurposes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addValidContactMechRole(ValidContactMechRole validContactMechRole) {
        if (this.validContactMechRoles == null) {
            this.validContactMechRoles = new ArrayList<ValidContactMechRole>();
        }
        this.validContactMechRoles.add(validContactMechRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeValidContactMechRole(ValidContactMechRole validContactMechRole) {
        if (this.validContactMechRoles == null) {
            return;
        }
        this.validContactMechRoles.remove(validContactMechRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearValidContactMechRole() {
        if (this.validContactMechRoles == null) {
            return;
        }
        this.validContactMechRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
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
        mapValue.put("contactMechTypeId", getContactMechTypeId());
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
