import java.util.Scanner;
public class Thirteen
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int number=scr.nextInt();
		if (number%2==0)
		System.out.println("number is even");
		else
		System.out.println("number is odd");
	}
}