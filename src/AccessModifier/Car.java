package AccessModifier;

public class Car {
	protected int number=100;

	public void test() {
		System.out.println("this is car test method");
	}
	
	private void color() {
		System.out.println("this is car color");
	}
	
	 void wheels() {
		System.out.println("these are car wheels");
	}
	 
	 protected void autostart() {
		 System.out.println("this is car autostart");
	 }
	public static void main(String[] args) {
		Car c=new Car();
		c.test();
		c.autostart();
		c.color();
		c.wheels();

	}

}
