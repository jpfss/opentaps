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
 * Auto generated base entity CreditCard.
 */
@javax.persistence.Entity
@Table(name="CREDIT_CARD")
public class CreditCard extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentMethodId", "PAYMENT_METHOD_ID");
        fields.put("cardType", "CARD_TYPE");
        fields.put("cardNumber", "CARD_NUMBER");
        fields.put("validFromDate", "VALID_FROM_DATE");
        fields.put("expireDate", "EXPIRE_DATE");
        fields.put("issueNumber", "ISSUE_NUMBER");
        fields.put("companyNameOnCard", "COMPANY_NAME_ON_CARD");
        fields.put("titleOnCard", "TITLE_ON_CARD");
        fields.put("firstNameOnCard", "FIRST_NAME_ON_CARD");
        fields.put("middleNameOnCard", "MIDDLE_NAME_ON_CARD");
        fields.put("lastNameOnCard", "LAST_NAME_ON_CARD");
        fields.put("suffixOnCard", "SUFFIX_ON_CARD");
        fields.put("contactMechId", "CONTACT_MECH_ID");
        fields.put("consecutiveFailedAuths", "CONSECUTIVE_FAILED_AUTHS");
        fields.put("lastFailedAuthDate", "LAST_FAILED_AUTH_DATE");
        fields.put("consecutiveFailedNsf", "CONSECUTIVE_FAILED_NSF");
        fields.put("lastFailedNsfDate", "LAST_FAILED_NSF_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CreditCard", fields);
}
  public static enum Fields implements EntityFieldInterface<CreditCard> {
    paymentMethodId("paymentMethodId"),
    cardType("cardType"),
    cardNumber("cardNumber"),
    validFromDate("validFromDate"),
    expireDate("expireDate"),
    issueNumber("issueNumber"),
    companyNameOnCard("companyNameOnCard"),
    titleOnCard("titleOnCard"),
    firstNameOnCard("firstNameOnCard"),
    middleNameOnCard("middleNameOnCard"),
    lastNameOnCard("lastNameOnCard"),
    suffixOnCard("suffixOnCard"),
    contactMechId("contactMechId"),
    consecutiveFailedAuths("consecutiveFailedAuths"),
    lastFailedAuthDate("lastFailedAuthDate"),
    consecutiveFailedNsf("consecutiveFailedNsf"),
    lastFailedNsfDate("lastFailedNsfDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="CreditCard_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="CreditCard_GEN")
   @Id
   @Column(name="PAYMENT_METHOD_ID")
   private String paymentMethodId;
   @Column(name="CARD_TYPE")
   private String cardType;
   @Column(name="CARD_NUMBER")
   private String cardNumber;
   @Column(name="VALID_FROM_DATE")
   private String validFromDate;
   @Column(name="EXPIRE_DATE")
   private String expireDate;
   @Column(name="ISSUE_NUMBER")
   private String issueNumber;
   @Column(name="COMPANY_NAME_ON_CARD")
   private String companyNameOnCard;
   @Column(name="TITLE_ON_CARD")
   private String titleOnCard;
   @Column(name="FIRST_NAME_ON_CARD")
   private String firstNameOnCard;
   @Column(name="MIDDLE_NAME_ON_CARD")
   private String middleNameOnCard;
   @Column(name="LAST_NAME_ON_CARD")
   private String lastNameOnCard;
   @Column(name="SUFFIX_ON_CARD")
   private String suffixOnCard;
   @Column(name="CONTACT_MECH_ID")
   private String contactMechId;
   @Column(name="CONSECUTIVE_FAILED_AUTHS")
   private Long consecutiveFailedAuths;
   @Column(name="LAST_FAILED_AUTH_DATE")
   private Timestamp lastFailedAuthDate;
   @Column(name="CONSECUTIVE_FAILED_NSF")
   private Long consecutiveFailedNsf;
   @Column(name="LAST_FAILED_NSF_DATE")
   private Timestamp lastFailedNsfDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentMethod paymentMethod = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ContactMech contactMech = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PostalAddress postalAddress = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID")
   
   private List<OrderPaymentPreference> orderPaymentPreferences = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID")
   
   private List<Payment> payments = null;

  /**
   * Default constructor.
   */
  public CreditCard() {
      super();
      this.baseEntityName = "CreditCard";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentMethodId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentMethodId");this.allFieldsNames.add("cardType");this.allFieldsNames.add("cardNumber");this.allFieldsNames.add("validFromDate");this.allFieldsNames.add("expireDate");this.allFieldsNames.add("issueNumber");this.allFieldsNames.add("companyNameOnCard");this.allFieldsNames.add("titleOnCard");this.allFieldsNames.add("firstNameOnCard");this.allFieldsNames.add("middleNameOnCard");this.allFieldsNames.add("lastNameOnCard");this.allFieldsNames.add("suffixOnCard");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("consecutiveFailedAuths");this.allFieldsNames.add("lastFailedAuthDate");this.allFieldsNames.add("consecutiveFailedNsf");this.allFieldsNames.add("lastFailedNsfDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CreditCard(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentMethodId the paymentMethodId to set
     */
    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    /**
     * Auto generated value setter.
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    /**
     * Auto generated value setter.
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    /**
     * Auto generated value setter.
     * @param validFromDate the validFromDate to set
     */
    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }
    /**
     * Auto generated value setter.
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    /**
     * Auto generated value setter.
     * @param issueNumber the issueNumber to set
     */
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
    /**
     * Auto generated value setter.
     * @param companyNameOnCard the companyNameOnCard to set
     */
    public void setCompanyNameOnCard(String companyNameOnCard) {
        this.companyNameOnCard = companyNameOnCard;
    }
    /**
     * Auto generated value setter.
     * @param titleOnCard the titleOnCard to set
     */
    public void setTitleOnCard(String titleOnCard) {
        this.titleOnCard = titleOnCard;
    }
    /**
     * Auto generated value setter.
     * @param firstNameOnCard the firstNameOnCard to set
     */
    public void setFirstNameOnCard(String firstNameOnCard) {
        this.firstNameOnCard = firstNameOnCard;
    }
    /**
     * Auto generated value setter.
     * @param middleNameOnCard the middleNameOnCard to set
     */
    public void setMiddleNameOnCard(String middleNameOnCard) {
        this.middleNameOnCard = middleNameOnCard;
    }
    /**
     * Auto generated value setter.
     * @param lastNameOnCard the lastNameOnCard to set
     */
    public void setLastNameOnCard(String lastNameOnCard) {
        this.lastNameOnCard = lastNameOnCard;
    }
    /**
     * Auto generated value setter.
     * @param suffixOnCard the suffixOnCard to set
     */
    public void setSuffixOnCard(String suffixOnCard) {
        this.suffixOnCard = suffixOnCard;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param consecutiveFailedAuths the consecutiveFailedAuths to set
     */
    public void setConsecutiveFailedAuths(Long consecutiveFailedAuths) {
        this.consecutiveFailedAuths = consecutiveFailedAuths;
    }
    /**
     * Auto generated value setter.
     * @param lastFailedAuthDate the lastFailedAuthDate to set
     */
    public void setLastFailedAuthDate(Timestamp lastFailedAuthDate) {
        this.lastFailedAuthDate = lastFailedAuthDate;
    }
    /**
     * Auto generated value setter.
     * @param consecutiveFailedNsf the consecutiveFailedNsf to set
     */
    public void setConsecutiveFailedNsf(Long consecutiveFailedNsf) {
        this.consecutiveFailedNsf = consecutiveFailedNsf;
    }
    /**
     * Auto generated value setter.
     * @param lastFailedNsfDate the lastFailedNsfDate to set
     */
    public void setLastFailedNsfDate(Timestamp lastFailedNsfDate) {
        this.lastFailedNsfDate = lastFailedNsfDate;
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
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCardType() {
        return this.cardType;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCardNumber() {
        return this.cardNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getValidFromDate() {
        return this.validFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExpireDate() {
        return this.expireDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIssueNumber() {
        return this.issueNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCompanyNameOnCard() {
        return this.companyNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTitleOnCard() {
        return this.titleOnCard;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFirstNameOnCard() {
        return this.firstNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMiddleNameOnCard() {
        return this.middleNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastNameOnCard() {
        return this.lastNameOnCard;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSuffixOnCard() {
        return this.suffixOnCard;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getConsecutiveFailedAuths() {
        return this.consecutiveFailedAuths;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastFailedAuthDate() {
        return this.lastFailedAuthDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getConsecutiveFailedNsf() {
        return this.consecutiveFailedNsf;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastFailedNsfDate() {
        return this.lastFailedNsfDate;
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
     * Auto generated method that gets the related <code>PaymentMethod</code> by the relation named <code>PaymentMethod</code>.
     * @return the <code>PaymentMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentMethod getPaymentMethod() throws RepositoryException {
        if (this.paymentMethod == null) {
            this.paymentMethod = getRelatedOne(PaymentMethod.class, "PaymentMethod");
        }
        return this.paymentMethod;
    }
    /**
     * Auto generated method that gets the related <code>ContactMech</code> by the relation named <code>ContactMech</code>.
     * @return the <code>ContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMech getContactMech() throws RepositoryException {
        if (this.contactMech == null) {
            this.contactMech = getRelatedOne(ContactMech.class, "ContactMech");
        }
        return this.contactMech;
    }
    /**
     * Auto generated method that gets the related <code>PostalAddress</code> by the relation named <code>PostalAddress</code>.
     * @return the <code>PostalAddress</code>
     * @throws RepositoryException if an error occurs
     */
    public PostalAddress getPostalAddress() throws RepositoryException {
        if (this.postalAddress == null) {
            this.postalAddress = getRelatedOne(PostalAddress.class, "PostalAddress");
        }
        return this.postalAddress;
    }
    /**
     * Auto generated method that gets the related <code>OrderPaymentPreference</code> by the relation named <code>OrderPaymentPreference</code>.
     * @return the list of <code>OrderPaymentPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderPaymentPreference> getOrderPaymentPreferences() throws RepositoryException {
        if (this.orderPaymentPreferences == null) {
            this.orderPaymentPreferences = getRelated(OrderPaymentPreference.class, "OrderPaymentPreference");
        }
        return this.orderPaymentPreferences;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the list of <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Payment> getPayments() throws RepositoryException {
        if (this.payments == null) {
            this.payments = getRelated(Payment.class, "Payment");
        }
        return this.payments;
    }

    /**
     * Auto generated value setter.
     * @param paymentMethod the paymentMethod to set
    */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    /**
     * Auto generated value setter.
     * @param contactMech the contactMech to set
    */
    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
    /**
     * Auto generated value setter.
     * @param postalAddress the postalAddress to set
    */
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }
    /**
     * Auto generated value setter.
     * @param orderPaymentPreferences the orderPaymentPreferences to set
    */
    public void setOrderPaymentPreferences(List<OrderPaymentPreference> orderPaymentPreferences) {
        this.orderPaymentPreferences = orderPaymentPreferences;
    }
    /**
     * Auto generated value setter.
     * @param payments the payments to set
    */
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentMethodId((String) mapValue.get("paymentMethodId"));
        setCardType((String) mapValue.get("cardType"));
        setCardNumber((String) mapValue.get("cardNumber"));
        setValidFromDate((String) mapValue.get("validFromDate"));
        setExpireDate((String) mapValue.get("expireDate"));
        setIssueNumber((String) mapValue.get("issueNumber"));
        setCompanyNameOnCard((String) mapValue.get("companyNameOnCard"));
        setTitleOnCard((String) mapValue.get("titleOnCard"));
        setFirstNameOnCard((String) mapValue.get("firstNameOnCard"));
        setMiddleNameOnCard((String) mapValue.get("middleNameOnCard"));
        setLastNameOnCard((String) mapValue.get("lastNameOnCard"));
        setSuffixOnCard((String) mapValue.get("suffixOnCard"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setConsecutiveFailedAuths((Long) mapValue.get("consecutiveFailedAuths"));
        setLastFailedAuthDate((Timestamp) mapValue.get("lastFailedAuthDate"));
        setConsecutiveFailedNsf((Long) mapValue.get("consecutiveFailedNsf"));
        setLastFailedNsfDate((Timestamp) mapValue.get("lastFailedNsfDate"));
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
        mapValue.put("paymentMethodId", getPaymentMethodId());
        mapValue.put("cardType", getCardType());
        mapValue.put("cardNumber", getCardNumber());
        mapValue.put("validFromDate", getValidFromDate());
        mapValue.put("expireDate", getExpireDate());
        mapValue.put("issueNumber", getIssueNumber());
        mapValue.put("companyNameOnCard", getCompanyNameOnCard());
        mapValue.put("titleOnCard", getTitleOnCard());
        mapValue.put("firstNameOnCard", getFirstNameOnCard());
        mapValue.put("middleNameOnCard", getMiddleNameOnCard());
        mapValue.put("lastNameOnCard", getLastNameOnCard());
        mapValue.put("suffixOnCard", getSuffixOnCard());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("consecutiveFailedAuths", getConsecutiveFailedAuths());
        mapValue.put("lastFailedAuthDate", getLastFailedAuthDate());
        mapValue.put("consecutiveFailedNsf", getConsecutiveFailedNsf());
        mapValue.put("lastFailedNsfDate", getLastFailedNsfDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
