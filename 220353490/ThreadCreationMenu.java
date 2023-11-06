import java.util.Scanner;

// Implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface is running.");
    }
}

// Extending the Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created by inheriting Thread class is running.");
    }
}

public class ThreadCreationMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (1==1) {
            System.out.println("Menu:");
            System.out.println("1. Create and start a thread using Runnable interface");
            System.out.println("2. Create and start a thread by inheriting Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Create and start a thread using Runnable interface
                    Runnable runnable = new MyRunnable();
                    Thread runnableThread = new Thread(runnable);
                    runnableThread.start();
                    break;
                case 2:
                    // Create and start a thread by inheriting Thread class
                    Thread thread = new MyThread();
                    thread.start();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
