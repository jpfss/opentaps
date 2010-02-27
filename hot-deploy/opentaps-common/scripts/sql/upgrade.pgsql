/*
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
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
 
/*
These scripts are for making table changes from opentaps 1.0 to opentaps 1.4
*/

ALTER TABLE EMPL_POSITION_TYPE DROP CONSTRAINT EMPL_PSTP_PRTY;
ALTER TABLE EMPL_POSITION_TYPE DROP CONSTRAINT EMPL_PSTP_PRLE;

ALTER TABLE EMPL_POSITION_TYPE DROP COLUMN PARTY_ID RESTRICT;
ALTER TABLE EMPL_POSITION_TYPE DROP COLUMN ROLE_TYPE_ID RESTRICT;

ALTER TABLE PERF_REVIEW DROP CONSTRAINT PERF_REV_PHFPRL;
ALTER TABLE PERF_REVIEW DROP CONSTRAINT PERF_REV_PHFPTY;
ALTER TABLE PERF_REVIEW DROP CONSTRAINT PERF_REV_PHTPRL;
ALTER TABLE PERF_REVIEW DROP CONSTRAINT PERF_REV_PHTPTY;

-- those table had the pk changed
-- ofbiz can add new columns but not set the PK properly
ALTER TABLE FIXED_ASSET_DEP_METHOD ADD COLUMN DEPRECIATION_CUSTOM_METHOD_ID CHARACTER VARYING(20);
ALTER TABLE FIXED_ASSET_DEP_METHOD DROP CONSTRAINT PK_FIXED_ASSET_DEP_METHOD;
ALTER TABLE FIXED_ASSET_DEP_METHOD ADD PRIMARY KEY (FIXED_ASSET_ID, DEPRECIATION_CUSTOM_METHOD_ID);

ALTER TABLE FIXED_ASSET_DEP_METHOD DROP CONSTRAINT FIXDAST_DM_DPMTH;

ALTER TABLE PARTY_QUAL DROP CONSTRAINT pk_party_qual;
ALTER TABLE PARTY_QUAL ADD PRIMARY KEY (PARTY_ID, PARTY_QUAL_TYPE_ID, FROM_DATE);
ALTER TABLE PARTY_RATE ADD COLUMN CURRENCY_UOM_ID CHARACTER VARYING(20);
ALTER TABLE PARTY_RATE DROP CONSTRAINT pk_party_rate;
ALTER TABLE PARTY_RATE ADD PRIMARY KEY ( PARTY_ID , RATE_TYPE_ID , FROM_DATE, CURRENCY_UOM_ID ) ;

ALTER TABLE PARTY_CONTENT ADD PARTY_CONTENT_TYPE_ID CHARACTER VARYING(20);
ALTER TABLE PARTY_CONTENT ADD FROM_DATE timestamp with time zone;
ALTER TABLE PARTY_CONTENT DROP CONSTRAINT pk_party_content;
ALTER TABLE PARTY_CONTENT ADD PRIMARY KEY ( PARTY_ID , CONTENT_ID, FROM_DATE , PARTY_CONTENT_TYPE_ID ) ;

ALTER TABLE WEB_USER_PREFERENCE ADD VISIT_ID CHARACTER VARYING(20);
ALTER TABLE WEB_USER_PREFERENCE DROP CONSTRAINT pk_web_user_preference;
ALTER TABLE WEB_USER_PREFERENCE ADD PRIMARY KEY ( PARTY_ID , USER_LOGIN_ID, WEB_PREFERENCE_TYPE_ID , VISIT_ID ) ;

ALTER TABLE PARTY_QUAL DROP CONSTRAINT PARTY_QUAL_INST;

ALTER TABLE WORK_EFFORT DROP CONSTRAINT WK_EFFRT_WFLW_ACT;
ALTER TABLE WORK_EFFORT DROP CONSTRAINT WK_EFFRT_WFLW_PKG;
ALTER TABLE WORK_EFFORT DROP CONSTRAINT WK_EFFRT_WFLW_PRC;

-- purge the job sandbox (else some scheduled jobs might loop as we reload the seed data)
-- the jobs should be reloaded from the seed
DELETE FROM JOB_SANDBOX;

-- update the password hashes
UPDATE USER_LOGIN SET CURRENT_PASSWORD = '{SHA}' || CURRENT_PASSWORD WHERE CURRENT_PASSWORD IS NOT NULL AND NOT CURRENT_PASSWORD LIKE '{SHA}%' AND USER_LOGIN_ID != 'anonymous';


