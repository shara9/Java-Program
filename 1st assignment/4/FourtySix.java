import java.util.Scanner;
public class FourtySix
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int n=scr.nextInt();
if(n%2==0)
		System.out.println("the number is even");	
else
System.out.println("the number is odd");	
	}
}