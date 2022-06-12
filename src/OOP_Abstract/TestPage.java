package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		
		//If the abstract class doesn’t have a constructor, a class that extends that abstract class will not get compiled.
		
		
		LoginPage lp=new LoginPage();
		LoginPage lp1=new LoginPage(10);
		//LoginPage lp1=new LoginPage(10);
		
//		System.out.println(lp.number);
//		lp.header();
//		lp.footer();
//		lp.title();
//		lp.pageLoadTimeOut();
//		lp.numberOfPages();
//		lp.logo();
//		lp.dologin("admin@gmail.com", "test123");
//		lp.forgotPassword();
//		Page obj=new LoginPage();
//		obj.header();
//		System.out.println(obj.number);
//
	}

}
