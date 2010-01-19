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
 * Auto generated base entity BillingAccountTerm.
 */
@javax.persistence.Entity
@Table(name="BILLING_ACCOUNT_TERM")
public class BillingAccountTerm extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("billingAccountTermId", "BILLING_ACCOUNT_TERM_ID");
        fields.put("billingAccountId", "BILLING_ACCOUNT_ID");
        fields.put("termTypeId", "TERM_TYPE_ID");
        fields.put("termValue", "TERM_VALUE");
        fields.put("termDays", "TERM_DAYS");
        fields.put("uomId", "UOM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("BillingAccountTerm", fields);
}
  public static enum Fields implements EntityFieldInterface<BillingAccountTerm> {
    billingAccountTermId("billingAccountTermId"),
    billingAccountId("billingAccountId"),
    termTypeId("termTypeId"),
    termValue("termValue"),
    termDays("termDays"),
    uomId("uomId"),
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

   @org.hibernate.annotations.GenericGenerator(name="BillingAccountTerm_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="BillingAccountTerm_GEN")
   @Id
   @Column(name="BILLING_ACCOUNT_TERM_ID")
   private String billingAccountTermId;
   @Column(name="BILLING_ACCOUNT_ID")
   private String billingAccountId;
   @Column(name="TERM_TYPE_ID")
   private String termTypeId;
   @Column(name="TERM_VALUE")
   private BigDecimal termValue;
   @Column(name="TERM_DAYS")
   private Long termDays;
   @Column(name="UOM_ID")
   private String uomId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TERM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TermType termType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BILLING_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private BillingAccount billingAccount = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccountTerm", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_TERM_ID")
   
   private List<BillingAccountTermAttr> billingAccountTermAttrs = null;

  /**
   * Default constructor.
   */
  public BillingAccountTerm() {
      super();
      this.baseEntityName = "BillingAccountTerm";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("billingAccountTermId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("billingAccountTermId");this.allFieldsNames.add("billingAccountId");this.allFieldsNames.add("termTypeId");this.allFieldsNames.add("termValue");this.allFieldsNames.add("termDays");this.allFieldsNames.add("uomId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BillingAccountTerm(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param billingAccountTermId the billingAccountTermId to set
     */
    public void setBillingAccountTermId(String billingAccountTermId) {
        this.billingAccountTermId = billingAccountTermId;
    }
    /**
     * Auto generated value setter.
     * @param billingAccountId the billingAccountId to set
     */
    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
    /**
     * Auto generated value setter.
     * @param termTypeId the termTypeId to set
     */
    public void setTermTypeId(String termTypeId) {
        this.termTypeId = termTypeId;
    }
    /**
     * Auto generated value setter.
     * @param termValue the termValue to set
     */
    public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }
    /**
     * Auto generated value setter.
     * @param termDays the termDays to set
     */
    public void setTermDays(Long termDays) {
        this.termDays = termDays;
    }
    /**
     * Auto generated value setter.
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        this.uomId = uomId;
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
    public String getBillingAccountTermId() {
        return this.billingAccountTermId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBillingAccountId() {
        return this.billingAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTermTypeId() {
        return this.termTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTermValue() {
        return this.termValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTermDays() {
        return this.termDays;
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
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
    }
    /**
     * Auto generated method that gets the related <code>TermType</code> by the relation named <code>TermType</code>.
     * @return the <code>TermType</code>
     * @throws RepositoryException if an error occurs
     */
    public TermType getTermType() throws RepositoryException {
        if (this.termType == null) {
            this.termType = getRelatedOne(TermType.class, "TermType");
        }
        return this.termType;
    }
    /**
     * Auto generated method that gets the related <code>BillingAccount</code> by the relation named <code>BillingAccount</code>.
     * @return the <code>BillingAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public BillingAccount getBillingAccount() throws RepositoryException {
        if (this.billingAccount == null) {
            this.billingAccount = getRelatedOne(BillingAccount.class, "BillingAccount");
        }
        return this.billingAccount;
    }
    /**
     * Auto generated method that gets the related <code>BillingAccountTermAttr</code> by the relation named <code>BillingAccountTermAttr</code>.
     * @return the list of <code>BillingAccountTermAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BillingAccountTermAttr> getBillingAccountTermAttrs() throws RepositoryException {
        if (this.billingAccountTermAttrs == null) {
            this.billingAccountTermAttrs = getRelated(BillingAccountTermAttr.class, "BillingAccountTermAttr");
        }
        return this.billingAccountTermAttrs;
    }

    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    /**
     * Auto generated value setter.
     * @param termType the termType to set
    */
    public void setTermType(TermType termType) {
        this.termType = termType;
    }
    /**
     * Auto generated value setter.
     * @param billingAccount the billingAccount to set
    */
    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }
    /**
     * Auto generated value setter.
     * @param billingAccountTermAttrs the billingAccountTermAttrs to set
    */
    public void setBillingAccountTermAttrs(List<BillingAccountTermAttr> billingAccountTermAttrs) {
        this.billingAccountTermAttrs = billingAccountTermAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addBillingAccountTermAttr(BillingAccountTermAttr billingAccountTermAttr) {
        if (this.billingAccountTermAttrs == null) {
            this.billingAccountTermAttrs = new ArrayList<BillingAccountTermAttr>();
        }
        this.billingAccountTermAttrs.add(billingAccountTermAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeBillingAccountTermAttr(BillingAccountTermAttr billingAccountTermAttr) {
        if (this.billingAccountTermAttrs == null) {
            return;
        }
        this.billingAccountTermAttrs.remove(billingAccountTermAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearBillingAccountTermAttr() {
        if (this.billingAccountTermAttrs == null) {
            return;
        }
        this.billingAccountTermAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBillingAccountTermId((String) mapValue.get("billingAccountTermId"));
        setBillingAccountId((String) mapValue.get("billingAccountId"));
        setTermTypeId((String) mapValue.get("termTypeId"));
        setTermValue(convertToBigDecimal(mapValue.get("termValue")));
        setTermDays((Long) mapValue.get("termDays"));
        setUomId((String) mapValue.get("uomId"));
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
        mapValue.put("billingAccountTermId", getBillingAccountTermId());
        mapValue.put("billingAccountId", getBillingAccountId());
        mapValue.put("termTypeId", getTermTypeId());
        mapValue.put("termValue", getTermValue());
        mapValue.put("termDays", getTermDays());
        mapValue.put("uomId", getUomId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
