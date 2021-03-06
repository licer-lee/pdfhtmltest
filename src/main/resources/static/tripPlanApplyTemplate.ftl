<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <#--<meta name="viewport" content="width=device-width, initial-scale=1.0" />-->
    <title>Document</title>
    <style type="text/css">
        body {
            font-family: SimSun;
        }
    </style>
    <style>
        /* style init */
        html,
        body,
        ol,
        ul,
        li,
        h1,
        h2,
        h3,
        h4,
        h5,
        h6,
        p,
        th,
        td,
        dl,
        dd,
        form,
        fieldset,
        legend {
            margin: 0;
            padding: 0;
        }
        ul,
        ol,
        li {
            list-style: none;
        }
        b,
        strong {
            font-weight: normal;
        }
        i,
        em {
            font-style: normal;
        }
        a,
        u {
            text-decoration: none;
        }

        .wrap {
            width: 780px;
            height: 900px;
            margin: 0 auto;
            background-color: rgba(255, 255, 255, 1);
        }

        /* header */
        .header {
            display: flex;
            flex-direction: column;
        }
        .header .firstTitle {
            display: flex;
            align-items: center;
            justify-content: space-between;
            margin-bottom: 10px;
            padding: 10px 0;
            border-bottom: 1px solid #000;
        }

        .header .firstTitle .title {
            color: rgba(51, 51, 51, 1);
            font-size: 20px;
        }

        .header .firstTitle .surroundings {
            color: rgba(51, 51, 51, 1);
            font-size: 16px;
        }

        .header .firstTitle .time {
            color: rgba(102, 102, 102, 1);
            font-size: 14px;
        }

        .header .secondTitle {
            display: flex;
            justify-content: space-between;
            margin-bottom: 30px;
            color: rgba(51, 51, 51, 1);
            font-size: 14px;
        }

        /* basicInformation */
        .basicInformation {
            display: flex;
            flex-direction: column;
            margin-bottom: 24px;
            border-bottom: 1px solid rgba(221, 221, 221, 1);
        }
        .basicInformation .title {
            margin-bottom: 16px;
            color: rgba(51, 51, 51, 1);
            font-size: 16px;
        }
        .basicInformation .information {
            display: flex;
            flex-direction: column;
        }
        .information .item {
            display: flex;
            flex: 1;
            padding: 10px 24px;
            border: 1px solid rgba(221, 221, 221, 1);
            border-bottom: 0;
        }
        .information .item .info {
            display: flex;
            flex: 1;
        }

        .information .item .type {
            margin-right: 16px;
            color: rgba(102, 102, 102, 1);
            font-size: 12px;
        }

        .information .item .content {
            color: rgba(102, 102, 102, 1);
            font-size: 12px;
        }

        /* planTrip */
        .planTrip .title {
            margin-bottom: 16px;
            padding: 8px 0;
            color: rgba(51, 51, 51, 1);
            font-size: 16px;
            border-bottom: 1px solid #000;
        }
        .planTrip .item {
            display: flex;
            flex-direction: column;
        }
        .planTrip .stroke {
            display: flex;
            align-items: center;
            margin-bottom: 28px;
        }
        .planTrip .stroke > span:nth-child(1) {
            margin-right: 27px;
        }
        .planTrip .stroke > span:nth-child(2) {
            margin-right: 32px;
        }
        .planTrip .stroke .piece {
            position: relative;
            display: flex;
            align-items: center;
            justify-content: center;
            width: 162px;
            height: 32px;
            color: rgba(51, 51, 51, 1);
            font-size: 14px;
            background-color: rgba(238, 238, 238, 1);
            border-radius: 16px;
        }

        .arrow-bottom {
            position: absolute;
            bottom: -26px;
            font-size: 0;
            line-height: 0;
            border-color: rgba(102, 102, 102, 1);
            border-style: dashed;
            border-width: 8px;
            border-top-style: solid;
            border-right-color: transparent;
            border-bottom-width: 0;
            border-left-color: transparent;
        }

        .planTrip .item .left {
            display: flex;
            flex-direction: column;
        }
        .planTrip .item .right {
            display: flex;
            flex: 1;
            background: #ccc;
        }

        .planTrip .setOff .piece::after {
            position: absolute;
            bottom: -20px;
            left: 50%;
            width: 1px;
            height: 18px;
            background-color: rgb(36, 13, 13);
            transform: translateX(-50%);
            content: "";
        }

        /* approvalRecord */
        .approvalRecord .title {
            margin-bottom: 16px;
            padding: 8px 0;
            color: rgba(51, 51, 51, 1);
            font-size: 16px;
            border-bottom: 1px solid #000;
        }

        .approvalRecord .path {
            position: relative;
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 24px;
        }

        .approvalRecord .path .circle {
            position: relative;
            width: 6px;
            height: 6px;
            margin-right: 12px;
            background: rgba(102, 102, 102, 1);
            border: 12px solid rgba(221, 221, 221, 1);
            border-radius: 18px;
        }

        .approvalRecord .path:last-child .circle {
            position: relative;
            width: 6px;
            height: 6px;
            background: #fff;
            border: 12px solid rgba(102, 102, 102, 1);
            border-radius: 18px;
        }

        .approvalRecord .path .circle::after {
            position: absolute;
            bottom: -34px;
            left: 50%;
            width: 0;
            height: 19px;
            border: 1px dashed rgba(102, 102, 102, 1);
            transform: translateX(-50%);
            content: "";
        }

        .approvalRecord .path:last-child .circle::after {
            content: unset;
        }
    </style>
