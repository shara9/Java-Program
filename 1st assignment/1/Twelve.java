import java.util.Scanner;
public class Twelve
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the person's age-:");
		int age=scr.nextInt();
		if (age>=18)
		System.out.println("eligible for voting");
		else
		System.out.println("not eligible for voting");
	}
}