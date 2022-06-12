package Encapsulation;

public class Customer {

	private String name;
	private char gender;
	private String role;  
	
	public Customer(String name,char gender,String role) {
		this.name=name;
		this.gender=gender;
		this.role=role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
