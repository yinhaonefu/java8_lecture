package lessons.lesson16;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by yinhao on 17/8/1.
 */
public class StreamTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");
//        String[] array = stream.toArray(length -> new String[length]);
//        String[] array1 = stream.toArray(String[]::new);

        //collect原始方式
        ArrayList list = stream.collect(() -> new ArrayList(), (theList, item) -> theList.add(item),
                (theList1, theList2) -> theList1.addAll(theList2));
        list.forEach(s -> System.out.println(s));

//        Collectors.toList();//封装了supplier accumulator combiner逻辑

//        ArrayList<Object> list1 = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        list1.forEach(System.out::println);
    }
}
