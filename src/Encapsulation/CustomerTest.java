package Encapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		Customer ct=new Customer("sima",'F',"BA");
		System.out.println(ct.getName()+" "+ct.getGender()+" "+ct.getRole());
		ct.setRole("Manager");
		System.out.println(ct.getName()+" "+ct.getGender()+" "+ct.getRole());
		
		

	}

}
