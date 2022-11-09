package Questions;

public class inverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32145;
		int ans = 0;
		int pos=1;
		while(n>0) {
			int rem = n%10;
			ans = (int )(ans + pos*(Math.pow(10, rem-1)));
			n/=10;
			pos++;
		}
		System.out.println(ans);
	}
	

}
