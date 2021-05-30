package AllProgram;

import java.util.Scanner;

public class Atmmachine {
	private int balance = 1000;
	private int pin;
	

	public static void main(String[] args) {
		 Scanner scr = new Scanner(System.in);
		 Atmmachine obj=new Atmmachine();
		System.out.println(
				"\t\tWELCOME TO SBI \n\n1-Change Pin \t\t\t2-Balance Enquiry \n3-Deposite \t\t\t4-Transfer \n5-Cash Withdraw \t\t6-Mini statment");
		System.out.println("\nenter pin");
		obj.pin =scr.nextInt();
		if (obj.pin > 999 && obj.pin < 9999) {
			int choice;
			do {
				System.out.println("choose your option-");
				choice = scr.nextInt();
				switch (choice) {
				case 1:
					ChangePin a = new ChangePin();
					a.change_method();
					break;
				case 2:
					BalanceEnquiry b = new BalanceEnquiry();
					b.enquiry_method();
					break;
				case 3:
					Deposite c = new Deposite();
					c.deposite_method();
					break;
				case 4:
					Transfer d = new Transfer();
					d.transfer_method();
					break;
				case 5:
					Withdraw e = new Withdraw();
					obj.balance = e.withdraw_method(obj.balance);
					break;
				case 6:
					MiniStatment f = new MiniStatment();
					f.ministatment_method();
					break;
				case 7:
					System.out.println("your pin is-" + obj.pin);
					break;
				default:
					System.out.println("wrong choice");
					break;
				}
			} while (choice != 10);
		} else {
			System.out.println("ERROR-pin must be 4 digit");
		}
	}
}

class ChangePin {
	void change_method() {
		System.out.println("enter new pin");
		Atmmachine.pin = Atmmachine.scr.nextInt();
		if (Atmmachine.pin > 999 && Atmmachine.pin < 9999) {
			System.out.println("SUCESSFULL \nnew pin is-" + Atmmachine.pin);
		} else {
			System.out.println("ERROR-pin must be 4 digit");
		}
	}
}

class BalanceEnquiry {
	void enquiry_method() {
		System.out.println("your total balance is-" + Atmmachine.balance);
	}
}

class Deposite {
	void deposite_method() {
		System.out.println("enter the deposite amount-");
		int deposite = Atmmachine.scr.nextInt();
		Atmmachine.balance = Atmmachine.balance + deposite;
		System.out.println("total balance is-" + Atmmachine.balance);
	}
}

class Transfer {
	
	void transfer_method() {
		Atmmachine.balance=10000000;
		System.out.println("enter the transfer amount-");
		int transfer = Atmmachine.scr.nextInt();
		Atmmachine.balance = Atmmachine.balance - transfer;
		System.out.println("total balance is-" + Atmmachine.balance);
	}
}

class Withdraw {

	int withdraw_method(int check) {
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the amount you want to withdraw-");
		int withdraw =scr.nextInt();
		if (withdraw < check) {
			check = check - withdraw;
			System.out.println("SUCESSFULL \ntotal balance is-" + check);
			scr.close();
			return check;
		}
		if (withdraw > check) {
			System.out.println("balance insufficent");

		}
		scr.close();
		return check;
	
	}
}

class MiniStatment {
	void ministatment_method() {
		System.out.println("your total balance is-" + Atmmachine.balance);
	}
}