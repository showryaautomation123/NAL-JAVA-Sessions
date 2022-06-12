package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignments {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(400);
		marks.add(900);
		marks.add(300);
		System.out.println(marks);
		System.out.println("*******Array List After Swapping***********");
		Collections.swap(marks, 1,3);
		System.out.println(marks);
//		for(int e:marks) {
//			System.out.println(e);
//		}
		System.out.println("******************");
		System.out.println(marks.get(0));
		System.out.println("******************");
		marks.add(5, 80);
		System.out.println(marks.get(5));
		System.out.println("******************");
		System.out.println(marks.size());
		System.out.println("******************");
		for(int i=0;i<marks.size();i++) {
			if(i>0 && i<5)
			{
				System.out.println(marks.get(i));
			}
		}
		System.out.println("******************");
		ArrayList<String> students=new ArrayList<String>();
		students.add("Apple");
		students.add("Ballon");
		students.add("castle");
		students.add("Dolphin");
		students.add("ELephant");
		System.out.println(students);
		students.add(students.size(),"hello");
		System.out.println(students);
        
		for(int i=0;i<students.size();i++) {
			if(students.get(i).equals("Dolphin")) {
				students.remove(i);
				students.add(i, "Dinosaur");
			}
			
		}
		System.out.println(students);
		
		for(int i=0;i<students.size();i++) {
			System.out.println("students at   "+i+"    "+students.get(i));
		}

		

}
	
}
