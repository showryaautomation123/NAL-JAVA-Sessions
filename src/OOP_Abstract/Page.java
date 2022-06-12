package OOP_Abstract;



public abstract class Page {
	
//	public Page() {
//		System.out.println("page default const");
//	}
////	
//	public  Page(int num) {
//		System.out.println("page parametr const.."+ num);
//	}
//    int number=20; 
	public abstract void title() ;
	public abstract void header();
	public abstract void footer();
	
	public void pageLoadTimeOut() {
		System.out.println("page load time out is 20sec");
	}
	
	public int numberOfPages() {
		System.out.println("total no.of pages");
		return 10;
	}
	
	public final void logo() {
		System.out.println("App logo");
	}
	
}
