import java.util.Scanner;
public class FourtyThree
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter 1st number-");
		int first=scr.nextInt();
		System.out.println("enter 2nd number-");
		int second=scr.nextInt();
		int n=10;
		int d=0;
		for(int i=1;i<=n;i++)
		{
			d=first+second;
			first=second;
			second=d;
			System.out.print(d+",");
		}
	}
}