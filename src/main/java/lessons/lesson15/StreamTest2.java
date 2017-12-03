package lessons.lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by yinhao on 2017/7/31.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //每个元素乘以2 再求和
        Optional<Integer> result = list.stream().map(integer -> integer * 2).reduce(Integer::sum);

        result.ifPresent(integer -> System.out.println(integer));

        long a = 10001;
        String s = String.valueOf(a);
        System.out.println(s);
    }
}
