package com.project.demo.face;

import com.baidu.aip.face.AipFace;

public class BaiduAipInstance extends AipFace {
    private static final String APP_ID = "42907702";
    private static final String API_KEY = "yLFE5lvyNeG7t5pv2wzgA0xX";
    private static final String SECRET_KEY = "eTtdq2DbEwNatHGzTTIbiCeabMkzVZ1F";

    private static BaiduAipInstance client = null;

    static {
        // 初始化一个AipFace
        client = new BaiduAipInstance(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
    }

    private BaiduAipInstance(String APP_ID , String API_KEY, String SECRET_KEY){
        super(APP_ID, API_KEY, SECRET_KEY);
    }

    public static BaiduAipInstance getInstance() {
        return client;
    }
}
