package lessons.lesson;

import java.util.function.Predicate;

/**
 * Created by yinhao on 17/7/22.
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println(predicate.test("hello"));
    }
}
