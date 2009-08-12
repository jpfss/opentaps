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
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity WebslingerHostMapping.
 */
@javax.persistence.Entity
@Table(name="WEBSLINGER_HOST_MAPPING")
public class WebslingerHostMapping extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("hostName", "HOST_NAME");
        fields.put("contextPath", "CONTEXT_PATH");
        fields.put("webslingerServerId", "WEBSLINGER_SERVER_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WebslingerHostMapping", fields);
}
  public static enum Fields implements EntityFieldInterface<WebslingerHostMapping> {
    hostName("hostName"),
    contextPath("contextPath"),
    webslingerServerId("webslingerServerId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.WebslingerHostMappingPkBridge.class)
     private WebslingerHostMappingPk id = new WebslingerHostMappingPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WebslingerHostMappingPk</code>
     */
      public WebslingerHostMappingPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WebslingerHostMappingPk</code> value to set
    */   
      public void setId(WebslingerHostMappingPk id) {
         this.id = id;
      }
   @Column(name="WEBSLINGER_SERVER_ID")
   private String webslingerServerId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WEBSLINGER_SERVER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WebslingerServer webslingerServer = null;

  /**
   * Default constructor.
   */
  public WebslingerHostMapping() {
      super();
      this.baseEntityName = "WebslingerHostMapping";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("hostName");this.primaryKeyNames.add("contextPath");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("hostName");this.allFieldsNames.add("contextPath");this.allFieldsNames.add("webslingerServerId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WebslingerHostMapping(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param hostName the hostName to set
     */
    public void setHostName(String hostName) {
        id.setHostName(hostName);
    }
    /**
     * Auto generated value setter.
     * @param contextPath the contextPath to set
     */
    public void setContextPath(String contextPath) {
        id.setContextPath(contextPath);
    }
    /**
     * Auto generated value setter.
     * @param webslingerServerId the webslingerServerId to set
     */
    public void setWebslingerServerId(String webslingerServerId) {
        this.webslingerServerId = webslingerServerId;
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
    public String getHostName() {
        return this.id.getHostName();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContextPath() {
        return this.id.getContextPath();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWebslingerServerId() {
        return this.webslingerServerId;
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
     * Auto generated method that gets the related <code>WebslingerServer</code> by the relation named <code>WebslingerServer</code>.
     * @return the <code>WebslingerServer</code>
     * @throws RepositoryException if an error occurs
     */
    public WebslingerServer getWebslingerServer() throws RepositoryException {
        if (this.webslingerServer == null) {
            this.webslingerServer = getRelatedOne(WebslingerServer.class, "WebslingerServer");
        }
        return this.webslingerServer;
    }

    /**
     * Auto generated value setter.
     * @param webslingerServer the webslingerServer to set
    */
    public void setWebslingerServer(WebslingerServer webslingerServer) {
        this.webslingerServer = webslingerServer;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setHostName((String) mapValue.get("hostName"));
        setContextPath((String) mapValue.get("contextPath"));
        setWebslingerServerId((String) mapValue.get("webslingerServerId"));
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
        mapValue.put("hostName", getHostName());
        mapValue.put("contextPath", getContextPath());
        mapValue.put("webslingerServerId", getWebslingerServerId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
