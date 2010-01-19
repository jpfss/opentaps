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
 * Auto generated base entity TermTypeFields.
 */
@javax.persistence.Entity
@Table(name="TERM_TYPE_FIELDS")
public class TermTypeFields extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("termTypeId", "TERM_TYPE_ID");
        fields.put("field1", "FIELD1");
        fields.put("field2", "FIELD2");
        fields.put("field3", "FIELD3");
        fields.put("field4", "FIELD4");
        fields.put("field5", "FIELD5");
        fields.put("field6", "FIELD6");
        fields.put("field7", "FIELD7");
        fields.put("field8", "FIELD8");
        fields.put("field9", "FIELD9");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TermTypeFields", fields);
}
  public static enum Fields implements EntityFieldInterface<TermTypeFields> {
    termTypeId("termTypeId"),
    field1("field1"),
    field2("field2"),
    field3("field3"),
    field4("field4"),
    field5("field5"),
    field6("field6"),
    field7("field7"),
    field8("field8"),
    field9("field9"),
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

   @org.hibernate.annotations.GenericGenerator(name="TermTypeFields_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="TermTypeFields_GEN")
   @Id
   @Column(name="TERM_TYPE_ID")
   private String termTypeId;
   @Column(name="FIELD1")
   private String field1;
   @Column(name="FIELD2")
   private String field2;
   @Column(name="FIELD3")
   private String field3;
   @Column(name="FIELD4")
   private String field4;
   @Column(name="FIELD5")
   private String field5;
   @Column(name="FIELD6")
   private String field6;
   @Column(name="FIELD7")
   private String field7;
   @Column(name="FIELD8")
   private String field8;
   @Column(name="FIELD9")
   private String field9;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TERM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TermType termType = null;

  /**
   * Default constructor.
   */
  public TermTypeFields() {
      super();
      this.baseEntityName = "TermTypeFields";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("termTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("termTypeId");this.allFieldsNames.add("field1");this.allFieldsNames.add("field2");this.allFieldsNames.add("field3");this.allFieldsNames.add("field4");this.allFieldsNames.add("field5");this.allFieldsNames.add("field6");this.allFieldsNames.add("field7");this.allFieldsNames.add("field8");this.allFieldsNames.add("field9");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TermTypeFields(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param field1 the field1 to set
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }
    /**
     * Auto generated value setter.
     * @param field2 the field2 to set
     */
    public void setField2(String field2) {
        this.field2 = field2;
    }
    /**
     * Auto generated value setter.
     * @param field3 the field3 to set
     */
    public void setField3(String field3) {
        this.field3 = field3;
    }
    /**
     * Auto generated value setter.
     * @param field4 the field4 to set
     */
    public void setField4(String field4) {
        this.field4 = field4;
    }
    /**
     * Auto generated value setter.
     * @param field5 the field5 to set
     */
    public void setField5(String field5) {
        this.field5 = field5;
    }
    /**
     * Auto generated value setter.
     * @param field6 the field6 to set
     */
    public void setField6(String field6) {
        this.field6 = field6;
    }
    /**
     * Auto generated value setter.
     * @param field7 the field7 to set
     */
    public void setField7(String field7) {
        this.field7 = field7;
    }
    /**
     * Auto generated value setter.
     * @param field8 the field8 to set
     */
    public void setField8(String field8) {
        this.field8 = field8;
    }
    /**
     * Auto generated value setter.
     * @param field9 the field9 to set
     */
    public void setField9(String field9) {
        this.field9 = field9;
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
    public String getTermTypeId() {
        return this.termTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField1() {
        return this.field1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField2() {
        return this.field2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField3() {
        return this.field3;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField4() {
        return this.field4;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField5() {
        return this.field5;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField6() {
        return this.field6;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField7() {
        return this.field7;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField8() {
        return this.field8;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getField9() {
        return this.field9;
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
     * Auto generated value setter.
     * @param termType the termType to set
    */
    public void setTermType(TermType termType) {
        this.termType = termType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTermTypeId((String) mapValue.get("termTypeId"));
        setField1((String) mapValue.get("field1"));
        setField2((String) mapValue.get("field2"));
        setField3((String) mapValue.get("field3"));
        setField4((String) mapValue.get("field4"));
        setField5((String) mapValue.get("field5"));
        setField6((String) mapValue.get("field6"));
        setField7((String) mapValue.get("field7"));
        setField8((String) mapValue.get("field8"));
        setField9((String) mapValue.get("field9"));
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
        mapValue.put("termTypeId", getTermTypeId());
        mapValue.put("field1", getField1());
        mapValue.put("field2", getField2());
        mapValue.put("field3", getField3());
        mapValue.put("field4", getField4());
        mapValue.put("field5", getField5());
        mapValue.put("field6", getField6());
        mapValue.put("field7", getField7());
        mapValue.put("field8", getField8());
        mapValue.put("field9", getField9());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
