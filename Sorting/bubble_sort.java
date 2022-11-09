package Sorting;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1,0,-11}; // 3k
		bubble_sorting(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void bubble_sorting(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int pass = 1;pass<n;pass++) {
			for(int j=0;j<n-pass;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
