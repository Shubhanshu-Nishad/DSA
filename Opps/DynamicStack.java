package Opps;

public class DynamicStack extends stack{
	@Override 
	public void push(int item) throws Exception {
		if(this.isFull()) {
			int[] a = new int[2*data.length];
			for (int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			data = a;
		}
		super.push(item);
	}
	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
	}
}
