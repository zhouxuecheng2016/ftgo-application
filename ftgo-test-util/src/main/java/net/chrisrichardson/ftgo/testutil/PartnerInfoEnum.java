package net.chrisrichardson.ftgo.testutil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: zhujiangang
 * @create: 2019-08-27 15:49
 * @description: 描述信息
 **/
public enum PartnerInfoEnum {
    QIANGUI("QianGui","58金融"),
    OPPO("Oppo","OPPO金融"),
    ;

    // 获取对接渠道信息
    public static final List<String> getPartnerInfo() {
        return Arrays.asList(PartnerInfoEnum.values())
                .stream()
                .map(p -> p.getAppId())
                .collect(Collectors.toList());
    }

    PartnerInfoEnum(String appId, String appName){
        this.appId=appId;
        this.appName=appName;
    }

    private String appId;
    private String appName;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}