</head>
<body>
<div id="pdf" class="wrap">
    <!-- 头部 -->
    <div class="header">
        <div class="firstTitle">
            <h1 class="title">差旅计划申请单</h1>
            <p class="surroundings">${companyName}</p>
            <p class="time">导出时间：${exportTime}</p>
        </div>
        <h2 class="secondTitle">
            <p class="left">${userName} - ${companyName}/${userDept}</p>
            <p class="right">差旅计划：${tripPlanNo}</p>
        </h2>
    </div>
    <!-- 基本信息 -->
    <div class="basicInformation">
        <h2 class="title">基本信息</h2>
        <div class="information">
            <div class="item">
                <div class="info">
                    <div class="type">出行类别</div>
                    <div class="content">${tripType}</div>
                </div>
                <div class="info">
                    <div class="type">费用归属</div>
                    <div class="content">${feeBelong}</div>
                </div>
            </div>
            <div class="item">
                <div class="info">
                    <div class="type">出行人员</div>
                    <div class="content">${tripPeople}</div>
                </div>
            </div>
            <div class="item">
                <div class="info">
                    <div class="type">出行理由</div>
                    <div class="content">${tripReason}</div>
                </div>
            </div>
        </div>
    </div>
    <!-- 计划行程 -->
    <div class="planTrip">
        <h2 class="title">计划行程</h2>
        <#list travels as travel>
        <div class="item">
            <div class="stroke setOff">
                <span>${travel.date}</span>
                <span>${travel.dayOfWeek}</span>
                <div class="piece">
                    <span>出发： ${travel.from}</span>
                    <span class="arrow-bottom"></span>
                </div>
            </div>
            <div class="stroke arrivals">
                <span>${travel.date}</span>
                <span>${travel.dayOfWeek}</span>
                <div class="piece">
                    <span>到达： ${travel.to}</span>
                </div>
            </div>
        </div>
        </#list>
    </div>
    <!-- 审批记录 -->
    <div class="approvalRecord">
        <h2 class="title">审批记录</h2>
        <#list auditLogs as audit>
        <div class="path">
            <div class="circle"></div>
            <span>乔谦</span>
            <span>发起申请</span>
            <span>2020-04-20 16:13</span>
            <span>【提交审核】</span>
        </div>
        </#list>
        <#--<div class="path">
            <div class="circle"></div>
            <span>乔谦</span>
            <span>发起申请</span>
            <span>2020-04-20 16:13</span>
            <span>【提交审核】</span>
        </div>-->
    </div>
</div>
</body>
</html>
