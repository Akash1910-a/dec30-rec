package edu.stpeters; 

class Bank {
	int balance;
	
	void deposit(int amt) {
		this.balance=this.balance + amt;
		System.out.println("From Bank successfully deposited...amount..."+amt);
	}
	
	void WithDraw(int amt) {
		this.balance=this.balance - amt;
		System.out.println("From Bank successfully withdrawn....amount..."+amt);
		}
	
	void checkBalance() {
		System.out.println("From Bank avl balance....." + this.balance);
	}
}

class CanaraBank extends Bank {
	public CanaraBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt < 50000) {
			this.balance=this.balance + amt;
			System.out.println("From Canra suucessfully deposited...amount.." + amt);
		} else {
			System.out.println("From Canara limit exceeded");
		}
	}
	void withdraw(int amt) {
		if (amt < 50000) {
			this.balance=this.balance - amt;
			System.out.println("From Canara sucessfully withdrawn...amount.." + amt);
		} else {
			System.out.println("From Canara limit exceeded");
		}
	}
}

class KotakBank extends Bank {
	public KotakBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt < 200000) {
			this.balance=this.balance + amt;
			System.out.println("From Kotak suucessfully deposited...amount.." + amt);
		} else {
			System.out.println("From Kotak limit exceeded");
		}
	}
	void withdraw(int amt) {
		if (amt < 200000) {
			this.balance=this.balance - amt;
			System.out.println("From Kotak suucessfully withdrawn...amount.." + amt);
		} else {
			System.out.println("From Kotak limit exceeded");
		}
	}
}

class YesBank extends Bank {
	public YesBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt < 500000) {
			this.balance=this.balance + amt;
			System.out.println("From Yes suucessfully deposited...amount.." + amt);
		} else {
			System.out.println("From Yes limit exceeded");
		}
	}
	void withdraw(int amt) {
		if (amt < 500000) {
			this.balance=this.balance - amt;
			System.out.println("From Yes sucessfully withdrawn...amount.." + amt);
		} else {
			System.out.println("From Yes limit exceeded");
		}
	}
}

public class polymorphism {
	public static void main (String [] args) {
		
		Bank bank = null;
		
		bank=new CanaraBank (10000);
		
		
		System.out.println("For Canara Bank starts...");
		bank.checkBalance();
		bank.deposit(6000);
		bank.checkBalance();
		bank.deposit(67000);
		bank.checkBalance();
		System.out.println("For Canara Bank ends...");
		
		
		bank=new KotakBank (75000);
		
		System.out.println("For Kotak Bank starts...");
		bank.checkBalance();
		bank.deposit(6000);
		bank.checkBalance();
		bank.WithDraw (67000);
		bank.checkBalance();
		System.out.println("For Kotak Bank ends...");
		
		bank=new YesBank(85000);
		System.out.println("For Yes Bank starts...");
		bank.checkBalance();
		bank.WithDraw(6000);
		bank.checkBalance();
		bank.deposit(67000);
		bank.checkBalance();
		System.out.println("For Yes Bank ends...");
		
	}
}




