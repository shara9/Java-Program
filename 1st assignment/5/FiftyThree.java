import java.util.Scanner;
public class FiftyThree
{
   	static Scanner scanner = new Scanner(System.in);
	public static void main(String args[])
   	{
		System.out.print("Enter the start number: ");
		int start = scanner.nextInt();
		System.out.print("Enter the end number: ");
		int end = scanner.nextInt();
		int num;
		int rem=0;
		int temp=0; 
		int counter=0;
		for(int i=start+1; i<end; i++)
		{
	  		temp = i;
			num=0;
	  		while(temp != 0)
	 		{
				rem = temp%10;
				num = num + rem*rem*rem;
				temp = temp/10;
	  		 }
	  	 if(i == num)
	  	 {
			if(counter == 0)
			{
		  	 System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
			}
		  System.out.print(i + "  ");
		  counter++;
	   	}
	}
	if(counter == 0)
	{
	   System.out.print("There is no Armstrong number Between "+start+" and "+end);
	}
    }
}