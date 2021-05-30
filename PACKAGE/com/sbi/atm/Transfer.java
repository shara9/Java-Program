package com.sbi.atm;
public class Transfer
{
	public static void transfer()
	{
		System.out.println("enter the amout u have to transfer: ");
		int transfer=Atm.scr.nextInt();
		Atm.balance=Atm.balance-transfer;
		System.out.println("total balance is: " +Atm.balance);
	}
}