import java.util.Scanner;
public class Nineteen
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the char-:");
		char c=scr.next().charAt(0);
		if(c>64&&c<91)
		System.out.println("it is uppercase alphabet");
		else
		System.out.println("it is not a uppercase alphabet");

	}
}