package ExceptionHandling;

public class ThrowsKeyword {
	
	public void test() {
		System.out.println("test method");
		test1();
	}
	
	public void test1() {
		
		try {
		int marks=100/0;
	}
	catch(Exception e) {
		System.out.println("this test1 method");}
		test2();
	}
	public void test2()  {
	
		System.out.println("this is test2");
	
	}

	public static void main(String[] args) {
		ThrowsKeyword obj=new ThrowsKeyword();
		
		obj.test();
		
		
	}

}
