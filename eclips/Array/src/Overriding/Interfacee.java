package Overriding;

interface  Kaam
{
	 void salary();
	 void office();
}

class Shanurana implements Kaam
{
	public void salary()
	{
		System.out.println("Shanu's salary");
	}
	public void office()
	{
		System.out.println("office provides facility");
	}
}
class Suchirana implements Kaam
{
	public void salary()
	{
		System.out.println("Suchi's salary");
	}
	public void office()
	 {
		System.out.println("office provides facility");
	}
}
public class Interfacee {

	public static void main(String[] args) {
		
		Kaam j=new Shanurana();
		j.salary();
		j.office();
		Kaam o=new Suchirana();
		o.salary();
		o.office();


	}

}
