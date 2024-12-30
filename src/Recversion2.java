
public class Recversion2 {

	public static void main(String[] args) {
		// n!
		// 1 2 3 .... n
		int n = 5;
		long res = factorial(n);
		System.out.println(res);
		
	}

	private static long factorial(int n) {
			//return  n > 1 ? n * factorial(n-1):1;
		if(n > 1) return n * factorial(n-1);
		return 1;
			
		
	}

}