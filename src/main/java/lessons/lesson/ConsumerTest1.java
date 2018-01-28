package lessons.lesson;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yinhao on 17/7/18.
 */
public class ConsumerTest1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(integer -> System.out.println(integer));
    }
}
