class BankAccount {
	int balance = 0;

	public int deposit(int amount) {
		balance += amount;
		return amount;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return amount;
	}

	public int checkMyBalance() {
		System.out.println("ภÜพื : " + balance);
		return balance;
	}
}

public class BankAccountOP {

	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		
	}

}
