package assignment3;

import java.util.Scanner;

public class WelcomeScreen {
	public int Welcome(int balance){
		int num;
		System.out.println("Your account balance is $"+balance);
		System.out.println("Enter an option number:");
		System.out.println("1\tDeposit check from image or picture");
		System.out.println("2\tDeposit check by manually entering information");
		System.out.println("3\tDeposit check from a pdf file");
		System.out.println("4\tExit");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		while(num < 1 || num > 4){
			System.out.println("Please only enter an option from 1 to 4");
			num = in.nextInt();
		}
		 return num;
	}
}
