package Sorting;

public class Quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1,0,-11}; // 3k
		Quick_sort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void Quick_sort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>=ei) {
			return;
		}
		int pi = pivot(arr,si,ei);
		Quick_sort(arr, si, pi-1);
		Quick_sort(arr, pi+1 , ei);
	}

	public static int pivot(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int pi = si;
		int pe = arr[ei];
		for(int i=si;i<ei;i++) {
			if(arr[i]<pe) {
				int temp = arr[i];
				arr[i] = arr[pi];
				arr[pi] = temp;
				pi++;
			}
		}
		
		int temp = arr[ei] ;
		arr[ei] = arr[pi];
		arr[pi] = temp;
		return pi;
	}
	
	
}
