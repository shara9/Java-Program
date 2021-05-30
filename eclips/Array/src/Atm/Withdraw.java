package Atm;

import java.util.Scanner;

class Withdraw 
{
	int withdraw_method(int with)
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("enter withdraw amout- ");
		int withdraw=scr.nextInt();
		with=with-withdraw;
		System.out.println("ur current balance is- " +with);
		return with;
	}
}