/*
* Modifying the product average cost table to change its primary keys
* The following statements will do:
*   1. drop PRODUCT_AVERAGE_COST old primary key
*   2. add PRODUCT_AVERAGE_COST_ID column
*   3. set different value to PRODUCT_AVERAGE_COST_ID
*   4. set PRODUCT_AVERAGE_COST_ID as primary key
*/
ALTER TABLE PRODUCT_AVERAGE_COST DROP CONSTRAINT PK_PRODUCT_AVERAGE_COST;
ALTER TABLE PRODUCT_AVERAGE_COST ADD COLUMN PRODUCT_AVERAGE_COST_ID CHARACTER VARYING(20);
CREATE TEMP SEQUENCE rownum START 10000;
UPDATE PRODUCT_AVERAGE_COST SET PRODUCT_AVERAGE_COST_ID=nextval('rownum');
DROP SEQUENCE rownum;
ALTER TABLE PRODUCT_AVERAGE_COST ADD CONSTRAINT PK_PRODUCT_AVERAGE_COST PRIMARY KEY (PRODUCT_AVERAGE_COST_ID);


update REQUIREMENT set STATUS_ID = 'REQ_CLOSED' where STATUS_ID in ('REQ_ORDERED', 'REQ_PRODUCED', 'REQ_TRANSFERRED');


