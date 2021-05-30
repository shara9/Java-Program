import java.util.Scanner;
public class Fifty
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
	System.out.println("enter your number-:");
	int n=scr.nextInt();
	for(int i=n;i>0;i--)
	System.out.println(i);
	}
}