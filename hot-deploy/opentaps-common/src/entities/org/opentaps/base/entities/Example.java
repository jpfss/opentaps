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
import java.sql.Timestamp;

/**
 * Auto generated base entity Example.
 */
@javax.persistence.Entity
@Table(name="EXAMPLE")
public class Example extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("exampleId", "EXAMPLE_ID");
        fields.put("exampleTypeId", "EXAMPLE_TYPE_ID");
        fields.put("statusId", "STATUS_ID");
        fields.put("exampleName", "EXAMPLE_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("longDescription", "LONG_DESCRIPTION");
        fields.put("comments", "COMMENTS");
        fields.put("exampleSize", "EXAMPLE_SIZE");
        fields.put("exampleDate", "EXAMPLE_DATE");
        fields.put("anotherDate", "ANOTHER_DATE");
        fields.put("anotherText", "ANOTHER_TEXT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("Example", fields);
}
  public static enum Fields implements EntityFieldInterface<Example> {
    exampleId("exampleId"),
    exampleTypeId("exampleTypeId"),
    statusId("statusId"),
    exampleName("exampleName"),
    description("description"),
    longDescription("longDescription"),
    comments("comments"),
    exampleSize("exampleSize"),
    exampleDate("exampleDate"),
    anotherDate("anotherDate"),
    anotherText("anotherText"),
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

   @org.hibernate.annotations.GenericGenerator(name="Example_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="Example_GEN")
   @Id
   @Column(name="EXAMPLE_ID")
   private String exampleId;
   @Column(name="EXAMPLE_TYPE_ID")
   private String exampleTypeId;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="EXAMPLE_NAME")
   private String exampleName;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LONG_DESCRIPTION")
   private String longDescription;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="EXAMPLE_SIZE")
   private Long exampleSize;
   @Column(name="EXAMPLE_DATE")
   private Timestamp exampleDate;
   @Column(name="ANOTHER_DATE")
   private Timestamp anotherDate;
   @Column(name="ANOTHER_TEXT")
   private String anotherText;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EXAMPLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ExampleType exampleType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="example", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EXAMPLE_ID")
   
   private List<ExampleFeatureAppl> exampleFeatureAppls = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="example", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EXAMPLE_ID")
   
   private List<ExampleItem> exampleItems = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="example", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EXAMPLE_ID")
   
   private List<ExampleStatus> exampleStatuses = null;

  /**
   * Default constructor.
   */
  public Example() {
      super();
      this.baseEntityName = "Example";
      this.isView = false;
      this.resourceName = "ExampleEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("exampleId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("exampleId");this.allFieldsNames.add("exampleTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("exampleName");this.allFieldsNames.add("description");this.allFieldsNames.add("longDescription");this.allFieldsNames.add("comments");this.allFieldsNames.add("exampleSize");this.allFieldsNames.add("exampleDate");this.allFieldsNames.add("anotherDate");this.allFieldsNames.add("anotherText");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public Example(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param exampleId the exampleId to set
     */
    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }
    /**
     * Auto generated value setter.
     * @param exampleTypeId the exampleTypeId to set
     */
    public void setExampleTypeId(String exampleTypeId) {
        this.exampleTypeId = exampleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param exampleName the exampleName to set
     */
    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
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
     * @param longDescription the longDescription to set
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param exampleSize the exampleSize to set
     */
    public void setExampleSize(Long exampleSize) {
        this.exampleSize = exampleSize;
    }
    /**
     * Auto generated value setter.
     * @param exampleDate the exampleDate to set
     */
    public void setExampleDate(Timestamp exampleDate) {
        this.exampleDate = exampleDate;
    }
    /**
     * Auto generated value setter.
     * @param anotherDate the anotherDate to set
     */
    public void setAnotherDate(Timestamp anotherDate) {
        this.anotherDate = anotherDate;
    }
    /**
     * Auto generated value setter.
     * @param anotherText the anotherText to set
     */
    public void setAnotherText(String anotherText) {
        this.anotherText = anotherText;
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
    public String getExampleId() {
        return this.exampleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExampleTypeId() {
        return this.exampleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExampleName() {
        return this.exampleName;
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
     * @return <code>String</code>
     */
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getExampleSize() {
        return this.exampleSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getExampleDate() {
        return this.exampleDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAnotherDate() {
        return this.anotherDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAnotherText() {
        return this.anotherText;
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
     * Auto generated method that gets the related <code>ExampleType</code> by the relation named <code>ExampleType</code>.
     * @return the <code>ExampleType</code>
     * @throws RepositoryException if an error occurs
     */
    public ExampleType getExampleType() throws RepositoryException {
        if (this.exampleType == null) {
            this.exampleType = getRelatedOne(ExampleType.class, "ExampleType");
        }
        return this.exampleType;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>ExampleFeatureAppl</code> by the relation named <code>ExampleFeatureAppl</code>.
     * @return the list of <code>ExampleFeatureAppl</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ExampleFeatureAppl> getExampleFeatureAppls() throws RepositoryException {
        if (this.exampleFeatureAppls == null) {
            this.exampleFeatureAppls = getRelated(ExampleFeatureAppl.class, "ExampleFeatureAppl");
        }
        return this.exampleFeatureAppls;
    }
    /**
     * Auto generated method that gets the related <code>ExampleItem</code> by the relation named <code>ExampleItem</code>.
     * @return the list of <code>ExampleItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ExampleItem> getExampleItems() throws RepositoryException {
        if (this.exampleItems == null) {
            this.exampleItems = getRelated(ExampleItem.class, "ExampleItem");
        }
        return this.exampleItems;
    }
    /**
     * Auto generated method that gets the related <code>ExampleStatus</code> by the relation named <code>ExampleStatus</code>.
     * @return the list of <code>ExampleStatus</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ExampleStatus> getExampleStatuses() throws RepositoryException {
        if (this.exampleStatuses == null) {
            this.exampleStatuses = getRelated(ExampleStatus.class, "ExampleStatus");
        }
        return this.exampleStatuses;
    }

    /**
     * Auto generated value setter.
     * @param exampleType the exampleType to set
    */
    public void setExampleType(ExampleType exampleType) {
        this.exampleType = exampleType;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param exampleFeatureAppls the exampleFeatureAppls to set
    */
    public void setExampleFeatureAppls(List<ExampleFeatureAppl> exampleFeatureAppls) {
        this.exampleFeatureAppls = exampleFeatureAppls;
    }
    /**
     * Auto generated value setter.
     * @param exampleItems the exampleItems to set
    */
    public void setExampleItems(List<ExampleItem> exampleItems) {
        this.exampleItems = exampleItems;
    }
    /**
     * Auto generated value setter.
     * @param exampleStatuses the exampleStatuses to set
    */
    public void setExampleStatuses(List<ExampleStatus> exampleStatuses) {
        this.exampleStatuses = exampleStatuses;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addExampleFeatureAppl(ExampleFeatureAppl exampleFeatureAppl) {
        if (this.exampleFeatureAppls == null) {
            this.exampleFeatureAppls = new ArrayList<ExampleFeatureAppl>();
        }
        this.exampleFeatureAppls.add(exampleFeatureAppl);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeExampleFeatureAppl(ExampleFeatureAppl exampleFeatureAppl) {
        if (this.exampleFeatureAppls == null) {
            return;
        }
        this.exampleFeatureAppls.remove(exampleFeatureAppl);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearExampleFeatureAppl() {
        if (this.exampleFeatureAppls == null) {
            return;
        }
        this.exampleFeatureAppls.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addExampleItem(ExampleItem exampleItem) {
        if (this.exampleItems == null) {
            this.exampleItems = new ArrayList<ExampleItem>();
        }
        this.exampleItems.add(exampleItem);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeExampleItem(ExampleItem exampleItem) {
        if (this.exampleItems == null) {
            return;
        }
        this.exampleItems.remove(exampleItem);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearExampleItem() {
        if (this.exampleItems == null) {
            return;
        }
        this.exampleItems.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addExampleStatuse(ExampleStatus exampleStatuse) {
        if (this.exampleStatuses == null) {
            this.exampleStatuses = new ArrayList<ExampleStatus>();
        }
        this.exampleStatuses.add(exampleStatuse);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeExampleStatuse(ExampleStatus exampleStatuse) {
        if (this.exampleStatuses == null) {
            return;
        }
        this.exampleStatuses.remove(exampleStatuse);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearExampleStatuse() {
        if (this.exampleStatuses == null) {
            return;
        }
        this.exampleStatuses.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setExampleId((String) mapValue.get("exampleId"));
        setExampleTypeId((String) mapValue.get("exampleTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setExampleName((String) mapValue.get("exampleName"));
        setDescription((String) mapValue.get("description"));
        setLongDescription((String) mapValue.get("longDescription"));
        setComments((String) mapValue.get("comments"));
        setExampleSize((Long) mapValue.get("exampleSize"));
        setExampleDate((Timestamp) mapValue.get("exampleDate"));
        setAnotherDate((Timestamp) mapValue.get("anotherDate"));
        setAnotherText((String) mapValue.get("anotherText"));
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
        mapValue.put("exampleId", getExampleId());
        mapValue.put("exampleTypeId", getExampleTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("exampleName", getExampleName());
        mapValue.put("description", getDescription());
        mapValue.put("longDescription", getLongDescription());
        mapValue.put("comments", getComments());
        mapValue.put("exampleSize", getExampleSize());
        mapValue.put("exampleDate", getExampleDate());
        mapValue.put("anotherDate", getAnotherDate());
        mapValue.put("anotherText", getAnotherText());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
