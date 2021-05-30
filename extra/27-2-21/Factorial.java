public class Factorial
{
public static void main(String[] args)
{
int a=5;
int b=a;
for(int i=a-1;i>=1;i--)
{
System.out.print(b+"*");
b--;
a=a*i;
}
System.out.print(1);
System.out.print("="+a);
}}