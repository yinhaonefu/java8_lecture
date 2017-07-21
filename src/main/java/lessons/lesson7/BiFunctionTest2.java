package lessons.lesson7;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by yinhao on 17/7/21.
 */
public class BiFunctionTest2 {
    public static void main(String[] args) {
        BiFunctionTest2 biFunctionTest2 = new BiFunctionTest2();
        System.out.println(biFunctionTest2.compute(4,5,(a,b) -> a * b,a -> a * 2));
    }

    public int compute(int a, int b, BiFunction<Integer,Integer,Integer> biFunction,
                       Function<Integer,Integer> function){
        return biFunction.andThen(function).apply(a,b);
    }
}
