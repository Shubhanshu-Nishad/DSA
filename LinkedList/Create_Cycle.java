package LinkedList;


public class Create_Cycle {
	class Node{
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	// O(1)
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(this.size==0) {
			head = nn;
			tail = nn;
			size++;
		}else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	// O(1)
	public void addlast(int item) {
		
		if(size==0) {
			addFirst(item);
		}else {
			Node nn = new Node();
			nn.val = item;
			tail.next=nn;
			tail = nn;
			size++;
		}
	}
	// O(n)
	public void display() {
		Node temp = head;
		while (temp!=null) {
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	// O(n)
	public void AddatIndex(int item,int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Fucking basterd keep your asshole short");
		}
		if(k==0) {
			addFirst(item);
		}else if(k==size) {
			addlast(item);;
		}else {
			Node k_1th = GetNode(k-1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}
	public int getFirst() {
		return head.val;
	}
	
	public int getLast() {
		return tail.val;
	}
	
	public int getindex(int k ) throws Exception {
		return GetNode(k).val;
	}
	private Node GetNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Fucking basterd keep your asshole short");
		}
		Node temp = head;
		for (int i = 1; i <=k ; i++) {
			temp = temp.next;
		}
		return temp;
	}
	// O(1)
	public int removefirst() {
		Node temp = head;
		if(size==1) {
			head = null;
			tail = null;
			size--;
		}else {
			head = head.next;
			temp.next=null;
			size--;
		}
		return temp.val;
	}
	
	public int removelast() throws Exception{
		Node temp = head;
		if(size==1) {
			return removefirst();
		}else {
			Node ss = GetNode(this.size-2);
			int rv = tail.val;
			tail =ss;
			tail.next = null;
			size--;
			return rv;
		}
	}
	
	public int removeatindex(int k) throws Exception {
		if(k==0 ) {
			return removefirst();
		}else if(k == size-1 ) {
			return removelast();
		}else {
			Node prev = GetNode(k-1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			return curr.val;
		}
	}
	
	public void CreateCycle() throws Exception{
		tail.next = GetNode(3);
	}
	
	public boolean hascycle() {
		Node fast = head;
	    Node slow = head;
	    while(fast !=null && fast.next !=null) {
	    	slow = slow.next;
	    	fast = fast.next.next;
	    	if(slow == fast )
	    		return true;
	    }
	    return false;
	}
	
	public Node meetingPoint() {
		Node fast = head;
	    Node slow = head;
	    while(fast !=null && fast.next !=null) {
	    	slow = slow.next;
	    	fast = fast.next.next;
	    	if(slow == fast )
	    		return slow;
	    }
	    return null;
	}
	
	public void FloydCycleremovel() {
		Node slow = meetingPoint();
		if(slow == null)
			return;
		Node fast = this.head;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next=null;
	}
	
}
