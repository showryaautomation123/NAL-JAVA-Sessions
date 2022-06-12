package Assignments;

public class IfAssignment {

	public static void main(String[] args) {


		int marks=95;
		if(marks<=100) {
			
			if(marks>90) {
				System.out.println("Grade AA");
			}
			else if(marks>80) {
				System.out.println("Grade AB");
			}
			else if(marks>70) {
				System.out.println("Grade BB");
			}
			else if(marks>60) {
				System.out.println("Grade CC");
			}
			else if(marks>50) {
				System.out.println("Grade Cd");
			}
			else if(marks>40) {
				System.out.println("Grade DD");
			}
			else if(marks<=40) {
				System.out.println("Fail");
			}
		}
	}
}

