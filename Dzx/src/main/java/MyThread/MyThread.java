package MyThread;

public class MyThread  extends Thread{

    @Override
    public void run() {
        System.out.println("线程一");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();//耗时大
        Thread.sleep(300);
        System.out.println("运行结束");//耗时小
    }
}
