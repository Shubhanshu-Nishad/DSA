package Sorting;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,111,0,-11}; // 3k
		selection_sorting(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selection_sorting(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		for(int counter=0;counter<n;counter++) {
			int min = counter;
			for(int i = counter+1;i<n;i++) {
				if(arr[i]<arr[min])
					min = i;
			}
			swap(arr, min, counter);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
