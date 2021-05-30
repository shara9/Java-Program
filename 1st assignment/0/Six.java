import java.util.Scanner;
public class Six
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("enter the 1st number=");
		int first=scr.nextInt();
		System.out.print("enter the 2nd number=");
		int second=scr.nextInt();
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("after swipe your 1st number is-:" +first);
		System.out.println("after swipe your 2nd number is-:" +second);
	}
}