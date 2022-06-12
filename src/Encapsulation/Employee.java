package Encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private String role;
	private boolean isActive;

	// public methods
	// getter and setter

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public String empData() {
		return name+" "+age+"  "+role+"  "+isActive;
	}
	
	
	

}
