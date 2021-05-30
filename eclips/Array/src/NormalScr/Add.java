package NormalScr;
import java.util.Scanner;
public class Add 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] arg)
	{
		System.out.println("Enter the first no");
		int a= s.nextInt();
		System.out.println("Enter the 2nd no");
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	

}
