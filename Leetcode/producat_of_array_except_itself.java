package Leetcode;

public class producat_of_array_except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4};
		product(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}

	}

	public static void product(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		// finding left product
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		//  finding product of right arry 
		right[n-1] = 1;
		for (int i = n-2; i >=0; i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		//  save product in array
		for (int i = 0; i < n; i++) {
			arr[i] = left[i]*right[i];
		}
		
	}

}
