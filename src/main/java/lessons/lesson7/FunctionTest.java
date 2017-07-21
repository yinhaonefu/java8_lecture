package lessons.lesson7;

import java.util.function.Function;

/**
 * Created by yinhao on 17/7/21.
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute1(5,i -> i * 2,i -> i * i));//50
        System.out.println(functionTest.compute2(5,i -> i * 2,i -> i * i));//100
    }

    public int compute1(int i, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.compose(function2).apply(i);
    }

    public int compute2(int i, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(i);
    }

}
