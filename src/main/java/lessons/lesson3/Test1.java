package lessons.lesson3;

/**
 * Created by yinhao on 17/7/19.
 */
public class Test1 {
    public void test(MyInterface myInterface){
        myInterface.test();
    }

    public static void main(String[] args) {

//        MyInterface myInterface = () -> {System.out.println("mytest");};

        MyInterface myInterface = System.out::println;

        Test1 test = new Test1();
        test.test(myInterface);
    }
}
