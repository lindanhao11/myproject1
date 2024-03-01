package com.project.demo.face;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

/**
 * @author Administrator
 */
public class Base64Util {

    public static String base64Encoding(String path){
        byte[] baseByte= new byte[0];
        try {
            path = path.replace("/api/upload","");
            // 从本地resource目录下获取图片
            String filePath = System.getProperty("user.dir") + "/src/main/resources/static/"+path;
            // base64图片前缀
//            String pre = "data:image/jpg;base64,";
            // 读取图片
            FileInputStream fileInputStream = new FileInputStream(filePath);
            // 读取字节长度
            int len = 0;
            // baseByte数组的容量
            int capacity = 0;
            byte [] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1){
                // 对原数组进行拷贝扩容
                baseByte= Arrays.copyOf(baseByte, len + capacity);
                // 将新数据拷贝到新扩容的数组
                System.arraycopy(bytes, 0, baseByte, capacity, len);
                // 数据容量增加
                capacity += len;
            }
            // 获取base64编码器
            Base64.Encoder encoder = Base64.getEncoder();
            // 将字节数组转换base64
            String encodeToString = encoder.encodeToString(baseByte);
            fileInputStream.close();
            return encodeToString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

