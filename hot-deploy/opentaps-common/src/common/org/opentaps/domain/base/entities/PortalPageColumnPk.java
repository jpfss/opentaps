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
public class PortalPageColumnPk implements Serializable {
    @Column(name="PORTAL_PAGE_ID")
    private String portalPageId;
    @Column(name="COLUMN_SEQ_ID")
    private String columnSeqId;
    
    /**
     * Auto generated value setter.
     * @param portalPageId the portalPageId to set
     */
    public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }
    /**
     * Auto generated value setter.
     * @param columnSeqId the columnSeqId to set
     */
    public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getPortalPageId() {
        return this.portalPageId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getColumnSeqId() {
        return this.columnSeqId;
    }
}
