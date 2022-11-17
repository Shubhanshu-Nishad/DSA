package Opps;

public class stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack s = new stack();
		s.push(50);
		s.push(51);
		s.push(52);
		s.push(53);
		s.push(54);
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
		s.push(61);
		//s.push(62);
		s.display();

	}

}
