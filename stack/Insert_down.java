package stack;

import java.util.Stack;

public class Insert_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert_down(st,-4);
		System.out.println(st);
	}

	private static void Insert_down(Stack<Integer> st, int n) {
		// TODO Auto-generated method stub
		if(st.size()==0) {
			st.push(n);
			return;
		}
		int k = st.pop();
		Insert_down(st,n);
		st.push(k);
	}

}
