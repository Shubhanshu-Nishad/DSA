package array;

public class spiral_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					};
		spiral_print(arr);
	}

	private static void spiral_print(int[][] arr) {
		// TODO Auto-generated method stub
		int minr=0;
		int maxr= arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		int total=arr.length*arr[0].length;
		int count=0;
		while(total>count) {
			// 0th  row and  0th col to arr[0].length-1 --> row is fixed col changes from 0 to maxc
			for (int i = minc; i <=maxc; i++) {
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			// last col and 1th row to arr.length -1 ---> col is fixed , row will change
			for (int i = minr; i <= maxr; i++) {
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			// arr.length-2 th  row and  arr[0].length-2 to  0th col --> row is fixed col changes from  maxc to 0
			for (int i = maxc; i >= 0; i--) {
				System.out.print(arr[maxr][i]+" ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr; i--) {
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			minc++;
		}
	}

}
