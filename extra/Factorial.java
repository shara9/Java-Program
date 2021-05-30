public class Factorial
{
public static void main(String[] args)
{
int a=10;
int c=a;
for (int i=9;i>=1;i--)
{
System.out.print(a+"*");
c=c*i;
a--;
}
System.out.println("1="+c);

}}