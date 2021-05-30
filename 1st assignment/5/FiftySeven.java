import java.util.Scanner;
public class FiftySeven
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the char-:");
		char ch=scr.next().charAt(0);
		for(int i=1;i<=4;i++)
		{
			for(int r=4;r>=i;r--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<i*2;c++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}