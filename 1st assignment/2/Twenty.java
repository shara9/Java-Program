import java.util.Scanner;
public class Twenty
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the char-:");
		char c=scr.next().charAt(0);
		if(c>96&&c<123)
		System.out.println("it is lowercase alphabet");
		else
		System.out.println("it is not a lowercase alphabet");

	}
}