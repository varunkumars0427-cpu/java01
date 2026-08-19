package project3;

class BankAccount {

    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing " + amount);

        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Withdrawal completed");
    }
}

class MyThread extends Thread {

    BankAccount bank;

    MyThread(BankAccount bank) {
        this.bank = bank;
    }

    public void run() {
        bank.withdraw(500);
    }
}

public class synchronization {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount();

        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);

        t1.start();
        t2.start();
    }
}