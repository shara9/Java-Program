import java.util.Scanner;
public class FiftyEight
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the char-:");
		char ch=scr.next().charAt(0);
		for(int i=1;i<=4;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=4;j>=i;j--)
			{
				System.out.print(ch);
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}