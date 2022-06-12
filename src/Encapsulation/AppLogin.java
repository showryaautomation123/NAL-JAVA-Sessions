package Encapsulation;

public class AppLogin {
private String userName;
private String passWord;
private String phnNum;


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getPhnNum() {
	return phnNum;
}
public void setPhnNum(String phnNum) {
	this.phnNum = phnNum;
}
public void doLogin(String un,String pwd) {
	System.out.println("enter username:"+ un);
	System.out.println("enter password:"+ pwd);
	System.out.println("enter phone num");
	System.out.println("user successfully loggedin");
	
}



}
