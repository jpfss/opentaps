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
 * Auto generated base entity PartyAndStatus.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyAndStatuss", query="SELECT SI.DESCRIPTION AS \"description\",PT.PARTY_ID AS \"partyId\",PT.PARTY_TYPE_ID AS \"partyTypeId\",PT.EXTERNAL_ID AS \"externalId\",PT.PREFERRED_CURRENCY_UOM_ID AS \"preferredCurrencyUomId\",PT.DESCRIPTION AS \"description\",PT.STATUS_ID AS \"statusId\",PT.CREATED_DATE AS \"createdDate\",PT.CREATED_BY_USER_LOGIN AS \"createdByUserLogin\",PT.LAST_MODIFIED_DATE AS \"lastModifiedDate\",PT.LAST_MODIFIED_BY_USER_LOGIN AS \"lastModifiedByUserLogin\",PT.DATA_SOURCE_ID AS \"dataSourceId\",PT.IS_UNREAD AS \"isUnread\",SI.STATUS_TYPE_ID AS \"statusTypeId\",SI.STATUS_CODE AS \"statusCode\",SI.SEQUENCE_ID AS \"sequenceId\" FROM PARTY PT INNER JOIN STATUS_ITEM SI ON PT.STATUS_ID = SI.STATUS_ID", resultSetMapping="PartyAndStatusMapping")
@SqlResultSetMapping(name="PartyAndStatusMapping", entities={
@EntityResult(entityClass=PartyAndStatus.class, fields = {
@FieldResult(name="statusDescription", column="statusDescription")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="partyTypeId", column="partyTypeId")
,@FieldResult(name="externalId", column="externalId")
,@FieldResult(name="preferredCurrencyUomId", column="preferredCurrencyUomId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="createdByUserLogin", column="createdByUserLogin")
,@FieldResult(name="lastModifiedDate", column="lastModifiedDate")
,@FieldResult(name="lastModifiedByUserLogin", column="lastModifiedByUserLogin")
,@FieldResult(name="dataSourceId", column="dataSourceId")
,@FieldResult(name="isUnread", column="isUnread")
,@FieldResult(name="statusTypeId", column="statusTypeId")
,@FieldResult(name="statusCode", column="statusCode")
,@FieldResult(name="sequenceId", column="sequenceId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyAndStatus extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("statusDescription", "SI.DESCRIPTION");
        fields.put("partyId", "PT.PARTY_ID");
        fields.put("partyTypeId", "PT.PARTY_TYPE_ID");
        fields.put("externalId", "PT.EXTERNAL_ID");
        fields.put("preferredCurrencyUomId", "PT.PREFERRED_CURRENCY_UOM_ID");
        fields.put("description", "PT.DESCRIPTION");
        fields.put("statusId", "PT.STATUS_ID");
        fields.put("createdDate", "PT.CREATED_DATE");
        fields.put("createdByUserLogin", "PT.CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "PT.LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "PT.LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("dataSourceId", "PT.DATA_SOURCE_ID");
        fields.put("isUnread", "PT.IS_UNREAD");
        fields.put("statusTypeId", "SI.STATUS_TYPE_ID");
        fields.put("statusCode", "SI.STATUS_CODE");
        fields.put("sequenceId", "SI.SEQUENCE_ID");
fieldMapColumns.put("PartyAndStatus", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyAndStatus> {
    statusDescription("statusDescription"),
    partyId("partyId"),
    partyTypeId("partyTypeId"),
    externalId("externalId"),
    preferredCurrencyUomId("preferredCurrencyUomId"),
    description("description"),
    statusId("statusId"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    dataSourceId("dataSourceId"),
    isUnread("isUnread"),
    statusTypeId("statusTypeId"),
    statusCode("statusCode"),
    sequenceId("sequenceId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String statusDescription;
    @Id
   private String partyId;
    
   private String partyTypeId;
    
   private String externalId;
    
   private String preferredCurrencyUomId;
    
   private String description;
    
   private String statusId;
    
   private Timestamp createdDate;
    
   private String createdByUserLogin;
    
   private Timestamp lastModifiedDate;
    
   private String lastModifiedByUserLogin;
    
   private String dataSourceId;
    
   private String isUnread;
    
   private String statusTypeId;
    
   private String statusCode;
    
   private String sequenceId;

  /**
   * Default constructor.
   */
  public PartyAndStatus() {
      super();
      this.baseEntityName = "PartyAndStatus";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("statusDescription");this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("externalId");this.allFieldsNames.add("preferredCurrencyUomId");this.allFieldsNames.add("description");this.allFieldsNames.add("statusId");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("dataSourceId");this.allFieldsNames.add("isUnread");this.allFieldsNames.add("statusTypeId");this.allFieldsNames.add("statusCode");this.allFieldsNames.add("sequenceId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyAndStatus(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param statusDescription the statusDescription to set
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param partyTypeId the partyTypeId to set
     */
    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
    /**
     * Auto generated value setter.
     * @param externalId the externalId to set
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    /**
     * Auto generated value setter.
     * @param preferredCurrencyUomId the preferredCurrencyUomId to set
     */
    public void setPreferredCurrencyUomId(String preferredCurrencyUomId) {
        this.preferredCurrencyUomId = preferredCurrencyUomId;
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
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
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
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param dataSourceId the dataSourceId to set
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    /**
     * Auto generated value setter.
     * @param isUnread the isUnread to set
     */
    public void setIsUnread(String isUnread) {
        this.isUnread = isUnread;
    }
    /**
     * Auto generated value setter.
     * @param statusTypeId the statusTypeId to set
     */
    public void setStatusTypeId(String statusTypeId) {
        this.statusTypeId = statusTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusCode the statusCode to set
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    /**
     * Auto generated value setter.
     * @param sequenceId the sequenceId to set
     */
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusDescription() {
        return this.statusDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyTypeId() {
        return this.partyTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPreferredCurrencyUomId() {
        return this.preferredCurrencyUomId;
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
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsUnread() {
        return this.isUnread;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusTypeId() {
        return this.statusTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusCode() {
        return this.statusCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSequenceId() {
        return this.sequenceId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setStatusDescription((String) mapValue.get("statusDescription"));
        setPartyId((String) mapValue.get("partyId"));
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setExternalId((String) mapValue.get("externalId"));
        setPreferredCurrencyUomId((String) mapValue.get("preferredCurrencyUomId"));
        setDescription((String) mapValue.get("description"));
        setStatusId((String) mapValue.get("statusId"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setDataSourceId((String) mapValue.get("dataSourceId"));
        setIsUnread((String) mapValue.get("isUnread"));
        setStatusTypeId((String) mapValue.get("statusTypeId"));
        setStatusCode((String) mapValue.get("statusCode"));
        setSequenceId((String) mapValue.get("sequenceId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("statusDescription", getStatusDescription());
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("externalId", getExternalId());
        mapValue.put("preferredCurrencyUomId", getPreferredCurrencyUomId());
        mapValue.put("description", getDescription());
        mapValue.put("statusId", getStatusId());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("dataSourceId", getDataSourceId());
        mapValue.put("isUnread", getIsUnread());
        mapValue.put("statusTypeId", getStatusTypeId());
        mapValue.put("statusCode", getStatusCode());
        mapValue.put("sequenceId", getSequenceId());
        return mapValue;
    }


}
