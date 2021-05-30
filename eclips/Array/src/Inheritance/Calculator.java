package Inheritance;
import java.util.Scanner;
class Start
{
	static int a;
	static int b;
	static Scanner s=new Scanner(System.in);
	void start()
	{
		System.out.println("enter ur 1st number- ");
		a=s.nextInt();
		System.out.println("enter ur 2nd number- ");
		b=s.nextInt();
	}
}
class Sum extends Start
{
	void sum()
	{
		int add =a+b;
		System.out.println(add);
	}
}
class Div extends Start
{
	void div()
	{
		int sub=a-b;
		System.out.println(sub);
	}
}
public class Calculator 
{
	static int choise;
	public static void main(String[] args)
	{
		System.out.println("\tchoose ur choise\n\n1- sum\t\t\t2- sub\n\n\n");		
		do
		{
			System.out.println("enter choice-");
			choise=Start.s.nextInt();
			switch(choise)
			{
	
			case 1:
				Sum s= new Sum();
				s.start();
				s.sum();
				break;
			case 2:
				Div d=new Div();
				d.start();
				d.div();
				break;
			default:
					System.out.println("invalid");
			}
		}
		while(choise<=2);
		
	}
	
	
}
