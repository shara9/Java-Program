package Interface;

public class Atm 
{
	static int balance=100;
	
	public static void main (String[] args) 
	{
		
		 int choice;
		System.out.println("select ur choice- ");
		switch (choice) 
		{
		 case 1:
			 Parent a=new Child();
			a.transfer();
			break;
		
		 case 2: Child b=new Child(); b.diposite();
		  
		  break; case 3: Child c=new Child(); c.widhtraw(); break; default:
		  System.out.println("wrong choice"); break;
		 
		}
		
		
		
		
	}
}


 interface Parent
{
	 
	void transfer();
	void widhtraw();
	void diposite();
}
 class Child implements Parent
 {
	 public void transfer() ///public bcz Cannot reduce the visibility of the inherited method from Parent
	 {
		// System.out.println("hi");
		 int transfer=50;
		Atm.balance=Atm.balance-transfer;
		 System.out.println(Atm.balance);
	 }
	 public void widhtraw()   ///public bcz Cannot reduce the visibility of the inherited method from Parent
	 {
		 int withdraw=10;
		 Atm.balance=Atm.balance-withdraw;
		 System.out.println(Atm.balance);
	 }
	 public void diposite()   ///public bcz Cannot reduce the visibility of the inherited method from Parent
	 {
		 
		 int diposite=100;
		 Atm.balance=Atm.balance-diposite;
		 System.out.println(Atm.balance);
	 
	 }
 }