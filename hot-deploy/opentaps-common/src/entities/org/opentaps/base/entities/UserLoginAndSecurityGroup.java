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
 * Auto generated base entity UserLoginAndSecurityGroup.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectUserLoginAndSecurityGroups", query="SELECT ULSG.USER_LOGIN_ID AS \"userLoginId\",ULSG.GROUP_ID AS \"groupId\",ULSG.FROM_DATE AS \"fromDate\",ULSG.THRU_DATE AS \"thruDate\",UL.CURRENT_PASSWORD AS \"currentPassword\",UL.PASSWORD_HINT AS \"passwordHint\",UL.IS_SYSTEM AS \"isSystem\",UL.ENABLED AS \"enabled\",UL.HAS_LOGGED_OUT AS \"hasLoggedOut\",UL.REQUIRE_PASSWORD_CHANGE AS \"requirePasswordChange\",UL.LAST_CURRENCY_UOM AS \"lastCurrencyUom\",UL.LAST_LOCALE AS \"lastLocale\",UL.LAST_TIME_ZONE AS \"lastTimeZone\",UL.DISABLED_DATE_TIME AS \"disabledDateTime\",UL.SUCCESSIVE_FAILED_LOGINS AS \"successiveFailedLogins\",UL.USER_LDAP_DN AS \"userLdapDn\",UL.PARTY_ID AS \"partyId\" FROM USER_LOGIN_SECURITY_GROUP ULSG INNER JOIN USER_LOGIN UL ON ULSG.USER_LOGIN_ID = UL.USER_LOGIN_ID", resultSetMapping="UserLoginAndSecurityGroupMapping")
