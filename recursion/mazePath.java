package recursion;

public class mazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2;
		int n = 2;
		mazePath(m-1,n-1,0,0,"");
	}

	private static void mazePath(int er, int ec, int cr, int cc, String ans) {
		// TODO Auto-generated method stub
		if(er == cr && ec == cc) {
			System.out.print(ans+" ");
			return;
		}
		if(cr > er || cc > ec ) {
			return;
		}
		mazePath(er,ec,cr,cc+1,ans+"H");
		mazePath(er,ec,cr+1,cc,ans+"V");
	}
}
