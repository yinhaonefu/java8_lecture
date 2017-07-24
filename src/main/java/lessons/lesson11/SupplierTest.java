package lessons.lesson11;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/**
 * Created by yinhao on 17/7/24.
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = String::new;
        String s = supplier.get();
        System.out.println("-------");

        //接收两个参数和返回值类型都一样
        BinaryOperator<String> operator = ((s1, s2) -> s1 + s2);

    }
}
