package Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("nilan");
		emp.setAge(30);
		emp.setActive(true);
		emp.setRole("QA");
		System.out.println(emp.getName()+"  "+emp.getAge()+"  "+emp.getRole()+"  "+emp.isActive());
		
		Employee emp1=new Employee();
		emp1.setName("Anish");
		emp1.setActive(false);
		System.out.println(emp1.getAge()+" "+emp1.getName()+"  "+emp1.getRole()+" "+emp1.isActive());
		System.out.println(emp.empData());
		
		

	}

}
