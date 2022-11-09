package algo;

public class reverse_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8};
		int k = 50;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		brute_force(arr,k);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void brute_force(int[] arr, int k) {
		// TODO Auto-generated method stub
		k = k %arr.length;
		for(int i=0;i<k;i++) {
			int temp = arr[arr.length-1];
			for (int j = arr.length-2 ; j >=0 ; j--) {
				arr[j+1] = arr[j];
			}
			arr[0] = temp;
		}
	}

}
