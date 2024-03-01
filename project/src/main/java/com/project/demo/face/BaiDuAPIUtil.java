package com.project.demo.face;

import com.baidu.aip.face.AipFace;
import com.baidu.aip.face.MatchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 百度API调用
 */
public class BaiDuAPIUtil {


    public static Double matchPerson(String image,String matchImage) {
        AipFace client = BaiduAipInstance.getInstance();
        String imageType = "BASE64";
        List<MatchRequest> list = new ArrayList<>();
        MatchRequest originalRequest = new MatchRequest(image,imageType);
        MatchRequest matchRequest = new MatchRequest(matchImage,imageType);
        list.add(originalRequest);
        list.add(matchRequest);
        // 人脸比对
        org.json.JSONObject res = client.match(list);
        String error_msg = res.getString("error_msg");
        if (error_msg.equals("SUCCESS")){
            return res.getJSONObject("result").getDouble("score");
        }else {
            System.out.println("人脸信息报错："+error_msg);
            return 0.0;
        }
    }
}
