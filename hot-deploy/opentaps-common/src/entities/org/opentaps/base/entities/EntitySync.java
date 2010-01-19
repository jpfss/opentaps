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
 * Auto generated base entity EntitySync.
 */
@javax.persistence.Entity
@Table(name="ENTITY_SYNC")
public class EntitySync extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("entitySyncId", "ENTITY_SYNC_ID");
        fields.put("runStatusId", "RUN_STATUS_ID");
        fields.put("lastSuccessfulSynchTime", "LAST_SUCCESSFUL_SYNCH_TIME");
        fields.put("lastHistoryStartDate", "LAST_HISTORY_START_DATE");
        fields.put("preOfflineSynchTime", "PRE_OFFLINE_SYNCH_TIME");
        fields.put("offlineSyncSplitMillis", "OFFLINE_SYNC_SPLIT_MILLIS");
        fields.put("syncSplitMillis", "SYNC_SPLIT_MILLIS");
        fields.put("syncEndBufferMillis", "SYNC_END_BUFFER_MILLIS");
        fields.put("maxRunningNoUpdateMillis", "MAX_RUNNING_NO_UPDATE_MILLIS");
        fields.put("targetServiceName", "TARGET_SERVICE_NAME");
        fields.put("targetDelegatorName", "TARGET_DELEGATOR_NAME");
        fields.put("keepRemoveInfoHours", "KEEP_REMOVE_INFO_HOURS");
        fields.put("forPullOnly", "FOR_PULL_ONLY");
        fields.put("forPushOnly", "FOR_PUSH_ONLY");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EntitySync", fields);
}
  public static enum Fields implements EntityFieldInterface<EntitySync> {
    entitySyncId("entitySyncId"),
    runStatusId("runStatusId"),
    lastSuccessfulSynchTime("lastSuccessfulSynchTime"),
    lastHistoryStartDate("lastHistoryStartDate"),
    preOfflineSynchTime("preOfflineSynchTime"),
    offlineSyncSplitMillis("offlineSyncSplitMillis"),
    syncSplitMillis("syncSplitMillis"),
    syncEndBufferMillis("syncEndBufferMillis"),
    maxRunningNoUpdateMillis("maxRunningNoUpdateMillis"),
    targetServiceName("targetServiceName"),
    targetDelegatorName("targetDelegatorName"),
    keepRemoveInfoHours("keepRemoveInfoHours"),
    forPullOnly("forPullOnly"),
    forPushOnly("forPushOnly"),
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

   @org.hibernate.annotations.GenericGenerator(name="EntitySync_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="EntitySync_GEN")
   @Id
   @Column(name="ENTITY_SYNC_ID")
   private String entitySyncId;
   @Column(name="RUN_STATUS_ID")
   private String runStatusId;
   @Column(name="LAST_SUCCESSFUL_SYNCH_TIME")
   private Timestamp lastSuccessfulSynchTime;
   @Column(name="LAST_HISTORY_START_DATE")
   private Timestamp lastHistoryStartDate;
   @Column(name="PRE_OFFLINE_SYNCH_TIME")
   private Timestamp preOfflineSynchTime;
   @Column(name="OFFLINE_SYNC_SPLIT_MILLIS")
   private Long offlineSyncSplitMillis;
   @Column(name="SYNC_SPLIT_MILLIS")
   private Long syncSplitMillis;
   @Column(name="SYNC_END_BUFFER_MILLIS")
   private Long syncEndBufferMillis;
   @Column(name="MAX_RUNNING_NO_UPDATE_MILLIS")
   private Long maxRunningNoUpdateMillis;
   @Column(name="TARGET_SERVICE_NAME")
   private String targetServiceName;
   @Column(name="TARGET_DELEGATOR_NAME")
   private String targetDelegatorName;
   @Column(name="KEEP_REMOVE_INFO_HOURS")
   private BigDecimal keepRemoveInfoHours;
   @Column(name="FOR_PULL_ONLY")
   private String forPullOnly;
   @Column(name="FOR_PUSH_ONLY")
   private String forPushOnly;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient List<EntitySyncInclGrpDetailView> entitySyncInclGrpDetailViews = null;
   private transient EntitySyncHistory lastEntitySyncHistory = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="entitySync", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ENTITY_SYNC_ID")
   
   private List<EntitySyncHistory> entitySyncHistorys = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="entitySync", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ENTITY_SYNC_ID")
   
   private List<EntitySyncInclude> entitySyncIncludes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="entitySync", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ENTITY_SYNC_ID")
   
   private List<EntitySyncIncludeGroup> entitySyncIncludeGroups = null;

  /**
   * Default constructor.
   */
  public EntitySync() {
      super();
      this.baseEntityName = "EntitySync";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("entitySyncId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("entitySyncId");this.allFieldsNames.add("runStatusId");this.allFieldsNames.add("lastSuccessfulSynchTime");this.allFieldsNames.add("lastHistoryStartDate");this.allFieldsNames.add("preOfflineSynchTime");this.allFieldsNames.add("offlineSyncSplitMillis");this.allFieldsNames.add("syncSplitMillis");this.allFieldsNames.add("syncEndBufferMillis");this.allFieldsNames.add("maxRunningNoUpdateMillis");this.allFieldsNames.add("targetServiceName");this.allFieldsNames.add("targetDelegatorName");this.allFieldsNames.add("keepRemoveInfoHours");this.allFieldsNames.add("forPullOnly");this.allFieldsNames.add("forPushOnly");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EntitySync(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param entitySyncId the entitySyncId to set
     */
    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }
    /**
     * Auto generated value setter.
     * @param runStatusId the runStatusId to set
     */
    public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }
    /**
     * Auto generated value setter.
     * @param lastSuccessfulSynchTime the lastSuccessfulSynchTime to set
     */
    public void setLastSuccessfulSynchTime(Timestamp lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }
    /**
     * Auto generated value setter.
     * @param lastHistoryStartDate the lastHistoryStartDate to set
     */
    public void setLastHistoryStartDate(Timestamp lastHistoryStartDate) {
        this.lastHistoryStartDate = lastHistoryStartDate;
    }
    /**
     * Auto generated value setter.
     * @param preOfflineSynchTime the preOfflineSynchTime to set
     */
    public void setPreOfflineSynchTime(Timestamp preOfflineSynchTime) {
        this.preOfflineSynchTime = preOfflineSynchTime;
    }
    /**
     * Auto generated value setter.
     * @param offlineSyncSplitMillis the offlineSyncSplitMillis to set
     */
    public void setOfflineSyncSplitMillis(Long offlineSyncSplitMillis) {
        this.offlineSyncSplitMillis = offlineSyncSplitMillis;
    }
    /**
     * Auto generated value setter.
     * @param syncSplitMillis the syncSplitMillis to set
     */
    public void setSyncSplitMillis(Long syncSplitMillis) {
        this.syncSplitMillis = syncSplitMillis;
    }
    /**
     * Auto generated value setter.
     * @param syncEndBufferMillis the syncEndBufferMillis to set
     */
    public void setSyncEndBufferMillis(Long syncEndBufferMillis) {
        this.syncEndBufferMillis = syncEndBufferMillis;
    }
    /**
     * Auto generated value setter.
     * @param maxRunningNoUpdateMillis the maxRunningNoUpdateMillis to set
     */
    public void setMaxRunningNoUpdateMillis(Long maxRunningNoUpdateMillis) {
        this.maxRunningNoUpdateMillis = maxRunningNoUpdateMillis;
    }
    /**
     * Auto generated value setter.
     * @param targetServiceName the targetServiceName to set
     */
    public void setTargetServiceName(String targetServiceName) {
        this.targetServiceName = targetServiceName;
    }
    /**
     * Auto generated value setter.
     * @param targetDelegatorName the targetDelegatorName to set
     */
    public void setTargetDelegatorName(String targetDelegatorName) {
        this.targetDelegatorName = targetDelegatorName;
    }
    /**
     * Auto generated value setter.
     * @param keepRemoveInfoHours the keepRemoveInfoHours to set
     */
    public void setKeepRemoveInfoHours(BigDecimal keepRemoveInfoHours) {
        this.keepRemoveInfoHours = keepRemoveInfoHours;
    }
    /**
     * Auto generated value setter.
     * @param forPullOnly the forPullOnly to set
     */
    public void setForPullOnly(String forPullOnly) {
        this.forPullOnly = forPullOnly;
    }
    /**
     * Auto generated value setter.
     * @param forPushOnly the forPushOnly to set
     */
    public void setForPushOnly(String forPushOnly) {
        this.forPushOnly = forPushOnly;
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
    public String getEntitySyncId() {
        return this.entitySyncId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRunStatusId() {
        return this.runStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastSuccessfulSynchTime() {
        return this.lastSuccessfulSynchTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastHistoryStartDate() {
        return this.lastHistoryStartDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPreOfflineSynchTime() {
        return this.preOfflineSynchTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getOfflineSyncSplitMillis() {
        return this.offlineSyncSplitMillis;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSyncSplitMillis() {
        return this.syncSplitMillis;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSyncEndBufferMillis() {
        return this.syncEndBufferMillis;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getMaxRunningNoUpdateMillis() {
        return this.maxRunningNoUpdateMillis;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTargetServiceName() {
        return this.targetServiceName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTargetDelegatorName() {
        return this.targetDelegatorName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getKeepRemoveInfoHours() {
        return this.keepRemoveInfoHours;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getForPullOnly() {
        return this.forPullOnly;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getForPushOnly() {
        return this.forPushOnly;
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
     * Auto generated method that gets the related <code>EntitySyncInclGrpDetailView</code> by the relation named <code>EntitySyncInclGrpDetailView</code>.
     * @return the list of <code>EntitySyncInclGrpDetailView</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EntitySyncInclGrpDetailView> getEntitySyncInclGrpDetailViews() throws RepositoryException {
        if (this.entitySyncInclGrpDetailViews == null) {
            this.entitySyncInclGrpDetailViews = getRelated(EntitySyncInclGrpDetailView.class, "EntitySyncInclGrpDetailView");
        }
        return this.entitySyncInclGrpDetailViews;
    }
    /**
     * Auto generated method that gets the related <code>EntitySyncHistory</code> by the relation named <code>LastEntitySyncHistory</code>.
     * @return the <code>EntitySyncHistory</code>
     * @throws RepositoryException if an error occurs
     */
    public EntitySyncHistory getLastEntitySyncHistory() throws RepositoryException {
        if (this.lastEntitySyncHistory == null) {
            this.lastEntitySyncHistory = getRelatedOne(EntitySyncHistory.class, "LastEntitySyncHistory");
        }
        return this.lastEntitySyncHistory;
    }
    /**
     * Auto generated method that gets the related <code>EntitySyncHistory</code> by the relation named <code>EntitySyncHistory</code>.
     * @return the list of <code>EntitySyncHistory</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EntitySyncHistory> getEntitySyncHistorys() throws RepositoryException {
        if (this.entitySyncHistorys == null) {
            this.entitySyncHistorys = getRelated(EntitySyncHistory.class, "EntitySyncHistory");
        }
        return this.entitySyncHistorys;
    }
    /**
     * Auto generated method that gets the related <code>EntitySyncInclude</code> by the relation named <code>EntitySyncInclude</code>.
     * @return the list of <code>EntitySyncInclude</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EntitySyncInclude> getEntitySyncIncludes() throws RepositoryException {
        if (this.entitySyncIncludes == null) {
            this.entitySyncIncludes = getRelated(EntitySyncInclude.class, "EntitySyncInclude");
        }
        return this.entitySyncIncludes;
    }
    /**
     * Auto generated method that gets the related <code>EntitySyncIncludeGroup</code> by the relation named <code>EntitySyncIncludeGroup</code>.
     * @return the list of <code>EntitySyncIncludeGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EntitySyncIncludeGroup> getEntitySyncIncludeGroups() throws RepositoryException {
        if (this.entitySyncIncludeGroups == null) {
            this.entitySyncIncludeGroups = getRelated(EntitySyncIncludeGroup.class, "EntitySyncIncludeGroup");
        }
        return this.entitySyncIncludeGroups;
    }

    /**
     * Auto generated value setter.
     * @param entitySyncInclGrpDetailViews the entitySyncInclGrpDetailViews to set
    */
    public void setEntitySyncInclGrpDetailViews(List<EntitySyncInclGrpDetailView> entitySyncInclGrpDetailViews) {
        this.entitySyncInclGrpDetailViews = entitySyncInclGrpDetailViews;
    }
    /**
     * Auto generated value setter.
     * @param lastEntitySyncHistory the lastEntitySyncHistory to set
    */
    public void setLastEntitySyncHistory(EntitySyncHistory lastEntitySyncHistory) {
        this.lastEntitySyncHistory = lastEntitySyncHistory;
    }
    /**
     * Auto generated value setter.
     * @param entitySyncHistorys the entitySyncHistorys to set
    */
    public void setEntitySyncHistorys(List<EntitySyncHistory> entitySyncHistorys) {
        this.entitySyncHistorys = entitySyncHistorys;
    }
    /**
     * Auto generated value setter.
     * @param entitySyncIncludes the entitySyncIncludes to set
    */
    public void setEntitySyncIncludes(List<EntitySyncInclude> entitySyncIncludes) {
        this.entitySyncIncludes = entitySyncIncludes;
    }
    /**
     * Auto generated value setter.
     * @param entitySyncIncludeGroups the entitySyncIncludeGroups to set
    */
    public void setEntitySyncIncludeGroups(List<EntitySyncIncludeGroup> entitySyncIncludeGroups) {
        this.entitySyncIncludeGroups = entitySyncIncludeGroups;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addEntitySyncHistory(EntitySyncHistory entitySyncHistory) {
        if (this.entitySyncHistorys == null) {
            this.entitySyncHistorys = new ArrayList<EntitySyncHistory>();
        }
        this.entitySyncHistorys.add(entitySyncHistory);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEntitySyncHistory(EntitySyncHistory entitySyncHistory) {
        if (this.entitySyncHistorys == null) {
            return;
        }
        this.entitySyncHistorys.remove(entitySyncHistory);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEntitySyncHistory() {
        if (this.entitySyncHistorys == null) {
            return;
        }
        this.entitySyncHistorys.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addEntitySyncInclude(EntitySyncInclude entitySyncInclude) {
        if (this.entitySyncIncludes == null) {
            this.entitySyncIncludes = new ArrayList<EntitySyncInclude>();
        }
        this.entitySyncIncludes.add(entitySyncInclude);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEntitySyncInclude(EntitySyncInclude entitySyncInclude) {
        if (this.entitySyncIncludes == null) {
            return;
        }
        this.entitySyncIncludes.remove(entitySyncInclude);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEntitySyncInclude() {
        if (this.entitySyncIncludes == null) {
            return;
        }
        this.entitySyncIncludes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addEntitySyncIncludeGroup(EntitySyncIncludeGroup entitySyncIncludeGroup) {
        if (this.entitySyncIncludeGroups == null) {
            this.entitySyncIncludeGroups = new ArrayList<EntitySyncIncludeGroup>();
        }
        this.entitySyncIncludeGroups.add(entitySyncIncludeGroup);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEntitySyncIncludeGroup(EntitySyncIncludeGroup entitySyncIncludeGroup) {
        if (this.entitySyncIncludeGroups == null) {
            return;
        }
        this.entitySyncIncludeGroups.remove(entitySyncIncludeGroup);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEntitySyncIncludeGroup() {
        if (this.entitySyncIncludeGroups == null) {
            return;
        }
        this.entitySyncIncludeGroups.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEntitySyncId((String) mapValue.get("entitySyncId"));
        setRunStatusId((String) mapValue.get("runStatusId"));
        setLastSuccessfulSynchTime((Timestamp) mapValue.get("lastSuccessfulSynchTime"));
        setLastHistoryStartDate((Timestamp) mapValue.get("lastHistoryStartDate"));
        setPreOfflineSynchTime((Timestamp) mapValue.get("preOfflineSynchTime"));
        setOfflineSyncSplitMillis((Long) mapValue.get("offlineSyncSplitMillis"));
        setSyncSplitMillis((Long) mapValue.get("syncSplitMillis"));
        setSyncEndBufferMillis((Long) mapValue.get("syncEndBufferMillis"));
        setMaxRunningNoUpdateMillis((Long) mapValue.get("maxRunningNoUpdateMillis"));
        setTargetServiceName((String) mapValue.get("targetServiceName"));
        setTargetDelegatorName((String) mapValue.get("targetDelegatorName"));
        setKeepRemoveInfoHours(convertToBigDecimal(mapValue.get("keepRemoveInfoHours")));
        setForPullOnly((String) mapValue.get("forPullOnly"));
        setForPushOnly((String) mapValue.get("forPushOnly"));
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
        mapValue.put("entitySyncId", getEntitySyncId());
        mapValue.put("runStatusId", getRunStatusId());
        mapValue.put("lastSuccessfulSynchTime", getLastSuccessfulSynchTime());
        mapValue.put("lastHistoryStartDate", getLastHistoryStartDate());
        mapValue.put("preOfflineSynchTime", getPreOfflineSynchTime());
        mapValue.put("offlineSyncSplitMillis", getOfflineSyncSplitMillis());
        mapValue.put("syncSplitMillis", getSyncSplitMillis());
        mapValue.put("syncEndBufferMillis", getSyncEndBufferMillis());
        mapValue.put("maxRunningNoUpdateMillis", getMaxRunningNoUpdateMillis());
        mapValue.put("targetServiceName", getTargetServiceName());
        mapValue.put("targetDelegatorName", getTargetDelegatorName());
        mapValue.put("keepRemoveInfoHours", getKeepRemoveInfoHours());
        mapValue.put("forPullOnly", getForPullOnly());
        mapValue.put("forPushOnly", getForPushOnly());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
