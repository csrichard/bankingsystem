package assignment3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		WelcomeScreen intro = new WelcomeScreen();
		Account acc = new Account(0);
		DepositController controller = new DepositController(acc);
		while(controller.getOption() != 4){
			controller.setOption(intro.Welcome(acc.getBalance()));
			controller.depChoice(controller.getOption());
			controller.depCheck(acc);
		}
	}
}



















/*controller.setOption(intro.Welcome());
controller.depChoice(controller.getOption());
controller.depCheck();*/