-- update the columns data type
ALTER TABLE ADDRESS_MATCH_MAP ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE AGREEMENT_INVOICE_ITEM_TYPE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE AGREEMENT_ITEM_TO_TERM_MAP ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE AGREEMENT_ITEM_TO_TERM_MAP ALTER COLUMN MAX_ALLOWED TYPE NUMERIC(20,0);
ALTER TABLE AGREEMENT_PROMO_APPL ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE AGREEMENT_TERM ALTER COLUMN TERM_DAYS TYPE NUMERIC(20,0);
ALTER TABLE AGREEMENT_TO_ITEM_MAP ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE AGREEMENT_TO_ITEM_MAP ALTER COLUMN MAX_ALLOWED TYPE NUMERIC(20,0);
ALTER TABLE BILLING_ACCOUNT_TERM ALTER COLUMN TERM_DAYS TYPE NUMERIC(20,0);
ALTER TABLE CARRIER_SHIPMENT_METHOD ALTER COLUMN SEQUENCE_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE CATALINA_SESSION ALTER COLUMN SESSION_SIZE TYPE NUMERIC(20,0);
ALTER TABLE CATALINA_SESSION ALTER COLUMN MAX_IDLE TYPE NUMERIC(20,0);
ALTER TABLE CATALINA_SESSION ALTER COLUMN LAST_ACCESSED TYPE NUMERIC(20,0);
ALTER TABLE COMM_EVENT_CONTENT_ASSOC ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE CONTENT ALTER COLUMN CHILD_LEAF_COUNT TYPE NUMERIC(20,0);
ALTER TABLE CONTENT ALTER COLUMN CHILD_BRANCH_COUNT TYPE NUMERIC(20,0);
ALTER TABLE CONTENT_APPROVAL ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE CONTENT_ASSOC ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE CONTENT_ASSOC ALTER COLUMN UPPER_COORDINATE TYPE NUMERIC(20,0);
ALTER TABLE CONTENT_ASSOC ALTER COLUMN LEFT_COORDINATE TYPE NUMERIC(20,0);
ALTER TABLE COST_COMPONENT_CALC ALTER COLUMN PER_MILLI_SECOND TYPE NUMERIC(20,0);
ALTER TABLE CREDIT_CARD ALTER COLUMN CONSECUTIVE_FAILED_AUTHS TYPE NUMERIC(20,0);
ALTER TABLE CREDIT_CARD ALTER COLUMN CONSECUTIVE_FAILED_NSF TYPE NUMERIC(20,0);
ALTER TABLE CUST_REQUEST ALTER COLUMN PRIORITY TYPE NUMERIC(20,0);
ALTER TABLE CUST_REQUEST_ITEM ALTER COLUMN PRIORITY TYPE NUMERIC(20,0);
ALTER TABLE CUST_REQUEST_ITEM ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE CUSTOM_TIME_PERIOD ALTER COLUMN PERIOD_NUM TYPE NUMERIC(20,0);
ALTER TABLE EFT_ACCOUNT ALTER COLUMN YEARS_AT_BANK TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC ALTER COLUMN OFFLINE_SYNC_SPLIT_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC ALTER COLUMN SYNC_SPLIT_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC ALTER COLUMN SYNC_END_BUFFER_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC ALTER COLUMN MAX_RUNNING_NO_UPDATE_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN LAST_SPLIT_START_TIME TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_CREATE_INSERTED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_CREATE_UPDATED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_CREATE_NOT_UPDATED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_STORE_INSERTED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_STORE_UPDATED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_STORE_NOT_UPDATED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_REMOVE_DELETED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TO_REMOVE_ALREADY_DELETED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TOTAL_ROWS_EXPORTED TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TOTAL_ROWS_TO_CREATE TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TOTAL_ROWS_TO_STORE TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TOTAL_ROWS_TO_REMOVE TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TOTAL_SPLITS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN TOTAL_STORE_CALLS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN RUNNING_TIME_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN PER_SPLIT_MIN_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN PER_SPLIT_MAX_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN PER_SPLIT_MIN_ITEMS TYPE NUMERIC(20,0);
ALTER TABLE ENTITY_SYNC_HISTORY ALTER COLUMN PER_SPLIT_MAX_ITEMS TYPE NUMERIC(20,0);
ALTER TABLE FACILITY ALTER COLUMN SQUARE_FOOTAGE TYPE NUMERIC(20,0);
ALTER TABLE FACILITY ALTER COLUMN DEFAULT_DAYS_TO_SHIP TYPE NUMERIC(20,0);
ALTER TABLE FACILITY_ASSOC ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE FACILITY_GROUP_MEMBER ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE FACILITY_GROUP_ROLLUP ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE FACILITY_TEAM_ROLE_SECURITY ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE FIXED_ASSET_PRODUCT ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE INVOICE_TERM ALTER COLUMN TERM_DAYS TYPE NUMERIC(20,0);
ALTER TABLE JOB_SANDBOX ALTER COLUMN MAX_RETRY TYPE NUMERIC(20,0);
ALTER TABLE MRP_PRODUCT_STORE_GROUP_MEMBER ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_KEYWORD_RESULT ALTER COLUMN NUM_RESULTS TYPE NUMERIC(20,0);
ALTER TABLE ORDER_DELIVERY_SCHEDULE ALTER COLUMN CARTONS TYPE NUMERIC(20,0);
ALTER TABLE ORDER_DELIVERY_SCHEDULE ALTER COLUMN SKIDS_PALLETS TYPE NUMERIC(20,0);
ALTER TABLE ORDER_ITEM_SHIP_GRP_INV_RES ALTER COLUMN SEQUENCE_ID TYPE NUMERIC(20,0);
ALTER TABLE ORDER_PAYMENT_PREFERENCE ALTER COLUMN PROCESS_ATTEMPT TYPE NUMERIC(20,0);
ALTER TABLE ORDER_TERM ALTER COLUMN TERM_DAYS TYPE NUMERIC(20,0);
ALTER TABLE PAGINATION_PREFERENCE ALTER COLUMN VIEW_SIZE TYPE NUMERIC(20,0);
ALTER TABLE PAGINATION_PREFERENCE ALTER COLUMN CURSOR_INDEX TYPE NUMERIC(20,0);
ALTER TABLE PARTY_ACCTG_PREFERENCE ALTER COLUMN FISCAL_YEAR_START_MONTH TYPE NUMERIC(20,0);
ALTER TABLE PARTY_ACCTG_PREFERENCE ALTER COLUMN FISCAL_YEAR_START_DAY TYPE NUMERIC(20,0);
ALTER TABLE PARTY_ACCTG_PREFERENCE ALTER COLUMN LAST_INVOICE_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE PARTY_ACCTG_PREFERENCE ALTER COLUMN LAST_QUOTE_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE PARTY_ACCTG_PREFERENCE ALTER COLUMN LAST_ORDER_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE PARTY_BENEFIT ALTER COLUMN AVAILABLE_TIME TYPE NUMERIC(20,0);
ALTER TABLE PARTY_CONTACT_MECH ALTER COLUMN YEARS_WITH_CONTACT_MECH TYPE NUMERIC(20,0);
ALTER TABLE PARTY_CONTACT_MECH ALTER COLUMN MONTHS_WITH_CONTACT_MECH TYPE NUMERIC(20,0);
ALTER TABLE PARTY_SKILL ALTER COLUMN YEARS_EXPERIENCE TYPE NUMERIC(20,0);
ALTER TABLE PARTY_SKILL ALTER COLUMN RATING TYPE NUMERIC(20,0);
ALTER TABLE PARTY_SKILL ALTER COLUMN SKILL_LEVEL TYPE NUMERIC(20,0);
ALTER TABLE PARTY_SUPPLEMENTAL_DATA ALTER COLUMN NUMBER_EMPLOYEES TYPE NUMERIC(20,0);
ALTER TABLE PERIOD_TYPE ALTER COLUMN PERIOD_LENGTH TYPE NUMERIC(20,0);
ALTER TABLE PERSON ALTER COLUMN YEARS_WITH_EMPLOYER TYPE NUMERIC(20,0);
ALTER TABLE PERSON ALTER COLUMN MONTHS_WITH_EMPLOYER TYPE NUMERIC(20,0);
ALTER TABLE PICKLIST_BIN ALTER COLUMN BIN_LOCATION_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE POS_TERMINAL_LOG ALTER COLUMN ITEM_COUNT TYPE NUMERIC(20,0);
ALTER TABLE PROD_CATALOG_CATEGORY ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PROD_CATALOG_INV_FACILITY ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PROD_CATALOG_ROLE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT ALTER COLUMN PIECES_INCLUDED TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT ALTER COLUMN BILL_OF_MATERIAL_LEVEL TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_ASSOC ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CALCULATED_INFO ALTER COLUMN TOTAL_TIMES_VIEWED TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CATEGORY_CONTENT ALTER COLUMN USE_COUNT_LIMIT TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CATEGORY_LINK ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CATEGORY_MEMBER ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CATEGORY_ROLLUP ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONFIG ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONFIG_CONFIG ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONFIG_OPTION ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONFIG_OPTION_IACTN ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONFIG_PRODUCT ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONFIG_STATS ALTER COLUMN NUM_OF_CONFS TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONTENT ALTER COLUMN USE_COUNT_LIMIT TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_CONTENT ALTER COLUMN USE_TIME TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_FACILITY ALTER COLUMN DAYS_TO_SHIP TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_FEATURE ALTER COLUMN DEFAULT_SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_FEATURE_APPL ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_FEATURE_GROUP_APPL ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_KEYWORD ALTER COLUMN RELEVANCY_WEIGHT TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_MAINT ALTER COLUMN REPEAT_COUNT TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_PAYMENT_METHOD_TYPE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_PROMO ALTER COLUMN USE_LIMIT_PER_ORDER TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_PROMO ALTER COLUMN USE_LIMIT_PER_CUSTOMER TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_PROMO ALTER COLUMN USE_LIMIT_PER_PROMOTION TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_PROMO_CODE ALTER COLUMN USE_LIMIT_PER_CODE TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_PROMO_CODE ALTER COLUMN USE_LIMIT_PER_CUSTOMER TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_SEARCH_RESULT ALTER COLUMN NUM_RESULTS TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE ALTER COLUMN DAYS_TO_CANCEL_NON_PAY TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE ALTER COLUMN AUTO_ORDER_CC_TRY_LATER_MAX TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE ALTER COLUMN STORE_CREDIT_VALID_DAYS TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_CATALOG ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_FACILITY ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_FIN_ACT_SETTING ALTER COLUMN ACCOUNT_CODE_LENGTH TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_FIN_ACT_SETTING ALTER COLUMN PIN_CODE_LENGTH TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_FIN_ACT_SETTING ALTER COLUMN ACCOUNT_VALID_DAYS TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_FIN_ACT_SETTING ALTER COLUMN AUTH_VALID_DAYS TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_GROUP_MEMBER ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_GROUP_ROLLUP ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_PROMO_APPL ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_ROLE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_SHIPMENT_METH ALTER COLUMN SEQUENCE_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_STORE_SURVEY_APPL ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_SUBSCRIPTION_RESOURCE ALTER COLUMN MAX_LIFE_TIME TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_SUBSCRIPTION_RESOURCE ALTER COLUMN AVAILABLE_TIME TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_SUBSCRIPTION_RESOURCE ALTER COLUMN USE_COUNT_LIMIT TYPE NUMERIC(20,0);
ALTER TABLE PRODUCT_SUBSCRIPTION_RESOURCE ALTER COLUMN USE_TIME TYPE NUMERIC(20,0);
ALTER TABLE QUOTE_TERM ALTER COLUMN TERM_VALUE TYPE NUMERIC(20,0);
ALTER TABLE RECURRENCE_INFO ALTER COLUMN RECURRENCE_COUNT TYPE NUMERIC(20,0);
ALTER TABLE RECURRENCE_RULE ALTER COLUMN COUNT_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE RECURRENCE_RULE ALTER COLUMN INTERVAL_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE SALES_OPPORTUNITY_STAGE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE SALES_TEAM_ROLE_SECURITY ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE SEQUENCE_VALUE_ITEM ALTER COLUMN SEQ_ID TYPE NUMERIC(20,0);
ALTER TABLE SERVER_HIT ALTER COLUMN NUM_OF_BYTES TYPE NUMERIC(20,0);
ALTER TABLE SERVER_HIT ALTER COLUMN RUNNING_TIME_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE SERVER_HIT_BIN ALTER COLUMN NUMBER_HITS TYPE NUMERIC(20,0);
ALTER TABLE SERVER_HIT_BIN ALTER COLUMN TOTAL_TIME_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE SERVER_HIT_BIN ALTER COLUMN MIN_TIME_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE SERVER_HIT_BIN ALTER COLUMN MAX_TIME_MILLIS TYPE NUMERIC(20,0);
ALTER TABLE SETTLEMENT_TERM ALTER COLUMN TERM_VALUE TYPE NUMERIC(20,0);
ALTER TABLE SHIPMENT_METHOD_TYPE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_MULTI_RESP_COLUMN ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_PAGE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_QUESTION_APPL ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_QUESTION_OPTION ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_QUESTION_OPTION ALTER COLUMN DURATION TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_RESPONSE_ANSWER ALTER COLUMN NUMERIC_RESPONSE TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_RESPONSE_ANSWER ALTER COLUMN DURATION TYPE NUMERIC(20,0);
ALTER TABLE SURVEY_RESPONSE_ANSWER ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE TESTING ALTER COLUMN TESTING_SIZE TYPE NUMERIC(20,0);
ALTER TABLE TRACKING_CODE ALTER COLUMN TRACKABLE_LIFETIME TYPE NUMERIC(20,0);
ALTER TABLE TRACKING_CODE ALTER COLUMN BILLABLE_LIFETIME TYPE NUMERIC(20,0);
ALTER TABLE UOM_CONVERSION ALTER COLUMN DECIMAL_SCALE TYPE NUMERIC(20,0);
ALTER TABLE UOM_CONVERSION_DATED ALTER COLUMN DECIMAL_SCALE TYPE NUMERIC(20,0);
ALTER TABLE USER_LOGIN ALTER COLUMN SUCCESSIVE_FAILED_LOGINS TYPE NUMERIC(20,0);
ALTER TABLE USPS_ZIP_TO_BMC_CODE ALTER COLUMN POSTAL_ZONE TYPE NUMERIC(20,0);
ALTER TABLE VALUE_LINK_KEY ALTER COLUMN WORKING_KEY_INDEX TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN REQUIRED_STOCK_MOVES TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN REQUESTED_INVENTORY_TRANSFERS TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN NUMBER_BACK_ORDERS TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN NUMBER_PRODUCTS_BACK_ORDERED TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN ORDERS_READY_SHIP TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN OPEN_PICKLISTS TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN PICKLISTS_SHIPPED TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN NEW_PRODUCT_RUNS TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN SCHEDULED_PRODUCTION_RUNS TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN CONFIRMED_PRODUCTION_RUNS TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_DATA ALTER COLUMN ACTIVE_PRODUCTION_RUNS TYPE NUMERIC(20,0);
ALTER TABLE WAREHOUSE_SUMMARY_PICK_MOVE ALTER COLUMN ORDER_READY_TO_PICK_INFO TYPE NUMERIC(20,0);
ALTER TABLE WEB_SITE_ROLE ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE WORK_EFFORT ALTER COLUMN PRIORITY TYPE NUMERIC(20,0);
ALTER TABLE WORK_EFFORT ALTER COLUMN PERCENT_COMPLETE TYPE NUMERIC(20,0);
ALTER TABLE WORK_EFFORT ALTER COLUMN TIME_TRANSPARENCY TYPE NUMERIC(20,0);
ALTER TABLE WORK_EFFORT ALTER COLUMN REVISION_NUMBER TYPE NUMERIC(20,0);
ALTER TABLE WORK_EFFORT_ASSOC ALTER COLUMN SEQUENCE_NUM TYPE NUMERIC(20,0);
ALTER TABLE WORK_EFFORT_KEYWORD ALTER COLUMN RELEVANCY_WEIGHT TYPE NUMERIC(20,0);
ALTER TABLE WORK_EFFORT_SEARCH_RESULT ALTER COLUMN NUM_RESULTS TYPE NUMERIC(20,0);
ALTER TABLE DATA_IMPORT_PRODUCT ALTER COLUMN DESCRIPTION TYPE TEXT;
ALTER TABLE ORDER_ITEM_PRICE_INFO ALTER COLUMN MODIFY_AMOUNT TYPE NUMERIC(18,3);
ALTER TABLE PAGINATION_PREFERENCE ALTER COLUMN USER_LOGIN_ID TYPE VARCHAR(250);
ALTER TABLE WORK_EFFORT_VIEW_HISTORY ALTER COLUMN USER_LOGIN_ID TYPE VARCHAR(250);


