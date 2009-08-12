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
 * Auto generated base entity SkillType.
 */
@javax.persistence.Entity
@Table(name="SKILL_TYPE")
public class SkillType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("skillTypeId", "SKILL_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SkillType", fields);
}
  public static enum Fields implements EntityFieldInterface<SkillType> {
    skillTypeId("skillTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="SkillType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SkillType_GEN")
   @Id
   @Column(name="SKILL_TYPE_ID")
   private String skillTypeId;
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
   
   private SkillType parentSkillType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="skillType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SKILL_TYPE_ID")
   
   private List<PartySkill> partySkills = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SKILL_TYPE_ID")
   
   private List<QuoteItem> quoteItems = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<SkillType> childSkillTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="skillType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SKILL_TYPE_ID")
   
   private List<WorkEffortSkillStandard> workEffortSkillStandards = null;

  /**
   * Default constructor.
   */
  public SkillType() {
      super();
      this.baseEntityName = "SkillType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("skillTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("skillTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SkillType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param skillTypeId the skillTypeId to set
     */
    public void setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId;
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
    public String getSkillTypeId() {
        return this.skillTypeId;
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
     * Auto generated method that gets the related <code>SkillType</code> by the relation named <code>ParentSkillType</code>.
     * @return the <code>SkillType</code>
     * @throws RepositoryException if an error occurs
     */
    public SkillType getParentSkillType() throws RepositoryException {
        if (this.parentSkillType == null) {
            this.parentSkillType = getRelatedOne(SkillType.class, "ParentSkillType");
        }
        return this.parentSkillType;
    }
    /**
     * Auto generated method that gets the related <code>PartySkill</code> by the relation named <code>PartySkill</code>.
     * @return the list of <code>PartySkill</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartySkill> getPartySkills() throws RepositoryException {
        if (this.partySkills == null) {
            this.partySkills = getRelated(PartySkill.class, "PartySkill");
        }
        return this.partySkills;
    }
    /**
     * Auto generated method that gets the related <code>QuoteItem</code> by the relation named <code>QuoteItem</code>.
     * @return the list of <code>QuoteItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends QuoteItem> getQuoteItems() throws RepositoryException {
        if (this.quoteItems == null) {
            this.quoteItems = getRelated(QuoteItem.class, "QuoteItem");
        }
        return this.quoteItems;
    }
    /**
     * Auto generated method that gets the related <code>SkillType</code> by the relation named <code>ChildSkillType</code>.
     * @return the list of <code>SkillType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SkillType> getChildSkillTypes() throws RepositoryException {
        if (this.childSkillTypes == null) {
            this.childSkillTypes = getRelated(SkillType.class, "ChildSkillType");
        }
        return this.childSkillTypes;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortSkillStandard</code> by the relation named <code>WorkEffortSkillStandard</code>.
     * @return the list of <code>WorkEffortSkillStandard</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortSkillStandard> getWorkEffortSkillStandards() throws RepositoryException {
        if (this.workEffortSkillStandards == null) {
            this.workEffortSkillStandards = getRelated(WorkEffortSkillStandard.class, "WorkEffortSkillStandard");
        }
        return this.workEffortSkillStandards;
    }

    /**
     * Auto generated value setter.
     * @param parentSkillType the parentSkillType to set
    */
    public void setParentSkillType(SkillType parentSkillType) {
        this.parentSkillType = parentSkillType;
    }
    /**
     * Auto generated value setter.
     * @param partySkills the partySkills to set
    */
    public void setPartySkills(List<PartySkill> partySkills) {
        this.partySkills = partySkills;
    }
    /**
     * Auto generated value setter.
     * @param quoteItems the quoteItems to set
    */
    public void setQuoteItems(List<QuoteItem> quoteItems) {
        this.quoteItems = quoteItems;
    }
    /**
     * Auto generated value setter.
     * @param childSkillTypes the childSkillTypes to set
    */
    public void setChildSkillTypes(List<SkillType> childSkillTypes) {
        this.childSkillTypes = childSkillTypes;
    }
    /**
     * Auto generated value setter.
     * @param workEffortSkillStandards the workEffortSkillStandards to set
    */
    public void setWorkEffortSkillStandards(List<WorkEffortSkillStandard> workEffortSkillStandards) {
        this.workEffortSkillStandards = workEffortSkillStandards;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPartySkill(PartySkill partySkill) {
        if (this.partySkills == null) {
            this.partySkills = new ArrayList<PartySkill>();
        }
        this.partySkills.add(partySkill);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartySkill(PartySkill partySkill) {
        if (this.partySkills == null) {
            return;
        }
        this.partySkills.remove(partySkill);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartySkill() {
        if (this.partySkills == null) {
            return;
        }
        this.partySkills.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortSkillStandard(WorkEffortSkillStandard workEffortSkillStandard) {
        if (this.workEffortSkillStandards == null) {
            this.workEffortSkillStandards = new ArrayList<WorkEffortSkillStandard>();
        }
        this.workEffortSkillStandards.add(workEffortSkillStandard);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortSkillStandard(WorkEffortSkillStandard workEffortSkillStandard) {
        if (this.workEffortSkillStandards == null) {
            return;
        }
        this.workEffortSkillStandards.remove(workEffortSkillStandard);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortSkillStandard() {
        if (this.workEffortSkillStandards == null) {
            return;
        }
        this.workEffortSkillStandards.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSkillTypeId((String) mapValue.get("skillTypeId"));
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
        mapValue.put("skillTypeId", getSkillTypeId());
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
