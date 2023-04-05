package Sorting;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0, y = 0, z = 1;
		boolean f = true;
		while (n > 0) {
		if (f) {
		x += Math.min(x, n);
		f = false;
		} else {
		y += Math.min(x, n);
		f = true;
		}
		n -= z;
		z += 4;
		}
		System.out.println(x + " " + y);
	}

}
