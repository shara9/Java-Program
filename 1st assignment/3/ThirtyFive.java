import java.util.Scanner;
public class ThirtyFive
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int n=scr.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ "*" +i+ "=" +n*i);
		}
	}
}