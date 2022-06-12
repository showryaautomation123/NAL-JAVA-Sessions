package ExceptionHandling;

public class ExceptionConcept {
	String name;

	public static void main(String[] args) {
		
		try{
			int num=5/0;
			ExceptionConcept obj=new ExceptionConcept();
			obj=null;
			obj.name="Karan";
			System.out.println(obj.name);
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled");
			e.printStackTrace();
		}
	
		//System.out.println("hello");
//		try{
//			ExceptionConcept obj=new ExceptionConcept();
//		obj=null;
//		obj.name="Karan";
//		System.out.println(obj.name);
//		}
		catch(NullPointerException e){
			System.out.println("nullpointer exception handling");
			e.printStackTrace();
			
		}
	}

}
