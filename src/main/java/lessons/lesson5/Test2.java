package lessons.lesson5;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yinhao on 17/7/19.
 */
public class Test2 {
    public static void main(String[] args) {
        //将集合中每个元素转成大写
        List<String> list = Arrays.asList("hello","world","helloworld");
        //使用Lambda表达式
        list.forEach(s -> System.out.println(s.toUpperCase()));

    }
}
