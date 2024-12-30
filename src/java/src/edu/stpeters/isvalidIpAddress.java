package edu.stpeters;

public class isvalidIpAddress {

	public static void main(String[] args) {
		String input = "172.16.254.1";
		input = input.replace('.',' ');
		String[]data = input.split(" ");
		
		//172 16 254 1
		int num = 0;
		boolean isValid = false;
		if(data.length ==4) 
		 {
			for (int i=0;i<data.length;i++) {
				//System.out.println(data[i]+" ");
				num = Integer.parseInt(data[i]);
				if( (num >=0) ||  (num <=255)) {
					isValid = true;
				}
				else {
					isValid = false;
					break;
				}
			}
		}	
		if(isValid == true) {
			System.out.println("Valid IPv4 Address");
		}
		else {
			System.out.println("Not Valid IPv4 Address");
		}	
	}
}