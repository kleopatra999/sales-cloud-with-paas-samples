/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleaapps.leadcapturesys.model.common;

import oracle.jbo.Row;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 14 14:59:47 CEST 2015
// ---------------------------------------------------------------------
public interface LeadCaptureSysVORow extends Row {
    Number getActivityId();

    void setActivityId(Number value);

    String getProspectName();

    void setProspectName(String value);

    String getDemoCompleted();

    void setDemoCompleted(String value);

    String getLeadRecUpdated();

    void setLeadRecUpdated(String value);

    Date getVisitDate();

    void setVisitDate(Date value);

    Timestamp getStartTime();

    void setStartTime(Timestamp value);

    Timestamp getEndTime();

    void setEndTime(Timestamp value);

    String getNotes();

    void setNotes(String value);
}
