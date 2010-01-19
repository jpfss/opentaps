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
 * Auto generated base entity ProductPromoCodeEmailParty.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductPromoCodeEmailPartys", query="SELECT PPCE.PRODUCT_PROMO_CODE_ID AS \"productPromoCodeId\",CM.INFO_STRING AS \"infoString\",PCM.PARTY_ID AS \"partyId\",PCM.FROM_DATE AS \"fromDate\",PCM.THRU_DATE AS \"thruDate\" FROM PRODUCT_PROMO_CODE_EMAIL PPCE INNER JOIN CONTACT_MECH CM ON PPCE.EMAIL_ADDRESS = CM.INFO_STRING INNER JOIN PARTY_CONTACT_MECH PCM ON CM.CONTACT_MECH_ID = PCM.CONTACT_MECH_ID", resultSetMapping="ProductPromoCodeEmailPartyMapping")
@SqlResultSetMapping(name="ProductPromoCodeEmailPartyMapping", entities={
@EntityResult(entityClass=ProductPromoCodeEmailParty.class, fields = {
@FieldResult(name="productPromoCodeId", column="productPromoCodeId")
,@FieldResult(name="infoString", column="infoString")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductPromoCodeEmailParty extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productPromoCodeId", "PPCE.PRODUCT_PROMO_CODE_ID");
        fields.put("infoString", "CM.INFO_STRING");
        fields.put("partyId", "PCM.PARTY_ID");
        fields.put("fromDate", "PCM.FROM_DATE");
        fields.put("thruDate", "PCM.THRU_DATE");
fieldMapColumns.put("ProductPromoCodeEmailParty", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPromoCodeEmailParty> {
    productPromoCodeId("productPromoCodeId"),
    infoString("infoString"),
    partyId("partyId"),
    fromDate("fromDate"),
    thruDate("thruDate");
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
   private String productPromoCodeId;
    
   private String infoString;
    
   private String partyId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;

  /**
   * Default constructor.
   */
  public ProductPromoCodeEmailParty() {
      super();
      this.baseEntityName = "ProductPromoCodeEmailParty";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productPromoCodeId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productPromoCodeId");this.allFieldsNames.add("infoString");this.allFieldsNames.add("partyId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPromoCodeEmailParty(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productPromoCodeId the productPromoCodeId to set
     */
    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
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
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoCodeId() {
        return this.productPromoCodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductPromoCodeId((String) mapValue.get("productPromoCodeId"));
        setInfoString((String) mapValue.get("infoString"));
        setPartyId((String) mapValue.get("partyId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productPromoCodeId", getProductPromoCodeId());
        mapValue.put("infoString", getInfoString());
        mapValue.put("partyId", getPartyId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        return mapValue;
    }


}
