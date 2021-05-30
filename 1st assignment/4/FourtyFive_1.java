import java.util.Scanner;
public class FourtyFive_1
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("enter the number-: ");
		int a=scr.nextInt();
		int temp=0;
		int b=a;
		int c=0;
		while(b!=0)
		{
			c=b%10;
			b=b/10;
			temp++;
		}
		System.out.print(temp);
	}
}

