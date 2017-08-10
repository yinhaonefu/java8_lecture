package lessons.lesson29;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MyMapCollector<T> implements Collector<T,Set<T>,Map<T,T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator");
        return (set,item) -> {
            set.add(item);
            System.out.println("accumulator----set:" + set +"," + Thread.currentThread().getName());
        };
    }

    //如果是串行流 combiner不会被调用，并行流会产生多个中间结果容器，才需要combiner进行合并
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner");
        return (set1,set2) -> {
            System.out.println("combiner====set1:" + set1 +",set2:" + set2 + Thread.currentThread().getName());
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher");
        return set -> {
            Map<T,T> map = new HashMap<>();
            set.stream().forEach(item -> map.put(item,item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED,Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        System.out.println("核数:" + Runtime.getRuntime().availableProcessors());

        for (int i = 0;i < 1;i++){
            List<String> list = Arrays.asList("hello", "world", "helloworld", "welcome", "a", "b", "c", "d", "e", "f", "g");
            Set<String> set = new HashSet<>();
            set.addAll(list);
            Map<String, String> collect = set.parallelStream().collect(new MyMapCollector<>());
            System.out.println(collect);
        }
    }
}