ALTER TABLE BUDGET_SCENARIO_APPLICATION ALTER COLUMN PERCENTAGE_CHANGE TYPE NUMERIC(18,6);
ALTER TABLE BUDGET_SCENARIO_RULE ALTER COLUMN PERCENTAGE_CHANGE TYPE NUMERIC(18,6);
ALTER TABLE CART_ABANDONED_LINE ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE CART_ABANDONED_LINE ALTER COLUMN RESERV_LENGTH TYPE NUMERIC(18,6);
ALTER TABLE CART_ABANDONED_LINE ALTER COLUMN RESERV_PERSONS TYPE NUMERIC(18,6);
ALTER TABLE CART_ABANDONED_LINE ALTER COLUMN RESERV2ND_P_P_PERC TYPE NUMERIC(18,6);
ALTER TABLE CART_ABANDONED_LINE ALTER COLUMN RESERV_NTH_P_P_PERC TYPE NUMERIC(18,6);
ALTER TABLE COST_COMPONENT ALTER COLUMN COST TYPE NUMERIC(18,6);
ALTER TABLE CUST_REQUEST_ITEM ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE CUST_REQUEST_ITEM ALTER COLUMN SELECTED_AMOUNT TYPE NUMERIC(18,6);
ALTER TABLE DELIVERY ALTER COLUMN START_MILEAGE TYPE NUMERIC(18,6);
ALTER TABLE DELIVERY ALTER COLUMN END_MILEAGE TYPE NUMERIC(18,6);
ALTER TABLE DELIVERY ALTER COLUMN FUEL_USED TYPE NUMERIC(18,6);
ALTER TABLE FIXED_ASSET ALTER COLUMN PRODUCTION_CAPACITY TYPE NUMERIC(18,6);
ALTER TABLE FIXED_ASSET_MAINT ALTER COLUMN INTERVAL_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE FIXED_ASSET_MAINT_METER ALTER COLUMN METER_VALUE TYPE NUMERIC(18,6);
ALTER TABLE FIXED_ASSET_PRODUCT ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE GL_BUDGET_XREF ALTER COLUMN ALLOCATION_PERCENTAGE TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM ALTER COLUMN QUANTITY_ON_HAND_TOTAL TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM ALTER COLUMN AVAILABLE_TO_PROMISE_TOTAL TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM ALTER COLUMN QUANTITY_ON_HAND TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM ALTER COLUMN AVAILABLE_TO_PROMISE TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM ALTER COLUMN UNIT_COST TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM_DETAIL ALTER COLUMN QUANTITY_ON_HAND_DIFF TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM_DETAIL ALTER COLUMN AVAILABLE_TO_PROMISE_DIFF TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM_TEMP_RES ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM_VARIANCE ALTER COLUMN AVAILABLE_TO_PROMISE_VAR TYPE NUMERIC(18,6);
ALTER TABLE INVENTORY_ITEM_VARIANCE ALTER COLUMN QUANTITY_ON_HAND_VAR TYPE NUMERIC(18,6);
ALTER TABLE INVOICE_ITEM ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE INVOICE_ROLE ALTER COLUMN PERCENTAGE TYPE NUMERIC(18,6);
ALTER TABLE ITEM_ISSUANCE ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE LOT ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ADJUSTMENT ALTER COLUMN SOURCE_PERCENTAGE TYPE NUMERIC(18,6);
ALTER TABLE ORDER_DELIVERY_SCHEDULE ALTER COLUMN UNITS_PIECES TYPE NUMERIC(18,6);
ALTER TABLE ORDER_DELIVERY_SCHEDULE ALTER COLUMN TOTAL_CUBIC_SIZE TYPE NUMERIC(18,6);
ALTER TABLE ORDER_DELIVERY_SCHEDULE ALTER COLUMN TOTAL_WEIGHT TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM ALTER COLUMN CANCEL_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM ALTER COLUMN SELECTED_AMOUNT TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM_ASSOC ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM_BILLING ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM_SHIP_GROUP_ASSOC ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM_SHIP_GROUP_ASSOC ALTER COLUMN CANCEL_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM_SHIP_GRP_INV_RES ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_ITEM_SHIP_GRP_INV_RES ALTER COLUMN QUANTITY_NOT_AVAILABLE TYPE NUMERIC(18,6);
ALTER TABLE ORDER_REQUIREMENT_COMMITMENT ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_SHIPMENT ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE ORDER_SUMMARY_ENTRY ALTER COLUMN TOTAL_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PICKLIST_ITEM ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN QUANTITY_INCLUDED TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN WEIGHT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN PRODUCT_HEIGHT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN SHIPPING_HEIGHT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN PRODUCT_WIDTH TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN SHIPPING_WIDTH TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN PRODUCT_DEPTH TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN SHIPPING_DEPTH TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN PRODUCT_RATING TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN RESERV_MAX_PERSONS TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN RESERV2ND_P_P_PERC TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT ALTER COLUMN RESERV_NTH_P_P_PERC TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_ASSOC ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_ASSOC ALTER COLUMN SCRAP_FACTOR TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_CALCULATED_INFO ALTER COLUMN TOTAL_QUANTITY_ORDERED TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_CALCULATED_INFO ALTER COLUMN AVERAGE_CUSTOMER_RATING TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_CATEGORY_CONTENT ALTER COLUMN USE_DAYS_LIMIT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_CATEGORY_MEMBER ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_CONFIG_PRODUCT ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_FACILITY ALTER COLUMN MINIMUM_STOCK TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_FACILITY ALTER COLUMN REORDER_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_FACILITY_LOCATION ALTER COLUMN MINIMUM_STOCK TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_FACILITY_LOCATION ALTER COLUMN MOVE_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_FEATURE ALTER COLUMN NUMBER_SPECIFIED TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_MAINT ALTER COLUMN INTERVAL_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_PRICE_ACTION ALTER COLUMN AMOUNT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_PROMO ALTER COLUMN BILLBACK_FACTOR TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_PROMO_ACTION ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_PROMO_ACTION ALTER COLUMN AMOUNT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_PROMO_USE ALTER COLUMN QUANTITY_LEFT_IN_ACTIONS TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_REVIEW ALTER COLUMN PRODUCT_RATING TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_STORE_SHIPMENT_METH ALTER COLUMN MIN_WEIGHT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_STORE_SHIPMENT_METH ALTER COLUMN MAX_WEIGHT TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_STORE_SHIPMENT_METH ALTER COLUMN MIN_SIZE TYPE NUMERIC(18,6);
ALTER TABLE PRODUCT_STORE_SHIPMENT_METH ALTER COLUMN MAX_SIZE TYPE NUMERIC(18,6);
ALTER TABLE QUANTITY_BREAK ALTER COLUMN FROM_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE QUANTITY_BREAK ALTER COLUMN THRU_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE QUOTE_ADJUSTMENT ALTER COLUMN SOURCE_PERCENTAGE TYPE NUMERIC(18,6);
ALTER TABLE QUOTE_COEFFICIENT ALTER COLUMN COEFF_VALUE TYPE NUMERIC(18,6);
ALTER TABLE QUOTE_ITEM ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE QUOTE_ITEM ALTER COLUMN SELECTED_AMOUNT TYPE NUMERIC(18,6);
ALTER TABLE REORDER_GUIDELINE ALTER COLUMN REORDER_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE REORDER_GUIDELINE ALTER COLUMN REORDER_LEVEL TYPE NUMERIC(18,6);
ALTER TABLE REQUIREMENT ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE RETURN_ADJUSTMENT ALTER COLUMN SOURCE_PERCENTAGE TYPE NUMERIC(18,6);
ALTER TABLE RETURN_ITEM ALTER COLUMN RETURN_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE RETURN_ITEM ALTER COLUMN RECEIVED_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE RETURN_ITEM_BILLING ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE SALES_FORECAST ALTER COLUMN PERCENT_OF_QUOTA_FORECAST TYPE NUMERIC(18,6);
ALTER TABLE SALES_FORECAST ALTER COLUMN PERCENT_OF_QUOTA_CLOSED TYPE NUMERIC(18,6);
ALTER TABLE SALES_FORECAST_HISTORY ALTER COLUMN PERCENT_OF_QUOTA_FORECAST TYPE NUMERIC(18,6);
ALTER TABLE SALES_FORECAST_HISTORY ALTER COLUMN PERCENT_OF_QUOTA_CLOSED TYPE NUMERIC(18,6);
ALTER TABLE SALES_OPPORTUNITY ALTER COLUMN ESTIMATED_PROBABILITY TYPE NUMERIC(18,6);
ALTER TABLE SALES_OPPORTUNITY_HISTORY ALTER COLUMN ESTIMATED_PROBABILITY TYPE NUMERIC(18,6);
ALTER TABLE SALES_OPPORTUNITY_STAGE ALTER COLUMN DEFAULT_PROBABILITY TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_BOX_TYPE ALTER COLUMN BOX_LENGTH TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_BOX_TYPE ALTER COLUMN BOX_WIDTH TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_BOX_TYPE ALTER COLUMN BOX_HEIGHT TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_COST_ESTIMATE ALTER COLUMN ORDER_PRICE_PERCENT TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_COST_ESTIMATE ALTER COLUMN SHIPPING_PRICE_PERCENT TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_COST_ESTIMATE ALTER COLUMN OVERSIZE_UNIT TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_COST_ESTIMATE ALTER COLUMN FEATURE_PERCENT TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_ITEM ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_PACKAGE ALTER COLUMN WEIGHT TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_PACKAGE_CONTENT ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_PACKAGE_CONTENT ALTER COLUMN SUB_PRODUCT_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_RECEIPT ALTER COLUMN QUANTITY_ACCEPTED TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_RECEIPT ALTER COLUMN QUANTITY_REJECTED TYPE NUMERIC(18,6);
ALTER TABLE SHIPMENT_ROUTE_SEGMENT ALTER COLUMN BILLING_WEIGHT TYPE NUMERIC(18,6);
ALTER TABLE SHOPPING_LIST_ITEM ALTER COLUMN QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE SHOPPING_LIST_ITEM ALTER COLUMN RESERV_LENGTH TYPE NUMERIC(18,6);
ALTER TABLE SHOPPING_LIST_ITEM ALTER COLUMN RESERV_PERSONS TYPE NUMERIC(18,6);
ALTER TABLE SHOPPING_LIST_ITEM ALTER COLUMN QUANTITY_PURCHASED TYPE NUMERIC(18,6);
ALTER TABLE SUPPLIER_PRODUCT ALTER COLUMN STANDARD_LEAD_TIME_DAYS TYPE NUMERIC(18,6);
ALTER TABLE SUPPLIER_PRODUCT ALTER COLUMN MINIMUM_ORDER_QUANTITY TYPE NUMERIC(18,6);
ALTER TABLE SUPPLIER_PRODUCT ALTER COLUMN ORDER_QTY_INCREMENTS TYPE NUMERIC(18,6);
ALTER TABLE SUPPLIER_PRODUCT ALTER COLUMN UNITS_INCLUDED TYPE NUMERIC(18,6);
ALTER TABLE SUPPLIER_PRODUCT ALTER COLUMN SUPPLIER_COMMISSION_PERC TYPE NUMERIC(18,6);
ALTER TABLE TAX_AUTHORITY_RATE_PRODUCT ALTER COLUMN TAX_PERCENTAGE TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN STATE_SALES_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN CITY_SALES_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN CITY_LOCAL_SALES_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN COUNTY_SALES_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN COUNTY_LOCAL_SALES_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN COMBO_SALES_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN STATE_USE_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN CITY_USE_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN CITY_LOCAL_USE_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN COUNTY_USE_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN COUNTY_LOCAL_USE_TAX TYPE NUMERIC(18,6);
ALTER TABLE ZIP_SALES_TAX_LOOKUP ALTER COLUMN COMBO_USE_TAX TYPE NUMERIC(18,6);

