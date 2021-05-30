import java.util.Scanner;
public class Five
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter 1st number-:");
		int first=scr.nextInt();
		System.out.println("Enter 2nd number-:");
		int second=scr.nextInt();
		int third=0;
		third=first;
		first=second;
		second=third;
		System.out.println("your 1st number-: "+first);
		System.out.println("your 2nd number-: "+second);
	}
}