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
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity SurveyQuestionOption.
 */
@javax.persistence.Entity
@Table(name="SURVEY_QUESTION_OPTION")
public class SurveyQuestionOption extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("surveyQuestionId", "SURVEY_QUESTION_ID");
        fields.put("surveyOptionSeqId", "SURVEY_OPTION_SEQ_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("amountBase", "AMOUNT_BASE");
        fields.put("amountBaseUomId", "AMOUNT_BASE_UOM_ID");
        fields.put("weightFactor", "WEIGHT_FACTOR");
        fields.put("duration", "DURATION");
        fields.put("durationUomId", "DURATION_UOM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SurveyQuestionOption", fields);
}
  public static enum Fields implements EntityFieldInterface<SurveyQuestionOption> {
    surveyQuestionId("surveyQuestionId"),
    surveyOptionSeqId("surveyOptionSeqId"),
    description("description"),
    sequenceNum("sequenceNum"),
    amountBase("amountBase"),
    amountBaseUomId("amountBaseUomId"),
    weightFactor("weightFactor"),
    duration("duration"),
    durationUomId("durationUomId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.SurveyQuestionOptionPkBridge.class)
     private SurveyQuestionOptionPk id = new SurveyQuestionOptionPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>SurveyQuestionOptionPk</code>
     */
      public SurveyQuestionOptionPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>SurveyQuestionOptionPk</code> value to set
    */   
      public void setId(SurveyQuestionOptionPk id) {
         this.id = id;
      }
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="AMOUNT_BASE")
   private BigDecimal amountBase;
   @Column(name="AMOUNT_BASE_UOM_ID")
   private String amountBaseUomId;
   @Column(name="WEIGHT_FACTOR")
   private BigDecimal weightFactor;
   @Column(name="DURATION")
   private Long duration;
   @Column(name="DURATION_UOM_ID")
   private String durationUomId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_QUESTION_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyQuestion surveyQuestion = null;
   private transient List<SurveyQuestionAppl> withSurveyQuestionAppls = null;
   private transient List<SurveyResponseAnswer> surveyResponseAnswers = null;

  /**
   * Default constructor.
   */
  public SurveyQuestionOption() {
      super();
      this.baseEntityName = "SurveyQuestionOption";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("surveyQuestionId");this.primaryKeyNames.add("surveyOptionSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("surveyQuestionId");this.allFieldsNames.add("surveyOptionSeqId");this.allFieldsNames.add("description");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("amountBase");this.allFieldsNames.add("amountBaseUomId");this.allFieldsNames.add("weightFactor");this.allFieldsNames.add("duration");this.allFieldsNames.add("durationUomId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SurveyQuestionOption(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param surveyQuestionId the surveyQuestionId to set
     */
    public void setSurveyQuestionId(String surveyQuestionId) {
        id.setSurveyQuestionId(surveyQuestionId);
    }
    /**
     * Auto generated value setter.
     * @param surveyOptionSeqId the surveyOptionSeqId to set
     */
    public void setSurveyOptionSeqId(String surveyOptionSeqId) {
        id.setSurveyOptionSeqId(surveyOptionSeqId);
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param amountBase the amountBase to set
     */
    public void setAmountBase(BigDecimal amountBase) {
        this.amountBase = amountBase;
    }
    /**
     * Auto generated value setter.
     * @param amountBaseUomId the amountBaseUomId to set
     */
    public void setAmountBaseUomId(String amountBaseUomId) {
        this.amountBaseUomId = amountBaseUomId;
    }
    /**
     * Auto generated value setter.
     * @param weightFactor the weightFactor to set
     */
    public void setWeightFactor(BigDecimal weightFactor) {
        this.weightFactor = weightFactor;
    }
    /**
     * Auto generated value setter.
     * @param duration the duration to set
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    /**
     * Auto generated value setter.
     * @param durationUomId the durationUomId to set
     */
    public void setDurationUomId(String durationUomId) {
        this.durationUomId = durationUomId;
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
        return this.id.getSurveyQuestionId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyOptionSeqId() {
        return this.id.getSurveyOptionSeqId();
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmountBase() {
        return this.amountBase;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAmountBaseUomId() {
        return this.amountBaseUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getWeightFactor() {
        return this.weightFactor;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getDuration() {
        return this.duration;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDurationUomId() {
        return this.durationUomId;
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
     * Auto generated method that gets the related <code>SurveyQuestion</code> by the relation named <code>SurveyQuestion</code>.
     * @return the <code>SurveyQuestion</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestion getSurveyQuestion() throws RepositoryException {
        if (this.surveyQuestion == null) {
            this.surveyQuestion = getRelatedOne(SurveyQuestion.class, "SurveyQuestion");
        }
        return this.surveyQuestion;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionAppl</code> by the relation named <code>WithSurveyQuestionAppl</code>.
     * @return the list of <code>SurveyQuestionAppl</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SurveyQuestionAppl> getWithSurveyQuestionAppls() throws RepositoryException {
        if (this.withSurveyQuestionAppls == null) {
            this.withSurveyQuestionAppls = getRelated(SurveyQuestionAppl.class, "WithSurveyQuestionAppl");
        }
        return this.withSurveyQuestionAppls;
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
     * @param surveyQuestion the surveyQuestion to set
    */
    public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }
    /**
     * Auto generated value setter.
     * @param withSurveyQuestionAppls the withSurveyQuestionAppls to set
    */
    public void setWithSurveyQuestionAppls(List<SurveyQuestionAppl> withSurveyQuestionAppls) {
        this.withSurveyQuestionAppls = withSurveyQuestionAppls;
    }
    /**
     * Auto generated value setter.
     * @param surveyResponseAnswers the surveyResponseAnswers to set
    */
    public void setSurveyResponseAnswers(List<SurveyResponseAnswer> surveyResponseAnswers) {
        this.surveyResponseAnswers = surveyResponseAnswers;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSurveyQuestionId((String) mapValue.get("surveyQuestionId"));
        setSurveyOptionSeqId((String) mapValue.get("surveyOptionSeqId"));
        setDescription((String) mapValue.get("description"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setAmountBase(convertToBigDecimal(mapValue.get("amountBase")));
        setAmountBaseUomId((String) mapValue.get("amountBaseUomId"));
        setWeightFactor(convertToBigDecimal(mapValue.get("weightFactor")));
        setDuration((Long) mapValue.get("duration"));
        setDurationUomId((String) mapValue.get("durationUomId"));
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
        mapValue.put("surveyOptionSeqId", getSurveyOptionSeqId());
        mapValue.put("description", getDescription());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("amountBase", getAmountBase());
        mapValue.put("amountBaseUomId", getAmountBaseUomId());
        mapValue.put("weightFactor", getWeightFactor());
        mapValue.put("duration", getDuration());
        mapValue.put("durationUomId", getDurationUomId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
