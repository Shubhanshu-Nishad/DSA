package Opps;

public class Queue {
	protected int[] data;
	protected int front = 0;
	private int size =0;
	
	public Queue() {
		data = new int[5];
	}
	public Queue(int cap) {
		data = new int[cap];
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == data.length;
	}
	public int size() {
		return size;
	}
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("sun be this is full");
		}
		int i = (front + size)%data.length;
		data[i] = item;
		size++;
	}
	
	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("sun be this is Empty");
		}
		front = front % data.length;
		int rv = data[front];
		front++;
		size--;
		return rv;
	}
	public int getFront() throws Exception {
		if(isEmpty()) {
			throw new Exception("sun be this is Empty");
		}
		return data[front];
	}
	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i)%data.length; 
			System.out.print(data[idx]+" ");
		}
		System.out.println();
	}
	public void Display2() {
		for (int i = 0; i < size; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
