package lessons.lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by yinhao on 17/7/26.
 */
public class MethodReferenceTest {
    public static void main(String[] args) {

        Student student1 = new Student("zhangsan",60);
        Student student2 = new Student("lisi",70);
        Student student3 = new Student("wangwu",80);
        Student student4 = new Student("zhaoliu",90);
        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        //类方法引用
        // 类是不能直接调用实例方法的，
        // sort方法需要接受一个Comparator函数式接口
        // Comparator中的compare方法接收的是两个参数
        // 调用compareByScore实例方法的对象是第一个参数
        students.sort(Student::compareByScore);
        students.forEach(student -> System.out.println(student.getScore()));
        System.out.println("--------");

        students.sort(Student::compareByName);
        students.forEach(student -> System.out.println(student.getName()));


        List<String> cities = Arrays.asList("beijing","shanghai","guangzhou","shenzhen");
        cities.sort(String::compareToIgnoreCase);
        cities.forEach(System.out::println);
        System.out.println("--------");



        Supplier<String> supplier = String::new;
        Function<String,String> function = String::new;
    }


}


