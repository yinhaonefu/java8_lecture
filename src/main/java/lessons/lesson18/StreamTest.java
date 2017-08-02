package lessons.lesson18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by yinhao on 2017/8/2.
 */
public class StreamTest {
    public static void main(String[] args) {
        //同时获取最大 最小 平均值等信息
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 11);
        IntSummaryStatistics statistics = list1.stream().filter(integer -> integer > 200).mapToInt(i -> i * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getAverage());
    }
}
