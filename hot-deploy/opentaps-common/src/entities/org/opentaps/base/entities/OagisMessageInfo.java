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
 * Auto generated base entity OagisMessageInfo.
 */
@javax.persistence.Entity
@Table(name="OAGIS_MESSAGE_INFO")
public class OagisMessageInfo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("logicalId", "LOGICAL_ID");
        fields.put("component", "COMPONENT");
        fields.put("task", "TASK");
        fields.put("referenceId", "REFERENCE_ID");
        fields.put("authId", "AUTH_ID");
        fields.put("outgoingMessage", "OUTGOING_MESSAGE");
        fields.put("sentDate", "SENT_DATE");
        fields.put("receivedDate", "RECEIVED_DATE");
        fields.put("confirmation", "CONFIRMATION");
        fields.put("bsrVerb", "BSR_VERB");
        fields.put("bsrNoun", "BSR_NOUN");
        fields.put("bsrRevision", "BSR_REVISION");
        fields.put("processingStatusId", "PROCESSING_STATUS_ID");
        fields.put("orderId", "ORDER_ID");
        fields.put("returnId", "RETURN_ID");
        fields.put("shipmentId", "SHIPMENT_ID");
        fields.put("origRef", "ORIG_REF");
        fields.put("fullMessageXml", "FULL_MESSAGE_XML");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OagisMessageInfo", fields);
}
  public static enum Fields implements EntityFieldInterface<OagisMessageInfo> {
    logicalId("logicalId"),
    component("component"),
    task("task"),
    referenceId("referenceId"),
    authId("authId"),
    outgoingMessage("outgoingMessage"),
    sentDate("sentDate"),
    receivedDate("receivedDate"),
    confirmation("confirmation"),
    bsrVerb("bsrVerb"),
    bsrNoun("bsrNoun"),
    bsrRevision("bsrRevision"),
    processingStatusId("processingStatusId"),
    orderId("orderId"),
    returnId("returnId"),
    shipmentId("shipmentId"),
    origRef("origRef"),
    fullMessageXml("fullMessageXml"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OagisMessageInfoPkBridge.class)
     private OagisMessageInfoPk id = new OagisMessageInfoPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OagisMessageInfoPk</code>
     */
      public OagisMessageInfoPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OagisMessageInfoPk</code> value to set
    */   
      public void setId(OagisMessageInfoPk id) {
         this.id = id;
      }
   @Column(name="AUTH_ID")
   private String authId;
   @Column(name="OUTGOING_MESSAGE")
   private String outgoingMessage;
   @Column(name="SENT_DATE")
   private Timestamp sentDate;
   @Column(name="RECEIVED_DATE")
   private Timestamp receivedDate;
   @Column(name="CONFIRMATION")
   private String confirmation;
   @Column(name="BSR_VERB")
   private String bsrVerb;
   @Column(name="BSR_NOUN")
   private String bsrNoun;
   @Column(name="BSR_REVISION")
   private String bsrRevision;
   @Column(name="PROCESSING_STATUS_ID")
   private String processingStatusId;
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="RETURN_ID")
   private String returnId;
   @Column(name="SHIPMENT_ID")
   private String shipmentId;
   @Column(name="ORIG_REF")
   private String origRef;
   @Column(name="FULL_MESSAGE_XML")
   private String fullMessageXml;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PROCESSING_STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem processingStatusItem = null;
   private transient List<OagisMessageErrorInfo> oagisMessageErrorInfoes = null;

  /**
   * Default constructor.
   */
  public OagisMessageInfo() {
      super();
      this.baseEntityName = "OagisMessageInfo";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("logicalId");this.primaryKeyNames.add("component");this.primaryKeyNames.add("task");this.primaryKeyNames.add("referenceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("logicalId");this.allFieldsNames.add("component");this.allFieldsNames.add("task");this.allFieldsNames.add("referenceId");this.allFieldsNames.add("authId");this.allFieldsNames.add("outgoingMessage");this.allFieldsNames.add("sentDate");this.allFieldsNames.add("receivedDate");this.allFieldsNames.add("confirmation");this.allFieldsNames.add("bsrVerb");this.allFieldsNames.add("bsrNoun");this.allFieldsNames.add("bsrRevision");this.allFieldsNames.add("processingStatusId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("returnId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("origRef");this.allFieldsNames.add("fullMessageXml");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OagisMessageInfo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param logicalId the logicalId to set
     */
    public void setLogicalId(String logicalId) {
        id.setLogicalId(logicalId);
    }
    /**
     * Auto generated value setter.
     * @param component the component to set
     */
    public void setComponent(String component) {
        id.setComponent(component);
    }
    /**
     * Auto generated value setter.
     * @param task the task to set
     */
    public void setTask(String task) {
        id.setTask(task);
    }
    /**
     * Auto generated value setter.
     * @param referenceId the referenceId to set
     */
    public void setReferenceId(String referenceId) {
        id.setReferenceId(referenceId);
    }
    /**
     * Auto generated value setter.
     * @param authId the authId to set
     */
    public void setAuthId(String authId) {
        this.authId = authId;
    }
    /**
     * Auto generated value setter.
     * @param outgoingMessage the outgoingMessage to set
     */
    public void setOutgoingMessage(String outgoingMessage) {
        this.outgoingMessage = outgoingMessage;
    }
    /**
     * Auto generated value setter.
     * @param sentDate the sentDate to set
     */
    public void setSentDate(Timestamp sentDate) {
        this.sentDate = sentDate;
    }
    /**
     * Auto generated value setter.
     * @param receivedDate the receivedDate to set
     */
    public void setReceivedDate(Timestamp receivedDate) {
        this.receivedDate = receivedDate;
    }
    /**
     * Auto generated value setter.
     * @param confirmation the confirmation to set
     */
    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }
    /**
     * Auto generated value setter.
     * @param bsrVerb the bsrVerb to set
     */
    public void setBsrVerb(String bsrVerb) {
        this.bsrVerb = bsrVerb;
    }
    /**
     * Auto generated value setter.
     * @param bsrNoun the bsrNoun to set
     */
    public void setBsrNoun(String bsrNoun) {
        this.bsrNoun = bsrNoun;
    }
    /**
     * Auto generated value setter.
     * @param bsrRevision the bsrRevision to set
     */
    public void setBsrRevision(String bsrRevision) {
        this.bsrRevision = bsrRevision;
    }
    /**
     * Auto generated value setter.
     * @param processingStatusId the processingStatusId to set
     */
    public void setProcessingStatusId(String processingStatusId) {
        this.processingStatusId = processingStatusId;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    /**
     * Auto generated value setter.
     * @param origRef the origRef to set
     */
    public void setOrigRef(String origRef) {
        this.origRef = origRef;
    }
    /**
     * Auto generated value setter.
     * @param fullMessageXml the fullMessageXml to set
     */
    public void setFullMessageXml(String fullMessageXml) {
        this.fullMessageXml = fullMessageXml;
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
    public String getLogicalId() {
        return this.id.getLogicalId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComponent() {
        return this.id.getComponent();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTask() {
        return this.id.getTask();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReferenceId() {
        return this.id.getReferenceId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAuthId() {
        return this.authId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOutgoingMessage() {
        return this.outgoingMessage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getSentDate() {
        return this.sentDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReceivedDate() {
        return this.receivedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfirmation() {
        return this.confirmation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBsrVerb() {
        return this.bsrVerb;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBsrNoun() {
        return this.bsrNoun;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBsrRevision() {
        return this.bsrRevision;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProcessingStatusId() {
        return this.processingStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnId() {
        return this.returnId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrigRef() {
        return this.origRef;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFullMessageXml() {
        return this.fullMessageXml;
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
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>ProcessingStatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getProcessingStatusItem() throws RepositoryException {
        if (this.processingStatusItem == null) {
            this.processingStatusItem = getRelatedOne(StatusItem.class, "ProcessingStatusItem");
        }
        return this.processingStatusItem;
    }
    /**
     * Auto generated method that gets the related <code>OagisMessageErrorInfo</code> by the relation named <code>OagisMessageErrorInfo</code>.
     * @return the list of <code>OagisMessageErrorInfo</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OagisMessageErrorInfo> getOagisMessageErrorInfoes() throws RepositoryException {
        if (this.oagisMessageErrorInfoes == null) {
            this.oagisMessageErrorInfoes = getRelated(OagisMessageErrorInfo.class, "OagisMessageErrorInfo");
        }
        return this.oagisMessageErrorInfoes;
    }

    /**
     * Auto generated value setter.
     * @param processingStatusItem the processingStatusItem to set
    */
    public void setProcessingStatusItem(StatusItem processingStatusItem) {
        this.processingStatusItem = processingStatusItem;
    }
    /**
     * Auto generated value setter.
     * @param oagisMessageErrorInfoes the oagisMessageErrorInfoes to set
    */
    public void setOagisMessageErrorInfoes(List<OagisMessageErrorInfo> oagisMessageErrorInfoes) {
        this.oagisMessageErrorInfoes = oagisMessageErrorInfoes;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setLogicalId((String) mapValue.get("logicalId"));
        setComponent((String) mapValue.get("component"));
        setTask((String) mapValue.get("task"));
        setReferenceId((String) mapValue.get("referenceId"));
        setAuthId((String) mapValue.get("authId"));
        setOutgoingMessage((String) mapValue.get("outgoingMessage"));
        setSentDate((Timestamp) mapValue.get("sentDate"));
        setReceivedDate((Timestamp) mapValue.get("receivedDate"));
        setConfirmation((String) mapValue.get("confirmation"));
        setBsrVerb((String) mapValue.get("bsrVerb"));
        setBsrNoun((String) mapValue.get("bsrNoun"));
        setBsrRevision((String) mapValue.get("bsrRevision"));
        setProcessingStatusId((String) mapValue.get("processingStatusId"));
        setOrderId((String) mapValue.get("orderId"));
        setReturnId((String) mapValue.get("returnId"));
        setShipmentId((String) mapValue.get("shipmentId"));
        setOrigRef((String) mapValue.get("origRef"));
        setFullMessageXml((String) mapValue.get("fullMessageXml"));
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
        mapValue.put("logicalId", getLogicalId());
        mapValue.put("component", getComponent());
        mapValue.put("task", getTask());
        mapValue.put("referenceId", getReferenceId());
        mapValue.put("authId", getAuthId());
        mapValue.put("outgoingMessage", getOutgoingMessage());
        mapValue.put("sentDate", getSentDate());
        mapValue.put("receivedDate", getReceivedDate());
        mapValue.put("confirmation", getConfirmation());
        mapValue.put("bsrVerb", getBsrVerb());
        mapValue.put("bsrNoun", getBsrNoun());
        mapValue.put("bsrRevision", getBsrRevision());
        mapValue.put("processingStatusId", getProcessingStatusId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("returnId", getReturnId());
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("origRef", getOrigRef());
        mapValue.put("fullMessageXml", getFullMessageXml());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
