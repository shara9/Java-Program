import java.util.Scanner;
public class ThirtySeven
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("enter first no: ");
		int a=scr.nextInt();
		System.out.print("enter second no: ");
		int b=scr.nextInt();
		int temp=0;
		int reminder;
		for(int i=1;i<b;i++)
		{
			temp++;
			int temp2=a*i;
			if(temp2==b)
			{
				break;
			}
			else if(temp2>b)
			{
				temp--;
				break;
			}
		}
		reminder=b-(temp*a);
		System.out.println("quotient is: "+reminder);

	}
}