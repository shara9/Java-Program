package com.sbi.atm;
public class Withdraw
{
	public static void withdraw()
	{
		System.out.println("enter the amout u have to withdraw: ");
		int withdraw=Atm.scr.nextInt();
		Atm.balance=Atm.balance-withdraw;
		System.out.println("total balance is: " +Atm.balance);
	}
}