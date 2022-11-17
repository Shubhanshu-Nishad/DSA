package inheritance;

public class C extends P{
	int d =2;
	int d2 = 20;
	
	@Override // it is used to ensure that fun is override it gets tricky when bulk code is there
	public void fun() {
		System.out.println("Fun in C");
	}
	public void fun2() {
		System.out.println("Fun2 in C");
	}

}
