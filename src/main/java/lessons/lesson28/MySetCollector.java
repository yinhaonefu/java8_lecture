package lessons.lesson28;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * 自定义收集器
 * @param <T>
 */
public class MySetCollector<T> implements Collector<T,Set<T>,Set<T>>{
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator");
        return Set<T>::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner");
        return (Set<T> s1, Set<T> s2) -> {
            s1.addAll(s2);
            return s1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher");
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics");
        EnumSet<Characteristics> characteristicsEnumSet = EnumSet.of(Characteristics.UNORDERED,
                Characteristics.IDENTITY_FINISH);//remove IDENTITY_FINISH finisher method will be invoked
        return Collections.unmodifiableSet(characteristicsEnumSet);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome","hello");
        Set<String> collect = list.stream().collect(new MySetCollector<String>());
        System.out.println(collect);
    }
}
