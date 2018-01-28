package lessons.lesson49;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by yinhao on 18/1/28.
 */
public class Java8TimeTest1 {
    public static void main(String[] args) {
        //不考虑时区本地日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getYear() + "-" + localDate.getMonthValue()
                + "-" + localDate.getDayOfMonth());

        LocalDate localDate1 = LocalDate.of(2017,3,3);
        System.out.println(localDate1);

        //MonthDay只关注月和日
        MonthDay monthDay = MonthDay.of(localDate1.getMonth(),localDate1.getDayOfMonth());
        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2018,3,3));
        System.out.println(monthDay.equals(monthDay1));

        //只关注时分秒
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //加3小时 30分钟
        LocalTime localTime1 = localTime.plusHours(3).plusMinutes(30);
        System.out.println(localTime1);

        //增加2个月
        LocalDate localDate2 = localDate.plus(2, ChronoUnit.MONTHS);
        System.out.println(localDate2);

        //减少5天
        LocalDate localDate3 = localDate.minus(5, ChronoUnit.DAYS);
        System.out.println(localDate3);

        //获取当期时区
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());

        //比较年月日
        LocalDate localDate4 = LocalDate.of(2018,1,28);
        System.out.println(localDate.equals(localDate4));
        System.out.println(localDate.isBefore(localDate4));
        System.out.println(localDate.isAfter(localDate4));

        //所有时区 排序后的
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(zoneIds);
        treeSet.forEach(System.out::println);



        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);//2018-01-28T18:30:26.220

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);//2018-01-28T18:30:26.220+08:00[Asia/Shanghai]

        //只表示年月
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);//2018-01
        System.out.println(yearMonth.lengthOfMonth());//31
        System.out.println(yearMonth.isLeapYear());//false 是否闰年


        YearMonth yearMonth1 = YearMonth.of(2016, 2);
        System.out.println(yearMonth1);//2016-02
        System.out.println(yearMonth1.lengthOfYear());//366
        System.out.println(yearMonth1.lengthOfMonth());//29
        System.out.println(yearMonth1.isLeapYear());//true 是否闰年


        //周期性 间隔
        LocalDate localDate5 = LocalDate.of(2017, 1, 28);
        LocalDate localDate6= LocalDate.of(2018, 3, 30);
        Period period = Period.between(localDate5, localDate6);//间隔1年2个月3天
        System.out.println(period.getYears());//1
        System.out.println(period.getMonths());//2
        System.out.println(period.getDays());//3


        System.out.println(Instant.now());//返回UTC时间 减了8小时
    }
}
