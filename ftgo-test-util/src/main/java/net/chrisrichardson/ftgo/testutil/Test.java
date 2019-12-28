package net.chrisrichardson.ftgo.testutil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author zhouxuecheng.
 * @date on 2019/10/18.
 * description .
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        Map<String, Object> objectMap = new HashMap<>();
        Date time = (Date) objectMap.get("successTime");
        System.out.println(time);
        objectMap.put("successTime", new Date());
        time = (Date) objectMap.get("successTime");
        System.out.println(time);

    }

}
