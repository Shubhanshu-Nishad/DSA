package recursion;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print2(5);

	}

	private static void print1(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		System.out.println(n);
		print1(n-1);
	}

	private static void print2(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		print2(n-1);
		System.out.println(n);
		
	}

}
