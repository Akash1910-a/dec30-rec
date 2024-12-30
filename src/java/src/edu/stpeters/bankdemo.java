package edu.stpeters;

//abstract 

abstract class Bank {
	int balance;
	abstract void deposit(int amt);
	abstract void withDraw(int amt);
	
	void checkBalance() {
		System.out.println(" avl balance....." + this.balance);
	}

	
}
class CanaraBank extends Bank {
	public CanaraBank(int balance) {
		this.balance = balance;
	}
	 void deposit(int amt)
	{
		if (amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("From CanaraBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("From CanaraBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	
}
class KotakBank extends Bank {
	public KotakBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 200000) {
			this.balance = this.balance + amt;
			System.out.println("From KotakBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 200000) {
			this.balance = this.balance - amt;
			System.out.println("From KotakBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	
}

class YesBank extends Bank {
	public YesBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 500000) {
			this.balance = this.balance + amt;
			System.out.println("From YesBank successfully deposited.....amount..." + amt);

		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 500000) {
			this.balance = this.balance - amt;
			System.out.println("From YesBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	
}

public class bankdemo {

	public static void main(String[] args) {
	

		
		
		CanaraBank cBank = new CanaraBank(10000);
		
		
		cBank.deposit(5000);
		cBank.checkBalance();
		cBank.withDraw(3200);
		cBank.checkBalance();
		
		
		
		
		
		
		
	}

}