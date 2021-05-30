import java.util.Scanner;
public class Third
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter string-:");
		String c=scr.nextLine(); 
		for(int i=0;i<c.length();i++)
		{
			System.out.println(c.charAt(i)+"");
		}
	}
}