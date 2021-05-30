import java.util.Scanner;
public class ThirtyOne
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the n number-:");
		int n=scr.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		sum=sum+i;
		System.out.println(sum);
		
	}
}