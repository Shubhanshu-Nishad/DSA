package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int[] stalls = new int[nos];
			for (int i = 0; i < stalls.length; i++) {
				stalls[i]= sc.nextInt();
				
			}
			Arrays.sort(stalls);
			System.out.println(AggressiveCows(stalls, noc));
		}

	}

	public static int AggressiveCows(int[] stalls, int noc) {
		// TODO Auto-generated method stub
		int ans = 0;
		int start = 0;
		int end = stalls[stalls.length-1] - stalls[0];
		while(start<=end) {
			int mid = (start + end)/2;
			if(isitPossible(stalls,noc,mid)) {
				ans  = mid;
				start = mid +1;
			}else {
				end = mid -1; 	
			}
		}
		return ans;
	}

	public static boolean isitPossible(int[] stalls, int noc, int mid) {
		// TODO Auto-generated method stub
		int cow = 1; // place first cow at 1th place
		int placeholder = stalls[0];
		int i = 1;
		while (i<stalls.length) {
			if(stalls[i]-placeholder>= mid) {
				cow++;
				placeholder = stalls[i];
			}
			i++;
			if(cow>=noc) {
				return true;
			}
		}
		return false;
	}

}
