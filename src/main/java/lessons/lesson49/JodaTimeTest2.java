package lessons.lesson49;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * Created by yinhao on 18/1/28.
 */
public class JodaTimeTest2 {

    /**
     * 接收标准的UTC时间 2018-01-28T17:09:33.567Z
     * 将UTC时间转换为当前时区本地时间 北京时间是东八区时间，会加8小时
     * @param utcDate
     * @return
     */
    public static Date convertUTC2Date(String utcDate){
        DateTime dateTime = DateTime.parse(utcDate,
                DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        return dateTime.toDate();
    }

    /**
     * 将当前时区本地时间，转换成UTC时间发送出去
     * 北京时间为东八区时间，减8小时
     * @param javaDate
     * @return
     */
    public static String convertDate2UTC(Date javaDate){
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }


    /**
     * 将日期转换成指定格式
     * @param javaDate
     * @param dateFormat
     * @return
     */
    public static String convertDate2LocalByDateFormat(Date javaDate,String dateFormat){
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }

    public static void main(String[] args) {
        System.out.println(convertDate2UTC(new Date()));
        System.out.println(convertUTC2Date("2018-01-28T09:55:26.409Z"));
        System.out.println(convertDate2LocalByDateFormat(new Date(),"yyyy-MM-dd HH:mm:ss.SSS"));
    }

}
