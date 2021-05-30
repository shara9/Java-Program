import java.util.Scanner;
public class Fourteen
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the 1st number-:");
		int first=scr.nextInt();
		System.out.println("Enter the 2nd number-:");
		int second=scr.nextInt();
		int max=first;
		if (second>first)
		max=second;
		System.out.println("max number is-:" +max);
	}
}