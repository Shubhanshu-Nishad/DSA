package coding_blocks;

public class Maximum_circular_subarry_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-8 ,-8, -9, -9, -10, -11, -12};
		int sum = CircularSubarraySum(arr);
		System.out.print(sum);
	}

	private static int CircularSubarraySum(int[] arr) {
		// TODO Auto-generated method stub
		int linear_Sum = kedens_algo(arr);
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum +=arr[i];
			arr[i] = -1 * arr[i];
		}
		int Inverted_Sum = kedens_algo(arr);
		
		int circular_sum = Inverted_Sum + sum;
		
		
		return Math.max(linear_Sum, circular_sum);
	}
	
	public static int kedens_algo(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int prev_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			prev_sum += arr[i];
			ans = Math.max(ans, prev_sum);
			if(prev_sum <0 )
				prev_sum = 0;
		}
		return ans;
	}
}
