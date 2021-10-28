package TestThread;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        myThread.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("run="+Thread.currentThread().getName());
        }
    }
}
