import java.util.Scanner;
public class FiftySix
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
	System.out.print("enter your symbol-:");
	char ch=scr.next().charAt(0);
	for(int r=1;r<=5;r++)
	{
		for(int c=5;c>=r;c--)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
	}
	}
}