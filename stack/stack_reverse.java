package stack;

import java.util.Stack;

public class stack_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse_For(st);
		System.out.println(st);
	}
	
	public static void reverse_For(Stack<Integer> st) {
		for (int i = 0; i < st.size()/2; i++) {
			int k = st.peek();
			Insert_down(st,k);
			st.pop();
		}
	}
	
	private static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.size()==0) {
			return;
		}
		int x = st.pop();
		Reverse(st);
		Insert_down(st,x);
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
