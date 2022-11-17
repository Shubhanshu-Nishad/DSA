package Opps;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue qq = new Queue();
		qq.Enqueue(11);
		qq.Enqueue(12);
		qq.Enqueue(13);
		qq.Enqueue(14);
		qq.Enqueue(15);
		System.out.println(qq.getFront());
		qq.Display();
		System.out.println(qq.Dequeue());//15
		System.out.println(qq.Dequeue());// 14
		qq.Enqueue(16);// 16
		qq.Display();
		qq.Enqueue(17); // 17
		qq.Display();
//		//qq.Enqueue(18);
//		System.out.println(qq.Dequeue());//15
//		System.out.println(qq.Dequeue());// 14
		qq.Display2();
	}

}
