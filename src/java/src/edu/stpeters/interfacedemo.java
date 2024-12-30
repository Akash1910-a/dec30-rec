package edu.stpeters;

//interface 

interface Bank1 {
	 public void deposit(int amt);
	 public void withDraw(int amt);
	
	 public void checkBalance();
	

	
}
class CanaraBank1 implements Bank1 {
	 int balance;
		
	 public CanaraBank1(int balance) {
		this.balance = balance;
	}
	public  void deposit(int amt)
	{
		if (amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("From CanaraBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	public void withDraw(int amt) {
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("From CanaraBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	
	public void checkBalance()
	{
		System.out.println(" avl balance....." + this.balance);
	}
	
}
class KotakBank1 implements Bank1 {
	int balance;
	
	public KotakBank1(int balance) {
		this.balance = balance;
	}
	public void deposit(int amt) {
		if (amt < 200000) {
			this.balance = this.balance + amt;
			System.out.println("From KotakBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	public void withDraw(int amt) {
		if (amt < 200000) {
			this.balance = this.balance - amt;
			System.out.println("From KotakBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	
	public void checkBalance()
	{
		System.out.println(" avl balance....." + this.balance);
	}
	
	
}

class YesBank1 implements Bank1 {
	int balance;
	
	public YesBank1(int balance) {
		this.balance = balance;
	}
	public void deposit(int amt) {
		if (amt < 500000) {
			this.balance = this.balance + amt;
			System.out.println("From YesBank successfully deposited.....amount..." + amt);

		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	public void withDraw(int amt) {
		if (amt < 500000) {
			this.balance = this.balance - amt;
			System.out.println("From YesBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	
	public void checkBalance()
	{
		System.out.println(" avl balance....." + this.balance);
	}
	
	
}

public class interfacedemo {

	public static void main(String[] args) {
	

	Bank1 bank = null;	
		
		bank = new CanaraBank1(10000);
		
		
		bank.deposit(5000);
		bank.checkBalance();
		bank.withDraw(3200);
		bank.checkBalance();
		
bank = new KotakBank1(10000);
		
		
		bank.deposit(5000);
		bank.checkBalance();
		bank.withDraw(3200);
		bank.checkBalance();
		
		
		
bank = new YesBank1(10000);
		
		
		bank.deposit(5000);
		bank.checkBalance();
		bank.withDraw(3200);
		bank.checkBalance();
		
		
		
		
		
		
	}

}
