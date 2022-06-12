package Assignments;

public class Students {
	String StudentName;
	int marks;
    char Grade;

	public static void main(String[] args) {
		Students u1=new Students();
		u1.StudentName="Alex";
		u1.marks=90;
		u1.Grade='A';
		
		Students u2=new Students();
		u2.StudentName="Brad";
		u2.marks=65;
		u2.Grade='C';
		
		Students u3=new Students();
		u3.StudentName="chloe";
		u3.marks=80;
		u3.Grade='B';
		
		Students u4=new Students();
		u4.StudentName="David";
		u4.marks=30;
		u4.Grade='F';
		
		u1=u2;
		System.out.println(u1.StudentName+" "+u1.marks+" "+u1.Grade);
		System.out.println(u2.StudentName+" "+u2.marks+" "+u2.Grade);
		System.out.println(u3.StudentName+" "+u3.marks+" "+u3.Grade);
		System.out.println(u4.StudentName+" "+u4.marks+" "+u4.Grade);
		u2=u3;
		System.out.println(u1.StudentName+" "+u1.marks+" "+u1.Grade);
		System.out.println(u2.StudentName+" "+u2.marks+" "+u2.Grade);
		System.out.println(u3.StudentName+" "+u3.marks+" "+u3.Grade);
		System.out.println(u4.StudentName+" "+u4.marks+" "+u4.Grade);
		
		u3=u4;
		System.out.println(u1.StudentName+" "+u1.marks+" "+u1.Grade);
		System.out.println(u2.StudentName+" "+u2.marks+" "+u2.Grade);
		System.out.println(u3.StudentName+" "+u3.marks+" "+u3.Grade);
		System.out.println(u4.StudentName+" "+u4.marks+" "+u4.Grade);
		
		u4=u1;
		System.out.println(u1.StudentName+" "+u1.marks+" "+u1.Grade);
		System.out.println(u2.StudentName+" "+u2.marks+" "+u2.Grade);
		System.out.println(u3.StudentName+" "+u3.marks+" "+u3.Grade);
		System.out.println(u4.StudentName+" "+u4.marks+" "+u4.Grade);
		
	}

}
