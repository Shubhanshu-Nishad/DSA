package LinkedList;

public class Polynomial_Addition {
	
	 // Definition for polynomial singly-linked list.
	  class PolyNode {
	      int coefficient, power;
	      PolyNode next = null;

	      PolyNode() {}
	      PolyNode(int x, int y) { this.coefficient = x; this.power = y; }
	      PolyNode(int x, int y, PolyNode next) { this.coefficient = x; this.power = y; this.next =
	 next; }
	  }
	 

	//Print the polynomial formed by adding both LL in the function itself.
	class Solution{
		public PolyNode addPoly(PolyNode p1, PolyNode p2) {
        	PolyNode dummyNode = new PolyNode();
        	PolyNode currNode = dummyNode;
        	while(p1.next !=null && p2.next!=null) {
        		if( p1.power == p2.power  ) {
        			if(p1.coefficient + p2.coefficient !=0 ) {
        				PolyNode nn = new PolyNode(p1.coefficient + p2.coefficient , p1.power);
        				currNode.next = nn;
        				currNode = currNode.next;
        			}
        			p1 = p1.next;
            		p2 = p2.next;
        		}else if(p1.power > p2.power ) {
        			PolyNode nn = new PolyNode(p1.coefficient, p1.power);
        			currNode.next = nn;
        			currNode = currNode.next;
        			p1 = p1.next;
        		}else {
        			PolyNode nn = new PolyNode(p2.coefficient, p2.power);
        			currNode.next = nn;
        			currNode = currNode.next;
        			p2 = p2.next;
        		}
        		
        	}
        	 if (p1 != null)
                 currNode.next = p1;
             if (p2 != null)
                 currNode.next = p2;
    		
        	return dummyNode.next;
    	}
	}
}
