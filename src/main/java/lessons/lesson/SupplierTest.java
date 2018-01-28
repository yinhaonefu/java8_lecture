package lessons.lesson;

import java.util.function.Supplier;

/**
 * Created by yinhao on 17/7/24.
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = String::new;
        String s = supplier.get();
        System.out.println("-------");
    }
}
