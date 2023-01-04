package Leetcode;

public class Subarray_Product_Less_Than_K_744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,2,6};
		int k = 100;
		System.out.println(Subarray_Product(arr,k));

	}

	private static int Subarray_Product(int[] arr, int k) {
		// TODO Auto-generated method stub
		int si =0;
		int ei=0;
		int ans = 0;
		int p = 1;
		while(ei<arr.length) {
			// Window grow
			p *=arr[ei];
			// Window shrink
			while(p>=k) {
				p /=arr[si];
				si++;
			}
				
			// ans update
			ans = ans + (ei -si + 1);
			ei++;
			
		}
		return ans;
	}

}
