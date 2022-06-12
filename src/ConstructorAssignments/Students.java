package ConstructorAssignments;

public class Students {

	String name;
	String id;
	String[] subjects;
	int marks;
	
	public Students(String name,String id) {
		
	}

	public Students(String name, String id, String[] subjects) {
		
		this.name = name;
		this.id = id;
		this.subjects = subjects;
	}

	public Students(String name, String id, String[] subjects, int marks) {
		
		this.name = name;
		this.id = id;
		this.subjects = subjects;
		this.marks = marks;
	}
	public void studentCredits( String name) {
		if(name=="Akash" || marks>90) {
			System.out.println("Grade A");
		}
		else if(name=="isha" || marks>70) {
			System.out.println("Grade B");
		}
		else if(name=="arav" || marks>80) {
			System.out.println("Grade AB");
		}
	
		else {
			System.out.println("student name not found:"+ name);
		}
		
		
	}
	
	

}
