package Questions;

public class binary_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101101;
		int ans = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%10;  //  to get remainder
			ans = ans + rem*mul;
			mul*=2;
			n/=10;
		}
		System.out.println(ans);

	}

}
