package lessons.lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by yinhao on 17/8/2.
 */
public class StreamTest {
    public static void main(String[] args) {

        int count = 5000000;

        List<String> list = new ArrayList<String>(count);

        System.out.println("开始生成数据");

        long startGenarate = System.nanoTime();

        for (int i = 0;i < count;i++){
            list.add(UUID.randomUUID().toString());
        }

        long endGenarate = System.nanoTime();

        System.out.println("生成完毕，耗时：" +
                TimeUnit.NANOSECONDS.toMillis(endGenarate - startGenarate));

        long start = System.nanoTime();

        System.out.println("开始排序");

        //并行流排序，改成串行流排序观察耗时
        list.parallelStream().sorted().count();

        long end = System.nanoTime();

        long times = TimeUnit.NANOSECONDS.toMillis(end - start);

        System.out.println("排序耗时：" + times);

    }
}
