package coding_blocks;

public class Karthik_bhayai_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbbabbbabbbab";
		int k = 3;
		int flipa = maximumLength(str,k,'a');
		int flipb = maximumLength(str,k,'b');
		System.out.println(Math.max(flipa, flipb));

	}

	private static int maximumLength(String str, int k, char c) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int ans = 0;
		int flip=0;
		while(ei<str.length()) {
			// window grow
			if(str.charAt(ei)==c) {
				flip++;
			}
			// window shrink
			while(flip>k && si<=ei) {
				if(str.charAt(ei)==c) {
					flip--;
				}
				si++;
			}
			
			// ans update
			ans = Math.max(ans, ei-si +1 );
			ei++;
		}
		return ans;
	}

}
