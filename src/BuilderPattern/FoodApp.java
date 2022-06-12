package BuilderPattern;

public class FoodApp {
	
	public FoodApp doSignIn(int phnum){
		System.out.println("SignIn by enterig phone number");
		return this;
	}
	public FoodApp doSignIn(String email,String Password){
		System.out.println("SIgnIn by enterig email");
		return this;
	}
	public FoodApp doSignIn(int phnum,String email,String Password){
		System.out.println("SIgnIn by enterig email&phnum");
		return this;
	}

	
	public FoodApp addRestraunts(String storeName,String storeAddress) {
		System.out.println("Select Store By Entering Name");
		return this;
	}
	public FoodApp addRestraunts(String storeName,String storeAddress,String floorNumber) {
		System.out.println("Select Store By Entering store Address");
		return this;
	}
	public FoodApp addRestraunts(String storeName,String storeAddress,String floorNumber,int phnum) {
		System.out.println("Select Store By Entering store Address&phnum");
		return this;
	}
	
	
	public FoodApp doSearch() {
		System.out.println("search food by favorite food type");
		return this;
	}
	public FoodApp doSearch(String foodType) {
		System.out.println("search food by favorite food type");
		return this;
	}
	public FoodApp dosearch(String foodType, int priceRange) {
		System.out.println("search food by price ");
		return this;
	}
	public FoodApp  dosearch(String foodType, String MostPopular) {
		System.out.println("search food by popularity ");
		return this;
	}
	public FoodApp dosearch(String foodType, int priceRange,int deliveryfee) {
		System.out.println("search food by price and delivery fee");
		return this;
	}
	public FoodApp dosearch(String foodType, String MostPopular,int deals) {
		System.out.println("search food on deals");
		return this;
	}
	

}
