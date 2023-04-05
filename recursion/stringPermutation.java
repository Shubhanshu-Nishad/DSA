package recursion;

public class stringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringPermutation("abc","");

	}

	private static void stringPermutation(String ques, String ans) {
		// TODO Auto-generated method stub
		if(0 == ques.length()) {
			System.out.print(ans+" ");
			return;
		}
		
		for (int i = 0; i < ques.length(); i++) {
			stringPermutation(ques.substring(0,i)+ques.substring(i+1) ,ans+ques.charAt(i));
		}
	}
	
	
	
}
