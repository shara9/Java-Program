import java.util.Scanner;
public class FourtyNine
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int n=scr.nextInt();
		n=n*n*n;
		System.out.println("sum of cubes-: " +n);
	}
}