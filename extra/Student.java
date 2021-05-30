import java.util.Scanner;
public class Student
{
static Scanner scr=new Scanner(System.in);
public static void main(String[] args)
{
System.out.println("enter the student's number");
int number=scr.nextInt();
if (number<=33)
{
System.out.println("Fail");
}
else
{
System.out.println("Pass");

}}}