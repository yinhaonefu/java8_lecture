package lessons.lesson35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OnCloseTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld");

        try(Stream<String> stream = list.stream()) {
            stream.onClose(() -> {//onClose handler will be invoked when the close method perform
                System.out.println("aaa");
                throw new NullPointerException("aaa");
            }).onClose(() -> {
                System.out.println("bbb");
                throw new ArithmeticException("bbb");//the second exxception will be suppressed
            }).forEach(System.out::println);
        }



        NullPointerException nullPointerException = new NullPointerException();

        try(Stream<String> stream = list.stream()) {
            stream.onClose(() -> {//onClose handler will be invoked when the close method perform
                System.out.println("aaa");
                throw nullPointerException;
            }).onClose(() -> {
                System.out.println("bbb");
//                throw new ArithmeticException("bbb");//the second exxception will be suppressed
                throw nullPointerException;//same as first exception will not be suppressed
            }).forEach(System.out::println);
        }
    }
}
