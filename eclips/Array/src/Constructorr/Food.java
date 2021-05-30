package Constructorr;

public class Food 
{
	int id;
	String name;
	Food (int a, String b)
	{
			id=a;
			name=b;
		
		//System.out.println("hi");
	}
	void eat()
	{
	System.out.println(id+ "," +name);
	}
	public static void main(String[] args) 
	{
		Food f=new Food(1,"shanu");
		f.eat();
	}

}
