package project3;

public class multithread extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("method " + i);
        }
    }

    public static void main(String[] args) {
        multithread bb = new multithread();

        bb.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main method " + i);
        }
    }
}