ALTER TABLE CURRENCY_DIM ALTER COLUMN CURRENCY_DIM_ID TYPE INT8;
ALTER TABLE DATE_DIM ALTER COLUMN DATE_DIM_ID TYPE INT8;
ALTER TABLE SALES_INVOICE_ITEM_FACT ALTER COLUMN DATE_DIM_ID TYPE INT8;
ALTER TABLE SALES_INVOICE_ITEM_FACT ALTER COLUMN STORE_DIM_ID TYPE INT8;
ALTER TABLE SALES_INVOICE_ITEM_FACT ALTER COLUMN CURRENCY_DIM_ID TYPE INT8;
ALTER TABLE STORE_DIM ALTER COLUMN STORE_DIM_ID TYPE INT8;
ALTER TABLE TAX_AUTHORITY_DIM ALTER COLUMN TAX_AUTHORITY_DIM_ID TYPE INT8;
ALTER TABLE TAX_INVOICE_ITEM_FACT ALTER COLUMN DATE_DIM_ID TYPE INT8;
ALTER TABLE TAX_INVOICE_ITEM_FACT ALTER COLUMN STORE_DIM_ID TYPE INT8;
ALTER TABLE TAX_INVOICE_ITEM_FACT ALTER COLUMN TAX_AUTHORITY_DIM_ID TYPE INT8;
ALTER TABLE TAX_INVOICE_ITEM_FACT ALTER COLUMN CURRENCY_DIM_ID TYPE INT8;

-- recreate primary key for DATA_IMPORT_ORDER_ITEM
ALTER TABLE DATA_IMPORT_ORDER_ITEM DROP CONSTRAINT PK_DATA_IMPORT_ORDER_ITEM;
ALTER TABLE DATA_IMPORT_ORDER_ITEM ADD PRIMARY KEY (ORDER_ID, PRODUCT_ID, QUANTITY, PRICE);
