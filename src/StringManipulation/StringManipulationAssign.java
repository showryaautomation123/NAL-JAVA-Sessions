package StringManipulation;

public class StringManipulationAssign {
	
	
	public static int test(String name) {
		if(name.contains("world")) {
		return (name.indexOf("world"));
		}
		
		else {
			return -1;
		}
	}
	

	public static void main(String[] args) {
		String title="Hello welcome to selenium";
		int len=title.length();
		System.out.println(len);
		System.out.println(title.substring(len/2));
		
		String name="Welcome to Naveen Automation Labs!";
		System.out.println(name.indexOf('e'));
		System.out.println(name.indexOf('e', name.indexOf('e')+1));
		System.out.println(name.indexOf('e',name.indexOf('e', name.indexOf('e')+1)+1));
		System.out.println(name.charAt(14));
		
		String user="Hello welcome To Selemium Automation world";
		
		System.out.println(test(user));
		
		String s="selenium with java";
		System.out.println(s.substring(s.indexOf(" ")+1, s.indexOf(" ",s.indexOf(" ")+1)));
		
		String str = "your transaction id is: 12345 and reference id is 34567";
		String strrep=str.replaceAll("[^0-9]", "");
		System.out.println(strrep);
		String alph=str.replaceAll("[^a-z]", "");
		System.out.println(alph);
		
	}

}
