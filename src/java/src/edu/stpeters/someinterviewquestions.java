package edu.stpeters;
interface MAX{
	public final String collegeName = "StPeters Engg College";
	public final int fee = 75000;
	public final String address = "HYD";
	public final int marks = 100;
}

interface  KK{
	
	public void mG(); 
}

interface  GG{
	
	public void mG(); 
}


interface TT extends KK,GG{
	public void mG(); 
}




class  HH implements GG,TT,KK{// 
	
	public void mG() {
		
	}
	
	void mH() {
		System.out.println(" welcome");
	}
}




public class someinterviewquestions {

	public static void main(String[] args) {
	
		
	}

}
