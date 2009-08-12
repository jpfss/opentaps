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
import java.sql.Blob;
import java.sql.Timestamp;

/**
 * Auto generated base entity TestEntity.
 */
@javax.persistence.Entity
@Table(name="TEST_ENTITY")
public class TestEntity extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("testId", "TEST_ID");
        fields.put("testStringField", "TEST_STRING_FIELD");
        fields.put("testDateTimeField", "TEST_DATE_TIME_FIELD");
        fields.put("testBlobField", "TEST_BLOB_FIELD");
        fields.put("testNumericField", "TEST_NUMERIC_FIELD");
        fields.put("testFloatingPointField", "TEST_FLOATING_POINT_FIELD");
        fields.put("testCurrencyPreciseField", "TEST_CURRENCY_PRECISE_FIELD");
        fields.put("testCreditCardNumberField", "TEST_CREDIT_CARD_NUMBER_FIELD");
        fields.put("testCreditCardDateField", "TEST_CREDIT_CARD_DATE_FIELD");
        fields.put("testEmailField", "TEST_EMAIL_FIELD");
        fields.put("testUrlField", "TEST_URL_FIELD");
        fields.put("testTelphoneField", "TEST_TELPHONE_FIELD");
        fields.put("enumId", "ENUM_ID");
        fields.put("testEncrypt", "TEST_ENCRYPT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TestEntity", fields);
}
  public static enum Fields implements EntityFieldInterface<TestEntity> {
    testId("testId"),
    testStringField("testStringField"),
    testDateTimeField("testDateTimeField"),
    testBlobField("testBlobField"),
    testNumericField("testNumericField"),
    testFloatingPointField("testFloatingPointField"),
    testCurrencyPreciseField("testCurrencyPreciseField"),
    testCreditCardNumberField("testCreditCardNumberField"),
    testCreditCardDateField("testCreditCardDateField"),
    testEmailField("testEmailField"),
    testUrlField("testUrlField"),
    testTelphoneField("testTelphoneField"),
    enumId("enumId"),
    testEncrypt("testEncrypt"),
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

   @org.hibernate.annotations.GenericGenerator(name="TestEntity_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="TestEntity_GEN")
   @Id
   @Column(name="TEST_ID")
   private String testId;
   @Column(name="TEST_STRING_FIELD")
   private String testStringField;
   @Column(name="TEST_DATE_TIME_FIELD")
   private Timestamp testDateTimeField;
   @Column(name="TEST_BLOB_FIELD")
   private Blob testBlobField;
   @Column(name="TEST_NUMERIC_FIELD")
   private Long testNumericField;
   @Column(name="TEST_FLOATING_POINT_FIELD")
   private BigDecimal testFloatingPointField;
   @Column(name="TEST_CURRENCY_PRECISE_FIELD")
   private BigDecimal testCurrencyPreciseField;
   @Column(name="TEST_CREDIT_CARD_NUMBER_FIELD")
   private String testCreditCardNumberField;
   @Column(name="TEST_CREDIT_CARD_DATE_FIELD")
   private String testCreditCardDateField;
   @Column(name="TEST_EMAIL_FIELD")
   private String testEmailField;
   @Column(name="TEST_URL_FIELD")
   private String testUrlField;
   @Column(name="TEST_TELPHONE_FIELD")
   private String testTelphoneField;
   @Column(name="ENUM_ID")
   private String enumId;
   @Column(name="TEST_ENCRYPT")
   private String testEncrypt;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration enumeration = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="testEntity", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="TEST_ENTITY_ID")
   
   private List<TestEntityItem> testEntityItems = null;

  /**
   * Default constructor.
   */
  public TestEntity() {
      super();
      this.baseEntityName = "TestEntity";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("testId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("testId");this.allFieldsNames.add("testStringField");this.allFieldsNames.add("testDateTimeField");this.allFieldsNames.add("testBlobField");this.allFieldsNames.add("testNumericField");this.allFieldsNames.add("testFloatingPointField");this.allFieldsNames.add("testCurrencyPreciseField");this.allFieldsNames.add("testCreditCardNumberField");this.allFieldsNames.add("testCreditCardDateField");this.allFieldsNames.add("testEmailField");this.allFieldsNames.add("testUrlField");this.allFieldsNames.add("testTelphoneField");this.allFieldsNames.add("enumId");this.allFieldsNames.add("testEncrypt");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TestEntity(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param testId the testId to set
     */
    public void setTestId(String testId) {
        this.testId = testId;
    }
    /**
     * Auto generated value setter.
     * @param testStringField the testStringField to set
     */
    public void setTestStringField(String testStringField) {
        this.testStringField = testStringField;
    }
    /**
     * Auto generated value setter.
     * @param testDateTimeField the testDateTimeField to set
     */
    public void setTestDateTimeField(Timestamp testDateTimeField) {
        this.testDateTimeField = testDateTimeField;
    }
    /**
     * Auto generated value setter.
     * @param testBlobField the testBlobField to set
     */
    public void setTestBlobField(Blob testBlobField) {
        this.testBlobField = testBlobField;
    }
    /**
     * Auto generated value setter.
     * @param testNumericField the testNumericField to set
     */
    public void setTestNumericField(Long testNumericField) {
        this.testNumericField = testNumericField;
    }
    /**
     * Auto generated value setter.
     * @param testFloatingPointField the testFloatingPointField to set
     */
    public void setTestFloatingPointField(BigDecimal testFloatingPointField) {
        this.testFloatingPointField = testFloatingPointField;
    }
    /**
     * Auto generated value setter.
     * @param testCurrencyPreciseField the testCurrencyPreciseField to set
     */
    public void setTestCurrencyPreciseField(BigDecimal testCurrencyPreciseField) {
        this.testCurrencyPreciseField = testCurrencyPreciseField;
    }
    /**
     * Auto generated value setter.
     * @param testCreditCardNumberField the testCreditCardNumberField to set
     */
    public void setTestCreditCardNumberField(String testCreditCardNumberField) {
        this.testCreditCardNumberField = testCreditCardNumberField;
    }
    /**
     * Auto generated value setter.
     * @param testCreditCardDateField the testCreditCardDateField to set
     */
    public void setTestCreditCardDateField(String testCreditCardDateField) {
        this.testCreditCardDateField = testCreditCardDateField;
    }
    /**
     * Auto generated value setter.
     * @param testEmailField the testEmailField to set
     */
    public void setTestEmailField(String testEmailField) {
        this.testEmailField = testEmailField;
    }
    /**
     * Auto generated value setter.
     * @param testUrlField the testUrlField to set
     */
    public void setTestUrlField(String testUrlField) {
        this.testUrlField = testUrlField;
    }
    /**
     * Auto generated value setter.
     * @param testTelphoneField the testTelphoneField to set
     */
    public void setTestTelphoneField(String testTelphoneField) {
        this.testTelphoneField = testTelphoneField;
    }
    /**
     * Auto generated value setter.
     * @param enumId the enumId to set
     */
    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }
    /**
     * Auto generated value setter.
     * @param testEncrypt the testEncrypt to set
     */
    public void setTestEncrypt(String testEncrypt) {
        this.testEncrypt = testEncrypt;
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
    public String getTestId() {
        return this.testId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestStringField() {
        return this.testStringField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTestDateTimeField() {
        return this.testDateTimeField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Blob</code>
     */
    public Blob getTestBlobField() {
        return this.testBlobField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTestNumericField() {
        return this.testNumericField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTestFloatingPointField() {
        return this.testFloatingPointField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTestCurrencyPreciseField() {
        return this.testCurrencyPreciseField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestCreditCardNumberField() {
        return this.testCreditCardNumberField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestCreditCardDateField() {
        return this.testCreditCardDateField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestEmailField() {
        return this.testEmailField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestUrlField() {
        return this.testUrlField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestTelphoneField() {
        return this.testTelphoneField;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnumId() {
        return this.enumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestEncrypt() {
        return this.testEncrypt;
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
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getEnumeration() throws RepositoryException {
        if (this.enumeration == null) {
            this.enumeration = getRelatedOne(Enumeration.class, "Enumeration");
        }
        return this.enumeration;
    }
    /**
     * Auto generated method that gets the related <code>TestEntityItem</code> by the relation named <code>TestEntityItem</code>.
     * @return the list of <code>TestEntityItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TestEntityItem> getTestEntityItems() throws RepositoryException {
        if (this.testEntityItems == null) {
            this.testEntityItems = getRelated(TestEntityItem.class, "TestEntityItem");
        }
        return this.testEntityItems;
    }

    /**
     * Auto generated value setter.
     * @param enumeration the enumeration to set
    */
    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }
    /**
     * Auto generated value setter.
     * @param testEntityItems the testEntityItems to set
    */
    public void setTestEntityItems(List<TestEntityItem> testEntityItems) {
        this.testEntityItems = testEntityItems;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addTestEntityItem(TestEntityItem testEntityItem) {
        if (this.testEntityItems == null) {
            this.testEntityItems = new ArrayList<TestEntityItem>();
        }
        this.testEntityItems.add(testEntityItem);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeTestEntityItem(TestEntityItem testEntityItem) {
        if (this.testEntityItems == null) {
            return;
        }
        this.testEntityItems.remove(testEntityItem);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearTestEntityItem() {
        if (this.testEntityItems == null) {
            return;
        }
        this.testEntityItems.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTestId((String) mapValue.get("testId"));
        setTestStringField((String) mapValue.get("testStringField"));
        setTestDateTimeField((Timestamp) mapValue.get("testDateTimeField"));
        setTestBlobField((Blob) mapValue.get("testBlobField"));
        setTestNumericField((Long) mapValue.get("testNumericField"));
        setTestFloatingPointField(convertToBigDecimal(mapValue.get("testFloatingPointField")));
        setTestCurrencyPreciseField(convertToBigDecimal(mapValue.get("testCurrencyPreciseField")));
        setTestCreditCardNumberField((String) mapValue.get("testCreditCardNumberField"));
        setTestCreditCardDateField((String) mapValue.get("testCreditCardDateField"));
        setTestEmailField((String) mapValue.get("testEmailField"));
        setTestUrlField((String) mapValue.get("testUrlField"));
        setTestTelphoneField((String) mapValue.get("testTelphoneField"));
        setEnumId((String) mapValue.get("enumId"));
        setTestEncrypt((String) mapValue.get("testEncrypt"));
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
        mapValue.put("testId", getTestId());
        mapValue.put("testStringField", getTestStringField());
        mapValue.put("testDateTimeField", getTestDateTimeField());
        mapValue.put("testBlobField", getTestBlobField());
        mapValue.put("testNumericField", getTestNumericField());
        mapValue.put("testFloatingPointField", getTestFloatingPointField());
        mapValue.put("testCurrencyPreciseField", getTestCurrencyPreciseField());
        mapValue.put("testCreditCardNumberField", getTestCreditCardNumberField());
        mapValue.put("testCreditCardDateField", getTestCreditCardDateField());
        mapValue.put("testEmailField", getTestEmailField());
        mapValue.put("testUrlField", getTestUrlField());
        mapValue.put("testTelphoneField", getTestTelphoneField());
        mapValue.put("enumId", getEnumId());
        mapValue.put("testEncrypt", getTestEncrypt());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
