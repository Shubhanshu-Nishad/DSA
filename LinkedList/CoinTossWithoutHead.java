package LinkedList;

public class CoinTossWithoutHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHeadTail(5,"");
		System.out.println();
	}
	private static void printHeadTail(int n, String ans) {
		// TODO Auto-generated method stub
		
		if(ans.length() == n ) {
			System.out.println(ans);
			return;
		}
		
		printHeadTail(n,ans+'T');
		if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') {
			printHeadTail(n, ans+'H');
		}
	}

}
