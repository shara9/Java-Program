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

class CashWithdraw extends Diposite
{
	void withdraw()
	{
	System.out.println("enter the amount u have to withdraw: ");
	int withdraw=scr.nextInt();
	balance=balance-withdraw;
	System.out.println("total balance is: " +balance);
	}
}

class Transfer extends CashWithdraw
{
	void transfer()
	{
	System.out.println("enter the amount u want to transfer: ");
	int transfer=scr.nextInt();
	balance=balance-transfer;
	System.out.println("total balance is: " +balance);
	}
}

class Multilavel
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		int balance=1000;
		System.out.println("\n\t\tWELCOME TO SBI \n\n1.cash withdraw\t \t\t2.diposite\n3.transfet");		//\n3.balance enquiry\t\t");
		System.out.println("\nenter pin");
   		int pin=scr.nextInt();
		int choice;
  		if(pin>999 && pin<9999)
    		{
			do
			{
				System.out.println("\nenter the choice: ");
				choice=scr.nextInt();
				switch(choice)
				{
					case 1:
					Transfer c=new Transfer ();
					c.dipo();
					break;
					case 2:
					Transfer d=new Transfer();
					d.withdraw();
					break;
					case 3:
					Transfer t=new Transfer();
					t.transfer();	
					break;
					default:
					System.out.println("invalid choice");
				}
			}
			while(choice!=0);
			
		}
		else
		System.out.println("invalid pin");
	}
} 
