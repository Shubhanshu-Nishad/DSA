package Questions;

public class decimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 45;
		int ans = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%2;  //  to get remainder
			ans = ans + rem*mul;
			mul*=10;
			n/=2;
		}
		System.out.println(ans);

	}

}
