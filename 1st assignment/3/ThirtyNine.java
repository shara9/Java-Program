import java.util.Scanner;
public class ThirtyNine
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("enter the number=");
		int a=scr.nextInt();
		int b=a;
		for(int i=a-1;i>=1;i--)
		{
			System.out.print(b+"*");
			b--;
			a=a*i;
		}
		System.out.print(1);
		System.out.print("="+a);
	}
}