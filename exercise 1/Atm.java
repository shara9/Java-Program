//import java.util.Scanner;
class Deposite
{
	static int balance=1000;
	//static Scanner s=new Scanner(System.in);
	public static void depo()
	{
		int depo=200;
		balance=balance+depo;
		System.out.println(balance);
		
	}
}
class Transfer extends Deposite
{
	public static void trans()
	{
		int transfer=100;
		balance=balance-transfer;
		System.out.println(balance);
	}
}
public class Atm
{
	public static void main(String ar[])
	{
	Transfer t=new Transfer();
	t.trans();
	Deposite d=new Deposite();
	d.depo();
	}
}