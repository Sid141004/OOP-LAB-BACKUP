public class SynchronizedStatementExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(() -> {
            resource.doSomething("Thread 1");
        });

        Thread thread2 = new Thread(() -> {
            resource.doSomething("Thread 2");
        });

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private final Object lock = new Object();

    public void doSomething(String threadName) {
        synchronized (lock) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Step " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
