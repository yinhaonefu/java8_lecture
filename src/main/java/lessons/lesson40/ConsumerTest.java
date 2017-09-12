package lessons.lesson40;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Created by yinhao on 17/9/12.
 */
public class ConsumerTest {

    public void test(Consumer<Integer> action){
        action.accept(100);
    }

    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

        ConsumerTest consumerTest = new ConsumerTest();

        consumerTest.test(consumer);
//        consumerTest.test(intConsumer);//传递的是对象，所以类型不兼容编译不通过

        consumerTest.test(consumer::accept);
        consumerTest.test(intConsumer::accept);//传递的行为，可以编译通过
    }


}
