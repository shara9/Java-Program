import java.util.Scanner;
public class Sixteen
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
		int max=first;
		if(second>max)
		{
			max=second;
		}
			if(third>max)
		{
			max=third;
		}
		System.out.println("max number is-:" +max);
	
	}
}








