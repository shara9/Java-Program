package com.sbi.atm;
public class Deposite
{
	public static void depo()
	{
		System.out.println("enter the amout u have to deposite: ");
		int deposite=Atm.scr.nextInt();
		Atm.balance=Atm.balance+deposite;
		System.out.println("total balance is: " +Atm.balance);
	}
}