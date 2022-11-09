package Leetcode;

import java.util.*;

public class maximum_subarray_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4};
		int max = product_subarray_max(arr);
			System.out.print(max);

	}

	public static int product_subarray_max(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int previous_sum = 0;
			for (int j = i; j < arr.length; j++) {
				previous_sum += arr[j];
				ans = Math.max(previous_sum, ans);
			}
		}
		return ans;
	}

}
