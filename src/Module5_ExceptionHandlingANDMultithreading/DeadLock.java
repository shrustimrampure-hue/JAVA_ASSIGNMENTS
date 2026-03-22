package Module5_ExceptionHandlingANDMultithreading;
public class DeadLock {
    static final Object obj1 = new Object();
    static final Object obj2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                synchronized (obj2) {
                    System.out.println("Thread 1 acquired both locks");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                synchronized (obj1) {
                    System.out.println("Thread 2 acquired both locks");
                }
            }
        });

        t1.start();
        t2.start();
    }
}