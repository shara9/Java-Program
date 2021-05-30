import java.util.Scanner;
public class FiftyFour
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("enter charecter-:");
		char ch=scr.next().charAt(0);
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=6;c++)
			{
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
		
	}
}