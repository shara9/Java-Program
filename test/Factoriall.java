public class Arms
{
	public static void main(String[] args)
	{
		int n=153;
		int t=n;
int b=0;
int c=0;
		while(t>=0)
		{
			b=t%10;	
			t=t/10;
			c=c+(b*b*b);
			
		}
if(n==c)
		System.out.print("arm");
else
System.out.print("not");
	}
}