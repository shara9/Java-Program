import java.util.Scanner;
public class Factorial
{
static Scanner scr=new Scanner(System.in);
public static void main(String[] args)
{
System.out.print("enter the no");
int a=scr.nextInt();
int c=a;
for (int i=a-1;i>=1;i--)
{
System.out.print(a+"*");
c=c*i;
a--;
}
System.out.println("1="+c);

}}