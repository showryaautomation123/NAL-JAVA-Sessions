package Assignments;

public class FoodDeliveryApp {
	
	public void doSignIn(int phnum){
		System.out.println("SignIn by enterig phone number");
	}
	public void doSignIn(String email,String Password){
		System.out.println("SIgnIn by enterig email");
	}
	public void doSignIn(int phnum,String email,String Password){
		System.out.println("SIgnIn by enterig email&phnum");
	}

	
	public void addRestraunts(String storeName,String storeAddress) {
		System.out.println("Select Store By Entering Name");
	}
	public void addRestraunts(String storeName,String storeAddress,String floorNumber) {
		System.out.println("Select Store By Entering store Address");
	}
	public void addRestraunts(String storeName,String storeAddress,String floorNumber,int phnum) {
		System.out.println("Select Store By Entering store Address&phnum");
	}
	
	
	public void doSearch() {
		System.out.println("search food by favorite food type");
	}
	public void doSearch(String foodType) {
		System.out.println("search food by favorite food type");
	}
	public void dosearch(String foodType, int priceRange) {
		System.out.println("search food by price ");
	}
	public void  dosearch(String foodType, String MostPopular) {
		System.out.println("search food by popularity ");
	}
	public void dosearch(String foodType, int priceRange,int deliveryfee) {
		System.out.println("search food by price and delivery fee");
	}
	public void dosearch(String foodType, String MostPopular,int deals) {
		System.out.println("search food on deals");
	}
	
	public void menu(String foodName) {
		System.out.println("selcet food by name");
	}
	public void menu(String foodName, double deliveryTime ) {
		System.out.println("selcet food by delivery time");
	}
	
	public void addToCart(long phnumber) {
		System.out.println("check out by phone number");
	}
	public void addToCart(String email) {
		System.out.println("check out by email");
	}
	public void addToCart(long phnumber,String email) {
		System.out.println("check out by phone number and email address");
	}
	public void addToCart(long phnumber,String email,int code) {
		System.out.println("check out by entering correct code");
	}
	public void addToCart(long phnumber,String email,int paymentType,int promocode) {
		System.out.println("check out by apllying promocode");
	}
	public static void main(String[] args) {
		FoodDeliveryApp obj=new FoodDeliveryApp();
		obj.doSignIn(99129911);
		obj.doSignIn("testing@gmail.com", "Automation123");
		obj.doSignIn(9110101, "test123@gmail.com", "test123");
		obj.addRestraunts("HotBreads", "Hyd");

	}

}
