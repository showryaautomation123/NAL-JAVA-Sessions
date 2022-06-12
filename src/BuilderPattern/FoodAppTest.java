package BuilderPattern;

public class FoodAppTest {

	public static void main(String[] args) {
		FoodApp fa=new FoodApp();
		fa.doSignIn(123456).doSignIn(123456, "yuvan@gmail.com", "yuvan123").doSearch("fast food").addRestraunts("Hot breads", "Hyd");
		fa.doSignIn("abby2gmail.com", "abby123").addRestraunts("Dominos", "heritage lane", "2nd").dosearch("thai", "soup");
	}

}
