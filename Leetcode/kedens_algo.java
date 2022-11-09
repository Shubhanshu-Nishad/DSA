package Leetcode;

public class kedens_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-12,-12,3,4,-9,7,4,-3};
		int max = keden_algo(arr);
		System.out.println(max);
	}

	public static int keden_algo(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int prev_Sum = 0;
		for (int i = 0; i < arr.length; i++) {
			prev_Sum += arr[i];
			ans = Math.max(ans, prev_Sum);
			if(prev_Sum<0)
				prev_Sum =0;
			
		}
		return ans;
	}

}
