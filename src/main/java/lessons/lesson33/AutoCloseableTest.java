package lessons.lesson33;

public class AutoCloseableTest implements AutoCloseable{

    public void doSomething(){
        System.out.println("doSomething");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }

    public static void main(String[] args){
        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()){
            autoCloseableTest.doSomething();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
