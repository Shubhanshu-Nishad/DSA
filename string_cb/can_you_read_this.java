package string_cb;

public class can_you_read_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IAmACompetitiveProgrammer";
		can_you_read_this(str);
	}

	private static void can_you_read_this(String str) {
		// TODO Auto-generated method stub
		String ans="";
		ans = ans + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z' ) {
				System.out.println(ans);
				ans="";
				ans =ans+ch;
			}else {
				ans =ans+ch;
			}
			
		}
	}

}
