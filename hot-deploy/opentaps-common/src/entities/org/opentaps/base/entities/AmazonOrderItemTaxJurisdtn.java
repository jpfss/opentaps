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
 * Auto generated base entity AmazonOrderItemTaxJurisdtn.
 */
@javax.persistence.Entity
@Table(name="AMAZON_ORDER_ITEM_TAX_JURISDTN")
public class AmazonOrderItemTaxJurisdtn extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("amazonOrderId", "AMAZON_ORDER_ID");
        fields.put("amazonOrderItemCode", "AMAZON_ORDER_ITEM_CODE");
        fields.put("itemTaxJurisTypeId", "ITEM_TAX_JURIS_TYPE_ID");
        fields.put("taxType", "TAX_TYPE");
        fields.put("taxLocationCode", "TAX_LOCATION_CODE");
        fields.put("taxJurisDistrict", "TAX_JURIS_DISTRICT");
        fields.put("taxJurisCity", "TAX_JURIS_CITY");
        fields.put("taxJurisCounty", "TAX_JURIS_COUNTY");
        fields.put("taxJurisState", "TAX_JURIS_STATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AmazonOrderItemTaxJurisdtn", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonOrderItemTaxJurisdtn> {
    amazonOrderId("amazonOrderId"),
    amazonOrderItemCode("amazonOrderItemCode"),
    itemTaxJurisTypeId("itemTaxJurisTypeId"),
    taxType("taxType"),
    taxLocationCode("taxLocationCode"),
    taxJurisDistrict("taxJurisDistrict"),
    taxJurisCity("taxJurisCity"),
    taxJurisCounty("taxJurisCounty"),
    taxJurisState("taxJurisState"),
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

   @Column(name="AMAZON_ORDER_ID")
   private String amazonOrderId;
   @Column(name="AMAZON_ORDER_ITEM_CODE")
   private String amazonOrderItemCode;
   @org.hibernate.annotations.GenericGenerator(name="AmazonOrderItemTaxJurisdtn_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="AmazonOrderItemTaxJurisdtn_GEN")
   @Id
   @Column(name="ITEM_TAX_JURIS_TYPE_ID")
   private String itemTaxJurisTypeId;
   @Column(name="TAX_TYPE")
   private String taxType;
   @Column(name="TAX_LOCATION_CODE")
   private String taxLocationCode;
   @Column(name="TAX_JURIS_DISTRICT")
   private String taxJurisDistrict;
   @Column(name="TAX_JURIS_CITY")
   private String taxJurisCity;
   @Column(name="TAX_JURIS_COUNTY")
   private String taxJurisCounty;
   @Column(name="TAX_JURIS_STATE")
   private String taxJurisState;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient AmazonOrderItem amazonOrderItem = null;
   private transient AmazonOrderTaxJurisToAuth amazonOrderTaxJurisToAuth = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="amazonOrderItemTaxJurisdtn", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ITEM_TAX_JURIS_TYPE_ID")
   
   private List<AmazonOrderItemTaxAmount> amazonOrderItemTaxAmounts = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="amazonOrderItemTaxJurisdtn", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ITEM_TAX_JURIS_TYPE_ID")
   
   private List<AmazonOrderItemTaxRate> amazonOrderItemTaxRates = null;

  /**
   * Default constructor.
   */
  public AmazonOrderItemTaxJurisdtn() {
      super();
      this.baseEntityName = "AmazonOrderItemTaxJurisdtn";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("itemTaxJurisTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("amazonOrderId");this.allFieldsNames.add("amazonOrderItemCode");this.allFieldsNames.add("itemTaxJurisTypeId");this.allFieldsNames.add("taxType");this.allFieldsNames.add("taxLocationCode");this.allFieldsNames.add("taxJurisDistrict");this.allFieldsNames.add("taxJurisCity");this.allFieldsNames.add("taxJurisCounty");this.allFieldsNames.add("taxJurisState");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonOrderItemTaxJurisdtn(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param amazonOrderId the amazonOrderId to set
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemCode the amazonOrderItemCode to set
     */
    public void setAmazonOrderItemCode(String amazonOrderItemCode) {
        this.amazonOrderItemCode = amazonOrderItemCode;
    }
    /**
     * Auto generated value setter.
     * @param itemTaxJurisTypeId the itemTaxJurisTypeId to set
     */
    public void setItemTaxJurisTypeId(String itemTaxJurisTypeId) {
        this.itemTaxJurisTypeId = itemTaxJurisTypeId;
    }
    /**
     * Auto generated value setter.
     * @param taxType the taxType to set
     */
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }
    /**
     * Auto generated value setter.
     * @param taxLocationCode the taxLocationCode to set
     */
    public void setTaxLocationCode(String taxLocationCode) {
        this.taxLocationCode = taxLocationCode;
    }
    /**
     * Auto generated value setter.
     * @param taxJurisDistrict the taxJurisDistrict to set
     */
    public void setTaxJurisDistrict(String taxJurisDistrict) {
        this.taxJurisDistrict = taxJurisDistrict;
    }
    /**
     * Auto generated value setter.
     * @param taxJurisCity the taxJurisCity to set
     */
    public void setTaxJurisCity(String taxJurisCity) {
        this.taxJurisCity = taxJurisCity;
    }
    /**
     * Auto generated value setter.
     * @param taxJurisCounty the taxJurisCounty to set
     */
    public void setTaxJurisCounty(String taxJurisCounty) {
        this.taxJurisCounty = taxJurisCounty;
    }
    /**
     * Auto generated value setter.
     * @param taxJurisState the taxJurisState to set
     */
    public void setTaxJurisState(String taxJurisState) {
        this.taxJurisState = taxJurisState;
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
    public String getAmazonOrderId() {
        return this.amazonOrderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAmazonOrderItemCode() {
        return this.amazonOrderItemCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemTaxJurisTypeId() {
        return this.itemTaxJurisTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxType() {
        return this.taxType;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxLocationCode() {
        return this.taxLocationCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisDistrict() {
        return this.taxJurisDistrict;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisCity() {
        return this.taxJurisCity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisCounty() {
        return this.taxJurisCounty;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisState() {
        return this.taxJurisState;
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
     * Auto generated method that gets the related <code>AmazonOrderItem</code> by the relation named <code>AmazonOrderItem</code>.
     * @return the <code>AmazonOrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonOrderItem getAmazonOrderItem() throws RepositoryException {
        if (this.amazonOrderItem == null) {
            this.amazonOrderItem = getRelatedOne(AmazonOrderItem.class, "AmazonOrderItem");
        }
        return this.amazonOrderItem;
    }
    /**
     * Auto generated method that gets the related <code>AmazonOrderTaxJurisToAuth</code> by the relation named <code>AmazonOrderTaxJurisToAuth</code>.
     * @return the <code>AmazonOrderTaxJurisToAuth</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonOrderTaxJurisToAuth getAmazonOrderTaxJurisToAuth() throws RepositoryException {
        if (this.amazonOrderTaxJurisToAuth == null) {
            this.amazonOrderTaxJurisToAuth = getRelatedOne(AmazonOrderTaxJurisToAuth.class, "AmazonOrderTaxJurisToAuth");
        }
        return this.amazonOrderTaxJurisToAuth;
    }
    /**
     * Auto generated method that gets the related <code>AmazonOrderItemTaxAmount</code> by the relation named <code>AmazonOrderItemTaxAmount</code>.
     * @return the list of <code>AmazonOrderItemTaxAmount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AmazonOrderItemTaxAmount> getAmazonOrderItemTaxAmounts() throws RepositoryException {
        if (this.amazonOrderItemTaxAmounts == null) {
            this.amazonOrderItemTaxAmounts = getRelated(AmazonOrderItemTaxAmount.class, "AmazonOrderItemTaxAmount");
        }
        return this.amazonOrderItemTaxAmounts;
    }
    /**
     * Auto generated method that gets the related <code>AmazonOrderItemTaxRate</code> by the relation named <code>AmazonOrderItemTaxRate</code>.
     * @return the list of <code>AmazonOrderItemTaxRate</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AmazonOrderItemTaxRate> getAmazonOrderItemTaxRates() throws RepositoryException {
        if (this.amazonOrderItemTaxRates == null) {
            this.amazonOrderItemTaxRates = getRelated(AmazonOrderItemTaxRate.class, "AmazonOrderItemTaxRate");
        }
        return this.amazonOrderItemTaxRates;
    }

    /**
     * Auto generated value setter.
     * @param amazonOrderItem the amazonOrderItem to set
    */
    public void setAmazonOrderItem(AmazonOrderItem amazonOrderItem) {
        this.amazonOrderItem = amazonOrderItem;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderTaxJurisToAuth the amazonOrderTaxJurisToAuth to set
    */
    public void setAmazonOrderTaxJurisToAuth(AmazonOrderTaxJurisToAuth amazonOrderTaxJurisToAuth) {
        this.amazonOrderTaxJurisToAuth = amazonOrderTaxJurisToAuth;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemTaxAmounts the amazonOrderItemTaxAmounts to set
    */
    public void setAmazonOrderItemTaxAmounts(List<AmazonOrderItemTaxAmount> amazonOrderItemTaxAmounts) {
        this.amazonOrderItemTaxAmounts = amazonOrderItemTaxAmounts;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemTaxRates the amazonOrderItemTaxRates to set
    */
    public void setAmazonOrderItemTaxRates(List<AmazonOrderItemTaxRate> amazonOrderItemTaxRates) {
        this.amazonOrderItemTaxRates = amazonOrderItemTaxRates;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addAmazonOrderItemTaxAmount(AmazonOrderItemTaxAmount amazonOrderItemTaxAmount) {
        if (this.amazonOrderItemTaxAmounts == null) {
            this.amazonOrderItemTaxAmounts = new ArrayList<AmazonOrderItemTaxAmount>();
        }
        this.amazonOrderItemTaxAmounts.add(amazonOrderItemTaxAmount);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeAmazonOrderItemTaxAmount(AmazonOrderItemTaxAmount amazonOrderItemTaxAmount) {
        if (this.amazonOrderItemTaxAmounts == null) {
            return;
        }
        this.amazonOrderItemTaxAmounts.remove(amazonOrderItemTaxAmount);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearAmazonOrderItemTaxAmount() {
        if (this.amazonOrderItemTaxAmounts == null) {
            return;
        }
        this.amazonOrderItemTaxAmounts.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addAmazonOrderItemTaxRate(AmazonOrderItemTaxRate amazonOrderItemTaxRate) {
        if (this.amazonOrderItemTaxRates == null) {
            this.amazonOrderItemTaxRates = new ArrayList<AmazonOrderItemTaxRate>();
        }
        this.amazonOrderItemTaxRates.add(amazonOrderItemTaxRate);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeAmazonOrderItemTaxRate(AmazonOrderItemTaxRate amazonOrderItemTaxRate) {
        if (this.amazonOrderItemTaxRates == null) {
            return;
        }
        this.amazonOrderItemTaxRates.remove(amazonOrderItemTaxRate);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearAmazonOrderItemTaxRate() {
        if (this.amazonOrderItemTaxRates == null) {
            return;
        }
        this.amazonOrderItemTaxRates.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAmazonOrderId((String) mapValue.get("amazonOrderId"));
        setAmazonOrderItemCode((String) mapValue.get("amazonOrderItemCode"));
        setItemTaxJurisTypeId((String) mapValue.get("itemTaxJurisTypeId"));
        setTaxType((String) mapValue.get("taxType"));
        setTaxLocationCode((String) mapValue.get("taxLocationCode"));
        setTaxJurisDistrict((String) mapValue.get("taxJurisDistrict"));
        setTaxJurisCity((String) mapValue.get("taxJurisCity"));
        setTaxJurisCounty((String) mapValue.get("taxJurisCounty"));
        setTaxJurisState((String) mapValue.get("taxJurisState"));
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
        mapValue.put("amazonOrderId", getAmazonOrderId());
        mapValue.put("amazonOrderItemCode", getAmazonOrderItemCode());
        mapValue.put("itemTaxJurisTypeId", getItemTaxJurisTypeId());
        mapValue.put("taxType", getTaxType());
        mapValue.put("taxLocationCode", getTaxLocationCode());
        mapValue.put("taxJurisDistrict", getTaxJurisDistrict());
        mapValue.put("taxJurisCity", getTaxJurisCity());
        mapValue.put("taxJurisCounty", getTaxJurisCounty());
        mapValue.put("taxJurisState", getTaxJurisState());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
