package Module5_ExceptionHandlingANDMultithreading;
class Counter {
    private int count = 0;

    // Synchronized method ensures only one thread can access at a time
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100); // Sleep to simulate some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Synchronization{
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        Thread t1 = new CounterThread(sharedCounter);
        Thread t2 = new CounterThread(sharedCounter);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}

