package Encapsulation;

import java.util.ArrayList;

public class User {
	
	public String name;
	public int age;
	private ArrayList<String> deviceList;
	private int salary;
	
	public ArrayList<String> getDeviceList() {
		return deviceList;
	}
	public void setDeviceList(ArrayList<String> deviceList) {
		this.deviceList = deviceList;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	


}
