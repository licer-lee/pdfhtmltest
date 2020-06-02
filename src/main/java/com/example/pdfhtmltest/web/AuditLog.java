package com.example.pdfhtmltest.web;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class AuditLog {
    private String auditPeople;
    private String auditName;
    private String auditTime;
    private String auditResult;
}
