package JavaAssignments;

public class LargestOf4numbers {

	public static void main(String[] args) {
		byte a=12;
		byte b=40;
		byte c=80;
		byte d=100;
		if(a>b && a>c && a>d) {
			System.out.println("a is the greatest");
		}
		else if(b>c && b>d) {
			System.out.println("b is the greatest");
		}
		else if(c>d) {
			System.out.println("c is the greatest");
		}
		else {
			System.out.println("d is the greatest");
		}
	}

}
