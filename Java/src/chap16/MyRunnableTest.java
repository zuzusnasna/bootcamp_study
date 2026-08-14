package chap16;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        int i;

        for (i = 0; i <= 200; i++) {
            System.out.println(
                    Thread.currentThread().getName() + ":" + i + "\t"
            );
        }
    }
}

public class MyRunnableTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

        System.out.println("end");
    }
}