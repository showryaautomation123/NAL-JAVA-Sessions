package OOP_Interface;

public class NorthHillsUniversity implements USUniversity,UKUniversity,IndianUniversity{
	
	//String name="jain";
	
	//static String name="happy";
	public NorthHillsUniversity() {
		System.out.println("default const");
	}

	@Override
	public void Mission() {
		System.out.println("mission of education");
	}

	@Override
	public void Lawprogrammes() {
		System.out.println("Law programmes in IndianUniversity");
		
	}

	@Override
	public void Hostelfacilities() {
		System.out.println("Boarding facilities in IndianUniversity");
		
	}

	@Override
	public void studyGroups() {
		System.out.println("study group resources IndianUniversity");
		
	}

	@Override
	public void Medicalprogrammes() {
		System.out.println("medical programmes in UKUniversity");
		
	}

	@Override
	public void Libraryfacilities() {
		System.out.println("Library facilities in UKUniversity");
		
	}

	@Override
	public void Fitnessresources() {
		System.out.println("Fitness resources in UKUniversity");
	}

	@Override
	public void Engineeringprogrammes() {
		System.out.println("engineering programmes in USUniversity");
		
	}

	@Override
	public void Buildingfacilities() {
		System.out.println("Building facilities in USUniversity");
	}

	@Override
	public void Teachingresources() {
		System.out.println("Teaching resources in USUniversity");
	}
	
	public static void minStrength() {
		System.out.println("minimum strength of NorthHills college : 1000");
	}
	
	public void grading() {
		System.out.println("grading in NorthHills");
	}
	
	

}
