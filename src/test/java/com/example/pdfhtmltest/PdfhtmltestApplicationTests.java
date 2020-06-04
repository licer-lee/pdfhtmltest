package com.example.pdfhtmltest;

import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.FileCopyUtils;

import java.io.*;

@SpringBootTest
class PdfhtmltestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testBase64() throws IOException {

        //https://blog.csdn.net/weixin_39800144/article/details/80225990
        File f = new File("d://beanLifeCircle.png");
        byte[] b = FileCopyUtils.copyToByteArray(f);
        Base64 base64=new Base64();
        b=base64.encode(b);
        String s=new String(b);
        System.out.println("s = " + s);
    }
}
