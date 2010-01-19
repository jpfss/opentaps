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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity BenefitType.
 */
@javax.persistence.Entity
@Table(name="BENEFIT_TYPE")
public class BenefitType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("benefitTypeId", "BENEFIT_TYPE_ID");
        fields.put("benefitName", "BENEFIT_NAME");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("employerPaidPercentage", "EMPLOYER_PAID_PERCENTAGE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("BenefitType", fields);
}
  public static enum Fields implements EntityFieldInterface<BenefitType> {
    benefitTypeId("benefitTypeId"),
    benefitName("benefitName"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
    employerPaidPercentage("employerPaidPercentage"),
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

   @org.hibernate.annotations.GenericGenerator(name="BenefitType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="BenefitType_GEN")
   @Id
   @Column(name="BENEFIT_TYPE_ID")
   private String benefitTypeId;
   @Column(name="BENEFIT_NAME")
   private String benefitName;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="EMPLOYER_PAID_PERCENTAGE")
   private BigDecimal employerPaidPercentage;
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
   
   private BenefitType parentBenefitType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<BenefitType> childBenefitTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="benefitType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BENEFIT_TYPE_ID")
   
   private List<PartyBenefit> partyBenefits = null;

  /**
   * Default constructor.
   */
  public BenefitType() {
      super();
      this.baseEntityName = "BenefitType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("benefitTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("benefitTypeId");this.allFieldsNames.add("benefitName");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("employerPaidPercentage");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BenefitType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param benefitTypeId the benefitTypeId to set
     */
    public void setBenefitTypeId(String benefitTypeId) {
        this.benefitTypeId = benefitTypeId;
    }
    /**
     * Auto generated value setter.
     * @param benefitName the benefitName to set
     */
    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
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
     * @param employerPaidPercentage the employerPaidPercentage to set
     */
    public void setEmployerPaidPercentage(BigDecimal employerPaidPercentage) {
        this.employerPaidPercentage = employerPaidPercentage;
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
    public String getBenefitTypeId() {
        return this.benefitTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBenefitName() {
        return this.benefitName;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEmployerPaidPercentage() {
        return this.employerPaidPercentage;
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
     * Auto generated method that gets the related <code>BenefitType</code> by the relation named <code>ParentBenefitType</code>.
     * @return the <code>BenefitType</code>
     * @throws RepositoryException if an error occurs
     */
    public BenefitType getParentBenefitType() throws RepositoryException {
        if (this.parentBenefitType == null) {
            this.parentBenefitType = getRelatedOne(BenefitType.class, "ParentBenefitType");
        }
        return this.parentBenefitType;
    }
    /**
     * Auto generated method that gets the related <code>BenefitType</code> by the relation named <code>ChildBenefitType</code>.
     * @return the list of <code>BenefitType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BenefitType> getChildBenefitTypes() throws RepositoryException {
        if (this.childBenefitTypes == null) {
            this.childBenefitTypes = getRelated(BenefitType.class, "ChildBenefitType");
        }
        return this.childBenefitTypes;
    }
    /**
     * Auto generated method that gets the related <code>PartyBenefit</code> by the relation named <code>PartyBenefit</code>.
     * @return the list of <code>PartyBenefit</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyBenefit> getPartyBenefits() throws RepositoryException {
        if (this.partyBenefits == null) {
            this.partyBenefits = getRelated(PartyBenefit.class, "PartyBenefit");
        }
        return this.partyBenefits;
    }

    /**
     * Auto generated value setter.
     * @param parentBenefitType the parentBenefitType to set
    */
    public void setParentBenefitType(BenefitType parentBenefitType) {
        this.parentBenefitType = parentBenefitType;
    }
    /**
     * Auto generated value setter.
     * @param childBenefitTypes the childBenefitTypes to set
    */
    public void setChildBenefitTypes(List<BenefitType> childBenefitTypes) {
        this.childBenefitTypes = childBenefitTypes;
    }
    /**
     * Auto generated value setter.
     * @param partyBenefits the partyBenefits to set
    */
    public void setPartyBenefits(List<PartyBenefit> partyBenefits) {
        this.partyBenefits = partyBenefits;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyBenefit(PartyBenefit partyBenefit) {
        if (this.partyBenefits == null) {
            this.partyBenefits = new ArrayList<PartyBenefit>();
        }
        this.partyBenefits.add(partyBenefit);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyBenefit(PartyBenefit partyBenefit) {
        if (this.partyBenefits == null) {
            return;
        }
        this.partyBenefits.remove(partyBenefit);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyBenefit() {
        if (this.partyBenefits == null) {
            return;
        }
        this.partyBenefits.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBenefitTypeId((String) mapValue.get("benefitTypeId"));
        setBenefitName((String) mapValue.get("benefitName"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
        setEmployerPaidPercentage(convertToBigDecimal(mapValue.get("employerPaidPercentage")));
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
        mapValue.put("benefitTypeId", getBenefitTypeId());
        mapValue.put("benefitName", getBenefitName());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("employerPaidPercentage", getEmployerPaidPercentage());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
