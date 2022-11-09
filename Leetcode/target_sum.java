package Leetcode;

import java.util.Arrays;

public class target_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(arr);
		target_Sum_triplet(arr, 10);

	}
	public static void target_Sum(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		while (start<=end) {
			if(arr[start]+arr[end]==target) {
				System.out.println(arr[start]+" "+arr[end]);
				start++;
				end--;
			}else if(arr[start]+arr[end]>target) {
				end--;
			}else {
				start++;
			}
		}
	}
	
	public static void target_Sum_triplet(int[] arr,int sum) {
		for(int i=0; i<arr.length-2; i++) {
			int target= sum - arr[i];
			int start = i+1;
			int end = arr.length-1;
			while (start<=end) {
				if(arr[start]+arr[end]==target) {
					System.out.println(arr[i]+" "+arr[start]+" "+arr[end]);
					start++;
					end--;
				}else if(arr[start]+arr[end]>target) {
					end--;
				}else {
					start++;
				}
			}
		}
	}

}
