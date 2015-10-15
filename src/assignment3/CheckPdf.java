package assignment3;

public class CheckPdf extends DepositCheck{

	@Override
	public int enterCheck() {
		// TODO Auto-generated method stub
		super.enterCheck();
		System.out.println("We are depositing check via a PDF");
		return 0;
	}

}
