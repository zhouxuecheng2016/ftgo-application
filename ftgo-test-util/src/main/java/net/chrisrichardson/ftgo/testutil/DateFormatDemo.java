package net.chrisrichardson.ftgo.testutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhouxuecheng.
 * @date on 2019/11/28.
 * description .
 */
public class DateFormatDemo {

    public static void main(String[] args) {
        try {
            zoneToLocalTime(new Date().toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static Date zoneToLocalTime(String dateString) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateString = dateString.replace("Z", " UTC");
        System.out.println(dateString);
        Date date = simpleDateFormat.parse(dateString);
        String d = df.format(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date pictureCapturedTime = sdf.parse(d);
        return pictureCapturedTime;
    }

}
