import java.util.Scanner;
public class TwentyFive
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the char: ");
		char alpha=scr.next().charAt(0);
		int n=alpha;
		if(n>64&&n<91)
		{
			n=n+32;
			char ch=(char)n;
			System.out.println(ch);
		}
		else if(n>96&&n<123)
		{
			char c=(char)n;
			System.out.println(c);
		}
	}
}