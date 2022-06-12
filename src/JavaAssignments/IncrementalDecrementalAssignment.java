package JavaAssignments;

public class IncrementalDecrementalAssignment {

	public static void main(String[] args) {
		byte b=2;
		byte b1=b++;
		System.out.println(b);
		System.out.println(b1);
		byte b2=4;
		byte b3=++b2;
		System.out.println(b2);
		System.out.println(b3);
		byte b4=5;
		byte b5=b4--;
		System.out.println(b4);
		System.out.println(b5);
		byte b6=10;
		byte b7=--b6;
		System.out.println(b6);
		System.out.println(b7);
		byte b8=100;
		System.out.println(b8++);
		System.out.println(b8);
		System.out.println(100+b8);
		System.out.println(100-(++b8));
		

	}

}
