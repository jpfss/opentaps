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
 * Auto generated base entity TaxAuthorityDim.
 */
@javax.persistence.Entity
@Table(name="TAX_AUTHORITY_DIM")
public class TaxAuthorityDim extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("taxAuthorityDimId", "TAX_AUTHORITY_DIM_ID");
        fields.put("dimVersion", "DIM_VERSION");
        fields.put("dateFrom", "DATE_FROM");
        fields.put("dateTo", "DATE_TO");
        fields.put("taxAuthPartyId", "TAX_AUTH_PARTY_ID");
        fields.put("taxAuthGeoId", "TAX_AUTH_GEO_ID");
        fields.put("groupName", "GROUP_NAME");
        fields.put("geoName", "GEO_NAME");
        fields.put("geoCode", "GEO_CODE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TaxAuthorityDim", fields);
}
  public static enum Fields implements EntityFieldInterface<TaxAuthorityDim> {
    taxAuthorityDimId("taxAuthorityDimId"),
    dimVersion("dimVersion"),
    dateFrom("dateFrom"),
    dateTo("dateTo"),
    taxAuthPartyId("taxAuthPartyId"),
    taxAuthGeoId("taxAuthGeoId"),
    groupName("groupName"),
    geoName("geoName"),
    geoCode("geoCode"),
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

   @org.hibernate.annotations.GenericGenerator(name="TaxAuthorityDim_GEN",  strategy="increment")
   @GeneratedValue(generator="TaxAuthorityDim_GEN")
   @Id
   @Column(name="TAX_AUTHORITY_DIM_ID")
   private Long taxAuthorityDimId;
   @Column(name="DIM_VERSION")
   private Long dimVersion;
   @Column(name="DATE_FROM")
   private Timestamp dateFrom;
   @Column(name="DATE_TO")
   private Timestamp dateTo;
   @Column(name="TAX_AUTH_PARTY_ID")
   private String taxAuthPartyId;
   @Column(name="TAX_AUTH_GEO_ID")
   private String taxAuthGeoId;
   @Column(name="GROUP_NAME")
   private String groupName;
   @Column(name="GEO_NAME")
   private String geoName;
   @Column(name="GEO_CODE")
   private String geoCode;
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
  public TaxAuthorityDim() {
      super();
      this.baseEntityName = "TaxAuthorityDim";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("taxAuthorityDimId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("taxAuthorityDimId");this.allFieldsNames.add("dimVersion");this.allFieldsNames.add("dateFrom");this.allFieldsNames.add("dateTo");this.allFieldsNames.add("taxAuthPartyId");this.allFieldsNames.add("taxAuthGeoId");this.allFieldsNames.add("groupName");this.allFieldsNames.add("geoName");this.allFieldsNames.add("geoCode");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TaxAuthorityDim(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param taxAuthorityDimId the taxAuthorityDimId to set
     */
    public void setTaxAuthorityDimId(Long taxAuthorityDimId) {
        this.taxAuthorityDimId = taxAuthorityDimId;
    }
    /**
     * Auto generated value setter.
     * @param dimVersion the dimVersion to set
     */
    public void setDimVersion(Long dimVersion) {
        this.dimVersion = dimVersion;
    }
    /**
     * Auto generated value setter.
     * @param dateFrom the dateFrom to set
     */
    public void setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom;
    }
    /**
     * Auto generated value setter.
     * @param dateTo the dateTo to set
     */
    public void setDateTo(Timestamp dateTo) {
        this.dateTo = dateTo;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthPartyId the taxAuthPartyId to set
     */
    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthGeoId the taxAuthGeoId to set
     */
    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param geoName the geoName to set
     */
    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }
    /**
     * Auto generated value setter.
     * @param geoCode the geoCode to set
     */
    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
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
     * @return <code>Long</code>
     */
    public Long getTaxAuthorityDimId() {
        return this.taxAuthorityDimId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getDimVersion() {
        return this.dimVersion;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateFrom() {
        return this.dateFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateTo() {
        return this.dateTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthPartyId() {
        return this.taxAuthPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthGeoId() {
        return this.taxAuthGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoName() {
        return this.geoName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoCode() {
        return this.geoCode;
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
        setTaxAuthorityDimId((Long) mapValue.get("taxAuthorityDimId"));
        setDimVersion((Long) mapValue.get("dimVersion"));
        setDateFrom((Timestamp) mapValue.get("dateFrom"));
        setDateTo((Timestamp) mapValue.get("dateTo"));
        setTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        setTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        setGroupName((String) mapValue.get("groupName"));
        setGeoName((String) mapValue.get("geoName"));
        setGeoCode((String) mapValue.get("geoCode"));
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
        mapValue.put("taxAuthorityDimId", getTaxAuthorityDimId());
        mapValue.put("dimVersion", getDimVersion());
        mapValue.put("dateFrom", getDateFrom());
        mapValue.put("dateTo", getDateTo());
        mapValue.put("taxAuthPartyId", getTaxAuthPartyId());
        mapValue.put("taxAuthGeoId", getTaxAuthGeoId());
        mapValue.put("groupName", getGroupName());
        mapValue.put("geoName", getGeoName());
        mapValue.put("geoCode", getGeoCode());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
