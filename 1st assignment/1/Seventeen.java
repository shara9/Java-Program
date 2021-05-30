 import java.util.Scanner;
public class Seventeen
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the 1st number-:");
		int first=scr.nextInt();
		System.out.println("Enter the 2nd number-:");
		int second=scr.nextInt();
		System.out.println("Enter the 3rd number-:");
		int third=scr.nextInt();
		int min=first;
		if(second<min)
		{
			min=second;
		}
		if(third<min)
		{
			min=third;
		}
		System.out.println("min number is-:" +min);
	
	}
}