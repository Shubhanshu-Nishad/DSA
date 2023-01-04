package Leetcode;

import java.util.Stack;

public class find132pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-3,7,8,6,9,-5,-14,-103,-120};
		System.out.println(find132pattern(arr));
		
	}

	private static boolean find132pattern(int[] arr) {
		// TODO Auto-generated method stub
		int[] min = new int[arr.length];
		min[0] = arr[0];
		for (int i = 1; i < min.length; i++) {
			min[i] =Math.min(min[i-1], arr[i]) ;
		}
		Stack<Integer> st = new Stack<>();
		for (int j = arr.length-1 ;j>=0 ; j--) {
			int ith = min[j];
			while (!st.isEmpty() && ith >=arr[st.peek()] ) {
				st.pop();
			}
			if(!st.isEmpty() && arr[j] >arr[st.peek()] ) {
				return true;
			}
			st.push(j);
		}
		return false;
	}

}
