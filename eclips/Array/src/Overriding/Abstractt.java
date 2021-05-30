package Overriding;

abstract class Job
{
	abstract void salary();
	void office()
	{
		System.out.println("office provides facility");
	}
}
class Shanu extends Job
{
	void salary()
	{
		System.out.println("Shanu's salary");
	}
}
class Suchi extends Job
{
	void salary()
	{
		System.out.println("Suchi's salary");
	}
}
public class Abstractt {

	public static void main(String[] args) {
		
		Job j=new Shanu();
		j.salary();
		j.office();
		Job o=new Suchi();
		o.salary();
		o.office();


	}

}
