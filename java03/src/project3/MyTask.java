package project3;

class Task implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class MyTask {

    public static void main(String[] args) {

        Task task = new Task();

        Thread t = new Thread(task);

        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
