package day_8;
public class BankWithdrawal {

    static void withdrawMoney(int amount, int withdrawal) {

        if (amount <= 0) {
            System.out.println("Withdrawal completed!");
            return;
        }

        System.out.println("Withdraw: ₹" + withdrawal);
        amount = amount - withdrawal;

        withdrawMoney(amount, withdrawal);
    }

    public static void main(String[] args) {

        int amount = 10000;
        int withdrawal = 2000;

        withdrawMoney(amount, withdrawal);
    }
}