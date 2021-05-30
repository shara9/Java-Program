package AllProgram;

public class Min 
{
	//static int min;
	public static void main(String[] ar)
	{
		int[] array = {7,8,4,6,2,6,99,55,33};
		int min = array[0];
		for(int i : array)
		{
			if (i < min)
			{
				min = i;
			}
		}
		System.out.println(min);		
	}
}
