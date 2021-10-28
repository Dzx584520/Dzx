package Runable;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("运行中  ");
    }

    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.start();
    }
}
