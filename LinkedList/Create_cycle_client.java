package LinkedList;

public class Create_cycle_client {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Create_Cycle ll = new Create_Cycle();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		ll.addlast(9);
		ll.display();
		ll.CreateCycle();
		System.out.println(ll.hascycle());
		ll.FloydCycleremovel();
		System.out.println(ll.hascycle());
		
		
	}
}
