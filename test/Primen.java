public class Primen
{
	public static void main(String[] args)
	{
		int p=4;
		int t=p;
		int temp=0;
		
		while(t>1)
		{
			if(p%t==0)
			{
				temp++;
			}
			t--;
		}
		if(temp==1)
		System.out.print("prime");
		else
		System.out.print("not");
	}
}