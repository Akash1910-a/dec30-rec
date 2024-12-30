package edu.stpeters;

interface money{
	
	void dollarToInr(int usDollar);
	//1 dollar == Rs.84.75
	void poundToInr(int ukPound);
	//1 pound == Rs.120.65
	
}
class  IndianRupee implements money {

	@Override
	public void dollarToInr(int usDollar) {
		// TODO Auto-generated method stub
		float res = 84.75f * usDollar;
		System.out.println("dollar "+usDollar +"indian rupees--->"+res);
	}

	@Override
	public void poundToInr(int ukPound) {
		// TODO Auto-generated method stub
		float res = 120.65f * ukPound;
		System.out.println("pound"+ukPound +"indian rupees--->"+res);
	}
	
}

public class currencydemo {
	public static void main (String[] args) {
		IndianRupee indianRuppes = new IndianRupee();
		
		indianRuppes.dollarToInr(1);
		indianRuppes.poundToInr(100);
		
	}
}
