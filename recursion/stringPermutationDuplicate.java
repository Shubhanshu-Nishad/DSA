package recursion;

public class stringPermutationDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringPermutationDuplicate("ABCA","");
	}
	private static void stringPermutationDuplicate(String ques, String ans) {
		// TODO Auto-generated method stub
		if(0 == ques.length()) {
			System.out.println(ans+" ");
			return;
		}
		
		
		
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean flag = true;
			for (int j = i+1; j < ques.length(); j++) {
				if(ch == ques.charAt(j)) {
					flag = false;
					break;
				}
			}
			String ros= ques.substring(0,i)+ques.substring(i+1) ;
			if(flag)
				stringPermutationDuplicate(ros,ans+ch);
		}
	}
}
