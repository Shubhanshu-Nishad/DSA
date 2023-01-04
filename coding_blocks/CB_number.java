package coding_blocks;

import java.util.*;

public class CB_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String str = "81615";
		int count = maximumCBnumber(str);
		System.out.println(count);
	}
	public static int maximumCBnumber(String str) {
		// TODO Auto-generated method stub
		
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() -len ; si++) {
				int ei = si+len;
				String st = str.substring(si,ei);
				//System.out.println(st);
				if(isCBnumber(Long.parseLong(st)) == true && isvisited(visited,si,ei)== false) {
					for (int i = si; i < ei; i++) {
						visited[i] = true;
					}
					count++;
				}
				
			}
		}
		return count;
	}
	
	
	public static boolean isvisited(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for(int i = si; i < ei; i++) {
			if( visited[i] == true)
				return true;
		}
		return false;
	}
	
	
	public static boolean isCBnumber(Long n) {
		if(n==0 || n==1)
			return false;
		
		int[] cb = {2,3,5,7,11,13,17,19,23,29};
		
		for(int i=0;i<cb.length;i++) {
			if(n==cb[i])
				return true;
		}
		
		for(int i=0;i<cb.length;i++) {
			if(n%cb[i]==0)
				return false;
		}
		
		return true;
		
	}
	
	
	

	
}
