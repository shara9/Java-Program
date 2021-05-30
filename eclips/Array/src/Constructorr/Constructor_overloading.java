package Constructorr;

public class Constructor_overloading 
{
	int id;
	String name;
	int rooln;
	Constructor_overloading  (int a, String b)
	{
			id=a;
			name=b;
			
	}
	Constructor_overloading  (int a, String b , int c)
	{
			id=a;
			name=b;
			rooln=c;
			
	}
	void eat()
	{
	System.out.println(id+ "," +name+","+rooln);
	}
	public static void main(String[] args) 
	{
		Constructor_overloading  f=new Constructor_overloading (1,"shanu");
		f.eat();
		Constructor_overloading  c=new Constructor_overloading (1,"shanu",5);
		c.eat();
		
	}

	}


