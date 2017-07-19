package lessons.lesson5;

/**
 * Created by yinhao on 17/7/19.
 */
public class Test {
    public static void main(String[] args) {
        MyInterface myInterface = () -> {};
        System.out.println(myInterface.getClass().getInterfaces()[0]);
        MyInterface2 myInterface2 = () -> {};
        System.out.println(myInterface2.getClass().getInterfaces()[0]);

        new Thread(() -> System.out.println("hello world")).start();
    }
}


interface MyInterface{
    void test();
}

interface MyInterface2{
    void test();
}