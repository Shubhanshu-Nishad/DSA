package recursion;

public class subSequence {
	// static int count = 0;
	// 1st way
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(subSequence(str,""));

	}

	public static int subSequence(String ques,String ans) {
		// TODO Auto-generated method stub
		
		if(ques.length()==0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		// bc,_ and bc,a
		int f1 = subSequence(ques.substring(1),ans);
		int f2 = subSequence(ques.substring(1),ans+ch);
		return f1 +f2;
		
	}

}
