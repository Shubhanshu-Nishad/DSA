package Questions;

import java.util.Scanner;

public class simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			sum +=n;
			if(sum<0) {
				break;
			}
			System.out.println(n);
			
		}

	}

}
