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
 * Auto generated base entity EmplPositionClassType.
 */
@javax.persistence.Entity
@Table(name="EMPL_POSITION_CLASS_TYPE")
public class EmplPositionClassType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("emplPositionClassTypeId", "EMPL_POSITION_CLASS_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EmplPositionClassType", fields);
}
  public static enum Fields implements EntityFieldInterface<EmplPositionClassType> {
    emplPositionClassTypeId("emplPositionClassTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="EmplPositionClassType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="EmplPositionClassType_GEN")
   @Id
   @Column(name="EMPL_POSITION_CLASS_TYPE_ID")
   private String emplPositionClassTypeId;
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
   
   private EmplPositionClassType parentEmplPositionClassType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<EmplPositionClassType> childEmplPositionClassTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="emplPositionClassType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EMPL_POSITION_CLASS_TYPE_ID")
   
   private List<EmplPositionTypeClass> emplPositionTypeClasses = null;

  /**
   * Default constructor.
   */
  public EmplPositionClassType() {
      super();
      this.baseEntityName = "EmplPositionClassType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("emplPositionClassTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("emplPositionClassTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EmplPositionClassType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param emplPositionClassTypeId the emplPositionClassTypeId to set
     */
    public void setEmplPositionClassTypeId(String emplPositionClassTypeId) {
        this.emplPositionClassTypeId = emplPositionClassTypeId;
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
    public String getEmplPositionClassTypeId() {
        return this.emplPositionClassTypeId;
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
     * Auto generated method that gets the related <code>EmplPositionClassType</code> by the relation named <code>ParentEmplPositionClassType</code>.
     * @return the <code>EmplPositionClassType</code>
     * @throws RepositoryException if an error occurs
     */
    public EmplPositionClassType getParentEmplPositionClassType() throws RepositoryException {
        if (this.parentEmplPositionClassType == null) {
            this.parentEmplPositionClassType = getRelatedOne(EmplPositionClassType.class, "ParentEmplPositionClassType");
        }
        return this.parentEmplPositionClassType;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionClassType</code> by the relation named <code>ChildEmplPositionClassType</code>.
     * @return the list of <code>EmplPositionClassType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionClassType> getChildEmplPositionClassTypes() throws RepositoryException {
        if (this.childEmplPositionClassTypes == null) {
            this.childEmplPositionClassTypes = getRelated(EmplPositionClassType.class, "ChildEmplPositionClassType");
        }
        return this.childEmplPositionClassTypes;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionTypeClass</code> by the relation named <code>EmplPositionTypeClass</code>.
     * @return the list of <code>EmplPositionTypeClass</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionTypeClass> getEmplPositionTypeClasses() throws RepositoryException {
        if (this.emplPositionTypeClasses == null) {
            this.emplPositionTypeClasses = getRelated(EmplPositionTypeClass.class, "EmplPositionTypeClass");
        }
        return this.emplPositionTypeClasses;
    }

    /**
     * Auto generated value setter.
     * @param parentEmplPositionClassType the parentEmplPositionClassType to set
    */
    public void setParentEmplPositionClassType(EmplPositionClassType parentEmplPositionClassType) {
        this.parentEmplPositionClassType = parentEmplPositionClassType;
    }
    /**
     * Auto generated value setter.
     * @param childEmplPositionClassTypes the childEmplPositionClassTypes to set
    */
    public void setChildEmplPositionClassTypes(List<EmplPositionClassType> childEmplPositionClassTypes) {
        this.childEmplPositionClassTypes = childEmplPositionClassTypes;
    }
    /**
     * Auto generated value setter.
     * @param emplPositionTypeClasses the emplPositionTypeClasses to set
    */
    public void setEmplPositionTypeClasses(List<EmplPositionTypeClass> emplPositionTypeClasses) {
        this.emplPositionTypeClasses = emplPositionTypeClasses;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addEmplPositionTypeClasse(EmplPositionTypeClass emplPositionTypeClasse) {
        if (this.emplPositionTypeClasses == null) {
            this.emplPositionTypeClasses = new ArrayList<EmplPositionTypeClass>();
        }
        this.emplPositionTypeClasses.add(emplPositionTypeClasse);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEmplPositionTypeClasse(EmplPositionTypeClass emplPositionTypeClasse) {
        if (this.emplPositionTypeClasses == null) {
            return;
        }
        this.emplPositionTypeClasses.remove(emplPositionTypeClasse);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEmplPositionTypeClasse() {
        if (this.emplPositionTypeClasses == null) {
            return;
        }
        this.emplPositionTypeClasses.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEmplPositionClassTypeId((String) mapValue.get("emplPositionClassTypeId"));
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
        mapValue.put("emplPositionClassTypeId", getEmplPositionClassTypeId());
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
