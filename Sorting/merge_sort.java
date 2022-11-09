package Sorting;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1,0,-11}; // 3k
		arr = merge_sort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] merge_sort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si == ei ) {
			int [] bs = new int [1];
			bs[0]=arr[si];
			return bs;
		}
		
		
		int mid = (si +ei )/2;
		int[] fa = merge_sort(arr, si,mid);
		int[] sa = merge_sort(arr, mid+1, ei);
		
		return Merge_two_array(fa, sa);
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

}
