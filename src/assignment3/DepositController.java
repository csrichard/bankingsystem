package assignment3;

public class DepositController {
	private DepositCheck deposit = null;
	private Account acc = null;
	private DepositTransaction t = null;
	private int option = 0;
	
	public DepositController(Account acc) {
		super();
		this.acc = acc;
		this.t = new DepositTransaction(this.acc);
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public void depChoice(int option){
		DepositCheck deposit = null;
		setOption(option);
		
		if(option == 1){
			deposit = new CheckImg();
		}
		else if(option == 2){
			deposit = new CheckManually();
		}
		else if(option == 3){
			deposit = new CheckPdf();
		}
		else if(option == 4){
			System.out.println("Goodbye and we hope to see you soon!");
			this.deposit = null;
		}
		this.deposit = deposit;
	}
	
	public void depCheck(Account acc){
		if(this.deposit == null){
			return;
		}
		else{
			int newAmount = t.addAmount(deposit.enterCheck());
			acc.setBalance(acc.updateBalance(newAmount));
			System.out.println("Your current balance is now at: " + acc.getBalance());
		}
	}
}
