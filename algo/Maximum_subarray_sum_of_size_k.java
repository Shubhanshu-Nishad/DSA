package algo;

public class Maximum_subarray_sum_of_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,2,4,4,5,6};
		int k = 3;
		System.out.println(sliding_window(arr,k));

	}

	private static int sliding_window(int[] nums, int k) {
		// TODO Auto-generated method stub
		
        int sum = 0;
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int ans = sum;
        for(int i = k;i<nums.length;i++){
            sum +=nums[i]; // window grow
            sum = sum - nums[i-k]; // window small
            ans = Math.max(sum,ans); // ans update
        }
		return ans;
	}

}
