import java.util.Scanner;
public class Eleven
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int number=scr.nextInt();
		if (number>0)
		System.out.println("number is positive");
		else
		System.out.println("number of negative");
	}
}