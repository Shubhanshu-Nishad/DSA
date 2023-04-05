package recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	}
	
	public static int fact(int n) {
		// BASE	 case 
		if(n==0) {
			return 1;
		}
		
		// sp n-1 
		int fn = fact(n-1); // recursion (n-1)! biswass karo ki n-1 factorial denga okay
	
		return fn * n;
		
	}

}
