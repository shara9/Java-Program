package AllProgram;

public class Max 
{
	public static void main(String[] ar)
	{
		int[] array = {3,5,6,1,9,101,4,7};
		int max = 0;
		//int max1 = 0;
		for(int i : array)
			{
				if (i > max)
				{
					max = i;
				}
			}
			System.out.println(max);
			
			
	}
}
