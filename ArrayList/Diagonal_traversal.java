package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diagonal_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public int[] findDiagonalOrder(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int i=0;
		int[] ans = new int[n*m];
		for (int d = 0; d < n+m-1; d++) {
			int r =0;
			int c = 0;
			if(d<m) {
				r=0;
				c=d;
			}else {
				c=m-1;
				r=d-m+1;
			}
			ArrayList<Integer> ls = new ArrayList<>();
			while(r<n || c>=0) {
				ls.add(mat[r][c]);
				c--;
				r++;
			}
			if(d%2==0)
				Collections.reverse(ls);
			for(int val : ls ) {
				ans[i] = val;
				i++;
			}
		}
		return ans;
	}
}
