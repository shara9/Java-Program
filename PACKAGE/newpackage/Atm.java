package com.sbi.atm;
import com.sbi.alert.Worning;
import java.util.Scanner;
public class Atm
{
	public static int balance=100;
	public static void main(String[] ag)
	{
	Worning g=new Worning();
	g.worn();
	
	Deposite d= new Deposite();
	d.depo();
	}
}