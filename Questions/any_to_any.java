package Questions;

import java.util.Scanner;


public class any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int n = sc.nextInt();
		
		// first convert it to 10 base number okay bhai ji
		int mul = 1;
		int ans = 0;
		while(n>0) {
			int rem = n%10;
			ans = ans + rem*mul;
			mul*=sb;
			n/=10;
		}
		System.out.println(ans);
		// now convert 10 base to destination base
		n = ans;
		mul=1;
		ans = 0;
		while (n>0) {
			int rem = n % db;
			ans = ans + rem*mul;
			mul *= 10;
			n/=10;
			
		}
		System.out.println(ans);
	}

}
