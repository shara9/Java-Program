import java.util.Scanner;
public class TwentySeven
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the alphabet-:");
		char alpha=scr.next().charAt(0);
		if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
		System.out.println(alpha+" is Vowel");
		else if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
		System.out.println(alpha+" is Vowel");
		else
		System.out.println(alpha+" is Consonant");
	}
}