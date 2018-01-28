package lessons.lesson44;

/**
 * this对象作用域
 * Lambda表达式看起来是匿名内部类的替代品，但是它们是有本质差别的
 */
public class LambdaTest {

    Runnable r1 = () -> System.out.println("r1:" + this);// LambdaTest 实例LambdaTest@2d2d936c

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("r2:" + this);//LambdaTest 匿名内部类实例LambdaTest$1@74f84cf 第一个匿名内部类所以$符号后面是1
        }
    };

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        Thread t1 = new Thread(lambdaTest.r1);
        t1.start();

        System.out.println("------------");

        Thread t2 = new Thread(lambdaTest.r2);
        t2.start();
    }

}
