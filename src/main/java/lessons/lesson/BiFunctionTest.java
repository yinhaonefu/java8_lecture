package lessons.lesson;

import java.util.function.BiFunction;

/**
 * Created by yinhao on 17/7/21.
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunctionTest biFunctionTest = new BiFunctionTest();
        System.out.println(biFunctionTest.compute(4,5,(i1,i2) -> i1 + i2));//加
        System.out.println(biFunctionTest.compute(4,5,(i1,i2) -> i1 - i2));//减
        System.out.println(biFunctionTest.compute(4,5,(i1,i2) -> i1 * i2));//乘
        System.out.println(biFunctionTest.compute(4,5,(i1,i2) -> i1 / i2));//除
    }

    //定义更抽象
    public int compute(int i1, int i2, BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(i1,i2);
    }
}
