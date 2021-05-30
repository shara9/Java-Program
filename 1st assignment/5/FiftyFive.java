import java.util.Scanner;
public class FiftyFive
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
	System.out.print("enter your symbol-:");
	char ch=scr.next().charAt(0);
	for(int i=1;i<=5;i++)
	{
		for(int c=1;c<=i;c++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
	}
	}
}