package JavaAssignments;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		int num[]=new int[5];
		num[0]=10;
		num[1]=30;
		num[2]=-2;
		num[3]=47;
		num[4]=100;
		//num[5]=300;
		num[4]=20;
		System.out.println(num[4]);
		//System.out.println(num);*******Gives Garbage Value********
		System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		for(int e:num) {
			System.out.println(e);
		}
		String name[]=new String[3];
		name[0]="blue";
		name[1]="orange";
		name[2]="brown";
		//System.out.println(name);*******Gives Garbage Value********
		for(String e:name) {
			System.out.println(e);
			if(e.equals("orange")) {
				System.out.println("my favorite color");
			}
			
		}
		char []c={'a','e','i','o','u'};
		System.out.println(c);
		 System.out.println(Arrays.toString(name));
		 
		 float []f=new float[3];
		 f[0]=12.88f;
		 f[1]=50.44f;
		 f[2]=45.66f;
		 System.out.println(f[0]-f[1]);
		 System.out.println(Arrays.toString(f));
	
		 double []d=new double[2];
		 d[0]=23.9000000000000000000900000;
		 d[1]=45.912330000000000000000000;
		 System.out.println(Arrays.toString(d));
		 
		 Object val[]=new Object[5];
		 val[0]=100;
		 val[1]="Hello";
		 val[2]='@';
		 val[3]=false;
		 val[4]=79.00;
		 System.out.println(val[4]);
		 //System.out.println(val);
		 for(int i=0;i<val.length;i++) {
			 System.out.println(val[i]);
		 }
		 for(Object e:val) {
			 System.out.println(e);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		

	}

}
