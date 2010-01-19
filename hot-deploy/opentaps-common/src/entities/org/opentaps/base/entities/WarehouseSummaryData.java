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
 * Auto generated base entity WarehouseSummaryData.
 */
@javax.persistence.Entity
@Table(name="WAREHOUSE_SUMMARY_DATA")
public class WarehouseSummaryData extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityId", "FACILITY_ID");
        fields.put("RequiredStockMoves", "REQUIRED_STOCK_MOVES");
        fields.put("RequestedInventoryTransfers", "REQUESTED_INVENTORY_TRANSFERS");
        fields.put("NumberBackOrders", "NUMBER_BACK_ORDERS");
        fields.put("NumberProductsBackOrdered", "NUMBER_PRODUCTS_BACK_ORDERED");
        fields.put("OrdersReadyShip", "ORDERS_READY_SHIP");
        fields.put("OpenPicklists", "OPEN_PICKLISTS");
        fields.put("PicklistsShipped", "PICKLISTS_SHIPPED");
        fields.put("NewProductRuns", "NEW_PRODUCT_RUNS");
        fields.put("ScheduledProductionRuns", "SCHEDULED_PRODUCTION_RUNS");
        fields.put("ConfirmedProductionRuns", "CONFIRMED_PRODUCTION_RUNS");
        fields.put("ActiveProductionRuns", "ACTIVE_PRODUCTION_RUNS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WarehouseSummaryData", fields);
}
  public static enum Fields implements EntityFieldInterface<WarehouseSummaryData> {
    facilityId("facilityId"),
    RequiredStockMoves("RequiredStockMoves"),
    RequestedInventoryTransfers("RequestedInventoryTransfers"),
    NumberBackOrders("NumberBackOrders"),
    NumberProductsBackOrdered("NumberProductsBackOrdered"),
    OrdersReadyShip("OrdersReadyShip"),
    OpenPicklists("OpenPicklists"),
    PicklistsShipped("PicklistsShipped"),
    NewProductRuns("NewProductRuns"),
    ScheduledProductionRuns("ScheduledProductionRuns"),
    ConfirmedProductionRuns("ConfirmedProductionRuns"),
    ActiveProductionRuns("ActiveProductionRuns"),
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

   @org.hibernate.annotations.GenericGenerator(name="WarehouseSummaryData_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="WarehouseSummaryData_GEN")
   @Id
   @Column(name="FACILITY_ID")
   private String facilityId;
   @Column(name="REQUIRED_STOCK_MOVES")
   private Long RequiredStockMoves;
   @Column(name="REQUESTED_INVENTORY_TRANSFERS")
   private Long RequestedInventoryTransfers;
   @Column(name="NUMBER_BACK_ORDERS")
   private Long NumberBackOrders;
   @Column(name="NUMBER_PRODUCTS_BACK_ORDERED")
   private Long NumberProductsBackOrdered;
   @Column(name="ORDERS_READY_SHIP")
   private Long OrdersReadyShip;
   @Column(name="OPEN_PICKLISTS")
   private Long OpenPicklists;
   @Column(name="PICKLISTS_SHIPPED")
   private Long PicklistsShipped;
   @Column(name="NEW_PRODUCT_RUNS")
   private Long NewProductRuns;
   @Column(name="SCHEDULED_PRODUCTION_RUNS")
   private Long ScheduledProductionRuns;
   @Column(name="CONFIRMED_PRODUCTION_RUNS")
   private Long ConfirmedProductionRuns;
   @Column(name="ACTIVE_PRODUCTION_RUNS")
   private Long ActiveProductionRuns;
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
  public WarehouseSummaryData() {
      super();
      this.baseEntityName = "WarehouseSummaryData";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityId");this.allFieldsNames.add("RequiredStockMoves");this.allFieldsNames.add("RequestedInventoryTransfers");this.allFieldsNames.add("NumberBackOrders");this.allFieldsNames.add("NumberProductsBackOrdered");this.allFieldsNames.add("OrdersReadyShip");this.allFieldsNames.add("OpenPicklists");this.allFieldsNames.add("PicklistsShipped");this.allFieldsNames.add("NewProductRuns");this.allFieldsNames.add("ScheduledProductionRuns");this.allFieldsNames.add("ConfirmedProductionRuns");this.allFieldsNames.add("ActiveProductionRuns");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WarehouseSummaryData(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param RequiredStockMoves the RequiredStockMoves to set
     */
    public void setRequiredStockMoves(Long RequiredStockMoves) {
        this.RequiredStockMoves = RequiredStockMoves;
    }
    /**
     * Auto generated value setter.
     * @param RequestedInventoryTransfers the RequestedInventoryTransfers to set
     */
    public void setRequestedInventoryTransfers(Long RequestedInventoryTransfers) {
        this.RequestedInventoryTransfers = RequestedInventoryTransfers;
    }
    /**
     * Auto generated value setter.
     * @param NumberBackOrders the NumberBackOrders to set
     */
    public void setNumberBackOrders(Long NumberBackOrders) {
        this.NumberBackOrders = NumberBackOrders;
    }
    /**
     * Auto generated value setter.
     * @param NumberProductsBackOrdered the NumberProductsBackOrdered to set
     */
    public void setNumberProductsBackOrdered(Long NumberProductsBackOrdered) {
        this.NumberProductsBackOrdered = NumberProductsBackOrdered;
    }
    /**
     * Auto generated value setter.
     * @param OrdersReadyShip the OrdersReadyShip to set
     */
    public void setOrdersReadyShip(Long OrdersReadyShip) {
        this.OrdersReadyShip = OrdersReadyShip;
    }
    /**
     * Auto generated value setter.
     * @param OpenPicklists the OpenPicklists to set
     */
    public void setOpenPicklists(Long OpenPicklists) {
        this.OpenPicklists = OpenPicklists;
    }
    /**
     * Auto generated value setter.
     * @param PicklistsShipped the PicklistsShipped to set
     */
    public void setPicklistsShipped(Long PicklistsShipped) {
        this.PicklistsShipped = PicklistsShipped;
    }
    /**
     * Auto generated value setter.
     * @param NewProductRuns the NewProductRuns to set
     */
    public void setNewProductRuns(Long NewProductRuns) {
        this.NewProductRuns = NewProductRuns;
    }
    /**
     * Auto generated value setter.
     * @param ScheduledProductionRuns the ScheduledProductionRuns to set
     */
    public void setScheduledProductionRuns(Long ScheduledProductionRuns) {
        this.ScheduledProductionRuns = ScheduledProductionRuns;
    }
    /**
     * Auto generated value setter.
     * @param ConfirmedProductionRuns the ConfirmedProductionRuns to set
     */
    public void setConfirmedProductionRuns(Long ConfirmedProductionRuns) {
        this.ConfirmedProductionRuns = ConfirmedProductionRuns;
    }
    /**
     * Auto generated value setter.
     * @param ActiveProductionRuns the ActiveProductionRuns to set
     */
    public void setActiveProductionRuns(Long ActiveProductionRuns) {
        this.ActiveProductionRuns = ActiveProductionRuns;
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
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getRequiredStockMoves() {
        return this.RequiredStockMoves;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getRequestedInventoryTransfers() {
        return this.RequestedInventoryTransfers;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumberBackOrders() {
        return this.NumberBackOrders;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumberProductsBackOrdered() {
        return this.NumberProductsBackOrdered;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getOrdersReadyShip() {
        return this.OrdersReadyShip;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getOpenPicklists() {
        return this.OpenPicklists;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPicklistsShipped() {
        return this.PicklistsShipped;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNewProductRuns() {
        return this.NewProductRuns;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getScheduledProductionRuns() {
        return this.ScheduledProductionRuns;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getConfirmedProductionRuns() {
        return this.ConfirmedProductionRuns;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getActiveProductionRuns() {
        return this.ActiveProductionRuns;
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
        setFacilityId((String) mapValue.get("facilityId"));
        setRequiredStockMoves((Long) mapValue.get("RequiredStockMoves"));
        setRequestedInventoryTransfers((Long) mapValue.get("RequestedInventoryTransfers"));
        setNumberBackOrders((Long) mapValue.get("NumberBackOrders"));
        setNumberProductsBackOrdered((Long) mapValue.get("NumberProductsBackOrdered"));
        setOrdersReadyShip((Long) mapValue.get("OrdersReadyShip"));
        setOpenPicklists((Long) mapValue.get("OpenPicklists"));
        setPicklistsShipped((Long) mapValue.get("PicklistsShipped"));
        setNewProductRuns((Long) mapValue.get("NewProductRuns"));
        setScheduledProductionRuns((Long) mapValue.get("ScheduledProductionRuns"));
        setConfirmedProductionRuns((Long) mapValue.get("ConfirmedProductionRuns"));
        setActiveProductionRuns((Long) mapValue.get("ActiveProductionRuns"));
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
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("RequiredStockMoves", getRequiredStockMoves());
        mapValue.put("RequestedInventoryTransfers", getRequestedInventoryTransfers());
        mapValue.put("NumberBackOrders", getNumberBackOrders());
        mapValue.put("NumberProductsBackOrdered", getNumberProductsBackOrdered());
        mapValue.put("OrdersReadyShip", getOrdersReadyShip());
        mapValue.put("OpenPicklists", getOpenPicklists());
        mapValue.put("PicklistsShipped", getPicklistsShipped());
        mapValue.put("NewProductRuns", getNewProductRuns());
        mapValue.put("ScheduledProductionRuns", getScheduledProductionRuns());
        mapValue.put("ConfirmedProductionRuns", getConfirmedProductionRuns());
        mapValue.put("ActiveProductionRuns", getActiveProductionRuns());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
