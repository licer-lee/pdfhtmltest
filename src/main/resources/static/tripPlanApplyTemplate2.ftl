<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
            width: 781px;
            height: 588px;
            margin: 0 auto;
        }

        /* header */
        .header {
            display: flex;
            flex-direction: column;
        }
        .header .firstTitle {
            display: flex;
            align-items: center;
            border-bottom: 1px solid #000;
        }

        .header .firstTitle .time {
            margin-left: auto;
        }

        .header .secondTitle {
            display: flex;
            justify-content: space-between;
        }

        /* basicInformation */
        .basicInformation {
            display: flex;
            flex-direction: column;
            border-bottom: 1px solid #000;
        }
        .basicInformation .information {
            display: flex;
            flex-direction: column;
        }
        .information .item {
            display: flex;
            flex: 1;
            border: 1px solid #000;
            border-bottom: 0;
        }
        .information .item .info {
            display: flex;
            flex: 1;
        }

        /* planTrip */
        .planTrip .title {
            border-bottom: 1px solid #000;
        }
        .planTrip .item {
            display: flex;
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

        /* approvalRecord */
        .approvalRecord .title {
            border-bottom: 1px solid #000;
        }
    </style>
</head>
<body>
<div class="wrap">
    <!-- 头部 -->
    <div class="header">
        <div class="firstTitle">
            <h1 class="title">差旅计划申请单</h1>
            <p class="surroundings">招银商旅演示环境</p>
            <p class="time">导出时间：${exportTime}</p>
        </div>
        <h2 class="secondTitle">
            <p class="left">${userName} - 招银商旅演示环境/${userDept}</p>
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
                <div class="left">
                    <span>${travel.date}</span>
                    <span>${travel.dayOfWeek}</span>
                </div>
                <div class="right">
                    <span>不限</span>
                    <span>${travel.from} - ${travel.to}</span>
                </div>
            </div>
        </#list>

    </div>
    <!-- 审批记录 -->
    <div class="approvalRecord">
        <h2 class="title">审批记录</h2>
        <#list auditLogs as audit>
            <div>
                <span>${audit.auditPeople}</span>
                <span>${audit.auditName}</span>
                <span>${audit.auditTime}</span>
                <span>【${audit.auditResult}】</span>
            </div>
        </#list>

    </div>
</div>
</body>
</html>
