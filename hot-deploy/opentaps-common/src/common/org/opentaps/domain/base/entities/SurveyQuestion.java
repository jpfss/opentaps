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
 * Auto generated base entity SurveyQuestion.
 */
@javax.persistence.Entity
@Table(name="SURVEY_QUESTION")
public class SurveyQuestion extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("surveyQuestionId", "SURVEY_QUESTION_ID");
        fields.put("surveyQuestionCategoryId", "SURVEY_QUESTION_CATEGORY_ID");
        fields.put("surveyQuestionTypeId", "SURVEY_QUESTION_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("question", "QUESTION");
        fields.put("hint", "HINT");
        fields.put("enumTypeId", "ENUM_TYPE_ID");
        fields.put("geoId", "GEO_ID");
        fields.put("formatString", "FORMAT_STRING");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SurveyQuestion", fields);
}
  public static enum Fields implements EntityFieldInterface<SurveyQuestion> {
    surveyQuestionId("surveyQuestionId"),
    surveyQuestionCategoryId("surveyQuestionCategoryId"),
    surveyQuestionTypeId("surveyQuestionTypeId"),
    description("description"),
    question("question"),
    hint("hint"),
    enumTypeId("enumTypeId"),
    geoId("geoId"),
    formatString("formatString"),
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

   @org.hibernate.annotations.GenericGenerator(name="SurveyQuestion_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SurveyQuestion_GEN")
   @Id
   @Column(name="SURVEY_QUESTION_ID")
   private String surveyQuestionId;
   @Column(name="SURVEY_QUESTION_CATEGORY_ID")
   private String surveyQuestionCategoryId;
   @Column(name="SURVEY_QUESTION_TYPE_ID")
   private String surveyQuestionTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="QUESTION")
   private String question;
   @Column(name="HINT")
   private String hint;
   @Column(name="ENUM_TYPE_ID")
   private String enumTypeId;
   @Column(name="GEO_ID")
   private String geoId;
   @Column(name="FORMAT_STRING")
   private String formatString;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_QUESTION_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyQuestionType surveyQuestionType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_QUESTION_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyQuestionCategory surveyQuestionCategory = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo geo = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ENUM_TYPE_ID")
   
   private List<Enumeration> enumerations = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="surveyQuestion", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SURVEY_QUESTION_ID")
   
   private List<SurveyQuestionAppl> surveyQuestionAppls = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="surveyQuestion", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SURVEY_QUESTION_ID")
   
   private List<SurveyQuestionOption> surveyQuestionOptions = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="surveyQuestion", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SURVEY_QUESTION_ID")
   
   private List<SurveyResponseAnswer> surveyResponseAnswers = null;

  /**
   * Default constructor.
   */
  public SurveyQuestion() {
      super();
      this.baseEntityName = "SurveyQuestion";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("surveyQuestionId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("surveyQuestionId");this.allFieldsNames.add("surveyQuestionCategoryId");this.allFieldsNames.add("surveyQuestionTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("question");this.allFieldsNames.add("hint");this.allFieldsNames.add("enumTypeId");this.allFieldsNames.add("geoId");this.allFieldsNames.add("formatString");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SurveyQuestion(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param surveyQuestionId the surveyQuestionId to set
     */
    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionCategoryId the surveyQuestionCategoryId to set
     */
    public void setSurveyQuestionCategoryId(String surveyQuestionCategoryId) {
        this.surveyQuestionCategoryId = surveyQuestionCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionTypeId the surveyQuestionTypeId to set
     */
    public void setSurveyQuestionTypeId(String surveyQuestionTypeId) {
        this.surveyQuestionTypeId = surveyQuestionTypeId;
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
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    /**
     * Auto generated value setter.
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }
    /**
     * Auto generated value setter.
     * @param enumTypeId the enumTypeId to set
     */
    public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }
    /**
     * Auto generated value setter.
     * @param geoId the geoId to set
     */
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
    /**
     * Auto generated value setter.
     * @param formatString the formatString to set
     */
    public void setFormatString(String formatString) {
        this.formatString = formatString;
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
    public String getSurveyQuestionId() {
        return this.surveyQuestionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyQuestionCategoryId() {
        return this.surveyQuestionCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyQuestionTypeId() {
        return this.surveyQuestionTypeId;
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
    public String getQuestion() {
        return this.question;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHint() {
        return this.hint;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnumTypeId() {
        return this.enumTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoId() {
        return this.geoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFormatString() {
        return this.formatString;
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
     * Auto generated method that gets the related <code>SurveyQuestionType</code> by the relation named <code>SurveyQuestionType</code>.
     * @return the <code>SurveyQuestionType</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestionType getSurveyQuestionType() throws RepositoryException {
        if (this.surveyQuestionType == null) {
            this.surveyQuestionType = getRelatedOne(SurveyQuestionType.class, "SurveyQuestionType");
        }
        return this.surveyQuestionType;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionCategory</code> by the relation named <code>SurveyQuestionCategory</code>.
     * @return the <code>SurveyQuestionCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestionCategory getSurveyQuestionCategory() throws RepositoryException {
        if (this.surveyQuestionCategory == null) {
            this.surveyQuestionCategory = getRelatedOne(SurveyQuestionCategory.class, "SurveyQuestionCategory");
        }
        return this.surveyQuestionCategory;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>Geo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getGeo() throws RepositoryException {
        if (this.geo == null) {
            this.geo = getRelatedOne(Geo.class, "Geo");
        }
        return this.geo;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the list of <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Enumeration> getEnumerations() throws RepositoryException {
        if (this.enumerations == null) {
            this.enumerations = getRelated(Enumeration.class, "Enumeration");
        }
        return this.enumerations;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionAppl</code> by the relation named <code>SurveyQuestionAppl</code>.
     * @return the list of <code>SurveyQuestionAppl</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SurveyQuestionAppl> getSurveyQuestionAppls() throws RepositoryException {
        if (this.surveyQuestionAppls == null) {
            this.surveyQuestionAppls = getRelated(SurveyQuestionAppl.class, "SurveyQuestionAppl");
        }
        return this.surveyQuestionAppls;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionOption</code> by the relation named <code>SurveyQuestionOption</code>.
     * @return the list of <code>SurveyQuestionOption</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SurveyQuestionOption> getSurveyQuestionOptions() throws RepositoryException {
        if (this.surveyQuestionOptions == null) {
            this.surveyQuestionOptions = getRelated(SurveyQuestionOption.class, "SurveyQuestionOption");
        }
        return this.surveyQuestionOptions;
    }
    /**
     * Auto generated method that gets the related <code>SurveyResponseAnswer</code> by the relation named <code>SurveyResponseAnswer</code>.
     * @return the list of <code>SurveyResponseAnswer</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SurveyResponseAnswer> getSurveyResponseAnswers() throws RepositoryException {
        if (this.surveyResponseAnswers == null) {
            this.surveyResponseAnswers = getRelated(SurveyResponseAnswer.class, "SurveyResponseAnswer");
        }
        return this.surveyResponseAnswers;
    }

    /**
     * Auto generated value setter.
     * @param surveyQuestionType the surveyQuestionType to set
    */
    public void setSurveyQuestionType(SurveyQuestionType surveyQuestionType) {
        this.surveyQuestionType = surveyQuestionType;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionCategory the surveyQuestionCategory to set
    */
    public void setSurveyQuestionCategory(SurveyQuestionCategory surveyQuestionCategory) {
        this.surveyQuestionCategory = surveyQuestionCategory;
    }
    /**
     * Auto generated value setter.
     * @param geo the geo to set
    */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }
    /**
     * Auto generated value setter.
     * @param enumerations the enumerations to set
    */
    public void setEnumerations(List<Enumeration> enumerations) {
        this.enumerations = enumerations;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionAppls the surveyQuestionAppls to set
    */
    public void setSurveyQuestionAppls(List<SurveyQuestionAppl> surveyQuestionAppls) {
        this.surveyQuestionAppls = surveyQuestionAppls;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionOptions the surveyQuestionOptions to set
    */
    public void setSurveyQuestionOptions(List<SurveyQuestionOption> surveyQuestionOptions) {
        this.surveyQuestionOptions = surveyQuestionOptions;
    }
    /**
     * Auto generated value setter.
     * @param surveyResponseAnswers the surveyResponseAnswers to set
    */
    public void setSurveyResponseAnswers(List<SurveyResponseAnswer> surveyResponseAnswers) {
        this.surveyResponseAnswers = surveyResponseAnswers;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addSurveyQuestionAppl(SurveyQuestionAppl surveyQuestionAppl) {
        if (this.surveyQuestionAppls == null) {
            this.surveyQuestionAppls = new ArrayList<SurveyQuestionAppl>();
        }
        this.surveyQuestionAppls.add(surveyQuestionAppl);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSurveyQuestionAppl(SurveyQuestionAppl surveyQuestionAppl) {
        if (this.surveyQuestionAppls == null) {
            return;
        }
        this.surveyQuestionAppls.remove(surveyQuestionAppl);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSurveyQuestionAppl() {
        if (this.surveyQuestionAppls == null) {
            return;
        }
        this.surveyQuestionAppls.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addSurveyQuestionOption(SurveyQuestionOption surveyQuestionOption) {
        if (this.surveyQuestionOptions == null) {
            this.surveyQuestionOptions = new ArrayList<SurveyQuestionOption>();
        }
        this.surveyQuestionOptions.add(surveyQuestionOption);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSurveyQuestionOption(SurveyQuestionOption surveyQuestionOption) {
        if (this.surveyQuestionOptions == null) {
            return;
        }
        this.surveyQuestionOptions.remove(surveyQuestionOption);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSurveyQuestionOption() {
        if (this.surveyQuestionOptions == null) {
            return;
        }
        this.surveyQuestionOptions.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addSurveyResponseAnswer(SurveyResponseAnswer surveyResponseAnswer) {
        if (this.surveyResponseAnswers == null) {
            this.surveyResponseAnswers = new ArrayList<SurveyResponseAnswer>();
        }
        this.surveyResponseAnswers.add(surveyResponseAnswer);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSurveyResponseAnswer(SurveyResponseAnswer surveyResponseAnswer) {
        if (this.surveyResponseAnswers == null) {
            return;
        }
        this.surveyResponseAnswers.remove(surveyResponseAnswer);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSurveyResponseAnswer() {
        if (this.surveyResponseAnswers == null) {
            return;
        }
        this.surveyResponseAnswers.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSurveyQuestionId((String) mapValue.get("surveyQuestionId"));
        setSurveyQuestionCategoryId((String) mapValue.get("surveyQuestionCategoryId"));
        setSurveyQuestionTypeId((String) mapValue.get("surveyQuestionTypeId"));
        setDescription((String) mapValue.get("description"));
        setQuestion((String) mapValue.get("question"));
        setHint((String) mapValue.get("hint"));
        setEnumTypeId((String) mapValue.get("enumTypeId"));
        setGeoId((String) mapValue.get("geoId"));
        setFormatString((String) mapValue.get("formatString"));
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
        mapValue.put("surveyQuestionId", getSurveyQuestionId());
        mapValue.put("surveyQuestionCategoryId", getSurveyQuestionCategoryId());
        mapValue.put("surveyQuestionTypeId", getSurveyQuestionTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("question", getQuestion());
        mapValue.put("hint", getHint());
        mapValue.put("enumTypeId", getEnumTypeId());
        mapValue.put("geoId", getGeoId());
        mapValue.put("formatString", getFormatString());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
