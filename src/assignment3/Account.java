package assignment3;

public class Account {
	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public int updateBalance(int newAmount){
		this.balance = newAmount;
		return balance;
	}
}
