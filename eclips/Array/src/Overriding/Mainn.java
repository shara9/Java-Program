package Overriding;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		  Parent p=new Parent(); 
		  System.out.println(p.pare(2,5));
		 
		
		Child c=new Child();
		System.out.println(c.pare(3,5));
		c.parent();
		c.child();
		
		Parent pa=new Child();
		System.out.println(pa.pare(2,4));
		pa.parent();
		//.child();
			}
		}