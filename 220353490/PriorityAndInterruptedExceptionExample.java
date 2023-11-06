public class PriorityAndInterruptedExceptionExample {
    public static void main(String[] args) {
        // Create a sample thread
        Thread myThread = new Thread(new MyRunnable());

        // Set the priority of the thread
        myThread.setPriority(Thread.MAX_PRIORITY);

        // Start the thread
        myThread.start();

        // Interrupt the thread after a delay
        try {
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Count: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
