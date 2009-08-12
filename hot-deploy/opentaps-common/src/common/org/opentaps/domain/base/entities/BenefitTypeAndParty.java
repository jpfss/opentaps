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
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity BenefitTypeAndParty.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectBenefitTypeAndPartys", query="SELECT BT.BENEFIT_TYPE_ID AS \"benefitTypeId\",BT.BENEFIT_NAME AS \"benefitName\",BT.PARENT_TYPE_ID AS \"parentTypeId\",BT.HAS_TABLE AS \"hasTable\",BT.DESCRIPTION AS \"description\",BT.EMPLOYER_PAID_PERCENTAGE AS \"employerPaidPercentage\",PB.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",PB.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",PB.PARTY_ID_FROM AS \"partyIdFrom\",PB.PARTY_ID_TO AS \"partyIdTo\",PB.FROM_DATE AS \"fromDate\",PB.THRU_DATE AS \"thruDate\",PB.PERIOD_TYPE_ID AS \"periodTypeId\",PB.COST AS \"cost\",PB.ACTUAL_EMPLOYER_PAID_PERCENT AS \"actualEmployerPaidPercent\",PB.AVAILABLE_TIME AS \"availableTime\" FROM BENEFIT_TYPE BT INNER JOIN PARTY_BENEFIT PB ON BT.BENEFIT_TYPE_ID = PB.BENEFIT_TYPE_ID", resultSetMapping="BenefitTypeAndPartyMapping")
@SqlResultSetMapping(name="BenefitTypeAndPartyMapping", entities={
@EntityResult(entityClass=BenefitTypeAndParty.class, fields = {
@FieldResult(name="benefitTypeId", column="benefitTypeId")
,@FieldResult(name="benefitName", column="benefitName")
,@FieldResult(name="parentTypeId", column="parentTypeId")
,@FieldResult(name="hasTable", column="hasTable")
,@FieldResult(name="description", column="description")
,@FieldResult(name="employerPaidPercentage", column="employerPaidPercentage")
,@FieldResult(name="roleTypeIdFrom", column="roleTypeIdFrom")
,@FieldResult(name="roleTypeIdTo", column="roleTypeIdTo")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="periodTypeId", column="periodTypeId")
,@FieldResult(name="cost", column="cost")
,@FieldResult(name="actualEmployerPaidPercent", column="actualEmployerPaidPercent")
,@FieldResult(name="availableTime", column="availableTime")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class BenefitTypeAndParty extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("benefitTypeId", "BT.BENEFIT_TYPE_ID");
        fields.put("benefitName", "BT.BENEFIT_NAME");
        fields.put("parentTypeId", "BT.PARENT_TYPE_ID");
        fields.put("hasTable", "BT.HAS_TABLE");
        fields.put("description", "BT.DESCRIPTION");
        fields.put("employerPaidPercentage", "BT.EMPLOYER_PAID_PERCENTAGE");
        fields.put("roleTypeIdFrom", "PB.ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "PB.ROLE_TYPE_ID_TO");
        fields.put("partyIdFrom", "PB.PARTY_ID_FROM");
        fields.put("partyIdTo", "PB.PARTY_ID_TO");
        fields.put("fromDate", "PB.FROM_DATE");
        fields.put("thruDate", "PB.THRU_DATE");
        fields.put("periodTypeId", "PB.PERIOD_TYPE_ID");
        fields.put("cost", "PB.COST");
        fields.put("actualEmployerPaidPercent", "PB.ACTUAL_EMPLOYER_PAID_PERCENT");
        fields.put("availableTime", "PB.AVAILABLE_TIME");
fieldMapColumns.put("BenefitTypeAndParty", fields);
}
  public static enum Fields implements EntityFieldInterface<BenefitTypeAndParty> {
    benefitTypeId("benefitTypeId"),
    benefitName("benefitName"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
    employerPaidPercentage("employerPaidPercentage"),
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    periodTypeId("periodTypeId"),
    cost("cost"),
    actualEmployerPaidPercent("actualEmployerPaidPercent"),
    availableTime("availableTime");
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
   private String benefitTypeId;
    
   private String benefitName;
    
   private String parentTypeId;
    
   private String hasTable;
    
   private String description;
    
   private BigDecimal employerPaidPercentage;
    
   private String roleTypeIdFrom;
    
   private String roleTypeIdTo;
    
   private String partyIdFrom;
    
   private String partyIdTo;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String periodTypeId;
    
   private BigDecimal cost;
    
   private BigDecimal actualEmployerPaidPercent;
    
   private Long availableTime;

  /**
   * Default constructor.
   */
  public BenefitTypeAndParty() {
      super();
      this.baseEntityName = "BenefitTypeAndParty";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("benefitTypeId");this.primaryKeyNames.add("roleTypeIdFrom");this.primaryKeyNames.add("roleTypeIdTo");this.primaryKeyNames.add("partyIdFrom");this.primaryKeyNames.add("partyIdTo");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("benefitTypeId");this.allFieldsNames.add("benefitName");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("employerPaidPercentage");this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("periodTypeId");this.allFieldsNames.add("cost");this.allFieldsNames.add("actualEmployerPaidPercent");this.allFieldsNames.add("availableTime");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BenefitTypeAndParty(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param benefitTypeId the benefitTypeId to set
     */
    private void setBenefitTypeId(String benefitTypeId) {
        this.benefitTypeId = benefitTypeId;
    }
    /**
     * Auto generated value setter.
     * @param benefitName the benefitName to set
     */
    private void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    private void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    private void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    private void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param employerPaidPercentage the employerPaidPercentage to set
     */
    private void setEmployerPaidPercentage(BigDecimal employerPaidPercentage) {
        this.employerPaidPercentage = employerPaidPercentage;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    private void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    private void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    private void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    private void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    private void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    private void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param periodTypeId the periodTypeId to set
     */
    private void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param cost the cost to set
     */
    private void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    /**
     * Auto generated value setter.
     * @param actualEmployerPaidPercent the actualEmployerPaidPercent to set
     */
    private void setActualEmployerPaidPercent(BigDecimal actualEmployerPaidPercent) {
        this.actualEmployerPaidPercent = actualEmployerPaidPercent;
    }
    /**
     * Auto generated value setter.
     * @param availableTime the availableTime to set
     */
    private void setAvailableTime(Long availableTime) {
        this.availableTime = availableTime;
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
     * @return <code>String</code>
     */
    public String getRoleTypeIdFrom() {
        return this.roleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.roleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.partyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPeriodTypeId() {
        return this.periodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCost() {
        return this.cost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getActualEmployerPaidPercent() {
        return this.actualEmployerPaidPercent;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getAvailableTime() {
        return this.availableTime;
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
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPeriodTypeId((String) mapValue.get("periodTypeId"));
        setCost(convertToBigDecimal(mapValue.get("cost")));
        setActualEmployerPaidPercent(convertToBigDecimal(mapValue.get("actualEmployerPaidPercent")));
        setAvailableTime((Long) mapValue.get("availableTime"));
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
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("periodTypeId", getPeriodTypeId());
        mapValue.put("cost", getCost());
        mapValue.put("actualEmployerPaidPercent", getActualEmployerPaidPercent());
        mapValue.put("availableTime", getAvailableTime());
        return mapValue;
    }


}
