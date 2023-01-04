package string_cb;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String_Max_Frequency(str);
	}

	private static void String_Max_Frequency(String str) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch-97] = freq[ch-97]+1;
		}
		int max_i = 0;
		for (int i = 1; i < freq.length; i++) {
			if(freq[i]>freq[max_i])
				max_i=i;
		}
		char ch = (char) (max_i + 97) ;
		System.out.println(ch);
	}

}
