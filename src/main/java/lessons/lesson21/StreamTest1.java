package lessons.lesson21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yinhao on 17/12/7.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        list1.forEach(s -> {
            list2.forEach(s1 -> {
                System.out.println(s + " " + s1);
            });
        });

        System.out.println("-----");

        List<String> collect = list1.stream().flatMap(item -> list2.stream().
                map(item2 -> item + " " + item2)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
