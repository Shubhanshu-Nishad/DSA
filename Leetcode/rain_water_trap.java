package Leetcode;

public class rain_water_trap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,6,4,1};
		int capacity = raniwatertrap(arr);
		System.out.println(capacity);

	}

	public static int raniwatertrap(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = arr[0];
		// finding max height from left 
		for (int i = 1; i <n ; i++) {
			left[i] = Math.max(arr[i], left[i-1]);
		}
		// finding max value form right
		right[n-1] = arr[n-1];
		for (int i = n-2; i >=0 ; i--) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		// calculate area of water by sub form min of both side height
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int min = Math.min(left[i], right[i]);
			ans = ans + (min-arr[i]);
		}
		return ans;
	}

}
