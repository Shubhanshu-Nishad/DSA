package Leetcode;

import java.util.Scanner;

public class Painter_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nop = sc.nextInt();
		int nob = sc.nextInt();
		
		int[] board = new int[nob];
		for (int i = 0; i < board.length; i++) {
			board[i] = sc.nextInt();
		}
		System.out.println(Painter(board,nop));
 	}

	public static int Painter(int[] board, int nop) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		for (int i = 0; i < board.length; i++) {
			end += board[i];
		}
		int ans = 0;
		System.out.println(start+" "+end);
		while (start<=end) {
			
			int mid = (start + end)/2;
			System.out.println(start+" "+end+" "+mid+" "+ans);
			if(isItpossible(board,nop,mid)) {
				
				ans = mid;
				end = mid -1;
			}else {
				start = mid+1;
			}
		}
		return ans;
	}

	public static boolean isItpossible(int[] board, int nop, int mid) {
		// TODO Auto-generated method stub
		int painter = 1;
		int board_paint = 0;
		int i =0;
		while(i<board.length) {
			if(board_paint+board[i]<=mid) {
				board_paint+=board[i];
				i++;
			}
			else {
				painter++;
				board_paint = 0;
				
			}
			if(painter>nop) {
				return false;
			}
		}
		return true;
	}

}
