package lessons.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by yinhao on 17/7/18.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
