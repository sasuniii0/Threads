package lk.ijse.gdse;

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyNewThread myNewThread = new MyNewThread();
        Thread thread = new Thread(myNewThread);
        thread.start();
    }
}
class MyNewThread implements Runnable{
    @Override
    public void run() {
        System.out.println("My New Thread!");
    }
}
