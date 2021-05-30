package NormalScr;
import java.util.Scanner;
public class Loop1 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] ar)
	{
		System.out.println("enter the no");
		int a = s.nextInt();
		int i=1;
		while (i<=10)
		{
			System.out.println(a+ " * " +i+ " = " +a*i);
			i++;
		}
	}
}
