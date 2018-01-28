package lessons.lesson;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yinhao on 17/7/18.
 */
public class ConsumerTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //构造方法引用
        list.forEach(ConsumerTest3::new);
    }

    ConsumerTest3(Integer i){
        System.out.println(i);
    }
}
