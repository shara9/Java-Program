import java.util.Scanner;
public class FourtyOne
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the number-:");
		int n=scr.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{		
			System.out.println("perfect");
		}	
		else
		{
			System.out.println("not");	
		}
	}
}