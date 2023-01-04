package sliding_window;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,7,11,3,2,1};
		int k = 3;
		MaxSum(arr,k);
	}
	public static void  MaxSum(int[] arr, int k) {
		int sum =0; 
		// 1st window
		for(int i=0;i<k;i++)
			sum +=arr[i];
		int ans =sum;
		for(int i=k;i<arr.length;i++) {
			sum +=arr[k]; // window grow
			sum -= arr[i-k]; // window shrink
			ans = Math.max(ans, sum);
 		}
		System.out.println(sum);
	}
}
