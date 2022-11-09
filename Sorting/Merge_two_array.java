package Sorting;

public class Merge_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,6,8,12,17,18,22,45,67}; // 3k
		int[] other = {3,6,7,16,43}; // 7k 
		int[] merge = mergetwoSortedArray(arr,other);
		for(int i=0;i<merge.length;i++)
			System.out.print(merge[i]+" ");
		System.out.println();
		merge = Merge_two_array(arr,other);
		for(int i=0;i<merge.length;i++)
			System.out.print(merge[i]+" ");

	}

	public static int[] Merge_two_array(int[] arr, int[] other) {
		// TODO Auto-generated method stub
		int n = arr.length ;
		int m =  other.length;
		int[] ans = new int[n+m];
		int i = 0; // arr
		int j = 0; // other
		int k = 0; // ans
		while(i<n && j < m) {
			if(arr[i] < other[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			}else {
				ans[k] = other[j];
				j++;
				k++;
			}
		}
		while(i < n) {
			ans[k]=arr[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=other[j];
			j++;
			k++;
		}
		
		
		return ans;
	}
	
	
	public static int[] mergetwoSortedArray(int[] arr, int[] arr1) {
		int n = arr.length;
		int m = arr1.length;
		int[] ans = new int[n + m];

		int i = 0;//arr
		int j = 0;// arr1
		int k = 0;// ans
		while (i < n && j < m) {
			if (arr[i] < arr1[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = arr1[j];
				j++;
				k++;
			}
		}

		while (i < n) {
			ans[k] = arr[i];
			i++;
			k++;
		}

		while (j < m) {
			ans[k] = arr1[j];
			j++;
			k++;
		}

		return ans;
	}
}
