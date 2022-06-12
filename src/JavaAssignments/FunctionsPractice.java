package JavaAssignments;

public class FunctionsPractice {
	public void sum() {
		int a=10;
		int b=90;
		int c=a+b;
		System.out.println("void sum method   "+c);
	}
    public int sum1() {
    	//System.out.println("sum method with return type    "+c);

    	int a=20;
    	int b=30;
    	int c=a+b;
    	System.out.println("sum method with return type    "+c);

    	return c;
    	//System.out.println("sum method with return type    "+c);
    }
	

	public static void main(String[] args) {
		FunctionsPractice fp=new FunctionsPractice();
		fp.sum();
		
		int val=fp.sum1()
;
		System.out.println(val);
	}

}
