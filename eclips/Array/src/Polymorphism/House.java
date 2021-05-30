package Polymorphism;

public class House 
{
	public static void main(String[] args)
	{
		House h=new House();
	System.out.println(h.room(5.5,6.5));
	}
	
	double room(double a, double b)
	{
	//int c=a+b;
	return a+b;
	}
	
	int room(int a,int b)
	{
	return a-b;
	}
}

