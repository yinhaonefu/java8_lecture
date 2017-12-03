package lessons.lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by yinhao on 17/7/24.
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest predicateTest = new PredicateTest();
        List<Integer> result = predicateTest.conditionFilter(list, integer -> integer > 5);
        result.forEach(System.out::println);
        System.out.println("-------");
        result = predicateTest.conditionFilter(list, integer -> integer >= 5);
        result.forEach(System.out::println);
        System.out.println("-------");
        result = predicateTest.conditionFilter(list, integer -> integer < 8);
        result.forEach(System.out::println);
        System.out.println("-------");
        result = predicateTest.conditionFilter(list, integer -> true);
        result.forEach(System.out::println);
        System.out.println("-------");

        //条件取反
        result = predicateTest.conditionFilterNegate(list,integer2 -> integer2 > 5);
        result.forEach(System.out::println);// 1 2 3 4 5
        System.out.println("-------");

        //大于5并且是偶数
        result = predicateTest.conditionFilterAnd(list, integer -> integer > 5, integer1 -> integer1 % 2 == 0);
        result.forEach(System.out::println);//6 8 10

        System.out.println("-------");

        //大于5或者是偶数
        result = predicateTest.conditionFilterOr(list, integer -> integer > 5, integer1 -> integer1 % 2 == 0);
        result.forEach(System.out::println);//2 4 6 8 9 10
        System.out.println("-------");

        System.out.println(Predicate.isEqual("test").test("test"));
    }

    public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<Integer> conditionFilterNegate(List<Integer> list, Predicate<Integer> predicate){
        return list.stream().filter(predicate.negate()).collect(Collectors.toList());
    }

    public List<Integer> conditionFilterAnd(List<Integer> list, Predicate<Integer> predicate,Predicate<Integer> predicate2){
        return list.stream().filter(predicate.and(predicate2)).collect(Collectors.toList());
    }

    public List<Integer> conditionFilterOr(List<Integer> list, Predicate<Integer> predicate,Predicate<Integer> predicate2){
        return list.stream().filter(predicate.or(predicate2)).collect(Collectors.toList());
    }
}
