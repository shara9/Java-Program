import java.util.Scanner;
public class Armstrong
{
static Scanner scr=new Scanner(System.in);
public static void main(String[] args)
{
System.out.println("enter no-");
int n=scr.nextInt();
int b=n;
int a=0;
int c=0;
for(int i=1;i<=n;i++)
{
a=b%10;
b=b/10;
c=c+(a*a*a);
}
if (n==c)
System.out.println(c+" is arm" );
else
System.out.println(c+" is not");
}}