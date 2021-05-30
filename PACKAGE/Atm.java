package com.sbi.atm;
import com.sbi.alert.Worning;
import java.util.Scanner;
public class Atm
{
	public static int balance=1001;
	static int choice;
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		Worning wo=new Worning();
		wo.worn();
		System.out.println("\n\t\tWELCOME TO SBI");
		System.out.println("\n1.deposite\t\t\t2.withdraw\n3.transfer\t\t\t4.balance enquiry");
		do
		{
			System.out.println("enter the choice: ");
			choice=scr.nextInt();
			switch(choice)
			{
				case 1:
					Deposite d=new Deposite();
					d.depo();
				break;	
				case 2:
					Withdraw w=new Withdraw();
					w.withdraw();
				break;
				case 3:
					Transfer t=new Transfer();
					t.transfer();
				break;
				case 4:
					BalanceEnquiry b=new BalanceEnquiry ();
					b.balanceenquiry ();
				break;
				default:
					System.out.println("invalid number");		
			
			}	
	
		}
		while(choice!=0);
	}
}