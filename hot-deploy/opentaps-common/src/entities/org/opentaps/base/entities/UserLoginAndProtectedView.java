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
 * Auto generated base entity UserLoginAndProtectedView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectUserLoginAndProtectedViews", query="SELECT ULSGPV.USER_LOGIN_ID AS \"userLoginId\",ULSGPV.GROUP_ID AS \"groupId\",ULSGPV.FROM_DATE AS \"fromDate\",ULSGPV.THRU_DATE AS \"thruDate\",PV.VIEW_NAME_ID AS \"viewNameId\",PV.MAX_HITS AS \"maxHits\",PV.MAX_HITS_DURATION AS \"maxHitsDuration\",PV.TARPIT_DURATION AS \"tarpitDuration\" FROM USER_LOGIN_SECURITY_GROUP ULSGPV INNER JOIN PROTECTED_VIEW PV ON ULSGPV.GROUP_ID = PV.GROUP_ID", resultSetMapping="UserLoginAndProtectedViewMapping")
@SqlResultSetMapping(name="UserLoginAndProtectedViewMapping", entities={
@EntityResult(entityClass=UserLoginAndProtectedView.class, fields = {
@FieldResult(name="userLoginId", column="userLoginId")
,@FieldResult(name="groupId", column="groupId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="viewNameId", column="viewNameId")
,@FieldResult(name="maxHits", column="maxHits")
,@FieldResult(name="maxHitsDuration", column="maxHitsDuration")
,@FieldResult(name="tarpitDuration", column="tarpitDuration")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class UserLoginAndProtectedView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("userLoginId", "ULSGPV.USER_LOGIN_ID");
        fields.put("groupId", "ULSGPV.GROUP_ID");
        fields.put("fromDate", "ULSGPV.FROM_DATE");
        fields.put("thruDate", "ULSGPV.THRU_DATE");
        fields.put("viewNameId", "PV.VIEW_NAME_ID");
        fields.put("maxHits", "PV.MAX_HITS");
        fields.put("maxHitsDuration", "PV.MAX_HITS_DURATION");
        fields.put("tarpitDuration", "PV.TARPIT_DURATION");
fieldMapColumns.put("UserLoginAndProtectedView", fields);
}
  public static enum Fields implements EntityFieldInterface<UserLoginAndProtectedView> {
    userLoginId("userLoginId"),
    groupId("groupId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    viewNameId("viewNameId"),
    maxHits("maxHits"),
    maxHitsDuration("maxHitsDuration"),
    tarpitDuration("tarpitDuration");
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
   private String userLoginId;
    
   private String groupId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String viewNameId;
    
   private Long maxHits;
    
   private Long maxHitsDuration;
    
   private Long tarpitDuration;

  /**
   * Default constructor.
   */
  public UserLoginAndProtectedView() {
      super();
      this.baseEntityName = "UserLoginAndProtectedView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("userLoginId");this.primaryKeyNames.add("groupId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("viewNameId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("groupId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("viewNameId");this.allFieldsNames.add("maxHits");this.allFieldsNames.add("maxHitsDuration");this.allFieldsNames.add("tarpitDuration");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UserLoginAndProtectedView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    /**
     * Auto generated value setter.
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
     * Auto generated value setter.
     * @param viewNameId the viewNameId to set
     */
    public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
    }
    /**
     * Auto generated value setter.
     * @param maxHits the maxHits to set
     */
    public void setMaxHits(Long maxHits) {
        this.maxHits = maxHits;
    }
    /**
     * Auto generated value setter.
     * @param maxHitsDuration the maxHitsDuration to set
     */
    public void setMaxHitsDuration(Long maxHitsDuration) {
        this.maxHitsDuration = maxHitsDuration;
    }
    /**
     * Auto generated value setter.
     * @param tarpitDuration the tarpitDuration to set
     */
    public void setTarpitDuration(Long tarpitDuration) {
        this.tarpitDuration = tarpitDuration;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLoginId() {
        return this.userLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupId() {
        return this.groupId;
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
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getViewNameId() {
        return this.viewNameId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getMaxHits() {
        return this.maxHits;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getMaxHitsDuration() {
        return this.maxHitsDuration;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTarpitDuration() {
        return this.tarpitDuration;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUserLoginId((String) mapValue.get("userLoginId"));
        setGroupId((String) mapValue.get("groupId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setViewNameId((String) mapValue.get("viewNameId"));
        setMaxHits((Long) mapValue.get("maxHits"));
        setMaxHitsDuration((Long) mapValue.get("maxHitsDuration"));
        setTarpitDuration((Long) mapValue.get("tarpitDuration"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("groupId", getGroupId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("viewNameId", getViewNameId());
        mapValue.put("maxHits", getMaxHits());
        mapValue.put("maxHitsDuration", getMaxHitsDuration());
        mapValue.put("tarpitDuration", getTarpitDuration());
        return mapValue;
    }


}
