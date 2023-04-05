package LinkedList;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Board_path(4,0,""));
	}

	private static int Board_path(int end, int curr, String ans) {
		// TODO Auto-generated method stub
		if(curr == end) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		
		int fp = Board_path(end, curr+1,ans+1);
		int sp = Board_path(end, curr+2,ans+2);
		int tp = Board_path(end, curr+3,ans+3);
		
		return fp+sp+tp;
		
	}

}
