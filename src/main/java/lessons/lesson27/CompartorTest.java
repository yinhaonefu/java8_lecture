package lessons.lesson27;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yinhao on 17/8/9.
 */
public class CompartorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","nihao","welcome");

        //当第一个比较器认为两个元素相同时，才会再执行then比较 先按长度比较，长度相等时按字母排序
        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));

        //先按长度比较，长度相等时按字母排序
        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));

        //先按长度比较，长度相等时按字母倒序排序
        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));
    }
}
