package Inheritance_OOP;

public class Car extends Vehicle {
	public void test() {
		System.out.println("test the car features");
	}
	public void start() {
		System.out.println("strat the car ");
	}
	public void stop() {
		System.out.println("stop the car");
	}
	public void wheels() {
		System.out.println("all wheel car");
	}
	
	@Override
	public void research() {
		System.out.println("research....cars");
	}
	private void engine() {
		System.out.println("car engine mechanism");
	}

	public final void seatingCapacity() {
		System.out.println("car...seating capacity");
	}
}
