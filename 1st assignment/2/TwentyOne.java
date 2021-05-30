import java.util.Scanner;
public class TwentyOne
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the char-:");
		char c=scr.next().charAt(0);
		if(c>31&&c<48||c>=58&&c<=64||c>=91&&c<=96||c>=123&&c<=126)
		System.out.println("it is special symbol");
		else
		System.out.println("it is not special symbol");

	}
}