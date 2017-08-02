package lessons.lesson20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yinhao on 17/8/2.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        //将每个元素的单词去重，输出 hello world welcome
        List<String> list = Arrays.asList("hello world","hello welcome",
                "hello world hello","hello welcome");
        list.stream().flatMap(s -> Arrays.asList(s.split(" ")).stream()).
                distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
