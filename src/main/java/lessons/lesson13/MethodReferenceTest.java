package lessons.lesson13;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yinhao on 17/7/26.
 */
public class MethodReferenceTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        list.forEach(System.out::println);


        Student student1 = new Student("zhangsan",60);
        Student student2 = new Student("lisi",70);
        Student student3 = new Student("wangwu",80);
        Student student4 = new Student("zhaoliu",90);
        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //静态方法引用 正序排列
        //满足sort入参的函数式接口中抽象方法的方法签名，可以直接使用静态方法引用
        students.sort(Student::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));
        System.out.println("---------");
        students.sort(Student::compareStudentByName);
        students.forEach(student -> System.out.println(student.getName()));
        System.out.println("---------");


        //对象方法引用 倒序排列
        StudentComparator studentComparator = new StudentComparator();
        students.sort(studentComparator::compareStudentByName);
        students.forEach(student -> System.out.println(student.getName()));
        System.out.println("---------");
        students.sort(studentComparator::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));
        System.out.println("---------");
    }
}
