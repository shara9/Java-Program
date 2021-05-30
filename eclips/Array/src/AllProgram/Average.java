package AllProgram;

public class Average 
{
	public static void main(String[] ar)
	{
		int[] array = {2,5,4,9,3,7,6};
		int sum= 0;
		double average =0;
		for(int i : array)
		{
			sum = sum + i;
		}
		average = (double)sum/array.length;
		System.out.println(average);
	}
}
