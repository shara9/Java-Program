import java.util.Scanner;
public class FiftyOne
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter the no: ");
		int s=scr.nextInt();
		int t=s;
		int sum=0;
		int a=0;
		for(int i=1;i<=s;i++)
		{
			a=s%10;
 			sum=(sum*10)+a;
			s=s/10;
		}
		if(sum==t)
		System.out.println("pali");
		else
		System.out.println("no");		
	}
}