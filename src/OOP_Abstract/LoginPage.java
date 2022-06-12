package OOP_Abstract;

public  class  LoginPage extends Page  {
	
	public LoginPage() {
		System.out.println(("LoginPage default const..."));
	}
	
	public LoginPage(int num) {
		//super(10);
		System.out.println("LoginPage param const:"+num);
	}

	@Override
	public void title() {
	System.out.println("page title is Amazon login");
	}

	@Override
	public void header() {
		System.out.println("header is Amazon Shopping");
		
	}

	@Override
	public void footer() {
		System.out.println("Thank you for shopping");
		
	}
	
	public void dologin(String un,String pwd) {
		System.out.println("user login details:"+un+" "+pwd);
	}
	
	public void forgotPassword() {
		System.out.println("reset the password");
	}
	
	@Override
	public void pageLoadTimeOut() {
		
			System.out.println("page load time out is 20sec");
		
	}
}
