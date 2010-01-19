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
 * Auto generated base entity WorkEffortCommunicationEventView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortCommunicationEventViews", query="SELECT CEWE.WORK_EFFORT_ID AS \"workEffortId\",CEWE.COMMUNICATION_EVENT_ID AS \"communicationEventId\",CEWE.DESCRIPTION AS \"description\",CE.COMMUNICATION_EVENT_TYPE_ID AS \"communicationEventTypeId\",CE.ORIG_COMM_EVENT_ID AS \"origCommEventId\",CE.PARENT_COMM_EVENT_ID AS \"parentCommEventId\",CE.STATUS_ID AS \"statusId\",CE.CONTACT_MECH_TYPE_ID AS \"contactMechTypeId\",CE.CONTACT_MECH_ID_FROM AS \"contactMechIdFrom\",CE.CONTACT_MECH_ID_TO AS \"contactMechIdTo\",CE.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",CE.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",CE.PARTY_ID_FROM AS \"partyIdFrom\",CE.PARTY_ID_TO AS \"partyIdTo\",CE.ENTRY_DATE AS \"entryDate\",CE.DATETIME_STARTED AS \"datetimeStarted\",CE.DATETIME_ENDED AS \"datetimeEnded\",CE.SUBJECT AS \"subject\",CE.CONTENT_MIME_TYPE_ID AS \"contentMimeTypeId\",CE.CONTENT AS \"content\",CE.NOTE AS \"note\",CE.REASON_ENUM_ID AS \"reasonEnumId\",CE.CONTACT_LIST_ID AS \"contactListId\",CE.HEADER_STRING AS \"headerString\",CE.FROM_STRING AS \"fromString\",CE.TO_STRING AS \"toString\",CE.CC_STRING AS \"ccString\",CE.BCC_STRING AS \"bccString\",CE.MESSAGE_ID AS \"messageId\" FROM COMMUNICATION_EVENT_WORK_EFF CEWE INNER JOIN COMMUNICATION_EVENT CE ON CEWE.COMMUNICATION_EVENT_ID = CE.COMMUNICATION_EVENT_ID", resultSetMapping="WorkEffortCommunicationEventViewMapping")
