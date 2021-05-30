import java.util.Scanner;
public class Fifteen
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the 1st number-:");
		int first=scr.nextInt();
		System.out.println("Enter the 2nd number-:");
		int second=scr.nextInt();
		int min=first;
		if (second<min)
		min=second;
		System.out.println("min number is-:" +min);
	}
}