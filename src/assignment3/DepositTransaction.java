package assignment3;

public class DepositTransaction {
	private int currbalance;
	private Account acc = null;
	public DepositTransaction(Account acc) {
		super();
		this.acc = acc;
	}
	
	public int addAmount(int amount){
		int newbalance = acc.getBalance() + amount;
		return newbalance;
	}
}
