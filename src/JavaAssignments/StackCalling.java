package JavaAssignments;

public class StackCalling {

	
	public static void test() {
		System.out.println("this is test method");
		test1();
	}
	
	public static void test1() {
		System.out.println("this is test1 method");
		test2();
	}
	
	public static void test2() {
		System.out.println("thisi is test2 method");
		test();
	}
	public static void main(String[] args) {
		test();

	}

}
