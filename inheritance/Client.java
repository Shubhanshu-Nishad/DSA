package inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case 1 
//		P obj = new P(); 
//		System.out.println(obj.d); // 1
//		System.out.println(obj.d1); // 10 
//		obj.fun();
//		obj.fun1();
		// case 
//		P obj = new C();
//		System.out.println(obj.d); // 1
//		System.out.println(obj.d1); // 10
////		System.out.println(obj.d2); // compile time d2 is not readable but it is readable in runtime  let's see how we can access it.
//		System.out.println(((C)(obj)).d2); // 
//		System.out.println(((C)(obj)).d); //  2
//		obj.fun(); // fun in C
//		obj.fun1(); // fun1 in P // we have created first blue print of P class that why it gives this output
//		((C)(obj)).fun2(); // compile time compile can see only P class object but in runtime it's visible so we have to type cast so that it is visible in compiler time
//		
		
//		case 3
//		C obj = new P(); // third case is not possible lol
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2); // compiler time error is better than runtime error
		
		// case 4
		C obj = new C(); // third case is not possible lol
		System.out.println(obj.d); // 2
		System.out.println(obj.d1); // 10
		System.out.println(obj.d2); // 20
		System.out.println(((P)(obj)).d); // 1
		// compiler time error is better than runtime error
		
	//	((p)(obj)).fun(); // we can't access fun of p class 
		obj.fun();
		obj.fun1();
		obj.fun2();
		
		
	}

}
