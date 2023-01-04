package string_cb;

import java.util.Scanner;

public class ascii_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ascii_difference(str);

	}

	private static void ascii_difference(String str) {
		// TODO Auto-generated method stub
		char prev = str.charAt(0);
		String ans = "";
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			ans =ans + prev + (curr-prev);
			prev = curr;
		}
		ans += prev;
		
		System.out.println(ans);
	}

}
