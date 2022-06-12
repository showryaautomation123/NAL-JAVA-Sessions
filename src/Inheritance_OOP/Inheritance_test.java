package Inheritance_OOP;

public class Inheritance_test {

	public static void main(String[] args) {
		
		
		BMW obj=new BMW();
		obj.research();
		obj.engine();
		obj.seatingCapacity();
		
		Car c=new Car();
		c.brakes();
		
//		//Top Casting
		Science sc=new Car();
		sc.research();
	      ((Car) sc).start();
//	    
//	    ((Car) sc).seatingCapacity();
//	    ((Vehicle) sc).brakes();
//	    ((Physics) sc).force();
//	    ((Mechanical) sc).design();
//	    ((BMW) sc).monogram();
//	    
//	    
	}

}
