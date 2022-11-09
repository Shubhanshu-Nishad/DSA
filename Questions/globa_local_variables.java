
package Questions;
public class globa_local_variables {
	
	static int val = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		System.out.println(a);
		System.out.println(val);
		print(a);
		int val = 56;
		System.out.println(val);
	}

	public static void print(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*2);
		System.out.println(val+6);
		int val = 11 +5;
		System.out.println(val);
	}
	

}
