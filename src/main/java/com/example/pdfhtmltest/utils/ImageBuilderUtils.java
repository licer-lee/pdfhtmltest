package com.example.pdfhtmltest.utils;

import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.*;

@Slf4j
public class ImageBuilderUtils {

    private static final int width = 807;
//    private static final int width = 452;
    private static final int height = 263;

    /**
     *
     * @param code 编码
     * @param path 二维码存放路劲
     * @return 最新图片生成路径
     */
    public static String ImageBuilder(String code,String path) {
        //得到图片缓冲区
        FileInputStream fileInputStream = null;
        try {
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            File file = new File(path);
            if(!file.exists()){
//                throw new BusinessException("二维码存放地址有误");
            }
            fileInputStream = new FileInputStream(file);
            BufferedImage image2 = ImageIO.read(fileInputStream);

            //得到它的绘制环境(这张图片的笔)
            Graphics2D g2 = (Graphics2D) bi.getGraphics();
            g2.fillRect(1, 1, width, height);
            //设置颜色
            g2.setColor(Color.WHITE);
//            g2.setBackground(Color.YELLOW);
            // 将图片大小设置为大约4cm*4cm 具体根据纸张大小设定
            g2.drawImage(image2, 10, 85, 135, 135,null);
            g2.drawRect(0, 0, width - 1, height - 1);

            //设置字体:字体、字号、大小
            g2.setFont(new Font("黑体", Font.BOLD, 26));
            //设置背景颜色
            g2.setColor(Color.BLACK);
            //向图片上写字符串
            g2.drawString("招银", 15, 30);

            g2.setFont(new Font("黑体", Font.BOLD, 20));
            g2.drawString("·", 65, 28);

            g2.setFont(new Font("黑体", Font.BOLD, 26));
            g2.drawString("云创", 83, 30);

            g2.setFont(new Font("黑体", Font.BOLD, 18));
            g2.drawString("PRO", 15, 60);

            g2.setFont(new Font("黑体", Font.ITALIC, 14));
            g2.drawString(code, 30, 80);

            // 图片上传后的路径
            String savePath = "D:/a.jpg";
            ImageIO.write(bi, "JPEG", new FileOutputStream(savePath));
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ImageIO.write(bi, "JPEG", bos);
            return savePath;
        }catch (Exception e){
            log.error("生成图片错误",e);
//            throw new BusinessException("生成图片错误",e);
        }finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static String assetImage(String code,String path) {


        //得到图片缓冲区
        FileInputStream fileInputStream = null;
        try {
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            // 二维码
            File file = new File(path);
            fileInputStream = new FileInputStream(file);
            BufferedImage qrcode = ImageIO.read(fileInputStream);

            // logo
            File logo = new File("d://mbcloud-logo_200_200.png");
            FileInputStream fileInputStreamLogo = new FileInputStream(logo);
            BufferedImage bufferedImageLogo = ImageIO.read(fileInputStreamLogo);

            // 开始画图
            Graphics2D g2 = (Graphics2D) bi.getGraphics();
            g2.fillRect(1,1, width-2, height-2);
            g2.setColor(Color.BLACK);

            // 画logo
            g2.drawImage(bufferedImageLogo, 20, 62, 138, 138,null);

            // 资产编号
//            g2.drawRect(0, 0, width - 1, height - 1);
            g2.setFont(new Font("SourceHanSansCN-Bold", Font.BOLD, 36));
            g2.setColor(Color.BLACK);
            g2.drawString("资产编号：", 178, 77);
            g2.setFont(new Font("SourceHanSansCN-Heavy", Font.BOLD, 48));
            g2.drawString(code, 178, 138);

            // 分割线
            g2.drawLine(531, 1, 531, 262);

            // 画二维码
            g2.drawImage(qrcode, 553, 15, 234, 234,null);

            // 结束画图
            g2.dispose();

            // 图片上传后的路径
            String savePath = "D:/a1.jpg";
            ImageIO.write(bi, "JPEG", new FileOutputStream(savePath));
            return savePath;
        }catch (Exception e){
            log.error("生成图片错误",e);
        }finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


}
