package lessons.lesson14;

/**
 * Created by yinhao on 17/7/27.
 */
public interface MyInterface2 {
    default public void myMethod(){
        System.out.println("MyInterface2");
    }
}
