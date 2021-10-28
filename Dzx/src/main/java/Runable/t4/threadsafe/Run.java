package Runable.t4.threadsafe;

public class Run {
    public static void main(String[] args) throws InterruptedException {

        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        System.out.println(aLogin.isAlive());
        aLogin.start();
        bLogin.start();
        Thread.sleep(1000);
        System.out.println(aLogin.isAlive());
    }
}
