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
 * Auto generated base entity WebSiteAndContent.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWebSiteAndContents", query="SELECT WS.WEB_SITE_ID AS \"webSiteId\",WS.SITE_NAME AS \"siteName\",WS.HTTP_HOST AS \"httpHost\",WS.HTTP_PORT AS \"httpPort\",WS.HTTPS_HOST AS \"httpsHost\",WS.HTTPS_PORT AS \"httpsPort\",WS.ENABLE_HTTPS AS \"enableHttps\",WS.STANDARD_CONTENT_PREFIX AS \"standardContentPrefix\",WS.SECURE_CONTENT_PREFIX AS \"secureContentPrefix\",WS.COOKIE_DOMAIN AS \"cookieDomain\",WS.VISUAL_THEME_SET_ID AS \"visualThemeSetId\",WS.PRODUCT_STORE_ID AS \"productStoreId\",WS.ALLOW_PRODUCT_STORE_CHANGE AS \"allowProductStoreChange\",WSCT.CONTENT_ID AS \"contentId\",WSCT.WEB_SITE_CONTENT_TYPE_ID AS \"webSiteContentTypeId\",WSCT.FROM_DATE AS \"fromDate\",WSCT.THRU_DATE AS \"thruDate\" FROM WEB_SITE WS INNER JOIN WEB_SITE_CONTENT WSCT ON WS.WEB_SITE_ID = WSCT.WEB_SITE_ID", resultSetMapping="WebSiteAndContentMapping")
