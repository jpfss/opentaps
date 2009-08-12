package org.opentaps.domain.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the Honest Public License.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* Honest Public License for more details.
*
* You should have received a copy of the Honest Public License
* along with this program; if not, write to Funambol,
* 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
*/

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;

@Embeddable
public class SalesForecastDetailPk implements Serializable {
    @Column(name="SALES_FORECAST_ID")
    private String salesForecastId;
    @Column(name="SALES_FORECAST_DETAIL_ID")
    private String salesForecastDetailId;
    
    /**
     * Auto generated value setter.
     * @param salesForecastId the salesForecastId to set
     */
    public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }
    /**
     * Auto generated value setter.
     * @param salesForecastDetailId the salesForecastDetailId to set
     */
    public void setSalesForecastDetailId(String salesForecastDetailId) {
        this.salesForecastDetailId = salesForecastDetailId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getSalesForecastId() {
        return this.salesForecastId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getSalesForecastDetailId() {
        return this.salesForecastDetailId;
    }
}
