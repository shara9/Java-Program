import java.util.Scanner;
public class Seven
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("enter the first number-: ");
		int a=scr.nextInt();
		System.out.print("enter the second number-: ");
		int b=scr.nextInt();

		System.out.println(a&b);
		System.out.println(a|b);
 		System.out.println(a^b);        
	}
}

