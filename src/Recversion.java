
public class Recversion {

	public static void main(String[] args) {
		// n!
		// 1 2 3 .... n
		int n = 5;
		int res = factorial(n);
		System.out.println(res);
		
	}

	private static int factorial(int n) {
		if(n == 2) {
			return 2;
		}
		else {
			return  n * factorial(n-1);// 5 * 24--- 4 * 6
		}
	}

}