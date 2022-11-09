package Questions;

import java.util.Scanner;

public class Chewbacca_and_Number {
//	Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them.
//	Inverting digit t means replacing it with digit 9 - t.
//
//	Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. 
//	The decimal representation of the final number shouldn't start with a zero.
//
//	Input Format
//	The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.
//
//	Constraints
//	x <= 100000000000000000
//
//	Output Format
//	Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't 
//  contain leading zeroes.
//
//	Sample Input
//	4545
//	Sample Output
//	4444
//	Explanation
//	There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or 
//  greater than the original digit. If it is less, then invert it otherwise leave it.
	
	public static void chewbacca_number(long n) {
		
		long[]  num = new long[18];
		int i =0;
		while (n>0) {
			long rem = n % 10;
			if((9 - rem )> rem) {
				num[i] = rem;
			}else 
				num[i] = 9 - rem;
			i++;
			n/=10;
		}
		if(num[i-1] == 0 ) {
			System.out.print(9);
			i--;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(num[j]);
		}
		System.out.println();
	}
	
	public static void chewbacca_number_method1(long n) {
		long rev=0;
		while(n!=0) {
			long rem = n%10;
			long x = 9-rem;
			n/=10;
			if(n==0 ) {
				rev=rev*10+rem;
				continue;
			}
			if(x>rem) {
				rev=rev*10+rem;
			}else {
				rev=rev*10+x;
			}
		}
		
		long m=rev;
		long rem2=0;
		long rev2=0;
		while(m!=0)
		{
			rem2=m%10;
			rev2=rev2*10+rem2;
			m=m/10;
		}
		
		System.out.println(rev2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while (t-->=0) {
			long n = sc.nextLong();
			chewbacca_number_method1(n);
//		}
	

//		long[] arr = new long[18];
//
//		int count = 0;
//
//		while (n != 0) {
//			long rem = n % 10;
//			arr[count] = rem;
//			count++;
//			n = n / 10;
//		}
//
//		for (int i = 0; i < count; i++) {
//
//			if (i != count - 1) {
//				if (arr[i] >= 5) {
//					arr[i] = 9 - arr[i];
//				}
//			} else {
//				if (arr[i] >= 5 && arr[i] <= 8) {
//					arr[i] = 9 - arr[i];
//				}
//			}
//		}
//
//		for (int i = count - 1; i >= 0; i--) {
//			System.out.print(arr[i]);
//		}
		
	}

}
