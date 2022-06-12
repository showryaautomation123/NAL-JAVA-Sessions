package Assignments;

public class MethodsConcept {
	
	public double getArea(int r) {
		double area=3.14*r*r;
		double circumference=2*3.14*r;
		System.out.println("Area of circle is:"+ area );
		System.out.println("circumference of circle is:"+ circumference);
		return area;
	}

	public static void main(String[] args) {

		MethodsConcept mc=new MethodsConcept ();
		mc.getArea(5);

	}

}
