package recursion;

import java.util.ArrayList;

public class find_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,54,5,6,7,3,4,6,7,23,4};
		System.out.println(index_first(arr,0,7));
		ArrayList<Integer> ls = new ArrayList<Integer>();
		System.out.println(all_occurence(arr,0,7,ls));
	}

	private static ArrayList<Integer> all_occurence(int[] arr, int i, int target ,ArrayList<Integer> ls) {
		// TODO Auto-generated method stub
		if( i == arr.length)
			return ls;
		
		if(arr[i]==target)
			ls.add(i);
		
		
		return all_occurence(arr, i+1, target, ls);
	}

	private static int index_first(int[] arr,int i, int target) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return -1;
		}
		if(arr[i] == target) {
			return i;
		}
		
		return index_first(arr, i+1, target);
	}

}
