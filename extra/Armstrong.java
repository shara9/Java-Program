import java.util.Scanner;
public class Armstrong 
{
static Scanner scr=new Scanner(System.in);
	public static void main(String[] arnumbers) 
	{

		System.out.println("enter your number which you want to check");
		int number=scr.nextInt();
		int temp=number;
		int b=temp;
		int power=0;
		int reminder=0;
		int d=0;
		for(;b!=0; ++power)
		{
			b=b/10;
		}
		
		for(int i=1;i<=power;i++)
		{
			reminder=temp%10;
			d+=Math.pow(reminder,power);
			temp=temp/10;
		}	
		System.out.println(d);
		if(d==number)
	{
		System.out.println("this no is Armstrong");
	}
	else
	{
	System.out.println("this no is not Armstrong");
	}

}}	