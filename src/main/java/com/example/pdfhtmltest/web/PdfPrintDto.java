package com.example.pdfhtmltest.web;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PdfPrintDto implements Serializable {

    private String title;
    private String exportTime;

}
