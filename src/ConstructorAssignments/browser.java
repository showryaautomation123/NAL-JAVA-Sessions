package ConstructorAssignments;

public class browser{

	String name;
	double version;
	String[] pluggin;
	public browser(String name,double version,String[] pluggin){
		this.name=name;
		this.version=version;
		this.pluggin=pluggin;
		
	}
	public browser(String name, double version) {
		this.name = name;
		this.version = version;
	}
	public browser(String name) {
		
		this.name = name;
	}
	
	
	
	
	

}
