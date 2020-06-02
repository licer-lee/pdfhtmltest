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

<table border="1" style="margin: 10px;">
    <tr>
        <td style="padding: 10px;">
            原资产编号：
            ${oldAssetCode}
        </td>
        <td rowspan="2" style="padding: 10px;">
            <img src="http://163.53.94.236:8080/mbcloud/M00/02/18/rBACGF7Mhy-AKEOdAAAD-0oRyRg821.jpg" alt="qrCode"/>
            <#--<img src="./qrLocal.jpg" alt="qrCodeUrl"/>-->
            <#--<img src="${qrCodeUrl}" alt="qrCodeUrl"/>-->
        </td>
    </tr>
    <tr>
        <td style="padding: 10px;">
            资产编号：
            ${assetCode}
        </td>
    </tr>
</table>


</body>
</html>
