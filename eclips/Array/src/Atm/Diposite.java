package Atm;
import java.util.Scanner;
class Diposite {

	int diposite_method(int dipo)
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("enter diposite amout- ");
		int diposite=scr.nextInt();
		dipo=dipo+diposite;
		System.out.println("ur current balance- "+dipo);
		return dipo;
		
	}
	
}
