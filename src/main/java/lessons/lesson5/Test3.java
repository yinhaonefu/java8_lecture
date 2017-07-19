package lessons.lesson5;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yinhao on 17/7/19.
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld");
        list.stream().map(s -> s.toUpperCase()).forEach(s1 -> System.out.println(s1));
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
