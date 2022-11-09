package Questions;

import java.util.Scanner;

public class Global_variables {
	static int val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		static int val = 25;
		Scanner sc = new Scanner(System.in);
		val = sc.nextInt();
		System.out.println(val);
		int val = 24;
		System.out.println(val);
		int a = 29;
		printnameji(a);

	}
	
	public static void printnameji(int a) {
		
		System.out.println(a);
		System.out.println(val);
	}
}
