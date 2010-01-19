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

/**
 * Auto generated base entity PaycheckItemAndTypeSum.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPaycheckItemAndTypeSums", query="SELECT PCKITM.PAYMENT_ID AS \"paymentId\",PCKITM.PAYCHECK_ITEM_TYPE_ID AS \"paycheckItemTypeId\",PCKITMTYP.PAYCHECK_ITEM_CLASS_ID AS \"paycheckItemClassId\",PCKITM.AMOUNT AS \"amount\",PCKITM.PARTY_ID AS \"partyId\" FROM PAYCHECK_ITEM PCKITM INNER JOIN PAYCHECK_ITEM_TYPE PCKITMTYP ON PCKITM.PAYCHECK_ITEM_TYPE_ID = PCKITMTYP.PAYCHECK_ITEM_TYPE_ID", resultSetMapping="PaycheckItemAndTypeSumMapping")
@SqlResultSetMapping(name="PaycheckItemAndTypeSumMapping", entities={
@EntityResult(entityClass=PaycheckItemAndTypeSum.class, fields = {
@FieldResult(name="paymentId", column="paymentId")
,@FieldResult(name="paycheckItemTypeId", column="paycheckItemTypeId")
,@FieldResult(name="paycheckItemClassId", column="paycheckItemClassId")
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="partyId", column="partyId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PaycheckItemAndTypeSum extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentId", "PCKITM.PAYMENT_ID");
        fields.put("paycheckItemTypeId", "PCKITM.PAYCHECK_ITEM_TYPE_ID");
        fields.put("paycheckItemClassId", "PCKITMTYP.PAYCHECK_ITEM_CLASS_ID");
        fields.put("amount", "PCKITM.AMOUNT");
        fields.put("partyId", "PCKITM.PARTY_ID");
fieldMapColumns.put("PaycheckItemAndTypeSum", fields);
}
  public static enum Fields implements EntityFieldInterface<PaycheckItemAndTypeSum> {
    paymentId("paymentId"),
    paycheckItemTypeId("paycheckItemTypeId"),
    paycheckItemClassId("paycheckItemClassId"),
    amount("amount"),
    partyId("partyId");
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
   private String paymentId;
    
   private String paycheckItemTypeId;
    
   private String paycheckItemClassId;
    
   private BigDecimal amount;
    
   private String partyId;

  /**
   * Default constructor.
   */
  public PaycheckItemAndTypeSum() {
      super();
      this.baseEntityName = "PaycheckItemAndTypeSum";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentId");this.allFieldsNames.add("paycheckItemTypeId");this.allFieldsNames.add("paycheckItemClassId");this.allFieldsNames.add("amount");this.allFieldsNames.add("partyId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaycheckItemAndTypeSum(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    /**
     * Auto generated value setter.
     * @param paycheckItemTypeId the paycheckItemTypeId to set
     */
    public void setPaycheckItemTypeId(String paycheckItemTypeId) {
        this.paycheckItemTypeId = paycheckItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param paycheckItemClassId the paycheckItemClassId to set
     */
    public void setPaycheckItemClassId(String paycheckItemClassId) {
        this.paycheckItemClassId = paycheckItemClassId;
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentId() {
        return this.paymentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaycheckItemTypeId() {
        return this.paycheckItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaycheckItemClassId() {
        return this.paycheckItemClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentId((String) mapValue.get("paymentId"));
        setPaycheckItemTypeId((String) mapValue.get("paycheckItemTypeId"));
        setPaycheckItemClassId((String) mapValue.get("paycheckItemClassId"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setPartyId((String) mapValue.get("partyId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("paycheckItemTypeId", getPaycheckItemTypeId());
        mapValue.put("paycheckItemClassId", getPaycheckItemClassId());
        mapValue.put("amount", getAmount());
        mapValue.put("partyId", getPartyId());
        return mapValue;
    }


}
