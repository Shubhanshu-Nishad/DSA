package recursion;

public class LexicoCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		LexicoCounting(0,n);

	}

	private static void LexicoCounting(int curr, int end) {
		// TODO Auto-generated method stub
		if(curr>end) {
			return;
		}
		
		System.out.println(curr);
		
		int i=0;
		
		if(curr == 0)
			i = 1;
		
		for (; i <= 9; i++) {
			LexicoCounting(curr*10+i,end);
			
		}
		
	}

}
