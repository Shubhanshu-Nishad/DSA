package Questions;
import java.util.*;
public class do_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			System.out.println("Do you want more addition ? if yes press true otherwise false ");
			flag = sc.nextBoolean();
		} while (flag);

	}

}
