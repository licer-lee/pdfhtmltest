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

    @RequestMapping("/tripException")
    public ResponseEntity<byte[]> tripException() {

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
        map.put("company", "招银云创");
        map.put("exportTime", "2020-04-21 16:17:36");
        map.put("userName", "乔谦");
        map.put("userDept", "招银云创/上海研发部");
        map.put("refundType", "改签");
        map.put("changeTime", "2020-05-01");
        map.put("people", "乔谦、汪琦璟");
        map.put("fee", "预计200元内（贰佰）");
        map.put("reason", "领导让晚回来一天，领导让晚回来一天，领导让晚回来一天，领导让晚回来一天，领导让晚回来一天");

        List<Map> tripList = new ArrayList<>();
        Map trip = new HashMap();
        trip.put("airPaper","虹桥机场 – 宝安机场");
        tripList.add(trip);
        trip = new HashMap();
        trip.put("airPaper","虹桥机场 – 宝安机场");
        tripList.add(trip);
        map.put("tripList", tripList);

        System.out.println("map = " + map.toString());

        String templateFilName = "trip_exception.ftl";
        String domain = "http://localhost:8082/";

        PDFTemplateUtil pdfTemplateUtil = new PDFTemplateUtil(templateFilName);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        pdfTemplateUtil.createPDFFromUrlTemplate(domain,map, out);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(out.toByteArray(), httpHeaders, HttpStatus.OK);

    }
}
