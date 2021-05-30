public class Fibonacci
{
public static void main(String[] args)
{
int a=0;
int b=2;
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