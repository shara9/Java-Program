import java.util.Scanner;
public class Fourty
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int n=scr.nextInt();
		int m=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{m++;}
		}
		if (m==1)
			System.out.println("this number is prime" );
		else
			System.out.println("this number is not a prime number" );
	}
}