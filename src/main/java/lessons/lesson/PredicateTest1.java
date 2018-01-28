package lessons.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by yinhao on 18/1/10.
 */
public class PredicateTest1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest1 predicateTest = new PredicateTest1();
        List<Integer> result = predicateTest.conditionFilter(list, integer -> integer > 5);
        result.forEach(System.out::println);
    }

    public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
