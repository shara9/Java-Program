import java.util.Scanner;
public class Group
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] ar)
	{
		System.out.print("enter the no-: ");
		int n=s.nextInt();
		if(n<=200)
		{
			if(n%2==0)
			{
				System.out.println("A= " +n/4);
				System.out.println("B= " +n/4);
				System.out.println("C= " +n/4);
				System.out.println("D= " +n/4);
			}
			if(n%2==1)
			{
				System.out.println("A= " +n/4);
				System.out.println("B= " +n/4);
				System.out.println("C= " +n/4);
				System.out.println("D= " +(n/4+n%4));
			}
		}
		else
		System.out.println("invalid number");
	}
}