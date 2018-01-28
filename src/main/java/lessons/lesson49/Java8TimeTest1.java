package lessons.lesson49;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

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
    }
}
