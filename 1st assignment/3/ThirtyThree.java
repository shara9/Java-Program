import java.util.Scanner;
public class ThirtyThree
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the n number-:");
		String n=scr.nextLine();
		for(int i=0;i<=n.length();i++)
		{
			int temp=n.charAt(i);
			switch(temp)
			{
				case 48:
					System.out.print("zero ");
				break;
				case 49:
					System.out.print("one ");
				break;
				case 50:
					System.out.print("two ");
				break;
				case 51:
					System.out.print("three ");
				break;
				case 52:
					System.out.print("four ");
				break;
				case 53:
					System.out.print("five ");
				break;
				case 54:
					System.out.print("six ");
				break;
				case 55:
					System.out.print("seven ");
				break;
				case 56:
					System.out.print("eight ");
				break;
				case 57:
					System.out.print("nine ");
				break;
				}
		}
	}
}