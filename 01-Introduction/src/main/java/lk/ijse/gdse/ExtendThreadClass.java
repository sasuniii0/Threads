package lk.ijse.gdse;

public class ExtendThreadClass {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("My New Thread!");
    }
}