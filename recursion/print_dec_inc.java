package recursion;

public class print_dec_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDI(5);
	}

	public static void PDI(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}

}
