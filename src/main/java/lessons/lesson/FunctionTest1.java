package lessons.lesson;

import java.util.function.Function;

/**
 * Created by yinhao on 18/1/10.
 */
public class FunctionTest1 {
    public static void main(String[] args) {
        FunctionTest1 functionTest = new FunctionTest1();

        int result2 = functionTest.compute(5, num -> num + 2);
        int result3 = functionTest.compute(5, num -> num - 2);
        int result4 = functionTest.compute(5, num -> num * 2);
        int result5 = functionTest.compute(5, num -> num * num);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

    //调用时传入逻辑
    public int compute(int i, Function<Integer,Integer> function){
        Integer result = function.apply(i);
        return result;
    }
}
