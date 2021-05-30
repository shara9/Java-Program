import java.util.Scanner;
public class FourtyEight
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter the number: ");
		int n=scr.nextInt();
		int a=0;
		int b=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			a=a+i;
			else
			b=b+i;
		}
		System.out.println("sum of even: " +a);
		System.out.println("sum of odd: " +b);
	}
}