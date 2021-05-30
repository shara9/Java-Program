public class Prime
{
	public static void main(String[] args)
	{
		int a=4;
		int i=a;
		int temp=0;
		while(i!=1)
		{
			if(a%i==0)
			{
				temp++;
			}
			i--;
		}
		if(temp==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not");
		}
	}
}
