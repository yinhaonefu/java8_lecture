package lessons.lesson14;

/**
 * Created by yinhao on 17/7/27.
 */
public class MyImpl extends MyInterface1Impl implements MyInterface1,MyInterface2{

//    @Override
//    public void myMethod() {
//        System.out.println("MyImpl");
//    }

    public static void main(String[] args) {
        MyImpl my = new MyImpl();
        my.myMethod();
    }
}
