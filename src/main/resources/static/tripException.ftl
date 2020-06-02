<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>差旅异常单</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <style type="text/css">
        body {
            font-family: SimSun;
        }
    </style>
</head>
<body>

出差异常情况申请单    ------     ${company}         -----                导出时间：${exportTime}
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
${userName} - ${userDept}

<hr style="height:1px;border:none;border-top:1px solid #555555;" />
基本信息
<table border="1">
    <tr>
        <td>退改类别：${refundType}</td>
        <td>改签日期：${changeTime}</td>
    </tr>
    <tr>
        <td>退改人员: ${people}</td>
        <td>退改手续费：${fee}</td>
    </tr>
    <tr>
        <td colspan="2">退改是由：${reason}</td>
    </tr>
</table>　

<hr style="height:1px;border:none;border-top:1px solid #555555;" />
订单详情：
<table border="1">
    <#list tripList as trip>
    <tr>
        <td>机票：${trip.airPaper}</td>
    </tr>
    </#list>
</table>　

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

审批记录
<hr style="height:1px;border:none;border-top:1px solid #555555;" />
<ul>
    <#list auditLogs as audit>
        <li>${audit.auditPeople}  --- ${audit.auditName}   --- ${audit.auditTime} --- ${audit.auditResult}          </li>
    </#list>
</ul>

</body>
</html>
