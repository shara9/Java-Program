package Atm;

import java.util.Scanner;

public class Atm {
	private int balance = 1000;

	public static void main(String[] args) {
		System.out.println("\t\t\tWELCOM TO SBI \n\t1-withdraw\t\t\t2-diposite\n\t3-transfer\t\t\t4-\n\n");
		Scanner scr = new Scanner(System.in);
		Atm obj = new Atm();
		// int choice;
		int choice;
		do {
			System.out.println("enter ur choice- ");
			choice = scr.nextInt();
			switch (choice) {
			case 1:

				Withdraw w = new Withdraw();
				obj.balance = w.withdraw_method(obj.balance);
				break;
			case 2:
				Diposite d = new Diposite();
				obj.balance = d.diposite_method(obj.balance);
				break;
			case 3:
				Transfer t = new Transfer();
				obj.balance = t.transfer_method(obj.balance);
				break;
			default:
				System.out.println("invalid input");
			}
		} while (choice <= 3);
	}

}
