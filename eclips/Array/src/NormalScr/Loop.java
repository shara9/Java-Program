package NormalScr;
import java.util.Scanner;
public class Loop 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] arg)
	{
		System.out.println("Enter the no");
		int a=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			//int b=a*i;
			System.out.println(a+" * "+i+" = "+a*i);
		}
		
	}
}
