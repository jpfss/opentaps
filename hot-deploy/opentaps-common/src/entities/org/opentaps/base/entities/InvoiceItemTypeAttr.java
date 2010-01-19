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
 * Auto generated base entity InvoiceItemTypeAttr.
 */
@javax.persistence.Entity
@Table(name="INVOICE_ITEM_TYPE_ATTR")
public class InvoiceItemTypeAttr extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("invoiceItemTypeId", "INVOICE_ITEM_TYPE_ID");
        fields.put("attrName", "ATTR_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InvoiceItemTypeAttr", fields);
}
  public static enum Fields implements EntityFieldInterface<InvoiceItemTypeAttr> {
    invoiceItemTypeId("invoiceItemTypeId"),
    attrName("attrName"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.InvoiceItemTypeAttrPkBridge.class)
     private InvoiceItemTypeAttrPk id = new InvoiceItemTypeAttrPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>InvoiceItemTypeAttrPk</code>
     */
      public InvoiceItemTypeAttrPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>InvoiceItemTypeAttrPk</code> value to set
    */   
      public void setId(InvoiceItemTypeAttrPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InvoiceItemType invoiceItemType = null;
   private transient List<InvoiceItemAttribute> invoiceItemAttributes = null;
   private transient List<InvoiceItem> invoiceItems = null;

  /**
   * Default constructor.
   */
  public InvoiceItemTypeAttr() {
      super();
      this.baseEntityName = "InvoiceItemTypeAttr";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("invoiceItemTypeId");this.primaryKeyNames.add("attrName");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("invoiceItemTypeId");this.allFieldsNames.add("attrName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InvoiceItemTypeAttr(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param invoiceItemTypeId the invoiceItemTypeId to set
     */
    public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        id.setInvoiceItemTypeId(invoiceItemTypeId);
    }
    /**
     * Auto generated value setter.
     * @param attrName the attrName to set
     */
    public void setAttrName(String attrName) {
        id.setAttrName(attrName);
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
    public String getInvoiceItemTypeId() {
        return this.id.getInvoiceItemTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttrName() {
        return this.id.getAttrName();
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
     * Auto generated method that gets the related <code>InvoiceItemType</code> by the relation named <code>InvoiceItemType</code>.
     * @return the <code>InvoiceItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public InvoiceItemType getInvoiceItemType() throws RepositoryException {
        if (this.invoiceItemType == null) {
            this.invoiceItemType = getRelatedOne(InvoiceItemType.class, "InvoiceItemType");
        }
        return this.invoiceItemType;
    }
    /**
     * Auto generated method that gets the related <code>InvoiceItemAttribute</code> by the relation named <code>InvoiceItemAttribute</code>.
     * @return the list of <code>InvoiceItemAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InvoiceItemAttribute> getInvoiceItemAttributes() throws RepositoryException {
        if (this.invoiceItemAttributes == null) {
            this.invoiceItemAttributes = getRelated(InvoiceItemAttribute.class, "InvoiceItemAttribute");
        }
        return this.invoiceItemAttributes;
    }
    /**
     * Auto generated method that gets the related <code>InvoiceItem</code> by the relation named <code>InvoiceItem</code>.
     * @return the list of <code>InvoiceItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InvoiceItem> getInvoiceItems() throws RepositoryException {
        if (this.invoiceItems == null) {
            this.invoiceItems = getRelated(InvoiceItem.class, "InvoiceItem");
        }
        return this.invoiceItems;
    }

    /**
     * Auto generated value setter.
     * @param invoiceItemType the invoiceItemType to set
    */
    public void setInvoiceItemType(InvoiceItemType invoiceItemType) {
        this.invoiceItemType = invoiceItemType;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItemAttributes the invoiceItemAttributes to set
    */
    public void setInvoiceItemAttributes(List<InvoiceItemAttribute> invoiceItemAttributes) {
        this.invoiceItemAttributes = invoiceItemAttributes;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItems the invoiceItems to set
    */
    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInvoiceItemTypeId((String) mapValue.get("invoiceItemTypeId"));
        setAttrName((String) mapValue.get("attrName"));
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
        mapValue.put("invoiceItemTypeId", getInvoiceItemTypeId());
        mapValue.put("attrName", getAttrName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