@SqlResultSetMapping(name="WorkEffortCommunicationEventViewMapping", entities={
@EntityResult(entityClass=WorkEffortCommunicationEventView.class, fields = {
@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="communicationEventId", column="communicationEventId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="communicationEventTypeId", column="communicationEventTypeId")
,@FieldResult(name="origCommEventId", column="origCommEventId")
,@FieldResult(name="parentCommEventId", column="parentCommEventId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="contactMechTypeId", column="contactMechTypeId")
,@FieldResult(name="contactMechIdFrom", column="contactMechIdFrom")
,@FieldResult(name="contactMechIdTo", column="contactMechIdTo")
,@FieldResult(name="roleTypeIdFrom", column="roleTypeIdFrom")
,@FieldResult(name="roleTypeIdTo", column="roleTypeIdTo")
,@FieldResult(name="partyIdFrom", column="partyIdFrom")
,@FieldResult(name="partyIdTo", column="partyIdTo")
,@FieldResult(name="entryDate", column="entryDate")
,@FieldResult(name="datetimeStarted", column="datetimeStarted")
,@FieldResult(name="datetimeEnded", column="datetimeEnded")
,@FieldResult(name="subject", column="subject")
,@FieldResult(name="contentMimeTypeId", column="contentMimeTypeId")
,@FieldResult(name="content", column="content")
,@FieldResult(name="note", column="note")
,@FieldResult(name="reasonEnumId", column="reasonEnumId")
,@FieldResult(name="contactListId", column="contactListId")
,@FieldResult(name="headerString", column="headerString")
,@FieldResult(name="fromString", column="fromString")
,@FieldResult(name="toString", column="toString")
,@FieldResult(name="ccString", column="ccString")
,@FieldResult(name="bccString", column="bccString")
,@FieldResult(name="messageId", column="messageId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortCommunicationEventView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortId", "CEWE.WORK_EFFORT_ID");
        fields.put("communicationEventId", "CEWE.COMMUNICATION_EVENT_ID");
        fields.put("description", "CEWE.DESCRIPTION");
        fields.put("communicationEventTypeId", "CE.COMMUNICATION_EVENT_TYPE_ID");
        fields.put("origCommEventId", "CE.ORIG_COMM_EVENT_ID");
        fields.put("parentCommEventId", "CE.PARENT_COMM_EVENT_ID");
        fields.put("statusId", "CE.STATUS_ID");
        fields.put("contactMechTypeId", "CE.CONTACT_MECH_TYPE_ID");
        fields.put("contactMechIdFrom", "CE.CONTACT_MECH_ID_FROM");
        fields.put("contactMechIdTo", "CE.CONTACT_MECH_ID_TO");
        fields.put("roleTypeIdFrom", "CE.ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "CE.ROLE_TYPE_ID_TO");
        fields.put("partyIdFrom", "CE.PARTY_ID_FROM");
        fields.put("partyIdTo", "CE.PARTY_ID_TO");
        fields.put("entryDate", "CE.ENTRY_DATE");
        fields.put("datetimeStarted", "CE.DATETIME_STARTED");
        fields.put("datetimeEnded", "CE.DATETIME_ENDED");
        fields.put("subject", "CE.SUBJECT");
        fields.put("contentMimeTypeId", "CE.CONTENT_MIME_TYPE_ID");
        fields.put("content", "CE.CONTENT");
        fields.put("note", "CE.NOTE");
        fields.put("reasonEnumId", "CE.REASON_ENUM_ID");
        fields.put("contactListId", "CE.CONTACT_LIST_ID");
        fields.put("headerString", "CE.HEADER_STRING");
        fields.put("fromString", "CE.FROM_STRING");
        fields.put("toString", "CE.TO_STRING");
        fields.put("ccString", "CE.CC_STRING");
        fields.put("bccString", "CE.BCC_STRING");
        fields.put("messageId", "CE.MESSAGE_ID");
fieldMapColumns.put("WorkEffortCommunicationEventView", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortCommunicationEventView> {
    workEffortId("workEffortId"),
    communicationEventId("communicationEventId"),
    description("description"),
    communicationEventTypeId("communicationEventTypeId"),
    origCommEventId("origCommEventId"),
    parentCommEventId("parentCommEventId"),
    statusId("statusId"),
    contactMechTypeId("contactMechTypeId"),
    contactMechIdFrom("contactMechIdFrom"),
    contactMechIdTo("contactMechIdTo"),
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    entryDate("entryDate"),
    datetimeStarted("datetimeStarted"),
    datetimeEnded("datetimeEnded"),
    subject("subject"),
    contentMimeTypeId("contentMimeTypeId"),
    content("content"),
    note("note"),
    reasonEnumId("reasonEnumId"),
    contactListId("contactListId"),
    headerString("headerString"),
    fromString("fromString"),
    toString("toString"),
    ccString("ccString"),
    bccString("bccString"),
    messageId("messageId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String workEffortId;
    
   private String communicationEventId;
    
   private String description;
    
   private String communicationEventTypeId;
    
   private String origCommEventId;
    
   private String parentCommEventId;
    
   private String statusId;
    
   private String contactMechTypeId;
    
   private String contactMechIdFrom;
    
   private String contactMechIdTo;
    
   private String roleTypeIdFrom;
    
   private String roleTypeIdTo;
    
   private String partyIdFrom;
    
   private String partyIdTo;
    
   private Timestamp entryDate;
    
   private Timestamp datetimeStarted;
    
   private Timestamp datetimeEnded;
    
   private String subject;
    
   private String contentMimeTypeId;
    
   private String content;
    
   private String note;
    
   private String reasonEnumId;
    
   private String contactListId;
    
   private String headerString;
    
   private String fromString;
    
   private String toString;
    
   private String ccString;
    
   private String bccString;
    
   private String messageId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COMMUNICATION_EVENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CommunicationEvent communicationEvent = null;

  /**
   * Default constructor.
   */
  public WorkEffortCommunicationEventView() {
      super();
      this.baseEntityName = "WorkEffortCommunicationEventView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("communicationEventId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("communicationEventId");this.allFieldsNames.add("description");this.allFieldsNames.add("communicationEventTypeId");this.allFieldsNames.add("origCommEventId");this.allFieldsNames.add("parentCommEventId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("contactMechTypeId");this.allFieldsNames.add("contactMechIdFrom");this.allFieldsNames.add("contactMechIdTo");this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("entryDate");this.allFieldsNames.add("datetimeStarted");this.allFieldsNames.add("datetimeEnded");this.allFieldsNames.add("subject");this.allFieldsNames.add("contentMimeTypeId");this.allFieldsNames.add("content");this.allFieldsNames.add("note");this.allFieldsNames.add("reasonEnumId");this.allFieldsNames.add("contactListId");this.allFieldsNames.add("headerString");this.allFieldsNames.add("fromString");this.allFieldsNames.add("toString");this.allFieldsNames.add("ccString");this.allFieldsNames.add("bccString");this.allFieldsNames.add("messageId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortCommunicationEventView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
    /**
     * Auto generated value setter.
     * @param communicationEventId the communicationEventId to set
     */
    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
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
     * @param communicationEventTypeId the communicationEventTypeId to set
     */
    public void setCommunicationEventTypeId(String communicationEventTypeId) {
        this.communicationEventTypeId = communicationEventTypeId;
    }
    /**
     * Auto generated value setter.
     * @param origCommEventId the origCommEventId to set
     */
    public void setOrigCommEventId(String origCommEventId) {
        this.origCommEventId = origCommEventId;
    }
    /**
     * Auto generated value setter.
     * @param parentCommEventId the parentCommEventId to set
     */
    public void setParentCommEventId(String parentCommEventId) {
        this.parentCommEventId = parentCommEventId;
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
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechIdFrom the contactMechIdFrom to set
     */
    public void setContactMechIdFrom(String contactMechIdFrom) {
        this.contactMechIdFrom = contactMechIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param contactMechIdTo the contactMechIdTo to set
     */
    public void setContactMechIdTo(String contactMechIdTo) {
        this.contactMechIdTo = contactMechIdTo;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param entryDate the entryDate to set
     */
    public void setEntryDate(Timestamp entryDate) {
        this.entryDate = entryDate;
    }
    /**
     * Auto generated value setter.
     * @param datetimeStarted the datetimeStarted to set
     */
    public void setDatetimeStarted(Timestamp datetimeStarted) {
        this.datetimeStarted = datetimeStarted;
    }
    /**
     * Auto generated value setter.
     * @param datetimeEnded the datetimeEnded to set
     */
    public void setDatetimeEnded(Timestamp datetimeEnded) {
        this.datetimeEnded = datetimeEnded;
    }
    /**
     * Auto generated value setter.
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * Auto generated value setter.
     * @param contentMimeTypeId the contentMimeTypeId to set
     */
    public void setContentMimeTypeId(String contentMimeTypeId) {
        this.contentMimeTypeId = contentMimeTypeId;
    }
    /**
     * Auto generated value setter.
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * Auto generated value setter.
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
    /**
     * Auto generated value setter.
     * @param reasonEnumId the reasonEnumId to set
     */
    public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
    /**
     * Auto generated value setter.
     * @param contactListId the contactListId to set
     */
    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }
    /**
     * Auto generated value setter.
     * @param headerString the headerString to set
     */
    public void setHeaderString(String headerString) {
        this.headerString = headerString;
    }
    /**
     * Auto generated value setter.
     * @param fromString the fromString to set
     */
    public void setFromString(String fromString) {
        this.fromString = fromString;
    }
    /**
     * Auto generated value setter.
     * @param toString the toString to set
     */
    public void setToString(String toString) {
        this.toString = toString;
    }
    /**
     * Auto generated value setter.
     * @param ccString the ccString to set
     */
    public void setCcString(String ccString) {
        this.ccString = ccString;
    }
    /**
     * Auto generated value setter.
     * @param bccString the bccString to set
     */
    public void setBccString(String bccString) {
        this.bccString = bccString;
    }
    /**
     * Auto generated value setter.
     * @param messageId the messageId to set
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCommunicationEventId() {
        return this.communicationEventId;
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
    public String getCommunicationEventTypeId() {
        return this.communicationEventTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrigCommEventId() {
        return this.origCommEventId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentCommEventId() {
        return this.parentCommEventId;
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
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechIdFrom() {
        return this.contactMechIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechIdTo() {
        return this.contactMechIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdFrom() {
        return this.roleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.roleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.partyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEntryDate() {
        return this.entryDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDatetimeStarted() {
        return this.datetimeStarted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDatetimeEnded() {
        return this.datetimeEnded;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSubject() {
        return this.subject;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentMimeTypeId() {
        return this.contentMimeTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContent() {
        return this.content;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNote() {
        return this.note;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReasonEnumId() {
        return this.reasonEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactListId() {
        return this.contactListId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHeaderString() {
        return this.headerString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFromString() {
        return this.fromString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToString() {
        return this.toString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCcString() {
        return this.ccString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBccString() {
        return this.bccString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getWorkEffort() throws RepositoryException {
        if (this.workEffort == null) {
            this.workEffort = getRelatedOne(WorkEffort.class, "WorkEffort");
        }
        return this.workEffort;
    }
    /**
     * Auto generated method that gets the related <code>CommunicationEvent</code> by the relation named <code>CommunicationEvent</code>.
     * @return the <code>CommunicationEvent</code>
     * @throws RepositoryException if an error occurs
     */
    public CommunicationEvent getCommunicationEvent() throws RepositoryException {
        if (this.communicationEvent == null) {
            this.communicationEvent = getRelatedOne(CommunicationEvent.class, "CommunicationEvent");
        }
        return this.communicationEvent;
    }

    /**
     * Auto generated value setter.
     * @param workEffort the workEffort to set
    */
    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }
    /**
     * Auto generated value setter.
     * @param communicationEvent the communicationEvent to set
    */
    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setCommunicationEventId((String) mapValue.get("communicationEventId"));
        setDescription((String) mapValue.get("description"));
        setCommunicationEventTypeId((String) mapValue.get("communicationEventTypeId"));
        setOrigCommEventId((String) mapValue.get("origCommEventId"));
        setParentCommEventId((String) mapValue.get("parentCommEventId"));
        setStatusId((String) mapValue.get("statusId"));
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        setContactMechIdFrom((String) mapValue.get("contactMechIdFrom"));
        setContactMechIdTo((String) mapValue.get("contactMechIdTo"));
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setEntryDate((Timestamp) mapValue.get("entryDate"));
        setDatetimeStarted((Timestamp) mapValue.get("datetimeStarted"));
        setDatetimeEnded((Timestamp) mapValue.get("datetimeEnded"));
        setSubject((String) mapValue.get("subject"));
        setContentMimeTypeId((String) mapValue.get("contentMimeTypeId"));
        setContent((String) mapValue.get("content"));
        setNote((String) mapValue.get("note"));
        setReasonEnumId((String) mapValue.get("reasonEnumId"));
        setContactListId((String) mapValue.get("contactListId"));
        setHeaderString((String) mapValue.get("headerString"));
        setFromString((String) mapValue.get("fromString"));
        setToString((String) mapValue.get("toString"));
        setCcString((String) mapValue.get("ccString"));
        setBccString((String) mapValue.get("bccString"));
        setMessageId((String) mapValue.get("messageId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("communicationEventId", getCommunicationEventId());
        mapValue.put("description", getDescription());
        mapValue.put("communicationEventTypeId", getCommunicationEventTypeId());
        mapValue.put("origCommEventId", getOrigCommEventId());
        mapValue.put("parentCommEventId", getParentCommEventId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("contactMechTypeId", getContactMechTypeId());
        mapValue.put("contactMechIdFrom", getContactMechIdFrom());
        mapValue.put("contactMechIdTo", getContactMechIdTo());
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("entryDate", getEntryDate());
        mapValue.put("datetimeStarted", getDatetimeStarted());
        mapValue.put("datetimeEnded", getDatetimeEnded());
        mapValue.put("subject", getSubject());
        mapValue.put("contentMimeTypeId", getContentMimeTypeId());
        mapValue.put("content", getContent());
        mapValue.put("note", getNote());
        mapValue.put("reasonEnumId", getReasonEnumId());
        mapValue.put("contactListId", getContactListId());
        mapValue.put("headerString", getHeaderString());
        mapValue.put("fromString", getFromString());
        mapValue.put("toString", getToString());
        mapValue.put("ccString", getCcString());
        mapValue.put("bccString", getBccString());
        mapValue.put("messageId", getMessageId());
        return mapValue;
    }


}
