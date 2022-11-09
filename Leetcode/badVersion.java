package Leetcode;

public class badVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int version = checkBadVersion(n);
		System.out.println(version);
	}

	public static int checkBadVersion(int n) {
		// TODO Auto-generated method stub
		int start = 1;
		int end = n;
		int ans = n;
		while (start<=end) {
			int mid = (start + (end - start )/2);
			if(isBadVersion(mid)) {
				ans = mid;
				end = mid -1;
			}else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
