import java.util.Scanner;
public class Nine
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
	System.out.println("enter your first number-:");
	int first=scr.nextInt();
	System.out.println("enter your second number-:");
	int second=scr.nextInt();
	if(second>0)
	{
		 while(second>0)
		{
			second--;
			first++;
		}
	}
	if(second<0)
	{
		while(second<0)
		{
			second++;
			first--;
		}
	}
			System.out.println("sum is-: "+first);
	}
}