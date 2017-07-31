package lessons.lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by yinhao on 2017/7/31.
 * 获取Stream的方式
 */
public class StreamTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");

        String[] array = new String[]{"hello","world","helloworld"};
        Stream<String> stream1 = Stream.of(array);

        List<String> list = Arrays.asList("hello","wor;d","helloworld");
        Stream<String> stream2 = list.stream();
    }
}
