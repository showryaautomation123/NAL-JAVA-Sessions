package JavaAssignments;

public class SwitchAssignment1 {

	public static void main(String[] args) {
		String role="SELLER    ";
//				switch (role.toLowerCase().trim()) {
//				case "customer":
//					System.out.println("Give Access To Customer");
//					
//					break;
//				case "admin":
//					System.out.println("Give Access To Admin");
//					
//					break;
//				case "vendor":
//					System.out.println("Give Access To Vendor");
//					
//					break;
//				case "seller":
//					System.out.println("Give Access To Seller");
//					
//					break;
//				case "distributor":
//					System.out.println("Give Access To Distibutor");
//					
//					break;
//
//				default:
//					System.out.println("Povide Correct Name");
//					break;
					
				String env="dev";
				switch (env.toUpperCase()) {
				case "DEV":
					System.out.println("Run test cases on DEV environment");
					break;
				case "QA":
					System.out.println("Run test cases on QA environment");
					break;
				case "STAGE":
					System.out.println("Run test cases on Stage environment");
					break;
				case "UAT":
					System.out.println("Run test cases on uat environment");
					break;
				case "PROD":
					System.out.println("Run test cases on Prod environment");
					break;

				default:
					System.out.println("Provide correct Env");
					break;
				}
	}
}