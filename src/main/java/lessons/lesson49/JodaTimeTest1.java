package lessons.lesson49;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Created by yinhao on 18/1/28.
 */
public class JodaTimeTest1 {
    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);
        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));

        DateTime firstDay =  today.withDayOfMonth(1);
        System.out.println(firstDay.toString("yyyy-MM-dd"));

        LocalDate localDate = new LocalDate();
        System.out.println(localDate.toString("yyyy-MM-dd"));

        //3个月后的月末
        LocalDate future = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(future.toString("yyyy-MM-dd"));

        LocalDate before = localDate.minusYears(2).dayOfMonth().withMaximumValue();
        System.out.println(before.toString("yyyy-MM-dd"));
    }
}
