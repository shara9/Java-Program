import java.util.Scanner;
class Start
{
	static int balance=1000;
	static Scanner scr=new Scanner(System.in);
	void starts()
	{	
	}
}
class Diposite extends Start
{
	void dipo()
	{
	System.out.println("enter the amount u have to diposite: ");
	int diposite=scr.nextInt();
	balance=balance+diposite;
	System.out.println("total balance is: " +balance);
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
class HiraricalAtm
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		int balance=1000;
		System.out.println("\n\t\tWELCOME TO SBI \n\n1.cash withdraw\t \t\t2.diposite");		//\n3.balance enquiry\t\t4.transfet");
		System.out.println("\nenter pin");
   		int pin=scr.nextInt();
  		if(pin>999 && pin<9999)
    		{
			System.out.println("enter the choice: ");
			int choice=scr.nextInt();
			switch(choice)
			{
				case 1:
				CashWithdraw c=new CashWithdraw();
				c.withdraw();
				break;
				case 2:
				Diposite d=new Diposite ();
				d.dipo();	
				break;
			}
		}
		else
		System.out.println("invalid pin");
	
	}
}
