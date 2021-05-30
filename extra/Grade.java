import java.util.Scanner;
public class Grade
{
static Scanner scr=new Scanner(System.in);
public static void main(String[] args)
{
System.out.println("enter the no");
int no= scr.nextInt();
do
{
if (no>70||no>50)
{
System.out.println( "grade A");
}
	if (no<50||no>30)
{
System.out.println( "grade B");
}
		if (no<30||no>0)
{
System.out.println( "Grade C");
}}
}}