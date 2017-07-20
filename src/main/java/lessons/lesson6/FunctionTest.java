package lessons.lesson6;

import java.util.function.Function;

/**
 * Created by yinhao on 17/7/20.
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();

        int result = functionTest.compute(5, integer -> integer * integer);
        System.out.println(result);


        int i = functionTest.add2(2);
        System.out.println(i);

    }

    //调用时传入逻辑
    public int compute(int i, Function<Integer,Integer> function){
        Integer result = function.apply(i);
        return result;
    }

    //逻辑提前定义好
    public int add2(int i){
        return i + 2;
    }
}
