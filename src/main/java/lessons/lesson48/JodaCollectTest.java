package lessons.lesson48;

import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;

/**
 * Created by yinhao on 18/1/28.
 */
public class JodaCollectTest {
    public static void main(String[] args) {
        IntList intList = new ArrayIntList();
        intList.add(1);
        intList.add(2);
        intList.forEach(System.out::println);
    }
}
