package assignment3;

import java.util.Scanner;

public class CheckManually extends DepositCheck{

	@Override
	public int enterCheck() {
		// TODO Auto-generated method stub
		super.enterCheck();
		int num = 0;
		int flag = 1;
		while(flag != 0){
			System.out.println("Please enter the check amount");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			if(num <= 0){
				System.out.println("You cannot deposit a check less or equal to 0");
			}
			else{
				flag = 0;
			}
		}
		return num;
	}
}
