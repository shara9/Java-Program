package Overriding;
 
class Father
{
	void Car()
	{
		System.out.println("father car");
	}
	void home()
	{
		System.out.println("father home");
	}
}
class Son extends Father
{
	void car()
	{
		System.out.println("son car");

	}
}
public class Example {

	public static void main(String[] args) 
	{
		Son s=new Son();
		s.car();
		s.home();
		

	}

}
