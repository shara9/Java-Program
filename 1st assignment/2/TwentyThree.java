import java.util.Scanner;
public class TwentyThree
{
	static Scanner scr=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the 1st subject marks-:");
		int first=scr.nextInt();
		System.out.println("Enter the 2nd subject marks-:");
		int second=scr.nextInt();
		System.out.println("Enter the 3rd subject marks-:");
		int third=scr.nextInt();
		int total=first+second+third;
		int average=total/3;
		System.out.println("total marks scored-:" +total);
		System.out.println("average of marks-:" +average);
		if (total>=80)
		System.out.println("Grade A- Excellent");
		else if(total>=70)
		System.out.println("Grade B- Very Good");
		else if(total>=60)
		System.out.println("Grade C- Good");
		else if(total>=50)
		System.out.println("Grade D- Satisfactory");
		else
		System.out.println("Grade E- Failure, Try Again!!!");
	}
}