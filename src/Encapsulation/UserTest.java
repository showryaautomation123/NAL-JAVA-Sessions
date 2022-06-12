package Encapsulation;

import java.util.ArrayList;

public class UserTest {

	public static void main(String[] args) {
	User u1=new User();
	u1.name="shri";
	u1.age=35;
	u1.setSalary(10000);
	
	ArrayList<String> dev=new ArrayList<String>();
	dev.add("Chrome Book");
	dev.add("Google Pixel4");
	dev.add("Google Home");
	u1.setDeviceList(null);
	u1.setDeviceList(dev);
	
	System.out.println(u1.name+" "+u1.age+" "+u1.getSalary()+"  "+u1.getDeviceList());
	User u=new User();
	u.name="niha";
	u.age=25;
	u.setSalary(20000);
	u.setDeviceList(dev);
	System.out.println(u.name+" "+u.age+" "+u.getSalary()+" "+u.getDeviceList());
	
	AppLogin login=new AppLogin();
	login.setUserName("hansh@gmail.com");
	login.setPassWord("Hansh123");
	login.setPhnNum("3546388912");
	System.out.println(login.getUserName()+" "+login.getPassWord()+"  "+login.getPhnNum());
	login.doLogin(login.getUserName(),login.getPassWord());
	
	AppLogin login1=new AppLogin();
	login1.setUserName("eon@gmail.com");
	login1.setPassWord("eon123");
	login1.setPhnNum("4576893023");
	System.out.println(login1.getUserName()+"  "+login1.getPassWord()+"  "+login1.getPhnNum());
	login1.doLogin(login1.getUserName(), login1.getPassWord());
	

}
}