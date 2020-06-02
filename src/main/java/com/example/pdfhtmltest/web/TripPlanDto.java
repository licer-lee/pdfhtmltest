package com.example.pdfhtmltest.web;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class TripPlanDto implements Serializable {

    private List<AuditLog> auditLogs;
    private List<Travel> travels;
    private String exportTime;
    private String userName;
    private String userDept;
    private String tripPlanNo;
    private String tripType;
    private String feeBelong;
    private String tripPeople;
    private String tripReason;

    public List<AuditLog> getAuditLogs() {
        return auditLogs;
    }

    public void setAuditLogs(List<AuditLog> auditLogs) {
        this.auditLogs = auditLogs;
    }

    public List<Travel> getTravels() {
        return travels;
    }

    public void setTravels(List<Travel> travels) {
        this.travels = travels;
    }

    public String getExportTime() {
        return exportTime;
    }

    public void setExportTime(String exportTime) {
        this.exportTime = exportTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getTripPlanNo() {
        return tripPlanNo;
    }

    public void setTripPlanNo(String tripPlanNo) {
        this.tripPlanNo = tripPlanNo;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getFeeBelong() {
        return feeBelong;
    }

    public void setFeeBelong(String feeBelong) {
        this.feeBelong = feeBelong;
    }

    public String getTripPeople() {
        return tripPeople;
    }

    public void setTripPeople(String tripPeople) {
        this.tripPeople = tripPeople;
    }

    public String getTripReason() {
        return tripReason;
    }

    public void setTripReason(String tripReason) {
        this.tripReason = tripReason;
    }
}
