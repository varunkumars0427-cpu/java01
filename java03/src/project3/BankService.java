package project3;

class Bank {
	static void withdrawMoney(int balance, int amount) throws Exception {
		checkBalance(balance, amount);
		System.out.println("Withdrawal successful");
	}
	static void checkBalance(int balance, int amount) throws Exception {

		if (amount < balance) {
			throw new Exception("Insufficient Balance");
		}
		System.out.println("Balance is sufficient");
	}
}
public class BankService {

	public static void main(String[] args) {

		try {
			Bank.withdrawMoney(2000, 5000);
		} catch (Exception e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}

	}
}