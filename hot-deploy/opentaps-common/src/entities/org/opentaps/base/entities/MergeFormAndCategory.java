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
 * Auto generated base entity MergeFormAndCategory.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectMergeFormAndCategorys", query="SELECT MF.MERGE_FORM_ID AS \"mergeFormId\",MF.PARTY_ID AS \"partyId\",MF.MERGE_FORM_NAME AS \"mergeFormName\",MF.SUBJECT AS \"subject\",MF.DESCRIPTION AS \"description\",MF.MERGE_FORM_TEXT AS \"mergeFormText\",MF.SHOW_IN_SELECT AS \"showInSelect\",MFC.MERGE_FORM_CATEGORY_ID AS \"mergeFormCategoryId\",MFC.MERGE_FORM_CATEGORY_NAME AS \"mergeFormCategoryName\" FROM MERGE_FORM_TO_CATEGORY MFTC LEFT JOIN MERGE_FORM MF ON MF.MERGE_FORM_ID = MFTC.MERGE_FORM_ID LEFT JOIN MERGE_FORM_CATEGORY MFC ON MFTC.MERGE_FORM_CATEGORY_ID = MFC.MERGE_FORM_CATEGORY_ID", resultSetMapping="MergeFormAndCategoryMapping")
@SqlResultSetMapping(name="MergeFormAndCategoryMapping", entities={
@EntityResult(entityClass=MergeFormAndCategory.class, fields = {
@FieldResult(name="mergeFormId", column="mergeFormId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="mergeFormName", column="mergeFormName")
,@FieldResult(name="subject", column="subject")
,@FieldResult(name="description", column="description")
,@FieldResult(name="mergeFormText", column="mergeFormText")
,@FieldResult(name="showInSelect", column="showInSelect")
,@FieldResult(name="mergeFormCategoryId", column="mergeFormCategoryId")
,@FieldResult(name="mergeFormCategoryName", column="mergeFormCategoryName")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class MergeFormAndCategory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("mergeFormId", "MF.MERGE_FORM_ID");
        fields.put("partyId", "MF.PARTY_ID");
        fields.put("mergeFormName", "MF.MERGE_FORM_NAME");
        fields.put("subject", "MF.SUBJECT");
        fields.put("description", "MF.DESCRIPTION");
        fields.put("mergeFormText", "MF.MERGE_FORM_TEXT");
        fields.put("showInSelect", "MF.SHOW_IN_SELECT");
        fields.put("mergeFormCategoryId", "MFC.MERGE_FORM_CATEGORY_ID");
        fields.put("mergeFormCategoryName", "MFC.MERGE_FORM_CATEGORY_NAME");
fieldMapColumns.put("MergeFormAndCategory", fields);
}
  public static enum Fields implements EntityFieldInterface<MergeFormAndCategory> {
    mergeFormId("mergeFormId"),
    partyId("partyId"),
    mergeFormName("mergeFormName"),
    subject("subject"),
    description("description"),
    mergeFormText("mergeFormText"),
    showInSelect("showInSelect"),
    mergeFormCategoryId("mergeFormCategoryId"),
    mergeFormCategoryName("mergeFormCategoryName");
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
   private String mergeFormId;
    
   private String partyId;
    
   private String mergeFormName;
    
   private String subject;
    
   private String description;
    
   private String mergeFormText;
    
   private String showInSelect;
    
   private String mergeFormCategoryId;
    
   private String mergeFormCategoryName;

  /**
   * Default constructor.
   */
  public MergeFormAndCategory() {
      super();
      this.baseEntityName = "MergeFormAndCategory";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("mergeFormId");this.primaryKeyNames.add("mergeFormCategoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("mergeFormId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("mergeFormName");this.allFieldsNames.add("subject");this.allFieldsNames.add("description");this.allFieldsNames.add("mergeFormText");this.allFieldsNames.add("showInSelect");this.allFieldsNames.add("mergeFormCategoryId");this.allFieldsNames.add("mergeFormCategoryName");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public MergeFormAndCategory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param mergeFormId the mergeFormId to set
     */
    public void setMergeFormId(String mergeFormId) {
        this.mergeFormId = mergeFormId;
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
     * @param mergeFormName the mergeFormName to set
     */
    public void setMergeFormName(String mergeFormName) {
        this.mergeFormName = mergeFormName;
    }
    /**
     * Auto generated value setter.
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
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
     * @param mergeFormText the mergeFormText to set
     */
    public void setMergeFormText(String mergeFormText) {
        this.mergeFormText = mergeFormText;
    }
    /**
     * Auto generated value setter.
     * @param showInSelect the showInSelect to set
     */
    public void setShowInSelect(String showInSelect) {
        this.showInSelect = showInSelect;
    }
    /**
     * Auto generated value setter.
     * @param mergeFormCategoryId the mergeFormCategoryId to set
     */
    public void setMergeFormCategoryId(String mergeFormCategoryId) {
        this.mergeFormCategoryId = mergeFormCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param mergeFormCategoryName the mergeFormCategoryName to set
     */
    public void setMergeFormCategoryName(String mergeFormCategoryName) {
        this.mergeFormCategoryName = mergeFormCategoryName;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMergeFormId() {
        return this.mergeFormId;
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
    public String getMergeFormName() {
        return this.mergeFormName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSubject() {
        return this.subject;
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
    public String getMergeFormText() {
        return this.mergeFormText;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShowInSelect() {
        return this.showInSelect;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMergeFormCategoryId() {
        return this.mergeFormCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMergeFormCategoryName() {
        return this.mergeFormCategoryName;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setMergeFormId((String) mapValue.get("mergeFormId"));
        setPartyId((String) mapValue.get("partyId"));
        setMergeFormName((String) mapValue.get("mergeFormName"));
        setSubject((String) mapValue.get("subject"));
        setDescription((String) mapValue.get("description"));
        setMergeFormText((String) mapValue.get("mergeFormText"));
        setShowInSelect((String) mapValue.get("showInSelect"));
        setMergeFormCategoryId((String) mapValue.get("mergeFormCategoryId"));
        setMergeFormCategoryName((String) mapValue.get("mergeFormCategoryName"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("mergeFormId", getMergeFormId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("mergeFormName", getMergeFormName());
        mapValue.put("subject", getSubject());
        mapValue.put("description", getDescription());
        mapValue.put("mergeFormText", getMergeFormText());
        mapValue.put("showInSelect", getShowInSelect());
        mapValue.put("mergeFormCategoryId", getMergeFormCategoryId());
        mapValue.put("mergeFormCategoryName", getMergeFormCategoryName());
        return mapValue;
    }


}
