package Inheritance;

//import java.util.Scanner;

public class Polymorphism {
	

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		Polymorphism p = new Polymorphism();
		// p.a = s.nextInt();
		// p.b = s.nextInt();

		//int d = p.calculation();
		System.out.println(p.calculation(1,3,3));
		// p.calculation(2.5f,5.3f);

	}

	 int calculation(int e, int f) {
		// int c = e + f;
		return e - f; // System.out.println(c);
	}

	 double calculation(double a, double b,double d) {
		//double c = a - b;
		return a+b+d;
	}

}
