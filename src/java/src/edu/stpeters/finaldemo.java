package edu.stpeters;


final class A{
	int a1 = 300;
	final int a3 = 500;
	final void mA() {
		System.out.println("from class A... ma()....");
	}
	
	void m2() {
		System.out.println( "from Class A....... m2()");
	}
}
class B {// is 
	
	A aObj;/// has  relation
	
	void mA() {
		System.out.println("from class B... mA()....");
	}
	void m2() {
		//a1 = a1 + 600;
		//a3 = a3 + 400;
		System.out.println( "from Class B....... m2()");
			
	}
}


public class finaldemo {
	
	

	public static void main(String[] args) {

		B b = new B();
		
		b.mA();
	
	
	}

}

