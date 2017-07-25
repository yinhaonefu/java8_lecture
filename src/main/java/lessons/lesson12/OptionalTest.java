package lessons.lesson12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by yinhao on 17/7/25.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        //如果存在 正常处理
        optional.ifPresent(s -> System.out.println(s));//接收Consumer
        System.out.println("-------");

        Optional<String> optional2 = Optional.empty();
        //如果为空返回一个默认值
        System.out.println(optional2.orElse("world"));
        System.out.println("-------");

        Optional<String> optional3 = Optional.empty();
        //接收Supplier 如果为空返回Supplier返回的结果
        System.out.println(optional3.orElseGet(() -> "welcome"));
        System.out.println("-------");

        //如果传入的结果不确定是否为空 使用ofNullable
        Optional<String> optional4 = Optional.ofNullable(null);
        optional4.ifPresent(s -> System.out.println(s));
        System.out.println("-------");


        Teacher teacher = new Teacher();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        List<Student> students = Arrays.asList(student1, student2, student3, student4);
//        teacher.setStudents(students);

        Optional<Teacher> optional5 = Optional.ofNullable(teacher);
        //先使用map将teacher转换成student集合，如果集合为空返回一个emptylist
        System.out.println(optional5.map(teacher1 -> teacher.getStudents()).
                orElse(Collections.emptyList()));
        System.out.println("-------");
    }
}
