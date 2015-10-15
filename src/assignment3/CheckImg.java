package assignment3;

public class CheckImg extends DepositCheck{
	@Override
	public int enterCheck() {
		// TODO Auto-generated method stub
		super.enterCheck();
		System.out.println("Please upload your image containing the check");
		return 0;
	}
}
