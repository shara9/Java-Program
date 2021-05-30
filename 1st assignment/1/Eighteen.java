import java.util.Scanner;
public class Eighteen
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the char-:");
		char c=scr.next().charAt(0);
		if(c>47&&c<58)
		System.out.println("it is digit");
		else
		System.out.println("it is not a digit");

	}
}