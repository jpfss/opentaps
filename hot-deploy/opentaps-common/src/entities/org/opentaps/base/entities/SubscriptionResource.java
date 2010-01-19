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
 * Auto generated base entity SubscriptionResource.
 */
@javax.persistence.Entity
@Table(name="SUBSCRIPTION_RESOURCE")
public class SubscriptionResource extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("subscriptionResourceId", "SUBSCRIPTION_RESOURCE_ID");
        fields.put("parentResourceId", "PARENT_RESOURCE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("contentId", "CONTENT_ID");
        fields.put("webSiteId", "WEB_SITE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SubscriptionResource", fields);
}
  public static enum Fields implements EntityFieldInterface<SubscriptionResource> {
    subscriptionResourceId("subscriptionResourceId"),
    parentResourceId("parentResourceId"),
    description("description"),
    contentId("contentId"),
    webSiteId("webSiteId"),
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

   @org.hibernate.annotations.GenericGenerator(name="SubscriptionResource_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SubscriptionResource_GEN")
   @Id
   @Column(name="SUBSCRIPTION_RESOURCE_ID")
   private String subscriptionResourceId;
   @Column(name="PARENT_RESOURCE_ID")
   private String parentResourceId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="CONTENT_ID")
   private String contentId;
   @Column(name="WEB_SITE_ID")
   private String webSiteId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_RESOURCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SubscriptionResource parentSubscriptionResource = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Content content = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WEB_SITE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WebSite webSite = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="subscriptionResource", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SUBSCRIPTION_RESOURCE_ID")
   
   private List<ProductSubscriptionResource> productSubscriptionResources = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SUBSCRIPTION_RESOURCE_ID")
   
   private List<Subscription> subscriptions = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_RESOURCE_ID")
   
   private List<SubscriptionResource> childSubscriptionResources = null;

  /**
   * Default constructor.
   */
  public SubscriptionResource() {
      super();
      this.baseEntityName = "SubscriptionResource";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("subscriptionResourceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("subscriptionResourceId");this.allFieldsNames.add("parentResourceId");this.allFieldsNames.add("description");this.allFieldsNames.add("contentId");this.allFieldsNames.add("webSiteId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SubscriptionResource(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param subscriptionResourceId the subscriptionResourceId to set
     */
    public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
    }
    /**
     * Auto generated value setter.
     * @param parentResourceId the parentResourceId to set
     */
    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
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
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
    /**
     * Auto generated value setter.
     * @param webSiteId the webSiteId to set
     */
    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
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
    public String getSubscriptionResourceId() {
        return this.subscriptionResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentResourceId() {
        return this.parentResourceId;
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
    public String getContentId() {
        return this.contentId;
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
     * Auto generated method that gets the related <code>SubscriptionResource</code> by the relation named <code>ParentSubscriptionResource</code>.
     * @return the <code>SubscriptionResource</code>
     * @throws RepositoryException if an error occurs
     */
    public SubscriptionResource getParentSubscriptionResource() throws RepositoryException {
        if (this.parentSubscriptionResource == null) {
            this.parentSubscriptionResource = getRelatedOne(SubscriptionResource.class, "ParentSubscriptionResource");
        }
        return this.parentSubscriptionResource;
    }
    /**
     * Auto generated method that gets the related <code>Content</code> by the relation named <code>Content</code>.
     * @return the <code>Content</code>
     * @throws RepositoryException if an error occurs
     */
    public Content getContent() throws RepositoryException {
        if (this.content == null) {
            this.content = getRelatedOne(Content.class, "Content");
        }
        return this.content;
    }
    /**
     * Auto generated method that gets the related <code>WebSite</code> by the relation named <code>WebSite</code>.
     * @return the <code>WebSite</code>
     * @throws RepositoryException if an error occurs
     */
    public WebSite getWebSite() throws RepositoryException {
        if (this.webSite == null) {
            this.webSite = getRelatedOne(WebSite.class, "WebSite");
        }
        return this.webSite;
    }
    /**
     * Auto generated method that gets the related <code>ProductSubscriptionResource</code> by the relation named <code>ProductSubscriptionResource</code>.
     * @return the list of <code>ProductSubscriptionResource</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductSubscriptionResource> getProductSubscriptionResources() throws RepositoryException {
        if (this.productSubscriptionResources == null) {
            this.productSubscriptionResources = getRelated(ProductSubscriptionResource.class, "ProductSubscriptionResource");
        }
        return this.productSubscriptionResources;
    }
    /**
     * Auto generated method that gets the related <code>Subscription</code> by the relation named <code>Subscription</code>.
     * @return the list of <code>Subscription</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Subscription> getSubscriptions() throws RepositoryException {
        if (this.subscriptions == null) {
            this.subscriptions = getRelated(Subscription.class, "Subscription");
        }
        return this.subscriptions;
    }
    /**
     * Auto generated method that gets the related <code>SubscriptionResource</code> by the relation named <code>ChildSubscriptionResource</code>.
     * @return the list of <code>SubscriptionResource</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SubscriptionResource> getChildSubscriptionResources() throws RepositoryException {
        if (this.childSubscriptionResources == null) {
            this.childSubscriptionResources = getRelated(SubscriptionResource.class, "ChildSubscriptionResource");
        }
        return this.childSubscriptionResources;
    }

    /**
     * Auto generated value setter.
     * @param parentSubscriptionResource the parentSubscriptionResource to set
    */
    public void setParentSubscriptionResource(SubscriptionResource parentSubscriptionResource) {
        this.parentSubscriptionResource = parentSubscriptionResource;
    }
    /**
     * Auto generated value setter.
     * @param content the content to set
    */
    public void setContent(Content content) {
        this.content = content;
    }
    /**
     * Auto generated value setter.
     * @param webSite the webSite to set
    */
    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
    }
    /**
     * Auto generated value setter.
     * @param productSubscriptionResources the productSubscriptionResources to set
    */
    public void setProductSubscriptionResources(List<ProductSubscriptionResource> productSubscriptionResources) {
        this.productSubscriptionResources = productSubscriptionResources;
    }
    /**
     * Auto generated value setter.
     * @param subscriptions the subscriptions to set
    */
    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
    /**
     * Auto generated value setter.
     * @param childSubscriptionResources the childSubscriptionResources to set
    */
    public void setChildSubscriptionResources(List<SubscriptionResource> childSubscriptionResources) {
        this.childSubscriptionResources = childSubscriptionResources;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addProductSubscriptionResource(ProductSubscriptionResource productSubscriptionResource) {
        if (this.productSubscriptionResources == null) {
            this.productSubscriptionResources = new ArrayList<ProductSubscriptionResource>();
        }
        this.productSubscriptionResources.add(productSubscriptionResource);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductSubscriptionResource(ProductSubscriptionResource productSubscriptionResource) {
        if (this.productSubscriptionResources == null) {
            return;
        }
        this.productSubscriptionResources.remove(productSubscriptionResource);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductSubscriptionResource() {
        if (this.productSubscriptionResources == null) {
            return;
        }
        this.productSubscriptionResources.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSubscriptionResourceId((String) mapValue.get("subscriptionResourceId"));
        setParentResourceId((String) mapValue.get("parentResourceId"));
        setDescription((String) mapValue.get("description"));
        setContentId((String) mapValue.get("contentId"));
        setWebSiteId((String) mapValue.get("webSiteId"));
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
        mapValue.put("subscriptionResourceId", getSubscriptionResourceId());
        mapValue.put("parentResourceId", getParentResourceId());
        mapValue.put("description", getDescription());
        mapValue.put("contentId", getContentId());
        mapValue.put("webSiteId", getWebSiteId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
