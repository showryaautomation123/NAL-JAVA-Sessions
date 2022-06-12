package JavaAssignments;

public class StaticMethodConcept {
	
	String name;
	int price;
	String color;
	static int wheels=4;
	
	
	public static void m1() {
		System.out.println("this is m1 method");
		
	}
	public static void m2() {
		System.out.println("this is m2 method");
		
	}
	public static void m2(int a) {
		System.out.println("this is method m2 with value :" +a);
	}
	public static void m3() {
		System.out.println("this is m3 non static method");
		
	}

	public static void main(String[] args) {
		StaticMethodConcept obj=new StaticMethodConcept();
		obj.name="Honda";
		obj.price=2000;
		obj.color="white";
		
		StaticMethodConcept obj1=new StaticMethodConcept();
		obj1.name="BMW";
		obj1.price=5000;
		obj1.color="black";
		
		StaticMethodConcept obj2=new StaticMethodConcept();
		obj2.name="Toyota";
		obj2.price=4000;
		obj2.color="Blue";
		System.out.println(obj.wheels);
		System.out.println(StaticMethodConcept.wheels);
//		wheels=8;
//		System.out.println(StaticMethodConcept.wheels);
//		final int a=90;
//		System.out.println(a);
//		obj.m3();
//		StaticMethodConcept.m1();
		m1();
		main(args);
		
		
		
		
		
		

	}

}
