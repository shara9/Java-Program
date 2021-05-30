import java.util.Scanner;
public class Fibonacci
{
static Scanner scr=new Scanner(System.in);
public static void main(String[] args)
{
System.out.println("enter 1st number-");
int a=scr.nextInt();
System.out.println("enter 2nd number-");
int b=scr.nextInt();
int c=10;
int d=0;
for(int i=1;i<=c;i++)
{
d=a+b;
a=b;
b=d;
System.out.print(d+",");
}
}}