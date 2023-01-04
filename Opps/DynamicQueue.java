package Opps;

public class DynamicQueue extends Queue{
	
	@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int[] arr = new int[2*data.length];
			for(int i=0;i<data.length;i++) {
				int idx = (this.front + i) % this.data.length;
				arr[i] = data[idx];
			}
			this.data = arr;
			this.front = 0;
		}
		super.Enqueue(item);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(50);
		dq.Enqueue(51);
		dq.Enqueue(52);
		dq.Enqueue(53);
		dq.Enqueue(54);
		dq.Enqueue(55);
		dq.Enqueue(56);
		dq.Enqueue(57);
		dq.Display();
		dq.Dequeue();
		dq.Display();
		dq.Display2();
		dq.Enqueue(58);
		dq.Enqueue(59);
		dq.Display();

	}

}
