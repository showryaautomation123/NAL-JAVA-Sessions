package ConstructorAssignments;

public class Login {

	String username;
	String password;
	public Login(String username,String password){
		this.username=username;
		this.password=password;
		
	}
	public boolean doLogIn() {
		System.out.println("enter username: "+username);
		System.out.println("enter password:"+password);
		System.out.println("click on login button" );
		System.out.println("login successful");
	
		return true; 
	}
	

}
