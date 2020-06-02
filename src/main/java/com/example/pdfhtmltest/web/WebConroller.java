package com.example.pdfhtmltest.web;

import com.example.pdfhtml.utils.PdfHtmlUtil;
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

        PdfHtmlUtil pdfTemplateUtil = new PdfHtmlUtil(templateFilName);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        pdfTemplateUtil.createPdfFromUrlTemplate(domain,map, out);

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

        String templateFilName = "tripException.ftl";
        String domain = "http://localhost:8082/";

        PdfHtmlUtil pdfHtmlUtil = new PdfHtmlUtil(templateFilName);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        pdfHtmlUtil.createPdfFromUrlTemplate(domain,map, out);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(out.toByteArray(), httpHeaders, HttpStatus.OK);

    }

    @RequestMapping("/tripPlan")
    public ResponseEntity<byte[]> tripPlan() {


        List<AuditLog> auditLogs = new ArrayList<>();
        auditLogs.add(AuditLog.builder().auditPeople("孙悟空1").auditName("发起申请").auditTime("2020-05-28 16:13").auditResult("提交审核").build());
        auditLogs.add(AuditLog.builder().auditPeople("猪八戒2").auditName("领导审批").auditTime("2020-05-28 16:13").auditResult("通过").build());
        auditLogs.add(AuditLog.builder().auditPeople("沙和尚3").auditName("财务审批").auditTime("2020-05-28 16:13").auditResult("通过").build());
        auditLogs.add(AuditLog.builder().auditPeople("唐长老4").auditName("领导审批").auditTime("2020-05-28 16:13").auditResult("通过").build());

        List<Travel> travels = new ArrayList<>();
        travels.add(Travel.builder().date("2020年04月20日").dayOfWeek("星期一").from("虹桥机场").to("宝安机场").build());
        travels.add(Travel.builder().date("2020年04月21日").dayOfWeek("星期二").from("虹桥机场").to("宝安机场").build());
        travels.add(Travel.builder().date("2020年04月22日").dayOfWeek("星期三").from("虹桥机场").to("宝安机场").build());
        travels.add(Travel.builder().date("2020年04月23日").dayOfWeek("星期四").from("虹桥机场").to("宝安机场").build());

        TripPlanDto tripPlanDto = new TripPlanDto();
        tripPlanDto.setAuditLogs(auditLogs);
        tripPlanDto.setTravels(travels);
        tripPlanDto.setExportTime("2020-04-21 16:17:36");
        tripPlanDto.setUserName("乔谦");
        tripPlanDto.setUserDept("上海研发部");
        tripPlanDto.setTripPlanNo("2020042000001");
        tripPlanDto.setTripType("改签");
        tripPlanDto.setFeeBelong("2020-05-01");
        tripPlanDto.setTripPeople("乔谦、汪琦璟");
        tripPlanDto.setTripReason("领导让晚回来一天，领导让晚回来一天，领导让晚回来一天，领导让晚回来一天，领导让晚回来一天");
        System.out.println("tripPlanDto = " + tripPlanDto);

        String templateFilName = "tripPlanApplyTemplate.ftl";
        String domain = "http://localhost:8082/";

        PdfHtmlUtil pdfHtmlUtil = new PdfHtmlUtil(templateFilName);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        pdfHtmlUtil.createPdfFromUrlTemplate(domain,tripPlanDto, out);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(out.toByteArray(), httpHeaders, HttpStatus.OK);

    }

    @RequestMapping("/assetDetail")
    public ResponseEntity<byte[]> assetDetail(){

        Map<String, Object> m = new HashMap<>();
        m.put("oldAssetCode", "123456");
        m.put("assetCode", "654321");
        m.put("qrCodeUrl", "http://163.53.94.236:8080/mbcloud/M00/02/18/rBACGF7Mhy-AKEOdAAAD-0oRyRg821.jpg");

        String templateFilName = "assetTemplate.ftl";
        String domain = "http://localhost:8082/";

        PdfHtmlUtil pdfHtmlUtil = new PdfHtmlUtil(templateFilName);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        pdfHtmlUtil.createPdfFromUrlTemplate(domain,m, out);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(out.toByteArray(), httpHeaders, HttpStatus.OK);

    }

    @RequestMapping("/stringTemplate")
    public ResponseEntity<byte[]> stringTemplate(){

        List<AuditLog> auditLogs = new ArrayList<>();
        auditLogs.add(AuditLog.builder().auditPeople("孙悟空1").auditName("发起申请").auditTime("2020-05-28 16:13").auditResult("提交审核").build());
        auditLogs.add(AuditLog.builder().auditPeople("猪八戒2").auditName("领导审批").auditTime("2020-05-28 16:13").auditResult("通过").build());
        auditLogs.add(AuditLog.builder().auditPeople("沙和尚3").auditName("财务审批").auditTime("2020-05-28 16:13").auditResult("通过").build());
        auditLogs.add(AuditLog.builder().auditPeople("唐长老4").auditName("领导审批").auditTime("2020-05-28 16:13").auditResult("通过").build());

        List<Travel> travels = new ArrayList<>();
        travels.add(Travel.builder().date("2020年04月20日").dayOfWeek("星期一").from("虹桥机场").to("宝安机场").build());
        travels.add(Travel.builder().date("2020年04月21日").dayOfWeek("星期二").from("虹桥机场").to("宝安机场").build());
        travels.add(Travel.builder().date("2020年04月22日").dayOfWeek("星期三").from("虹桥机场").to("宝安机场").build());
        travels.add(Travel.builder().date("2020年04月23日").dayOfWeek("星期四").from("虹桥机场").to("宝安机场").build());

        TripPlanDto tripPlanDto = new TripPlanDto();
        tripPlanDto.setAuditLogs(auditLogs);
        tripPlanDto.setTravels(travels);
        tripPlanDto.setExportTime("2020-04-21 16:17:36");
        tripPlanDto.setUserName("乔谦");
        tripPlanDto.setUserDept("上海研发部");
        tripPlanDto.setTripPlanNo("2020042000001");
        tripPlanDto.setTripType("改签");
        tripPlanDto.setFeeBelong("2020-05-01");
        tripPlanDto.setTripPeople("乔谦、汪琦璟");
        tripPlanDto.setTripReason("领导让晚回来一天，领导让晚回来一天，领导让晚回来一天，领导让晚回来一天，领导让晚回来一天");
        System.out.println("tripPlanDto = " + tripPlanDto);

        String templateFilName = "assetTemplate.ftl";
        String StringContent = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "    <title></title>\n" +
                "    <meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\"/>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "    <style type=\"text/css\">\n" +
                "        body {\n" +
                "            font-family: SimSun;\n" +
                "        }\n" +
                "    </style>\n" +
                "    <style>\n" +
                "        /* style init */\n" +
                "        html,\n" +
                "        body,\n" +
                "        ol,\n" +
                "        ul,\n" +
                "        li,\n" +
                "        h1,\n" +
                "        h2,\n" +
                "        h3,\n" +
                "        h4,\n" +
                "        h5,\n" +
                "        h6,\n" +
                "        p,\n" +
                "        th,\n" +
                "        td,\n" +
                "        dl,\n" +
                "        dd,\n" +
                "        form,\n" +
                "        fieldset,\n" +
                "        legend {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        ul,\n" +
                "        ol,\n" +
                "        li {\n" +
                "            list-style: none;\n" +
                "        }\n" +
                "        b,\n" +
                "        strong {\n" +
                "            font-weight: normal;\n" +
                "        }\n" +
                "        i,\n" +
                "        em {\n" +
                "            font-style: normal;\n" +
                "        }\n" +
                "        a,\n" +
                "        u {\n" +
                "            text-decoration: none;\n" +
                "        }\n" +
                "\n" +
                "        .wrap {\n" +
                "            width: 781px;\n" +
                "            height: 588px;\n" +
                "            margin: 0 auto;\n" +
                "        }\n" +
                "\n" +
                "        /* header */\n" +
                "        .header {\n" +
                "            display: flex;\n" +
                "            flex-direction: column;\n" +
                "        }\n" +
                "        .header .firstTitle {\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            border-bottom: 1px solid #000;\n" +
                "        }\n" +
                "\n" +
                "        .header .firstTitle .time {\n" +
                "            margin-left: auto;\n" +
                "        }\n" +
                "\n" +
                "        .header .secondTitle {\n" +
                "            display: flex;\n" +
                "            justify-content: space-between;\n" +
                "        }\n" +
                "\n" +
                "        /* basicInformation */\n" +
                "        .basicInformation {\n" +
                "            display: flex;\n" +
                "            flex-direction: column;\n" +
                "            border-bottom: 1px solid #000;\n" +
                "        }\n" +
                "        .basicInformation .information {\n" +
                "            display: flex;\n" +
                "            flex-direction: column;\n" +
                "        }\n" +
                "        .information .item {\n" +
                "            display: flex;\n" +
                "            flex: 1;\n" +
                "            border: 1px solid #000;\n" +
                "            border-bottom: 0;\n" +
                "        }\n" +
                "        .information .item .info {\n" +
                "            display: flex;\n" +
                "            flex: 1;\n" +
                "        }\n" +
                "\n" +
                "        /* planTrip */\n" +
                "        .planTrip .title {\n" +
                "            border-bottom: 1px solid #000;\n" +
                "        }\n" +
                "        .planTrip .item {\n" +
                "            display: flex;\n" +
                "        }\n" +
                "        .planTrip .item .left {\n" +
                "            display: flex;\n" +
                "            flex-direction: column;\n" +
                "        }\n" +
                "        .planTrip .item .right {\n" +
                "            display: flex;\n" +
                "            flex: 1;\n" +
                "            background: #ccc;\n" +
                "        }\n" +
                "\n" +
                "        /* approvalRecord */\n" +
                "        .approvalRecord .title {\n" +
                "            border-bottom: 1px solid #000;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"wrap\">\n" +
                "    <!-- 头部 -->\n" +
                "    <div class=\"header\">\n" +
                "        <div class=\"firstTitle\">\n" +
                "            <h1 class=\"title\">差旅计划申请单</h1>\n" +
                "            <p class=\"surroundings\">招银商旅演示环境</p>\n" +
                "            <p class=\"time\">导出时间：${exportTime}</p>\n" +
                "        </div>\n" +
                "        <h2 class=\"secondTitle\">\n" +
                "            <p class=\"left\">${userName} - 招银商旅演示环境/${userDept}</p>\n" +
                "            <p class=\"right\">差旅计划：${tripPlanNo}</p>\n" +
                "        </h2>\n" +
                "    </div>\n" +
                "    <!-- 基本信息 -->\n" +
                "    <div class=\"basicInformation\">\n" +
                "        <h2 class=\"title\">基本信息</h2>\n" +
                "        <div class=\"information\">\n" +
                "            <div class=\"item\">\n" +
                "                <div class=\"info\">\n" +
                "                    <div class=\"type\">出行类别</div>\n" +
                "                    <div class=\"content\">${tripType}</div>\n" +
                "                </div>\n" +
                "                <div class=\"info\">\n" +
                "                    <div class=\"type\">费用归属</div>\n" +
                "                    <div class=\"content\">${feeBelong}</div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"item\">\n" +
                "                <div class=\"info\">\n" +
                "                    <div class=\"type\">出行人员</div>\n" +
                "                    <div class=\"content\">${tripPeople}</div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"item\">\n" +
                "                <div class=\"info\">\n" +
                "                    <div class=\"type\">出行理由</div>\n" +
                "                    <div class=\"content\">${tripReason}</div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <!-- 计划行程 -->\n" +
                "    <div class=\"planTrip\">\n" +
                "        <h2 class=\"title\">计划行程</h2>\n" +
                "        <#list travels as travel>\n" +
                "            <div class=\"item\">\n" +
                "                <div class=\"left\">\n" +
                "                    <span>${travel.date}</span>\n" +
                "                    <span>${travel.dayOfWeek}</span>\n" +
                "                </div>\n" +
                "                <div class=\"right\">\n" +
                "                    <span>不限</span>\n" +
                "                    <span>${travel.from} - ${travel.to}</span>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </#list>\n" +
                "\n" +
                "    </div>\n" +
                "    <!-- 审批记录 -->\n" +
                "    <div class=\"approvalRecord\">\n" +
                "        <h2 class=\"title\">审批记录</h2>\n" +
                "        <#list auditLogs as audit>\n" +
                "            <div>\n" +
                "                <span>${audit.auditPeople}</span>\n" +
                "                <span>${audit.auditName}</span>\n" +
                "                <span>${audit.auditTime}</span>\n" +
                "                <span>【${audit.auditResult}】</span>\n" +
                "            </div>\n" +
                "        </#list>\n" +
                "\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n";

        PdfHtmlUtil pdfHtmlUtil = new PdfHtmlUtil(templateFilName);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        pdfHtmlUtil.createPdfFromStringTemplate(StringContent, tripPlanDto, out);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(out.toByteArray(), httpHeaders, HttpStatus.OK);

    }

}
