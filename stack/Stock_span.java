package stack;

import java.util.Stack;

public class Stock_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,1,3,5,5,8,7};
		int[] ans = Stockspan(arr);
	}

	private static int[] Stockspan(int[] arr) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()] ) 
				st.pop();
			if(!st.isEmpty())
				ans[i] = i - st.peek();
			else {
				ans[i] = i+1 ;
			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		return ans;
	}

}
