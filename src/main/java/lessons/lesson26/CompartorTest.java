package lessons.lesson26;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yinhao on 17/8/8.
 */
public class CompartorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","nihao","welcome");

        Collections.sort(list,Comparator.comparingInt(String::length).reversed());

        //为什么加上reversed方法，前面的lambda表达式就无法进行类型推断
        Collections.sort(list,Comparator.comparingInt((String s) -> s.length()).reversed());

        System.out.println(list);
    }
}
