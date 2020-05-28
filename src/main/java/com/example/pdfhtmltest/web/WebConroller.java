package com.example.pdfhtmltest.web;

import com.example.pdfhtml.utils.PDFTemplateUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pdf")
public class WebConroller {


    @RequestMapping("/createAndView")
    public ResponseEntity<byte[]> pdfCreateAndView1() {



        List<Map> auditLogs = new ArrayList<>();
        Map mapd = new HashMap();
        mapd.put("auditPeople","孙悟空1");
        mapd.put("auditName","发起申请");
        mapd.put("auditTime", "2020-05-28 16:13");
        mapd.put("auditResult", "提交审核");
        auditLogs.add(mapd);

        mapd = new HashMap();
        mapd.put("auditPeople","猪八戒2");
        mapd.put("auditName","领导审批");
        mapd.put("auditTime", "2020-05-28 16:13");
        mapd.put("auditResult", "通过");
        auditLogs.add(mapd);

        mapd = new HashMap();
        mapd.put("auditPeople","沙和尚3");
        mapd.put("auditName","财务审批");
        mapd.put("auditTime", "2020-05-28 16:13");
        mapd.put("auditResult", "通过");
        auditLogs.add(mapd);

        mapd = new HashMap();
        mapd.put("auditPeople","唐长老4");
        mapd.put("auditName","领导审批");
        mapd.put("auditTime", "2020-05-28 16:13");
        mapd.put("auditResult", "通过");
        auditLogs.add(mapd);

        Map<String, Object> map = new HashMap<>();
        map.put("auditLogs", auditLogs);
        map.put("title", "审批记录");
        System.out.println("map = " + map.toString());

        String templateFilName = "rBACGF7PeCaAXEKhAAAeGpVFFcE221.ftl";
        String domain = "http://163.53.94.236:8080/mbcloud/M00/02/18/";

        PDFTemplateUtil pdfTemplateUtil = new PDFTemplateUtil(templateFilName);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        pdfTemplateUtil.createPDFFromUrlTemplate(domain,map, out);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(out.toByteArray(), httpHeaders, HttpStatus.OK);

    }
}
