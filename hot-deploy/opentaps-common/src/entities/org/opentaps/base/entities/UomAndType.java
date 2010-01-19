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

/**
 * Auto generated base entity UomAndType.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectUomAndTypes", query="SELECT UOM.UOM_ID AS \"uomId\",UOM.UOM_TYPE_ID AS \"uomTypeId\",UOM.ABBREVIATION AS \"abbreviation\",UOM.DESCRIPTION AS \"description\",UOMTP.UOM_TYPE_ID AS \"uomTypeId\",UOMTP.PARENT_TYPE_ID AS \"parentTypeId\",UOMTP.HAS_TABLE AS \"hasTable\",UOMTP.DESCRIPTION AS \"description\" FROM UOM UOM INNER JOIN UOM_TYPE UOMTP ON UOM.UOM_TYPE_ID = UOMTP.UOM_TYPE_ID", resultSetMapping="UomAndTypeMapping")
@SqlResultSetMapping(name="UomAndTypeMapping", entities={
@EntityResult(entityClass=UomAndType.class, fields = {
@FieldResult(name="uomId", column="uomId")
,@FieldResult(name="uomTypeId", column="uomTypeId")
,@FieldResult(name="abbreviation", column="abbreviation")
,@FieldResult(name="description", column="description")
,@FieldResult(name="typeUomTypeId", column="typeUomTypeId")
,@FieldResult(name="typeParentTypeId", column="typeParentTypeId")
,@FieldResult(name="typeHasTable", column="typeHasTable")
,@FieldResult(name="typeDescription", column="typeDescription")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class UomAndType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("uomId", "UOM.UOM_ID");
        fields.put("uomTypeId", "UOM.UOM_TYPE_ID");
        fields.put("abbreviation", "UOM.ABBREVIATION");
        fields.put("description", "UOM.DESCRIPTION");
        fields.put("typeUomTypeId", "UOMTP.UOM_TYPE_ID");
        fields.put("typeParentTypeId", "UOMTP.PARENT_TYPE_ID");
        fields.put("typeHasTable", "UOMTP.HAS_TABLE");
        fields.put("typeDescription", "UOMTP.DESCRIPTION");
fieldMapColumns.put("UomAndType", fields);
}
  public static enum Fields implements EntityFieldInterface<UomAndType> {
    uomId("uomId"),
    uomTypeId("uomTypeId"),
    abbreviation("abbreviation"),
    description("description"),
    typeUomTypeId("typeUomTypeId"),
    typeParentTypeId("typeParentTypeId"),
    typeHasTable("typeHasTable"),
    typeDescription("typeDescription");
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
   private String uomId;
    
   private String uomTypeId;
    
   private String abbreviation;
    
   private String description;
    
   private String typeUomTypeId;
    
   private String typeParentTypeId;
    
   private String typeHasTable;
    
   private String typeDescription;

  /**
   * Default constructor.
   */
  public UomAndType() {
      super();
      this.baseEntityName = "UomAndType";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("uomId");this.primaryKeyNames.add("typeUomTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("uomId");this.allFieldsNames.add("uomTypeId");this.allFieldsNames.add("abbreviation");this.allFieldsNames.add("description");this.allFieldsNames.add("typeUomTypeId");this.allFieldsNames.add("typeParentTypeId");this.allFieldsNames.add("typeHasTable");this.allFieldsNames.add("typeDescription");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UomAndType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        this.uomId = uomId;
    }
    /**
     * Auto generated value setter.
     * @param uomTypeId the uomTypeId to set
     */
    public void setUomTypeId(String uomTypeId) {
        this.uomTypeId = uomTypeId;
    }
    /**
     * Auto generated value setter.
     * @param abbreviation the abbreviation to set
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
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
     * @param typeUomTypeId the typeUomTypeId to set
     */
    public void setTypeUomTypeId(String typeUomTypeId) {
        this.typeUomTypeId = typeUomTypeId;
    }
    /**
     * Auto generated value setter.
     * @param typeParentTypeId the typeParentTypeId to set
     */
    public void setTypeParentTypeId(String typeParentTypeId) {
        this.typeParentTypeId = typeParentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param typeHasTable the typeHasTable to set
     */
    public void setTypeHasTable(String typeHasTable) {
        this.typeHasTable = typeHasTable;
    }
    /**
     * Auto generated value setter.
     * @param typeDescription the typeDescription to set
     */
    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUomId() {
        return this.uomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUomTypeId() {
        return this.uomTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAbbreviation() {
        return this.abbreviation;
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
    public String getTypeUomTypeId() {
        return this.typeUomTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTypeParentTypeId() {
        return this.typeParentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTypeHasTable() {
        return this.typeHasTable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTypeDescription() {
        return this.typeDescription;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUomId((String) mapValue.get("uomId"));
        setUomTypeId((String) mapValue.get("uomTypeId"));
        setAbbreviation((String) mapValue.get("abbreviation"));
        setDescription((String) mapValue.get("description"));
        setTypeUomTypeId((String) mapValue.get("typeUomTypeId"));
        setTypeParentTypeId((String) mapValue.get("typeParentTypeId"));
        setTypeHasTable((String) mapValue.get("typeHasTable"));
        setTypeDescription((String) mapValue.get("typeDescription"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("uomId", getUomId());
        mapValue.put("uomTypeId", getUomTypeId());
        mapValue.put("abbreviation", getAbbreviation());
        mapValue.put("description", getDescription());
        mapValue.put("typeUomTypeId", getTypeUomTypeId());
        mapValue.put("typeParentTypeId", getTypeParentTypeId());
        mapValue.put("typeHasTable", getTypeHasTable());
        mapValue.put("typeDescription", getTypeDescription());
        return mapValue;
    }


}
