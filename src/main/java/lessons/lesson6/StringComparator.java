package lessons.lesson6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yinhao on 17/7/20.
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        Collections.sort(names,(s1,s2) -> {
//            return s2.compareTo(s1);
//        });

//        Collections.sort(names,(s1,s2) -> {return s2.compareTo(s1);});

        Collections.sort(names,(s1,s2) -> s2.compareTo(s1));

        System.out.println(names);

    }
}
