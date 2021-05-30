import java.util.Scanner;
public class Arm
{
static Scanner scr=new Scanner(System.in);
public static void main(String[] args)
{

System.out.println("enter no");
int a=scr.nextInt();

int e=a;
int b=0;
int c=0;
for(int i=1;i<=a;i++)
{
b=e%10;
e=e/10;
c=c+(b*b*b);
}
if (a==c)
{
System.out.println("Arm");
}
else
{
System.out.println("not");
}
}}