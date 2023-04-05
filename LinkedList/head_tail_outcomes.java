package LinkedList;

public class head_tail_outcomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printHeadTail2(3,""));
		System.out.println(printHeadTail(3,""));
		
	}

	private static int printHeadTail(int n, String ans) {
		// TODO Auto-generated method stub
		
		if(ans.length() == n ) {
			System.out.print(ans+" ");
			return 1;
		}
		int count1 = printHeadTail(n,ans+'T');
		int count2 = printHeadTail(n, ans+'H');
		return count1 + count2;
	}

	
	private static int printHeadTail2(int n, String ans) {
		// TODO Auto-generated method stub
		 
		if(n == 0 ) {
			System.out.print(ans+" ");
			return 1;
		}
		int count1 = printHeadTail2(n-1,ans+'T');
		int count2 = printHeadTail2(n-1, ans+'H');
		return count1 + count2;
	}
}
