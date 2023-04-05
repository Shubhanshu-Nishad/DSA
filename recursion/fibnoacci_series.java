package recursion;

public class fibnoacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fib(0));
	}

	public static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return n;
		
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		
		return f1 + f2;
	}

}
