import java.util.Scanner;
public class Eight
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter number-:");
		int n=scr.nextInt();
		int power=1;
		while(power<n)
		{
			power=2*power;
		}
			if (power==n)
			System.out.println("its power of two");
			else
			System.out.println("its not power of two");
	}
}