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
 * Auto generated base entity EmploymentAppSourceType.
 */
@javax.persistence.Entity
@Table(name="EMPLOYMENT_APP_SOURCE_TYPE")
public class EmploymentAppSourceType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("employmentAppSourceTypeId", "EMPLOYMENT_APP_SOURCE_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EmploymentAppSourceType", fields);
}
  public static enum Fields implements EntityFieldInterface<EmploymentAppSourceType> {
    employmentAppSourceTypeId("employmentAppSourceTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="EmploymentAppSourceType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="EmploymentAppSourceType_GEN")
   @Id
   @Column(name="EMPLOYMENT_APP_SOURCE_TYPE_ID")
   private String employmentAppSourceTypeId;
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
   
   private EmploymentAppSourceType parentEmploymentAppSourceType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="EMPLOYMENT_APP_SOURCE_TYPE_ID")
   
   private List<EmploymentApp> employmentApps = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<EmploymentAppSourceType> childEmploymentAppSourceTypes = null;

  /**
   * Default constructor.
   */
  public EmploymentAppSourceType() {
      super();
      this.baseEntityName = "EmploymentAppSourceType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("employmentAppSourceTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("employmentAppSourceTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EmploymentAppSourceType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param employmentAppSourceTypeId the employmentAppSourceTypeId to set
     */
    public void setEmploymentAppSourceTypeId(String employmentAppSourceTypeId) {
        this.employmentAppSourceTypeId = employmentAppSourceTypeId;
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
    public String getEmploymentAppSourceTypeId() {
        return this.employmentAppSourceTypeId;
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
     * Auto generated method that gets the related <code>EmploymentAppSourceType</code> by the relation named <code>ParentEmploymentAppSourceType</code>.
     * @return the <code>EmploymentAppSourceType</code>
     * @throws RepositoryException if an error occurs
     */
    public EmploymentAppSourceType getParentEmploymentAppSourceType() throws RepositoryException {
        if (this.parentEmploymentAppSourceType == null) {
            this.parentEmploymentAppSourceType = getRelatedOne(EmploymentAppSourceType.class, "ParentEmploymentAppSourceType");
        }
        return this.parentEmploymentAppSourceType;
    }
    /**
     * Auto generated method that gets the related <code>EmploymentApp</code> by the relation named <code>EmploymentApp</code>.
     * @return the list of <code>EmploymentApp</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmploymentApp> getEmploymentApps() throws RepositoryException {
        if (this.employmentApps == null) {
            this.employmentApps = getRelated(EmploymentApp.class, "EmploymentApp");
        }
        return this.employmentApps;
    }
    /**
     * Auto generated method that gets the related <code>EmploymentAppSourceType</code> by the relation named <code>ChildEmploymentAppSourceType</code>.
     * @return the list of <code>EmploymentAppSourceType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmploymentAppSourceType> getChildEmploymentAppSourceTypes() throws RepositoryException {
        if (this.childEmploymentAppSourceTypes == null) {
            this.childEmploymentAppSourceTypes = getRelated(EmploymentAppSourceType.class, "ChildEmploymentAppSourceType");
        }
        return this.childEmploymentAppSourceTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentEmploymentAppSourceType the parentEmploymentAppSourceType to set
    */
    public void setParentEmploymentAppSourceType(EmploymentAppSourceType parentEmploymentAppSourceType) {
        this.parentEmploymentAppSourceType = parentEmploymentAppSourceType;
    }
    /**
     * Auto generated value setter.
     * @param employmentApps the employmentApps to set
    */
    public void setEmploymentApps(List<EmploymentApp> employmentApps) {
        this.employmentApps = employmentApps;
    }
    /**
     * Auto generated value setter.
     * @param childEmploymentAppSourceTypes the childEmploymentAppSourceTypes to set
    */
    public void setChildEmploymentAppSourceTypes(List<EmploymentAppSourceType> childEmploymentAppSourceTypes) {
        this.childEmploymentAppSourceTypes = childEmploymentAppSourceTypes;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEmploymentAppSourceTypeId((String) mapValue.get("employmentAppSourceTypeId"));
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
        mapValue.put("employmentAppSourceTypeId", getEmploymentAppSourceTypeId());
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
