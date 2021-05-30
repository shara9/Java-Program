import java.util.Scanner;
public class Thirty
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the n number-:");
		int n=scr.nextInt();
		for(int i=1;i<=n;i++)
		System.out.println(i);
	}
}