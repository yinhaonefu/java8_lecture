package lessons.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yinhao on 17/8/1.
 */
public class StreamTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");
        //Collectors.toCollection()方法，接收supplier指定返回的结果容器
//        LinkedList<String> list = stream.collect(Collectors.toCollection(LinkedList::new));
//        list.forEach(System.out::println);

        String str = stream.collect(Collectors.joining());
        System.out.println(str);


        List<String> list = Arrays.asList("hello", "world", "helloworld");
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("------------");

        Stream<List<Integer>> listStream =
                Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        //将流中所有集合中的元素平方后输出
        List<Integer> collect1 = listStream.flatMap(theList -> theList.stream()).
                map(integer -> integer * integer).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        System.out.println("------------");

        Stream<String> generate = Stream.generate(UUID.randomUUID()::toString);
        Optional<String> first = generate.findFirst();
        first.ifPresent(System.out::println);

        System.out.println("------------");

        //从1开始，每个元素比前一个元素大2，生成最多10个元素
        Stream.iterate(1,item -> item + 2).limit(10).forEach(System.out::println);

        System.out.println("------------");

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 11);
        //大于2的元素乘以2，忽略前两个，再取出前两个求和
        Integer collect2 = list1.stream().filter(integer -> integer > 2).mapToInt(i -> i *2 ).skip(2).limit(2).sum();
        System.out.println(collect2);
    }
}
