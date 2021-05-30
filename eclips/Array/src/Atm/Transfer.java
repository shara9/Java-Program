package Atm;

import java.util.Scanner;

class Transfer {
	int transfer_method(int trans) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter transfer amount- ");
		int transfer = scr.nextInt();
		trans = trans - transfer;
		System.out.println("ur current balance- " + trans);
		return trans;
	}

}
