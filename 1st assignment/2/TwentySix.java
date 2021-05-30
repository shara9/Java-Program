 import java.util.Scanner;
public class TwentySix
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the year value-:");
		int n =scr.nextInt();
		if(n%4==0&& n%100!=0||n%400==0)
		{
			System.out.println("leap");
		}
		else
		{
			System.out.println("not");
		}
	}
}