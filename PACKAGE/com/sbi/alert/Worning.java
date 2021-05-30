package com.sbi.alert;
import com.sbi.atm.Atm;
public class Worning
{
	public static void worn()
	{
	Atm obj=new Atm();
	if(obj.balance<=50)
	{
	System.out.println("ur balance is low");
	}
	}
}
