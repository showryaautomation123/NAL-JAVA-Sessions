package OOP_Interface;

public interface UKUniversity extends INUniversity{

	public void Medicalprogrammes();
	public void Libraryfacilities();
	public void Fitnessresources();
	
	default void nonimmigrantQuota() {
		System.out.println("30% non immigrant quota...");
	}

}
