package JavaAssignments;

public class FunctionsConcept {
	
	public void test() {
		System.out.println("this is test method");
	}
	public int sum() {
		int a=20;
		int b=30;
		int c=a+b;
		//System.out.println(c);
		return c;
	}
	public int getStudentMarks(String studentName) {
		if(studentName.equalsIgnoreCase("Alex")) {
			System.out.println("student marks:"+studentName);
			return 90;
		}
		else if(studentName.equalsIgnoreCase("Fin")) {
			System.out.println("student marks");
			return 70;
		}
		else {
			System.out.println("student name not found:"  +studentName);
		}
		return 0;
	}

	public static void main(String[] args) {
		
		FunctionsConcept obj=new FunctionsConcept();
		obj.test();
		int sum = obj.sum();
		System.out.println(sum);
		System.out.println(obj.getStudentMarks("fin"));
	}

}
