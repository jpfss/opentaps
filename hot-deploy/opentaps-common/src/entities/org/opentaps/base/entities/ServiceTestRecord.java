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
 * Auto generated base entity ServiceTestRecord.
 */
@javax.persistence.Entity
@Table(name="SERVICE_TEST_RECORD")
public class ServiceTestRecord extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("key1", "KEY1");
        fields.put("key2", "KEY2");
        fields.put("value1", "VALUE1");
        fields.put("value2", "VALUE2");
        fields.put("testTimestamp", "TEST_TIMESTAMP");
        fields.put("createdByUserLogin", "CREATED_BY_USER_LOGIN");
        fields.put("modifiedByUserLogin", "MODIFIED_BY_USER_LOGIN");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ServiceTestRecord", fields);
}
  public static enum Fields implements EntityFieldInterface<ServiceTestRecord> {
    key1("key1"),
    key2("key2"),
    value1("value1"),
    value2("value2"),
    testTimestamp("testTimestamp"),
    createdByUserLogin("createdByUserLogin"),
    modifiedByUserLogin("modifiedByUserLogin"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ServiceTestRecordPkBridge.class)
     private ServiceTestRecordPk id = new ServiceTestRecordPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ServiceTestRecordPk</code>
     */
      public ServiceTestRecordPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ServiceTestRecordPk</code> value to set
    */   
      public void setId(ServiceTestRecordPk id) {
         this.id = id;
      }
   @Column(name="VALUE1")
   private BigDecimal value1;
   @Column(name="VALUE2")
   private BigDecimal value2;
   @Column(name="TEST_TIMESTAMP")
   private Timestamp testTimestamp;
   @Column(name="CREATED_BY_USER_LOGIN")
   private String createdByUserLogin;
   @Column(name="MODIFIED_BY_USER_LOGIN")
   private String modifiedByUserLogin;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CREATED_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin relatedCreatedByUserLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="MODIFIED_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin relatedModifiedByUserLogin = null;

  /**
   * Default constructor.
   */
  public ServiceTestRecord() {
      super();
      this.baseEntityName = "ServiceTestRecord";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("key1");this.primaryKeyNames.add("key2");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("key1");this.allFieldsNames.add("key2");this.allFieldsNames.add("value1");this.allFieldsNames.add("value2");this.allFieldsNames.add("testTimestamp");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("modifiedByUserLogin");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ServiceTestRecord(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param key1 the key1 to set
     */
    public void setKey1(String key1) {
        id.setKey1(key1);
    }
    /**
     * Auto generated value setter.
     * @param key2 the key2 to set
     */
    public void setKey2(String key2) {
        id.setKey2(key2);
    }
    /**
     * Auto generated value setter.
     * @param value1 the value1 to set
     */
    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }
    /**
     * Auto generated value setter.
     * @param value2 the value2 to set
     */
    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }
    /**
     * Auto generated value setter.
     * @param testTimestamp the testTimestamp to set
     */
    public void setTestTimestamp(Timestamp testTimestamp) {
        this.testTimestamp = testTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param modifiedByUserLogin the modifiedByUserLogin to set
     */
    public void setModifiedByUserLogin(String modifiedByUserLogin) {
        this.modifiedByUserLogin = modifiedByUserLogin;
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
    public String getKey1() {
        return this.id.getKey1();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getKey2() {
        return this.id.getKey2();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getValue1() {
        return this.value1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getValue2() {
        return this.value2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTestTimestamp() {
        return this.testTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getModifiedByUserLogin() {
        return this.modifiedByUserLogin;
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
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>CreatedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getRelatedCreatedByUserLogin() throws RepositoryException {
        if (this.relatedCreatedByUserLogin == null) {
            this.relatedCreatedByUserLogin = getRelatedOne(UserLogin.class, "CreatedByUserLogin");
        }
        return this.relatedCreatedByUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>ModifiedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getRelatedModifiedByUserLogin() throws RepositoryException {
        if (this.relatedModifiedByUserLogin == null) {
            this.relatedModifiedByUserLogin = getRelatedOne(UserLogin.class, "ModifiedByUserLogin");
        }
        return this.relatedModifiedByUserLogin;
    }

    /**
     * Auto generated value setter.
     * @param relatedCreatedByUserLogin the relatedCreatedByUserLogin to set
    */
    public void setRelatedCreatedByUserLogin(UserLogin relatedCreatedByUserLogin) {
        this.relatedCreatedByUserLogin = relatedCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param relatedModifiedByUserLogin the relatedModifiedByUserLogin to set
    */
    public void setRelatedModifiedByUserLogin(UserLogin relatedModifiedByUserLogin) {
        this.relatedModifiedByUserLogin = relatedModifiedByUserLogin;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setKey1((String) mapValue.get("key1"));
        setKey2((String) mapValue.get("key2"));
        setValue1(convertToBigDecimal(mapValue.get("value1")));
        setValue2(convertToBigDecimal(mapValue.get("value2")));
        setTestTimestamp((Timestamp) mapValue.get("testTimestamp"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setModifiedByUserLogin((String) mapValue.get("modifiedByUserLogin"));
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
        mapValue.put("key1", getKey1());
        mapValue.put("key2", getKey2());
        mapValue.put("value1", getValue1());
        mapValue.put("value2", getValue2());
        mapValue.put("testTimestamp", getTestTimestamp());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("modifiedByUserLogin", getModifiedByUserLogin());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
