package Sorting;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,111,0,-11}; // 3k
		insertion_sorting(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void insertion_sorting(int[] arr) {
		// TODO Auto-generated method stub
		for (int counter = 1; counter < arr.length; counter++) {
			int item = arr[counter];
			int j = counter - 1;
			while ( j>=0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;
		}
	}

	
}
