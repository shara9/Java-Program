package Inheritance;
class Teacher
{
	static  int a=2;
	 void Teacher()
	{
		// int a=2;
		
	}
}
class Classroom extends Teacher
{
	void classroom()
	{
		
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
}
class School
{
	public static void main(String[] args)
	{
		Classroom s=new Classroom();
		s.Teacher();
		s.classroom();
		
	}
}
	