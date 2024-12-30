package edu.stpeters;

class RBIBank {
	int balance;
	
	void deposit(int amt) {
		this.balance=this.balance + amt;
		System.out.println("From RBI successfully deposited...amount..."+amt);
	}
	
	void WithDraw(int amt) {
		this.balance=this.balance - amt;
		System.out.println("From RBI successfully withdrawn....amount..."+amt);
		}
	
	void checkBalance() {
		System.out.println("From RBI avl balance....." + this.balance);
	}
}

class SBIBank extends RBIBank {
	public SBIBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt < 50000) {
			this.balance=this.balance + amt;
			System.out.println("From SBI suucessfully deposited...amount.." + amt);
		} else {
			System.out.println("From SBI limit exceeded");
		}
	}
	void withdraw(int amt) {
		if (amt < 50000) {
			this.balance=this.balance - amt;
			System.out.println("From SBI suucessfully withdrawn...amount.." + amt);
		} else {
			System.out.println("From SBI limit exceeded");
		}
	}
}

class ICICIBank extends RBIBank {
	public ICICIBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt < 200000) {
			this.balance=this.balance + amt;
			System.out.println("From ICICI suucessfully deposited...amount.." + amt);
		} else {
			System.out.println("From ICICI limit exceeded");
		}
	}
	void withdraw(int amt) {
		if (amt < 200000) {
			this.balance=this.balance - amt;
			System.out.println("From ICICI suucessfully withdrawn...amount.." + amt);
		} else {
			System.out.println("From ICICI limit exceeded");
		}
	}
}

class HDFCBank extends RBIBank {
	public HDFCBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt < 500000) {
			this.balance=this.balance + amt;
			System.out.println("From HDFC suucessfully deposited...amount.." + amt);
		} else {
			System.out.println("From HDFC limit exceeded");
		}
	}
	void withdraw(int amt) {
		if (amt < 500000) {
			this.balance=this.balance - amt;
			System.out.println("From HDFC sucessfully withdrawn...amount.." + amt);
		} else {
			System.out.println("From HDFC limit exceeded");
		}
	}
}

public class overriding {
	public static void main (String [] args) {
		SBIBank sbi=new SBIBank (10000);
		ICICIBank icici=new ICICIBank (75000);
		HDFCBank hdfc=new HDFCBank(85000);
		
		System.out.println("For SBI Bank starts...");
		sbi.checkBalance();
		sbi.deposit(6000);
		sbi.checkBalance();
		sbi.deposit(67000);
		sbi.checkBalance();
		System.out.println("For SBI Bank ends...");
		
		System.out.println("For ICICI Bank starts...");
		icici.checkBalance();
		icici.deposit(6000);
		icici.checkBalance();
		icici.deposit(67000);
		icici.checkBalance();
		System.out.println("For ICICI Bank ends...");
		
		System.out.println("For HDFC Bank starts...");
		hdfc.checkBalance();
		hdfc.deposit(6000);
		hdfc.checkBalance();
		hdfc.withdraw(67000);
		hdfc.checkBalance();
		System.out.println("For HDFC Bank ends...");
		
	}
}




