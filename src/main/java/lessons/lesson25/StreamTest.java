package lessons.lesson25;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by yinhao on 17/8/8.
 */
public class StreamTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",80);
        Student student2 = new Student("lisi",60);
        Student student3 = new Student("wangwu",80);
        Student student4 = new Student("zhaoliu",60);
        Student student5 = new Student("zhaoliu",60);
        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5);

        //取出分数最少的
        Optional<Student> min = students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore)));
        min.ifPresent(System.out::println);

        //取出分数最大的
        Optional<Student> max = students.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore)));
        max.ifPresent(System.out::println);
        //取平均值
        Double average = students.stream().collect(Collectors.averagingInt(Student::getScore));
        System.out.println(average);
        //汇总信息
        IntSummaryStatistics summaryStatistics = students.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(summaryStatistics);

        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",")));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",","<begin>","<end>")));

        //先按分数分组再按名字分组
        Map<Integer, Map<String, List<Student>>> collect = students.stream().collect(Collectors.groupingBy(Student::getScore, Collectors.groupingBy(Student::getName)));
        System.out.println(collect);

        //按分数是否大于60分区
        Map<Boolean, List<Student>> collect1 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 60));
        System.out.println(collect1);

        //先按分数是否大于60分区，再按大于60的是否大于80分区
        Map<Boolean, Map<Boolean, List<Student>>> collect2 = students.stream().collect(Collectors.partitioningBy(s -> s.getScore() > 60, Collectors.partitioningBy(s1 -> s1.getScore() > 80)));
        System.out.println(collect2);
    }
}
