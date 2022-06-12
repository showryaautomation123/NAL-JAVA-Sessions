package JavaAssignments;

import java.util.ArrayList;

public class ArrayListAssignment1 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(400);
		marks.add(900);
		marks.add(300);
		System.out.println(marks);
		ArrayList<String> students=new ArrayList<String>();
		students.add("Apple");
		students.add("Ballon");
		students.add("castle");
		students.add("Dolphin");
		students.add("ELephant");
		System.out.println(students);
		ArrayList<Object> emp=new ArrayList<Object>();
		emp.add("Alex");
		emp.add(25);
		emp.add('M');
		emp.add(50.55);
		emp.add("Admin");
		System.out.println(emp);
		emp.addAll(students);
		System.out.println(students);
		System.out.println(emp);
		
		ArrayList<Double> emp1=new ArrayList<Double>();
		emp1.add(23.88);
		emp1.add(25.00);
		emp1.add(40.0);
		emp1.add(50.55);
		emp1.add(10.00);
		System.out.println(emp1);
		
		ArrayList<Character> Vowels=new ArrayList<Character>();
		Vowels.add('a');
		Vowels.add('e');
		Vowels.add('i');
		Vowels.add('o');
		Vowels.add('u');
		System.out.println(Vowels);
		Vowels.addAll(Vowels);
		
		
		
		
		
		

	}

}

