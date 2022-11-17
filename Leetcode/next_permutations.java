package Leetcode;

public class next_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,5};
		next_permutations(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	private static void next_permutations(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		//  finding first last decreasing number 
		int pos = 0;
		for (int i = n-2; i >=0; i--) {
			if(arr[i]<arr[i+1]) {
				pos = i;
				break;
			}
			
		}
		int q = 0;
		for (int i = n-1; i >=0; i--) {
			if(arr[i]>arr[pos]) {
				q = i;
				break;
			}
			
		}
		if(pos == 0 && q == 0) {
			reverser_range(arr,0,n-1);
			return;
		}
		swap(arr, pos, q);
		reverser_range(arr, pos+1, n-1);
			
		
	}

	private static void reverser_range(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while(start<=end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
