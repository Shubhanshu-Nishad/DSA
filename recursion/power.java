package recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,2));
	}

	public static int power(int a, int b) {
		// TODO Auto-generated method stub
		if( b==0) {
			return 1;
		}
		
		// sp
		int ans = power(a, b-1); // a^(b-1)
		
		return  ans* a;
	}

}
