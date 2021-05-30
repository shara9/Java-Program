import java.util.Scanner;
public class Ten
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the Fahrenheit value-:");
		float f=scr.nextFloat();
		float c=0;
		c=(f-32)*5/9;
		System.out.println("Celsius value-:" +c);
	}
}