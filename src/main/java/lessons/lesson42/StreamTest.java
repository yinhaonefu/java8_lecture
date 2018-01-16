package lessons.lesson42;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        //直接对源进行终止操作会调用ReferencePipeline.Head中的forEach，分析forEach执行
        List<String> list = Arrays.asList("hello", "world", "helloworld", "welcome", "person", "student");
//        list.stream().forEach(System.out::println);
        list.stream().map(s -> s).filter(s -> true).forEach(System.out::println);
    }
}
