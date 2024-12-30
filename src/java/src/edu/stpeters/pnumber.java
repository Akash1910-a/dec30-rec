package edu.stpeters;

/*
 * Write a Program to find 17th Prime number range from 1 to 300
*/
public class pnumber {

	public static void main(String[] args) {
		
		int c=17,res=0,p=1;
		for(int i=1;i<=300;i++) {
			if(checkPrime(i) == true) {
				System.out.print(i+" ");
				//c++;
				if(c--==0) {
					//System.out.println("17 th prime no..."+i);
					res = i;
				}// if
			}// if
			}// for
		System.out.println("\n17th Prime no----->"+res);

	}

	private static boolean checkPrime(int num) {
		// TODO Auto-generated method stub
		
		int count=0,r;
		for(int i=1;i<=num;i++) {
			r = num % i;;
			if(r==0) count++;
		}
		if(count ==2) return true;
		return false;
	}
}