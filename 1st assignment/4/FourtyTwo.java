import java.util.Scanner;
public class FourtyTwo
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int n=scr.nextInt();
		System.out.println("Enter the second-:");
		int m=scr.nextInt();
		int j;
		
		for(int i=n;i<=m;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				break;
			}
			if (i==j)
			System.out.println(j);
		}
	}
}