package Assignments;

public class FactorialAssignment {
	public int getfactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			 fact=fact*i;
	
		
		}
		return fact;
	}
	public int fact(int num) {
		if(num==0)
			return 1;
		else return(num*fact(num-1));
	}

	public static void main(String[] args) {
		FactorialAssignment fa=new FactorialAssignment();
		System.out.println(fa.getfactorial(4));
		System.out.println(fa.fact(5));

}
}