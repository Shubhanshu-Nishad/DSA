package inheritance;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 4));
		System.out.println(add(2, 4,6));
		System.out.println(add(2, 4,9.4f));
		System.out.println(add(2,3,4,-2,3,29,348,32));
	}
	
	public static int add(int a , int b) {
		return a+b;
	}
	public static int add(int a , int b,int c) {
		return a+b+c;
	}
	public static int add(int a , int b,float c) {
		return (int)(a+b+c);
	}
	
	public static int add(int b,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum  += a[i];	
		}
		return sum;
	}
}
