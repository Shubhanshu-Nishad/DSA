package sliding_window;

public class productLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
		int k = 10;
		System.out.println(CountSubArray(arr,k));
	}

	public static int CountSubArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int ans =0;
		int p=1;
		while(ei<arr.length) {
			// window grow
			p *= arr[ei];
			// window shrik
			while(p>=k && si<=ei) {
				p /=arr[si];
				si++;
			}
			// calculate ans 
			ans = ans + ei -si +1;
			ei++;
		}
		return ans;
	}

}
