package Assignments;

import java.util.Arrays;

public class FunctionsAssignment {
	
	public String[] getEmpProduct(String empName ) {
		
		
		switch (empName.toLowerCase().trim()) 
		{
		
		case "alex":
		System.out.println(empName);
		String product[]= {"Ipad","Iphone 13Pro","Macbook","Apple airpods"};
			return product;
		case "sandra":
			System.out.println(empName);
			 String  product1[]= {"Chromebook","Google Pixel 4","Google Home"};
			return product1;
		default:
			System.out.println("employee name not found:"+ empName);
			return null;
		}
//     	String product[]=new String[5];
//		switch (empName.toLowerCase().trim()) {
//		
//		case "alex":
//		System.out.println(empName);
//		product[0]="Ipad";
//		product[1]="Iphone 13Pro";
//		product[2]="Macbook";
//		product[3]="Apple airpods";
//			return product;
//			
//		case "sandra":
//			System.out.println(empName);
//			product[0]="Chromebook";
//			product[1]="Google Pixel 4";
//			product[2]="Google Home";
//			return product;
//			
//		default:
//			System.out.println("employee name not found:"+ empName);
//			return null;
//		}
		
		
		
//		if(empName.equalsIgnoreCase("Alex")) {
//			System.out.println(empName);
//			product[0]="Ipad";
//			product[1]="Iphone 13Pro";
//			product[2]="Macbook";
//			product[3]="Apple airpods";
//		}
//		else if(empName.equalsIgnoreCase("Sandra")) {
//			System.out.println(empName);
//			product[0]="Chromebook";
//			product[1]="Google Pixel 4";
//			product[2]="Google Home";
//		}
//		else {
//			System.out.println("employee name not found:"+ empName);
//		}
//		return product;
		
		
//		if(empName.equalsIgnoreCase("Alex")) {
//			System.out.println(empName);
//			String product[]= {"Ipad","Iphone 13Pro","Macbook","Apple airpods"};
//			return product;
//		}
//		else if(empName.equalsIgnoreCase("Sandra")) {
//			System.out.println(empName);
//			String product[]= {"Chromebook","Google Pixel 4","Google Home"};
//			return product;
//		}
//		else {
//			System.out.println("employee name not found:"+ empName);
//		}
//		return null;
//       }
//	
	}
	

	public static void main(String[] args) {
		FunctionsAssignment fa=new FunctionsAssignment();
		String dev[]=fa.getEmpProduct("sara");
		System.out.println(Arrays.toString(dev));
		
		
	}

}
