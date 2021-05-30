package com.sbi.atm;
public class Deposite
{
	public static void depo()
	{
	int deposite=500;
	Atm.balance=Atm.balance+deposite;
	System.out.println(Atm.balance);
	}
}
