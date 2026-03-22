package Module5_ExceptionHandlingANDMultithreading;
public class ThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle t = new ThreadLifeCycle();

        System.out.println("State: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}
