package Leetcode;

import java.util.Stack;

public class Valid_subarray_1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,5,3};
		System.out.println(Valid_subarray_1063(arr));

	}

	public static int Valid_subarray_1063(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.empty() && arr[i]<st.peek()) {
				st.pop();
			}
			st.push(arr[i]);
			ans +=st.size();
		}
		return ans;
	}

}
