package coding_blocks;

import java.util.Scanner;

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			String str = sc.next();
			form_minimum_number(str);
		}
	}

	private static void form_minimum_number(String str) {
		// TODO Auto-generated method stub
		int ans [] = new int[str.length()+1];
		int count=1;
		for (int i = 0; i <= str.length(); i++) {
			if( i == str.length() || str.charAt(i) =='I') {
				ans[i] = count;
				count++;
				for (int j = i-1; j>=0 &&  str.charAt(j) !='I';j--) {
					ans[j] = count;
					count++;
				}
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}

}
