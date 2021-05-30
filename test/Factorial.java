public class Factorial
{
	public static void main(String[] args)
	{
		int a=5;
		int c=a;
		int i=a-1;
		while(i>0)
		{
			a=a*i;
			i--;
			System.out.print(c+"*");
			c--;
		}
		System.out.print(1);
		System.out.println("="+a);
	}
}