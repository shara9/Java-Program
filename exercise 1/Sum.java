import java.util.Scanner;
public class Sum
{
	static Scanner s=new Scanner(System.in);
	public static void main(String agrs[])
	{
		System.out.println("enter 1st no-: ");
		int a=s.nextInt();
		System.out.println("enter 2nd no-: ");
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("sum is="+sum); 
	}
}