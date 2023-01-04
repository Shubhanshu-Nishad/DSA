package sliding_window;

public class MinimumWinodwSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(MinimumWinodwSize(s,t));

	}

	public static String MinimumWinodwSize(String s, String t) {
		// TODO Auto-generated method stub
		int[] freq_t = new int[256];
		int[] freq_s = new int[256];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freq_t[ch]++;
		}
		
		int count =0;
		int start = 0;
		int min_len = Integer.MAX_VALUE;// 2^31-1
		int start_Index = -1;
		
		for (int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);
			freq_s[ch]++;
			if(freq_s[ch]<=freq_t[ch]) {
				count++;
			}
			
			// window shrink
			if(count==t.length()) {
				
				while(freq_s[s.charAt(start)] > freq_t[s.charAt(start)] || freq_t[s.charAt(start)] == 0 ) {
					if(freq_s[s.charAt(start)] > freq_t[s.charAt(start)])
						freq_s[s.charAt(start)]--;
					start++;
				}
				
				//  ans update
				min_len = Math.min(min_len,end-start+1);
				start_Index=start;		
			}
		}
		if(start_Index==-1)
			return "";
		else
			return s.substring(start_Index,start_Index+min_len);
	}

}
