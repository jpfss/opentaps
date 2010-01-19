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
 * Auto generated base entity PaginationPreference.
 */
@javax.persistence.Entity
@Table(name="PAGINATION_PREFERENCE")
public class PaginationPreference extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("userLoginId", "USER_LOGIN_ID");
        fields.put("paginatorName", "PAGINATOR_NAME");
        fields.put("viewSize", "VIEW_SIZE");
        fields.put("cursorIndex", "CURSOR_INDEX");
        fields.put("orderBy", "ORDER_BY");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaginationPreference", fields);
}
  public static enum Fields implements EntityFieldInterface<PaginationPreference> {
    userLoginId("userLoginId"),
    paginatorName("paginatorName"),
    viewSize("viewSize"),
    cursorIndex("cursorIndex"),
    orderBy("orderBy"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PaginationPreferencePkBridge.class)
     private PaginationPreferencePk id = new PaginationPreferencePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PaginationPreferencePk</code>
     */
      public PaginationPreferencePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PaginationPreferencePk</code> value to set
    */   
      public void setId(PaginationPreferencePk id) {
         this.id = id;
      }
   @Column(name="VIEW_SIZE")
   private Long viewSize;
   @Column(name="CURSOR_INDEX")
   private Long cursorIndex;
   @Column(name="ORDER_BY")
   private String orderBy;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;

  /**
   * Default constructor.
   */
  public PaginationPreference() {
      super();
      this.baseEntityName = "PaginationPreference";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("userLoginId");this.primaryKeyNames.add("paginatorName");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("paginatorName");this.allFieldsNames.add("viewSize");this.allFieldsNames.add("cursorIndex");this.allFieldsNames.add("orderBy");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaginationPreference(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        id.setUserLoginId(userLoginId);
    }
    /**
     * Auto generated value setter.
     * @param paginatorName the paginatorName to set
     */
    public void setPaginatorName(String paginatorName) {
        id.setPaginatorName(paginatorName);
    }
    /**
     * Auto generated value setter.
     * @param viewSize the viewSize to set
     */
    public void setViewSize(Long viewSize) {
        this.viewSize = viewSize;
    }
    /**
     * Auto generated value setter.
     * @param cursorIndex the cursorIndex to set
     */
    public void setCursorIndex(Long cursorIndex) {
        this.cursorIndex = cursorIndex;
    }
    /**
     * Auto generated value setter.
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
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
    public String getUserLoginId() {
        return this.id.getUserLoginId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaginatorName() {
        return this.id.getPaginatorName();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getViewSize() {
        return this.viewSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getCursorIndex() {
        return this.cursorIndex;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderBy() {
        return this.orderBy;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUserLoginId((String) mapValue.get("userLoginId"));
        setPaginatorName((String) mapValue.get("paginatorName"));
        setViewSize((Long) mapValue.get("viewSize"));
        setCursorIndex((Long) mapValue.get("cursorIndex"));
        setOrderBy((String) mapValue.get("orderBy"));
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
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("paginatorName", getPaginatorName());
        mapValue.put("viewSize", getViewSize());
        mapValue.put("cursorIndex", getCursorIndex());
        mapValue.put("orderBy", getOrderBy());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
