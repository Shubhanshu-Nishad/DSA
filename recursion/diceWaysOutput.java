package recursion;

public class diceWaysOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = Dice_path(10,0,"");
		System.out.println();
		System.out.println("Totoal ways is : "+count);
	}
	
	private static int Dice_path(int end, int curr, String ans) {
		// TODO Auto-generated method stub
		if(curr == end) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		int dp = 0;
		for (int i = 1; i < 7; i++) {
			dp += Dice_path(end, curr+i,ans+i);	
		}
		return dp;
		
	}
}
