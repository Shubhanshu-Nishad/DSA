package LinkedList;

public class LinkedList_Client {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		ll.addlast(9);
		ll.display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
//		ll.removefirst();
//		ll.removelast();
		ll.removeatindex(1);
		ll.display();
	}
}

