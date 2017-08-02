package lessons.lesson20;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yinhao on 17/8/2.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld");
//        list.stream().mapToInt(s -> s.length()).filter(value -> value == 5).
//                findFirst().ifPresent(i -> System.out.println(i));

        //找到第一个长度是5的元素
        list.stream().mapToInt(s -> {
            System.out.println(s);//只会输出hello，不会将所有元素都应用
            return s.length();
        }).filter(i -> i == 5).findFirst().ifPresent(System.out::println);

    }
}
