package lessons.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by yinhao on 2017/8/2.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld");
        list.stream().map(s -> {
            System.out.println("test");
            return s.toUpperCase();
        });

        //Stream陷阱 distinct()会一直等待产生的结果去重，将distinct()和limit(6)调换位置，先限制结果集再去重就可以了
        IntStream.iterate(0,i -> (i + 1) % 2).distinct().limit(6).forEach(System.out::println);
    }
}