@SqlResultSetMapping(name="UserLoginAndSecurityGroupMapping", entities={
@EntityResult(entityClass=UserLoginAndSecurityGroup.class, fields = {
@FieldResult(name="userLoginId", column="userLoginId")
,@FieldResult(name="groupId", column="groupId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="currentPassword", column="currentPassword")
,@FieldResult(name="passwordHint", column="passwordHint")
,@FieldResult(name="isSystem", column="isSystem")
,@FieldResult(name="enabled", column="enabled")
,@FieldResult(name="hasLoggedOut", column="hasLoggedOut")
,@FieldResult(name="requirePasswordChange", column="requirePasswordChange")
,@FieldResult(name="lastCurrencyUom", column="lastCurrencyUom")
,@FieldResult(name="lastLocale", column="lastLocale")
,@FieldResult(name="lastTimeZone", column="lastTimeZone")
,@FieldResult(name="disabledDateTime", column="disabledDateTime")
,@FieldResult(name="successiveFailedLogins", column="successiveFailedLogins")
,@FieldResult(name="userLdapDn", column="userLdapDn")
,@FieldResult(name="partyId", column="partyId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class UserLoginAndSecurityGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("userLoginId", "ULSG.USER_LOGIN_ID");
        fields.put("groupId", "ULSG.GROUP_ID");
        fields.put("fromDate", "ULSG.FROM_DATE");
        fields.put("thruDate", "ULSG.THRU_DATE");
        fields.put("currentPassword", "UL.CURRENT_PASSWORD");
        fields.put("passwordHint", "UL.PASSWORD_HINT");
        fields.put("isSystem", "UL.IS_SYSTEM");
        fields.put("enabled", "UL.ENABLED");
        fields.put("hasLoggedOut", "UL.HAS_LOGGED_OUT");
        fields.put("requirePasswordChange", "UL.REQUIRE_PASSWORD_CHANGE");
        fields.put("lastCurrencyUom", "UL.LAST_CURRENCY_UOM");
        fields.put("lastLocale", "UL.LAST_LOCALE");
        fields.put("lastTimeZone", "UL.LAST_TIME_ZONE");
        fields.put("disabledDateTime", "UL.DISABLED_DATE_TIME");
        fields.put("successiveFailedLogins", "UL.SUCCESSIVE_FAILED_LOGINS");
        fields.put("userLdapDn", "UL.USER_LDAP_DN");
        fields.put("partyId", "UL.PARTY_ID");
fieldMapColumns.put("UserLoginAndSecurityGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<UserLoginAndSecurityGroup> {
    userLoginId("userLoginId"),
    groupId("groupId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    currentPassword("currentPassword"),
    passwordHint("passwordHint"),
    isSystem("isSystem"),
    enabled("enabled"),
    hasLoggedOut("hasLoggedOut"),
    requirePasswordChange("requirePasswordChange"),
    lastCurrencyUom("lastCurrencyUom"),
    lastLocale("lastLocale"),
    lastTimeZone("lastTimeZone"),
    disabledDateTime("disabledDateTime"),
    successiveFailedLogins("successiveFailedLogins"),
    userLdapDn("userLdapDn"),
    partyId("partyId");
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
    
   private String currentPassword;
    
   private String passwordHint;
    
   private String isSystem;
    
   private String enabled;
    
   private String hasLoggedOut;
    
   private String requirePasswordChange;
    
   private String lastCurrencyUom;
    
   private String lastLocale;
    
   private String lastTimeZone;
    
   private Timestamp disabledDateTime;
    
   private Long successiveFailedLogins;
    
   private String userLdapDn;
    
   private String partyId;

  /**
   * Default constructor.
   */
  public UserLoginAndSecurityGroup() {
      super();
      this.baseEntityName = "UserLoginAndSecurityGroup";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("userLoginId");this.primaryKeyNames.add("groupId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("groupId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("currentPassword");this.allFieldsNames.add("passwordHint");this.allFieldsNames.add("isSystem");this.allFieldsNames.add("enabled");this.allFieldsNames.add("hasLoggedOut");this.allFieldsNames.add("requirePasswordChange");this.allFieldsNames.add("lastCurrencyUom");this.allFieldsNames.add("lastLocale");this.allFieldsNames.add("lastTimeZone");this.allFieldsNames.add("disabledDateTime");this.allFieldsNames.add("successiveFailedLogins");this.allFieldsNames.add("userLdapDn");this.allFieldsNames.add("partyId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UserLoginAndSecurityGroup(RepositoryInterface repository) {
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
     * @param currentPassword the currentPassword to set
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
    /**
     * Auto generated value setter.
     * @param passwordHint the passwordHint to set
     */
    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
    /**
     * Auto generated value setter.
     * @param isSystem the isSystem to set
     */
    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }
    /**
     * Auto generated value setter.
     * @param enabled the enabled to set
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    /**
     * Auto generated value setter.
     * @param hasLoggedOut the hasLoggedOut to set
     */
    public void setHasLoggedOut(String hasLoggedOut) {
        this.hasLoggedOut = hasLoggedOut;
    }
    /**
     * Auto generated value setter.
     * @param requirePasswordChange the requirePasswordChange to set
     */
    public void setRequirePasswordChange(String requirePasswordChange) {
        this.requirePasswordChange = requirePasswordChange;
    }
    /**
     * Auto generated value setter.
     * @param lastCurrencyUom the lastCurrencyUom to set
     */
    public void setLastCurrencyUom(String lastCurrencyUom) {
        this.lastCurrencyUom = lastCurrencyUom;
    }
    /**
     * Auto generated value setter.
     * @param lastLocale the lastLocale to set
     */
    public void setLastLocale(String lastLocale) {
        this.lastLocale = lastLocale;
    }
    /**
     * Auto generated value setter.
     * @param lastTimeZone the lastTimeZone to set
     */
    public void setLastTimeZone(String lastTimeZone) {
        this.lastTimeZone = lastTimeZone;
    }
    /**
     * Auto generated value setter.
     * @param disabledDateTime the disabledDateTime to set
     */
    public void setDisabledDateTime(Timestamp disabledDateTime) {
        this.disabledDateTime = disabledDateTime;
    }
    /**
     * Auto generated value setter.
     * @param successiveFailedLogins the successiveFailedLogins to set
     */
    public void setSuccessiveFailedLogins(Long successiveFailedLogins) {
        this.successiveFailedLogins = successiveFailedLogins;
    }
    /**
     * Auto generated value setter.
     * @param userLdapDn the userLdapDn to set
     */
    public void setUserLdapDn(String userLdapDn) {
        this.userLdapDn = userLdapDn;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
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
    public String getCurrentPassword() {
        return this.currentPassword;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPasswordHint() {
        return this.passwordHint;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsSystem() {
        return this.isSystem;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnabled() {
        return this.enabled;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasLoggedOut() {
        return this.hasLoggedOut;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirePasswordChange() {
        return this.requirePasswordChange;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastCurrencyUom() {
        return this.lastCurrencyUom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastLocale() {
        return this.lastLocale;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastTimeZone() {
        return this.lastTimeZone;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDisabledDateTime() {
        return this.disabledDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSuccessiveFailedLogins() {
        return this.successiveFailedLogins;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLdapDn() {
        return this.userLdapDn;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUserLoginId((String) mapValue.get("userLoginId"));
        setGroupId((String) mapValue.get("groupId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setCurrentPassword((String) mapValue.get("currentPassword"));
        setPasswordHint((String) mapValue.get("passwordHint"));
        setIsSystem((String) mapValue.get("isSystem"));
        setEnabled((String) mapValue.get("enabled"));
        setHasLoggedOut((String) mapValue.get("hasLoggedOut"));
        setRequirePasswordChange((String) mapValue.get("requirePasswordChange"));
        setLastCurrencyUom((String) mapValue.get("lastCurrencyUom"));
        setLastLocale((String) mapValue.get("lastLocale"));
        setLastTimeZone((String) mapValue.get("lastTimeZone"));
        setDisabledDateTime((Timestamp) mapValue.get("disabledDateTime"));
        setSuccessiveFailedLogins((Long) mapValue.get("successiveFailedLogins"));
        setUserLdapDn((String) mapValue.get("userLdapDn"));
        setPartyId((String) mapValue.get("partyId"));
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
        mapValue.put("currentPassword", getCurrentPassword());
        mapValue.put("passwordHint", getPasswordHint());
        mapValue.put("isSystem", getIsSystem());
        mapValue.put("enabled", getEnabled());
        mapValue.put("hasLoggedOut", getHasLoggedOut());
        mapValue.put("requirePasswordChange", getRequirePasswordChange());
        mapValue.put("lastCurrencyUom", getLastCurrencyUom());
        mapValue.put("lastLocale", getLastLocale());
        mapValue.put("lastTimeZone", getLastTimeZone());
        mapValue.put("disabledDateTime", getDisabledDateTime());
        mapValue.put("successiveFailedLogins", getSuccessiveFailedLogins());
        mapValue.put("userLdapDn", getUserLdapDn());
        mapValue.put("partyId", getPartyId());
        return mapValue;
    }


}
