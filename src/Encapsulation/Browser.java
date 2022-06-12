package Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch the browser");
		browserVersion();
		browserCompatible();
		checkNetwork();
	}
	
	private void browserVersion() {
		System.out.println("check the browser version");
	}
	
	private void browserCompatible() {
		System.out.println("check the browser compatibility");
	}
	
	private void checkNetwork() {
		System.out.println("check the network connection");
		
	}
}
