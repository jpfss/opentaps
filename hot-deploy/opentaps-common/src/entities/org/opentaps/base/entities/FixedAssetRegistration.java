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
 * Auto generated base entity FixedAssetRegistration.
 */
@javax.persistence.Entity
@Table(name="FIXED_ASSET_REGISTRATION")
public class FixedAssetRegistration extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("fixedAssetId", "FIXED_ASSET_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("registrationDate", "REGISTRATION_DATE");
        fields.put("govAgencyPartyId", "GOV_AGENCY_PARTY_ID");
        fields.put("registrationNumber", "REGISTRATION_NUMBER");
        fields.put("licenseNumber", "LICENSE_NUMBER");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FixedAssetRegistration", fields);
}
  public static enum Fields implements EntityFieldInterface<FixedAssetRegistration> {
    fixedAssetId("fixedAssetId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    registrationDate("registrationDate"),
    govAgencyPartyId("govAgencyPartyId"),
    registrationNumber("registrationNumber"),
    licenseNumber("licenseNumber"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.FixedAssetRegistrationPkBridge.class)
     private FixedAssetRegistrationPk id = new FixedAssetRegistrationPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>FixedAssetRegistrationPk</code>
     */
      public FixedAssetRegistrationPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>FixedAssetRegistrationPk</code> value to set
    */   
      public void setId(FixedAssetRegistrationPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="REGISTRATION_DATE")
   private Timestamp registrationDate;
   @Column(name="GOV_AGENCY_PARTY_ID")
   private String govAgencyPartyId;
   @Column(name="REGISTRATION_NUMBER")
   private String registrationNumber;
   @Column(name="LICENSE_NUMBER")
   private String licenseNumber;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FIXED_ASSET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FixedAsset fixedAsset = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GOV_AGENCY_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party govAgencyParty = null;

  /**
   * Default constructor.
   */
  public FixedAssetRegistration() {
      super();
      this.baseEntityName = "FixedAssetRegistration";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("fixedAssetId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("registrationDate");this.allFieldsNames.add("govAgencyPartyId");this.allFieldsNames.add("registrationNumber");this.allFieldsNames.add("licenseNumber");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FixedAssetRegistration(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param fixedAssetId the fixedAssetId to set
     */
    public void setFixedAssetId(String fixedAssetId) {
        id.setFixedAssetId(fixedAssetId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param registrationDate the registrationDate to set
     */
    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }
    /**
     * Auto generated value setter.
     * @param govAgencyPartyId the govAgencyPartyId to set
     */
    public void setGovAgencyPartyId(String govAgencyPartyId) {
        this.govAgencyPartyId = govAgencyPartyId;
    }
    /**
     * Auto generated value setter.
     * @param registrationNumber the registrationNumber to set
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    /**
     * Auto generated value setter.
     * @param licenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
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
    public String getFixedAssetId() {
        return this.id.getFixedAssetId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRegistrationDate() {
        return this.registrationDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGovAgencyPartyId() {
        return this.govAgencyPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLicenseNumber() {
        return this.licenseNumber;
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
     * Auto generated method that gets the related <code>FixedAsset</code> by the relation named <code>FixedAsset</code>.
     * @return the <code>FixedAsset</code>
     * @throws RepositoryException if an error occurs
     */
    public FixedAsset getFixedAsset() throws RepositoryException {
        if (this.fixedAsset == null) {
            this.fixedAsset = getRelatedOne(FixedAsset.class, "FixedAsset");
        }
        return this.fixedAsset;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>GovAgencyParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getGovAgencyParty() throws RepositoryException {
        if (this.govAgencyParty == null) {
            this.govAgencyParty = getRelatedOne(Party.class, "GovAgencyParty");
        }
        return this.govAgencyParty;
    }

    /**
     * Auto generated value setter.
     * @param fixedAsset the fixedAsset to set
    */
    public void setFixedAsset(FixedAsset fixedAsset) {
        this.fixedAsset = fixedAsset;
    }
    /**
     * Auto generated value setter.
     * @param govAgencyParty the govAgencyParty to set
    */
    public void setGovAgencyParty(Party govAgencyParty) {
        this.govAgencyParty = govAgencyParty;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setRegistrationDate((Timestamp) mapValue.get("registrationDate"));
        setGovAgencyPartyId((String) mapValue.get("govAgencyPartyId"));
        setRegistrationNumber((String) mapValue.get("registrationNumber"));
        setLicenseNumber((String) mapValue.get("licenseNumber"));
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
        mapValue.put("fixedAssetId", getFixedAssetId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("registrationDate", getRegistrationDate());
        mapValue.put("govAgencyPartyId", getGovAgencyPartyId());
        mapValue.put("registrationNumber", getRegistrationNumber());
        mapValue.put("licenseNumber", getLicenseNumber());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
