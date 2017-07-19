package lessons.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by yinhao on 17/7/18.
 */
public class Test1 {
    public static void main(String[] args) {
        //匿名内部类
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //Lambda表达式
        list.forEach(item -> System.out.println(item));
        //方法引用
        list.forEach(System.out::println);
    }
}
