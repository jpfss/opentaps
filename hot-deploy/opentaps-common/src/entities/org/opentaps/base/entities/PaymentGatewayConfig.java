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
 * Auto generated base entity PaymentGatewayConfig.
 */
@javax.persistence.Entity
@Table(name="PAYMENT_GATEWAY_CONFIG")
public class PaymentGatewayConfig extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentGatewayConfigId", "PAYMENT_GATEWAY_CONFIG_ID");
        fields.put("paymentGatewayConfigTypeId", "PAYMENT_GATEWAY_CONFIG_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaymentGatewayConfig", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentGatewayConfig> {
    paymentGatewayConfigId("paymentGatewayConfigId"),
    paymentGatewayConfigTypeId("paymentGatewayConfigTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="PaymentGatewayConfig_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PaymentGatewayConfig_GEN")
   @Id
   @Column(name="PAYMENT_GATEWAY_CONFIG_ID")
   private String paymentGatewayConfigId;
   @Column(name="PAYMENT_GATEWAY_CONFIG_TYPE_ID")
   private String paymentGatewayConfigTypeId;
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
   @JoinColumn(name="PAYMENT_GATEWAY_CONFIG_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentGatewayConfigType paymentGatewayConfigType = null;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_GATEWAY_CONFIG_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentGatewayClearCommerce paymentGatewayClearCommerce = null;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_GATEWAY_CONFIG_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentGatewayPayPal paymentGatewayPayPal = null;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_GATEWAY_CONFIG_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentGatewayPayflowPro paymentGatewayPayflowPro = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_GATEWAY_CONFIG_ID")
   
   private List<ProductStorePaymentSetting> productStorePaymentSettings = null;

  /**
   * Default constructor.
   */
  public PaymentGatewayConfig() {
      super();
      this.baseEntityName = "PaymentGatewayConfig";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentGatewayConfigId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentGatewayConfigId");this.allFieldsNames.add("paymentGatewayConfigTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentGatewayConfig(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentGatewayConfigId the paymentGatewayConfigId to set
     */
    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
    /**
     * Auto generated value setter.
     * @param paymentGatewayConfigTypeId the paymentGatewayConfigTypeId to set
     */
    public void setPaymentGatewayConfigTypeId(String paymentGatewayConfigTypeId) {
        this.paymentGatewayConfigTypeId = paymentGatewayConfigTypeId;
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
    public String getPaymentGatewayConfigId() {
        return this.paymentGatewayConfigId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentGatewayConfigTypeId() {
        return this.paymentGatewayConfigTypeId;
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
     * Auto generated method that gets the related <code>PaymentGatewayConfigType</code> by the relation named <code>PaymentGatewayConfigType</code>.
     * @return the <code>PaymentGatewayConfigType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentGatewayConfigType getPaymentGatewayConfigType() throws RepositoryException {
        if (this.paymentGatewayConfigType == null) {
            this.paymentGatewayConfigType = getRelatedOne(PaymentGatewayConfigType.class, "PaymentGatewayConfigType");
        }
        return this.paymentGatewayConfigType;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayClearCommerce</code> by the relation named <code>PaymentGatewayClearCommerce</code>.
     * @return the <code>PaymentGatewayClearCommerce</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentGatewayClearCommerce getPaymentGatewayClearCommerce() throws RepositoryException {
        if (this.paymentGatewayClearCommerce == null) {
            this.paymentGatewayClearCommerce = getRelatedOne(PaymentGatewayClearCommerce.class, "PaymentGatewayClearCommerce");
        }
        return this.paymentGatewayClearCommerce;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayPayPal</code> by the relation named <code>PaymentGatewayPayPal</code>.
     * @return the <code>PaymentGatewayPayPal</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentGatewayPayPal getPaymentGatewayPayPal() throws RepositoryException {
        if (this.paymentGatewayPayPal == null) {
            this.paymentGatewayPayPal = getRelatedOne(PaymentGatewayPayPal.class, "PaymentGatewayPayPal");
        }
        return this.paymentGatewayPayPal;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayPayflowPro</code> by the relation named <code>PaymentGatewayPayflowPro</code>.
     * @return the <code>PaymentGatewayPayflowPro</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentGatewayPayflowPro getPaymentGatewayPayflowPro() throws RepositoryException {
        if (this.paymentGatewayPayflowPro == null) {
            this.paymentGatewayPayflowPro = getRelatedOne(PaymentGatewayPayflowPro.class, "PaymentGatewayPayflowPro");
        }
        return this.paymentGatewayPayflowPro;
    }
    /**
     * Auto generated method that gets the related <code>ProductStorePaymentSetting</code> by the relation named <code>ProductStorePaymentSetting</code>.
     * @return the list of <code>ProductStorePaymentSetting</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStorePaymentSetting> getProductStorePaymentSettings() throws RepositoryException {
        if (this.productStorePaymentSettings == null) {
            this.productStorePaymentSettings = getRelated(ProductStorePaymentSetting.class, "ProductStorePaymentSetting");
        }
        return this.productStorePaymentSettings;
    }

    /**
     * Auto generated value setter.
     * @param paymentGatewayConfigType the paymentGatewayConfigType to set
    */
    public void setPaymentGatewayConfigType(PaymentGatewayConfigType paymentGatewayConfigType) {
        this.paymentGatewayConfigType = paymentGatewayConfigType;
    }
    /**
     * Auto generated value setter.
     * @param paymentGatewayClearCommerce the paymentGatewayClearCommerce to set
    */
    public void setPaymentGatewayClearCommerce(PaymentGatewayClearCommerce paymentGatewayClearCommerce) {
        this.paymentGatewayClearCommerce = paymentGatewayClearCommerce;
    }
    /**
     * Auto generated value setter.
     * @param paymentGatewayPayPal the paymentGatewayPayPal to set
    */
    public void setPaymentGatewayPayPal(PaymentGatewayPayPal paymentGatewayPayPal) {
        this.paymentGatewayPayPal = paymentGatewayPayPal;
    }
    /**
     * Auto generated value setter.
     * @param paymentGatewayPayflowPro the paymentGatewayPayflowPro to set
    */
    public void setPaymentGatewayPayflowPro(PaymentGatewayPayflowPro paymentGatewayPayflowPro) {
        this.paymentGatewayPayflowPro = paymentGatewayPayflowPro;
    }
    /**
     * Auto generated value setter.
     * @param productStorePaymentSettings the productStorePaymentSettings to set
    */
    public void setProductStorePaymentSettings(List<ProductStorePaymentSetting> productStorePaymentSettings) {
        this.productStorePaymentSettings = productStorePaymentSettings;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentGatewayConfigId((String) mapValue.get("paymentGatewayConfigId"));
        setPaymentGatewayConfigTypeId((String) mapValue.get("paymentGatewayConfigTypeId"));
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
        mapValue.put("paymentGatewayConfigId", getPaymentGatewayConfigId());
        mapValue.put("paymentGatewayConfigTypeId", getPaymentGatewayConfigTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
