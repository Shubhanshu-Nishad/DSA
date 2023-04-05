package recursion;

public class keyPaid {
	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
		printKeyPaid(str, "");
	}
	private static void printKeyPaid(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0); // '1' --> 49
		String pressString = key[ch - 48]; // ch --> 49
		for (int i = 0; i < pressString.length(); i++) {
			printKeyPaid(ques.substring(1),ans+ pressString.charAt(i));
		}
		
	}

}
