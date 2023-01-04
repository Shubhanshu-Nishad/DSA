package Opps;

public class stack {
	protected int[] data;
	private int top = -1;
	public stack() {
		this.data = new int[5];
		
	}
	public stack(int cap) {
		this.data = new int[cap];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public  boolean isFull() {
		return top==data.length-1;
	}
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Sun be yeah kya kar rha hain tu pagal...");
		}
		top++;
		data[top] = item;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Sun be yeah kya kar rha hain tu pagal... stack mein koi element nhi h");
		}
		top--;
		return data[top+1];
	}
	
	public int peek() {
		return this.data[top];
	}
	public int size() {
		return top;
	}
	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}


