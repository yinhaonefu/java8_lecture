package lessons.lesson21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by yinhao on 17/8/2.
 *
 */
public class StreamTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",90,20);
        Student student2 = new Student("lisi",80,30);
        Student student3 = new Student("wangwu",70,40);
        Student student4 = new Student("zhangsan",60,50);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //按name分组
        Map<String, List<Student>> collect = students.stream().
                collect(Collectors.groupingBy(Student::getName));
        System.out.println(collect);

        //按name分组 得出每组的学生数量 使用重载的groupingBy方法，第二个参数是分组后的操作
        Map<String, Long> collect1 = students.stream().collect(Collectors.
                groupingBy(Student::getName, Collectors.counting()));
        System.out.println(collect1);

        //按name分组 求每组的平均值
        Map<String, Double> collect2 = students.stream().collect(Collectors.
                groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(collect2);

        //按是否大于80分分区
        Map<Boolean, List<Student>> collect3 = students.stream().
                collect(Collectors.partitioningBy(student -> student.getScore() > 80));
        System.out.println(collect3);
        System.out.println(collect3.get(true));

    }
}
