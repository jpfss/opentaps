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
 * Auto generated base entity ProductStoreFinActSetting.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_STORE_FIN_ACT_SETTING")
public class ProductStoreFinActSetting extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productStoreId", "PRODUCT_STORE_ID");
        fields.put("finAccountTypeId", "FIN_ACCOUNT_TYPE_ID");
        fields.put("requirePinCode", "REQUIRE_PIN_CODE");
        fields.put("validateGCFinAcct", "VALIDATE_G_C_FIN_ACCT");
        fields.put("accountCodeLength", "ACCOUNT_CODE_LENGTH");
        fields.put("pinCodeLength", "PIN_CODE_LENGTH");
        fields.put("accountValidDays", "ACCOUNT_VALID_DAYS");
        fields.put("authValidDays", "AUTH_VALID_DAYS");
        fields.put("purchaseSurveyId", "PURCHASE_SURVEY_ID");
        fields.put("purchSurveySendTo", "PURCH_SURVEY_SEND_TO");
        fields.put("purchSurveyCopyMe", "PURCH_SURVEY_COPY_ME");
        fields.put("allowAuthToNegative", "ALLOW_AUTH_TO_NEGATIVE");
        fields.put("minBalance", "MIN_BALANCE");
        fields.put("replenishThreshold", "REPLENISH_THRESHOLD");
        fields.put("replenishMethodEnumId", "REPLENISH_METHOD_ENUM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductStoreFinActSetting", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStoreFinActSetting> {
    productStoreId("productStoreId"),
    finAccountTypeId("finAccountTypeId"),
    requirePinCode("requirePinCode"),
    validateGCFinAcct("validateGCFinAcct"),
    accountCodeLength("accountCodeLength"),
    pinCodeLength("pinCodeLength"),
    accountValidDays("accountValidDays"),
    authValidDays("authValidDays"),
    purchaseSurveyId("purchaseSurveyId"),
    purchSurveySendTo("purchSurveySendTo"),
    purchSurveyCopyMe("purchSurveyCopyMe"),
    allowAuthToNegative("allowAuthToNegative"),
    minBalance("minBalance"),
    replenishThreshold("replenishThreshold"),
    replenishMethodEnumId("replenishMethodEnumId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductStoreFinActSettingPkBridge.class)
     private ProductStoreFinActSettingPk id = new ProductStoreFinActSettingPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductStoreFinActSettingPk</code>
     */
      public ProductStoreFinActSettingPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductStoreFinActSettingPk</code> value to set
    */   
      public void setId(ProductStoreFinActSettingPk id) {
         this.id = id;
      }
   @Column(name="REQUIRE_PIN_CODE")
   private String requirePinCode;
   @Column(name="VALIDATE_G_C_FIN_ACCT")
   private String validateGCFinAcct;
   @Column(name="ACCOUNT_CODE_LENGTH")
   private Long accountCodeLength;
   @Column(name="PIN_CODE_LENGTH")
   private Long pinCodeLength;
   @Column(name="ACCOUNT_VALID_DAYS")
   private Long accountValidDays;
   @Column(name="AUTH_VALID_DAYS")
   private Long authValidDays;
   @Column(name="PURCHASE_SURVEY_ID")
   private String purchaseSurveyId;
   @Column(name="PURCH_SURVEY_SEND_TO")
   private String purchSurveySendTo;
   @Column(name="PURCH_SURVEY_COPY_ME")
   private String purchSurveyCopyMe;
   @Column(name="ALLOW_AUTH_TO_NEGATIVE")
   private String allowAuthToNegative;
   @Column(name="MIN_BALANCE")
   private BigDecimal minBalance;
   @Column(name="REPLENISH_THRESHOLD")
   private BigDecimal replenishThreshold;
   @Column(name="REPLENISH_METHOD_ENUM_ID")
   private String replenishMethodEnumId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStore productStore = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FIN_ACCOUNT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FinAccountType finAccountType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PURCHASE_SURVEY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Survey survey = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REPLENISH_METHOD_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration replenishMethodEnumeration = null;

  /**
   * Default constructor.
   */
  public ProductStoreFinActSetting() {
      super();
      this.baseEntityName = "ProductStoreFinActSetting";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productStoreId");this.primaryKeyNames.add("finAccountTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("finAccountTypeId");this.allFieldsNames.add("requirePinCode");this.allFieldsNames.add("validateGCFinAcct");this.allFieldsNames.add("accountCodeLength");this.allFieldsNames.add("pinCodeLength");this.allFieldsNames.add("accountValidDays");this.allFieldsNames.add("authValidDays");this.allFieldsNames.add("purchaseSurveyId");this.allFieldsNames.add("purchSurveySendTo");this.allFieldsNames.add("purchSurveyCopyMe");this.allFieldsNames.add("allowAuthToNegative");this.allFieldsNames.add("minBalance");this.allFieldsNames.add("replenishThreshold");this.allFieldsNames.add("replenishMethodEnumId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStoreFinActSetting(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        id.setProductStoreId(productStoreId);
    }
    /**
     * Auto generated value setter.
     * @param finAccountTypeId the finAccountTypeId to set
     */
    public void setFinAccountTypeId(String finAccountTypeId) {
        id.setFinAccountTypeId(finAccountTypeId);
    }
    /**
     * Auto generated value setter.
     * @param requirePinCode the requirePinCode to set
     */
    public void setRequirePinCode(String requirePinCode) {
        this.requirePinCode = requirePinCode;
    }
    /**
     * Auto generated value setter.
     * @param validateGCFinAcct the validateGCFinAcct to set
     */
    public void setValidateGCFinAcct(String validateGCFinAcct) {
        this.validateGCFinAcct = validateGCFinAcct;
    }
    /**
     * Auto generated value setter.
     * @param accountCodeLength the accountCodeLength to set
     */
    public void setAccountCodeLength(Long accountCodeLength) {
        this.accountCodeLength = accountCodeLength;
    }
    /**
     * Auto generated value setter.
     * @param pinCodeLength the pinCodeLength to set
     */
    public void setPinCodeLength(Long pinCodeLength) {
        this.pinCodeLength = pinCodeLength;
    }
    /**
     * Auto generated value setter.
     * @param accountValidDays the accountValidDays to set
     */
    public void setAccountValidDays(Long accountValidDays) {
        this.accountValidDays = accountValidDays;
    }
    /**
     * Auto generated value setter.
     * @param authValidDays the authValidDays to set
     */
    public void setAuthValidDays(Long authValidDays) {
        this.authValidDays = authValidDays;
    }
    /**
     * Auto generated value setter.
     * @param purchaseSurveyId the purchaseSurveyId to set
     */
    public void setPurchaseSurveyId(String purchaseSurveyId) {
        this.purchaseSurveyId = purchaseSurveyId;
    }
    /**
     * Auto generated value setter.
     * @param purchSurveySendTo the purchSurveySendTo to set
     */
    public void setPurchSurveySendTo(String purchSurveySendTo) {
        this.purchSurveySendTo = purchSurveySendTo;
    }
    /**
     * Auto generated value setter.
     * @param purchSurveyCopyMe the purchSurveyCopyMe to set
     */
    public void setPurchSurveyCopyMe(String purchSurveyCopyMe) {
        this.purchSurveyCopyMe = purchSurveyCopyMe;
    }
    /**
     * Auto generated value setter.
     * @param allowAuthToNegative the allowAuthToNegative to set
     */
    public void setAllowAuthToNegative(String allowAuthToNegative) {
        this.allowAuthToNegative = allowAuthToNegative;
    }
    /**
     * Auto generated value setter.
     * @param minBalance the minBalance to set
     */
    public void setMinBalance(BigDecimal minBalance) {
        this.minBalance = minBalance;
    }
    /**
     * Auto generated value setter.
     * @param replenishThreshold the replenishThreshold to set
     */
    public void setReplenishThreshold(BigDecimal replenishThreshold) {
        this.replenishThreshold = replenishThreshold;
    }
    /**
     * Auto generated value setter.
     * @param replenishMethodEnumId the replenishMethodEnumId to set
     */
    public void setReplenishMethodEnumId(String replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
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
    public String getProductStoreId() {
        return this.id.getProductStoreId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountTypeId() {
        return this.id.getFinAccountTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirePinCode() {
        return this.requirePinCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getValidateGCFinAcct() {
        return this.validateGCFinAcct;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getAccountCodeLength() {
        return this.accountCodeLength;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPinCodeLength() {
        return this.pinCodeLength;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getAccountValidDays() {
        return this.accountValidDays;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getAuthValidDays() {
        return this.authValidDays;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPurchaseSurveyId() {
        return this.purchaseSurveyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPurchSurveySendTo() {
        return this.purchSurveySendTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPurchSurveyCopyMe() {
        return this.purchSurveyCopyMe;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowAuthToNegative() {
        return this.allowAuthToNegative;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinBalance() {
        return this.minBalance;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReplenishThreshold() {
        return this.replenishThreshold;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReplenishMethodEnumId() {
        return this.replenishMethodEnumId;
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
     * Auto generated method that gets the related <code>ProductStore</code> by the relation named <code>ProductStore</code>.
     * @return the <code>ProductStore</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStore getProductStore() throws RepositoryException {
        if (this.productStore == null) {
            this.productStore = getRelatedOne(ProductStore.class, "ProductStore");
        }
        return this.productStore;
    }
    /**
     * Auto generated method that gets the related <code>FinAccountType</code> by the relation named <code>FinAccountType</code>.
     * @return the <code>FinAccountType</code>
     * @throws RepositoryException if an error occurs
     */
    public FinAccountType getFinAccountType() throws RepositoryException {
        if (this.finAccountType == null) {
            this.finAccountType = getRelatedOne(FinAccountType.class, "FinAccountType");
        }
        return this.finAccountType;
    }
    /**
     * Auto generated method that gets the related <code>Survey</code> by the relation named <code>Survey</code>.
     * @return the <code>Survey</code>
     * @throws RepositoryException if an error occurs
     */
    public Survey getSurvey() throws RepositoryException {
        if (this.survey == null) {
            this.survey = getRelatedOne(Survey.class, "Survey");
        }
        return this.survey;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>ReplenishMethodEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getReplenishMethodEnumeration() throws RepositoryException {
        if (this.replenishMethodEnumeration == null) {
            this.replenishMethodEnumeration = getRelatedOne(Enumeration.class, "ReplenishMethodEnumeration");
        }
        return this.replenishMethodEnumeration;
    }

    /**
     * Auto generated value setter.
     * @param productStore the productStore to set
    */
    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }
    /**
     * Auto generated value setter.
     * @param finAccountType the finAccountType to set
    */
    public void setFinAccountType(FinAccountType finAccountType) {
        this.finAccountType = finAccountType;
    }
    /**
     * Auto generated value setter.
     * @param survey the survey to set
    */
    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
    /**
     * Auto generated value setter.
     * @param replenishMethodEnumeration the replenishMethodEnumeration to set
    */
    public void setReplenishMethodEnumeration(Enumeration replenishMethodEnumeration) {
        this.replenishMethodEnumeration = replenishMethodEnumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductStoreId((String) mapValue.get("productStoreId"));
        setFinAccountTypeId((String) mapValue.get("finAccountTypeId"));
        setRequirePinCode((String) mapValue.get("requirePinCode"));
        setValidateGCFinAcct((String) mapValue.get("validateGCFinAcct"));
        setAccountCodeLength((Long) mapValue.get("accountCodeLength"));
        setPinCodeLength((Long) mapValue.get("pinCodeLength"));
        setAccountValidDays((Long) mapValue.get("accountValidDays"));
        setAuthValidDays((Long) mapValue.get("authValidDays"));
        setPurchaseSurveyId((String) mapValue.get("purchaseSurveyId"));
        setPurchSurveySendTo((String) mapValue.get("purchSurveySendTo"));
        setPurchSurveyCopyMe((String) mapValue.get("purchSurveyCopyMe"));
        setAllowAuthToNegative((String) mapValue.get("allowAuthToNegative"));
        setMinBalance(convertToBigDecimal(mapValue.get("minBalance")));
        setReplenishThreshold(convertToBigDecimal(mapValue.get("replenishThreshold")));
        setReplenishMethodEnumId((String) mapValue.get("replenishMethodEnumId"));
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
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("finAccountTypeId", getFinAccountTypeId());
        mapValue.put("requirePinCode", getRequirePinCode());
        mapValue.put("validateGCFinAcct", getValidateGCFinAcct());
        mapValue.put("accountCodeLength", getAccountCodeLength());
        mapValue.put("pinCodeLength", getPinCodeLength());
        mapValue.put("accountValidDays", getAccountValidDays());
        mapValue.put("authValidDays", getAuthValidDays());
        mapValue.put("purchaseSurveyId", getPurchaseSurveyId());
        mapValue.put("purchSurveySendTo", getPurchSurveySendTo());
        mapValue.put("purchSurveyCopyMe", getPurchSurveyCopyMe());
        mapValue.put("allowAuthToNegative", getAllowAuthToNegative());
        mapValue.put("minBalance", getMinBalance());
        mapValue.put("replenishThreshold", getReplenishThreshold());
        mapValue.put("replenishMethodEnumId", getReplenishMethodEnumId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
