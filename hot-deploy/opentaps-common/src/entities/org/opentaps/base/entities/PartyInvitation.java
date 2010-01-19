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
 * Auto generated base entity PartyInvitation.
 */
@javax.persistence.Entity
@Table(name="PARTY_INVITATION")
public class PartyInvitation extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyInvitationId", "PARTY_INVITATION_ID");
        fields.put("partyIdFrom", "PARTY_ID_FROM");
        fields.put("partyId", "PARTY_ID");
        fields.put("toName", "TO_NAME");
        fields.put("emailAddress", "EMAIL_ADDRESS");
        fields.put("statusId", "STATUS_ID");
        fields.put("lastInviteDate", "LAST_INVITE_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyInvitation", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyInvitation> {
    partyInvitationId("partyInvitationId"),
    partyIdFrom("partyIdFrom"),
    partyId("partyId"),
    toName("toName"),
    emailAddress("emailAddress"),
    statusId("statusId"),
    lastInviteDate("lastInviteDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="PartyInvitation_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PartyInvitation_GEN")
   @Id
   @Column(name="PARTY_INVITATION_ID")
   private String partyInvitationId;
   @Column(name="PARTY_ID_FROM")
   private String partyIdFrom;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="TO_NAME")
   private String toName;
   @Column(name="EMAIL_ADDRESS")
   private String emailAddress;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="LAST_INVITE_DATE")
   private Timestamp lastInviteDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="partyInvitation", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARTY_INVITATION_ID")
   
   private List<PartyInvitationGroupAssoc> partyInvitationGroupAssocs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="partyInvitation", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARTY_INVITATION_ID")
   
   private List<PartyInvitationRoleAssoc> partyInvitationRoleAssocs = null;

  /**
   * Default constructor.
   */
  public PartyInvitation() {
      super();
      this.baseEntityName = "PartyInvitation";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyInvitationId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyInvitationId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyId");this.allFieldsNames.add("toName");this.allFieldsNames.add("emailAddress");this.allFieldsNames.add("statusId");this.allFieldsNames.add("lastInviteDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyInvitation(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyInvitationId the partyInvitationId to set
     */
    public void setPartyInvitationId(String partyInvitationId) {
        this.partyInvitationId = partyInvitationId;
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
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param toName the toName to set
     */
    public void setToName(String toName) {
        this.toName = toName;
    }
    /**
     * Auto generated value setter.
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
     * @param lastInviteDate the lastInviteDate to set
     */
    public void setLastInviteDate(Timestamp lastInviteDate) {
        this.lastInviteDate = lastInviteDate;
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
    public String getPartyInvitationId() {
        return this.partyInvitationId;
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
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToName() {
        return this.toName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEmailAddress() {
        return this.emailAddress;
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
    public Timestamp getLastInviteDate() {
        return this.lastInviteDate;
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
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
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
     * Auto generated method that gets the related <code>PartyInvitationGroupAssoc</code> by the relation named <code>PartyInvitationGroupAssoc</code>.
     * @return the list of <code>PartyInvitationGroupAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyInvitationGroupAssoc> getPartyInvitationGroupAssocs() throws RepositoryException {
        if (this.partyInvitationGroupAssocs == null) {
            this.partyInvitationGroupAssocs = getRelated(PartyInvitationGroupAssoc.class, "PartyInvitationGroupAssoc");
        }
        return this.partyInvitationGroupAssocs;
    }
    /**
     * Auto generated method that gets the related <code>PartyInvitationRoleAssoc</code> by the relation named <code>PartyInvitationRoleAssoc</code>.
     * @return the list of <code>PartyInvitationRoleAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyInvitationRoleAssoc> getPartyInvitationRoleAssocs() throws RepositoryException {
        if (this.partyInvitationRoleAssocs == null) {
            this.partyInvitationRoleAssocs = getRelated(PartyInvitationRoleAssoc.class, "PartyInvitationRoleAssoc");
        }
        return this.partyInvitationRoleAssocs;
    }

    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
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
     * @param partyInvitationGroupAssocs the partyInvitationGroupAssocs to set
    */
    public void setPartyInvitationGroupAssocs(List<PartyInvitationGroupAssoc> partyInvitationGroupAssocs) {
        this.partyInvitationGroupAssocs = partyInvitationGroupAssocs;
    }
    /**
     * Auto generated value setter.
     * @param partyInvitationRoleAssocs the partyInvitationRoleAssocs to set
    */
    public void setPartyInvitationRoleAssocs(List<PartyInvitationRoleAssoc> partyInvitationRoleAssocs) {
        this.partyInvitationRoleAssocs = partyInvitationRoleAssocs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyInvitationGroupAssoc(PartyInvitationGroupAssoc partyInvitationGroupAssoc) {
        if (this.partyInvitationGroupAssocs == null) {
            this.partyInvitationGroupAssocs = new ArrayList<PartyInvitationGroupAssoc>();
        }
        this.partyInvitationGroupAssocs.add(partyInvitationGroupAssoc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyInvitationGroupAssoc(PartyInvitationGroupAssoc partyInvitationGroupAssoc) {
        if (this.partyInvitationGroupAssocs == null) {
            return;
        }
        this.partyInvitationGroupAssocs.remove(partyInvitationGroupAssoc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyInvitationGroupAssoc() {
        if (this.partyInvitationGroupAssocs == null) {
            return;
        }
        this.partyInvitationGroupAssocs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyInvitationRoleAssoc(PartyInvitationRoleAssoc partyInvitationRoleAssoc) {
        if (this.partyInvitationRoleAssocs == null) {
            this.partyInvitationRoleAssocs = new ArrayList<PartyInvitationRoleAssoc>();
        }
        this.partyInvitationRoleAssocs.add(partyInvitationRoleAssoc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyInvitationRoleAssoc(PartyInvitationRoleAssoc partyInvitationRoleAssoc) {
        if (this.partyInvitationRoleAssocs == null) {
            return;
        }
        this.partyInvitationRoleAssocs.remove(partyInvitationRoleAssoc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyInvitationRoleAssoc() {
        if (this.partyInvitationRoleAssocs == null) {
            return;
        }
        this.partyInvitationRoleAssocs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyInvitationId((String) mapValue.get("partyInvitationId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyId((String) mapValue.get("partyId"));
        setToName((String) mapValue.get("toName"));
        setEmailAddress((String) mapValue.get("emailAddress"));
        setStatusId((String) mapValue.get("statusId"));
        setLastInviteDate((Timestamp) mapValue.get("lastInviteDate"));
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
        mapValue.put("partyInvitationId", getPartyInvitationId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyId", getPartyId());
        mapValue.put("toName", getToName());
        mapValue.put("emailAddress", getEmailAddress());
        mapValue.put("statusId", getStatusId());
        mapValue.put("lastInviteDate", getLastInviteDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
