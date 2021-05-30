import java.util.Scanner;
class Start
{
	static int balance=1000;
	static Scanner scr=new Scanner(System.in);
	void start()
	{
	//System.out.println("\n\t\tWELCOME TO SBI \n\n1.cash withdraw\t \t\t2.diposite\n3.balance enquiry\t\t4.transfet");
	
	//int choice;
	
	}
}

class CashWithdraw extends Start
{
	void withdraw()
	{
	System.out.println("enter the amount u have to withdraw: ");
	int withdraw=scr.nextInt();
	balance=balance-withdraw;
	System.out.println("total balance is: " +balance);
	}
}
class SingleAtm
{
	public static void main(String[] args)
	{
	CashWithdraw c=new CashWithdraw();
	c.withdraw();
	c.start();
	}
}
