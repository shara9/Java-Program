package com.sbi.alert;
import com.sbi.atm.Atm;
public class Worning
{
	public static void worn()
	{
		if(Atm.balance<=100)
		System.out.println("balance low");
		}	
}