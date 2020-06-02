package com.example.pdfhtmltest.web;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class Travel {

    private String date;
    private String dayOfWeek;
    private String from;
    private String to;
}
