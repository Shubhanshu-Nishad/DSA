package recursion;

public class generateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateParanthesis(3,0,0,"");

	}

	private static void generateParanthesis(int n,int start,int end,String ans) {
		// TODO Auto-generated method stub
		if(start ==n && end == n) {
			System.out.print(ans+" ");
			return;
		}
		if(start<n)
		generateParanthesis(n,start+1,end,ans+"(");
		if(end<start)
			generateParanthesis(n,start,end+1,ans+")");
	}

}
