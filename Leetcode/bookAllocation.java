package Leetcode;

public class bookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pages = {10,20,30,40};
		int nos = 2;
		int max = Book_Allocation(pages,nos);
		System.out.println(max);

	}

	private static int Book_Allocation(int[] pages, int nos) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		for (int i = 0; i < pages.length; i++) 
			end += pages[i];
		// apply binary search
		int ans = 0;
		while(start<=end) {
			int mid = (start+end)/2;
			if(isItPossible(pages,nos,mid)) {
				ans = mid;
				end = mid-1;
			}
			else 
				start = mid +1;
		}
		return ans;
	}

	public static boolean isItPossible(int[] pages, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int read_pages = 0;
		int i =0;
		while(i<pages.length) {
			if(read_pages + pages[i]<=mid) {
				read_pages += pages[i];
				i++;
			}
			else {
				student++;
				read_pages = 0;
			}
			if(student>nos)
				return false;
		}
		
			return true;
		
	}

}