@SqlResultSetMapping(name="WebSiteAndContentMapping", entities={
@EntityResult(entityClass=WebSiteAndContent.class, fields = {
@FieldResult(name="webSiteId", column="webSiteId")
,@FieldResult(name="siteName", column="siteName")
,@FieldResult(name="httpHost", column="httpHost")
,@FieldResult(name="httpPort", column="httpPort")
,@FieldResult(name="httpsHost", column="httpsHost")
,@FieldResult(name="httpsPort", column="httpsPort")
,@FieldResult(name="enableHttps", column="enableHttps")
,@FieldResult(name="standardContentPrefix", column="standardContentPrefix")
,@FieldResult(name="secureContentPrefix", column="secureContentPrefix")
,@FieldResult(name="cookieDomain", column="cookieDomain")
,@FieldResult(name="visualThemeSetId", column="visualThemeSetId")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="allowProductStoreChange", column="allowProductStoreChange")
,@FieldResult(name="contentId", column="contentId")
,@FieldResult(name="webSiteContentTypeId", column="webSiteContentTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WebSiteAndContent extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("webSiteId", "WS.WEB_SITE_ID");
        fields.put("siteName", "WS.SITE_NAME");
        fields.put("httpHost", "WS.HTTP_HOST");
        fields.put("httpPort", "WS.HTTP_PORT");
        fields.put("httpsHost", "WS.HTTPS_HOST");
        fields.put("httpsPort", "WS.HTTPS_PORT");
        fields.put("enableHttps", "WS.ENABLE_HTTPS");
        fields.put("standardContentPrefix", "WS.STANDARD_CONTENT_PREFIX");
        fields.put("secureContentPrefix", "WS.SECURE_CONTENT_PREFIX");
        fields.put("cookieDomain", "WS.COOKIE_DOMAIN");
        fields.put("visualThemeSetId", "WS.VISUAL_THEME_SET_ID");
        fields.put("productStoreId", "WS.PRODUCT_STORE_ID");
        fields.put("allowProductStoreChange", "WS.ALLOW_PRODUCT_STORE_CHANGE");
        fields.put("contentId", "WSCT.CONTENT_ID");
        fields.put("webSiteContentTypeId", "WSCT.WEB_SITE_CONTENT_TYPE_ID");
        fields.put("fromDate", "WSCT.FROM_DATE");
        fields.put("thruDate", "WSCT.THRU_DATE");
fieldMapColumns.put("WebSiteAndContent", fields);
}
  public static enum Fields implements EntityFieldInterface<WebSiteAndContent> {
    webSiteId("webSiteId"),
    siteName("siteName"),
    httpHost("httpHost"),
    httpPort("httpPort"),
    httpsHost("httpsHost"),
    httpsPort("httpsPort"),
    enableHttps("enableHttps"),
    standardContentPrefix("standardContentPrefix"),
    secureContentPrefix("secureContentPrefix"),
    cookieDomain("cookieDomain"),
    visualThemeSetId("visualThemeSetId"),
    productStoreId("productStoreId"),
    allowProductStoreChange("allowProductStoreChange"),
    contentId("contentId"),
    webSiteContentTypeId("webSiteContentTypeId"),
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
   private String webSiteId;
    
   private String siteName;
    
   private String httpHost;
    
   private String httpPort;
    
   private String httpsHost;
    
   private String httpsPort;
    
   private String enableHttps;
    
   private String standardContentPrefix;
    
   private String secureContentPrefix;
    
   private String cookieDomain;
    
   private String visualThemeSetId;
    
   private String productStoreId;
    
   private String allowProductStoreChange;
    
   private String contentId;
    
   private String webSiteContentTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;

  /**
   * Default constructor.
   */
  public WebSiteAndContent() {
      super();
      this.baseEntityName = "WebSiteAndContent";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("webSiteId");this.primaryKeyNames.add("contentId");this.primaryKeyNames.add("webSiteContentTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("webSiteId");this.allFieldsNames.add("siteName");this.allFieldsNames.add("httpHost");this.allFieldsNames.add("httpPort");this.allFieldsNames.add("httpsHost");this.allFieldsNames.add("httpsPort");this.allFieldsNames.add("enableHttps");this.allFieldsNames.add("standardContentPrefix");this.allFieldsNames.add("secureContentPrefix");this.allFieldsNames.add("cookieDomain");this.allFieldsNames.add("visualThemeSetId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("allowProductStoreChange");this.allFieldsNames.add("contentId");this.allFieldsNames.add("webSiteContentTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WebSiteAndContent(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param webSiteId the webSiteId to set
     */
    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
    /**
     * Auto generated value setter.
     * @param siteName the siteName to set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    /**
     * Auto generated value setter.
     * @param httpHost the httpHost to set
     */
    public void setHttpHost(String httpHost) {
        this.httpHost = httpHost;
    }
    /**
     * Auto generated value setter.
     * @param httpPort the httpPort to set
     */
    public void setHttpPort(String httpPort) {
        this.httpPort = httpPort;
    }
    /**
     * Auto generated value setter.
     * @param httpsHost the httpsHost to set
     */
    public void setHttpsHost(String httpsHost) {
        this.httpsHost = httpsHost;
    }
    /**
     * Auto generated value setter.
     * @param httpsPort the httpsPort to set
     */
    public void setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
    }
    /**
     * Auto generated value setter.
     * @param enableHttps the enableHttps to set
     */
    public void setEnableHttps(String enableHttps) {
        this.enableHttps = enableHttps;
    }
    /**
     * Auto generated value setter.
     * @param standardContentPrefix the standardContentPrefix to set
     */
    public void setStandardContentPrefix(String standardContentPrefix) {
        this.standardContentPrefix = standardContentPrefix;
    }
    /**
     * Auto generated value setter.
     * @param secureContentPrefix the secureContentPrefix to set
     */
    public void setSecureContentPrefix(String secureContentPrefix) {
        this.secureContentPrefix = secureContentPrefix;
    }
    /**
     * Auto generated value setter.
     * @param cookieDomain the cookieDomain to set
     */
    public void setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
    }
    /**
     * Auto generated value setter.
     * @param visualThemeSetId the visualThemeSetId to set
     */
    public void setVisualThemeSetId(String visualThemeSetId) {
        this.visualThemeSetId = visualThemeSetId;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param allowProductStoreChange the allowProductStoreChange to set
     */
    public void setAllowProductStoreChange(String allowProductStoreChange) {
        this.allowProductStoreChange = allowProductStoreChange;
    }
    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
    /**
     * Auto generated value setter.
     * @param webSiteContentTypeId the webSiteContentTypeId to set
     */
    public void setWebSiteContentTypeId(String webSiteContentTypeId) {
        this.webSiteContentTypeId = webSiteContentTypeId;
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
    public String getWebSiteId() {
        return this.webSiteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSiteName() {
        return this.siteName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHttpHost() {
        return this.httpHost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHttpPort() {
        return this.httpPort;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHttpsHost() {
        return this.httpsHost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHttpsPort() {
        return this.httpsPort;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnableHttps() {
        return this.enableHttps;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStandardContentPrefix() {
        return this.standardContentPrefix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSecureContentPrefix() {
        return this.secureContentPrefix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCookieDomain() {
        return this.cookieDomain;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVisualThemeSetId() {
        return this.visualThemeSetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowProductStoreChange() {
        return this.allowProductStoreChange;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWebSiteContentTypeId() {
        return this.webSiteContentTypeId;
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
        setWebSiteId((String) mapValue.get("webSiteId"));
        setSiteName((String) mapValue.get("siteName"));
        setHttpHost((String) mapValue.get("httpHost"));
        setHttpPort((String) mapValue.get("httpPort"));
        setHttpsHost((String) mapValue.get("httpsHost"));
        setHttpsPort((String) mapValue.get("httpsPort"));
        setEnableHttps((String) mapValue.get("enableHttps"));
        setStandardContentPrefix((String) mapValue.get("standardContentPrefix"));
        setSecureContentPrefix((String) mapValue.get("secureContentPrefix"));
        setCookieDomain((String) mapValue.get("cookieDomain"));
        setVisualThemeSetId((String) mapValue.get("visualThemeSetId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setAllowProductStoreChange((String) mapValue.get("allowProductStoreChange"));
        setContentId((String) mapValue.get("contentId"));
        setWebSiteContentTypeId((String) mapValue.get("webSiteContentTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("webSiteId", getWebSiteId());
        mapValue.put("siteName", getSiteName());
        mapValue.put("httpHost", getHttpHost());
        mapValue.put("httpPort", getHttpPort());
        mapValue.put("httpsHost", getHttpsHost());
        mapValue.put("httpsPort", getHttpsPort());
        mapValue.put("enableHttps", getEnableHttps());
        mapValue.put("standardContentPrefix", getStandardContentPrefix());
        mapValue.put("secureContentPrefix", getSecureContentPrefix());
        mapValue.put("cookieDomain", getCookieDomain());
        mapValue.put("visualThemeSetId", getVisualThemeSetId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("allowProductStoreChange", getAllowProductStoreChange());
        mapValue.put("contentId", getContentId());
        mapValue.put("webSiteContentTypeId", getWebSiteContentTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        return mapValue;
    }


}
