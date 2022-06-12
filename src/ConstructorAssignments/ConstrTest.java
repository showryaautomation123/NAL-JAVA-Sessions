package ConstructorAssignments;

import java.util.Arrays;

public class ConstrTest {

	public static void main(String[] args) {
//		String []plug=new String[3];
//		plug[0]="google docs";
//		plug[1]="chropath";
//		plug[2]="Adobe";
//		browser br=new browser("chrome",99.9777,plug);
//		System.out.println(br.name+" "+br.version+" "+Arrays.toString(plug));
//		browser br1=new browser("firefox",100);
//		System.out.println(br1.name);
//		browser br2=new browser("Ie");
//		System.out.println(br2.name);
//		
//		Login log=new Login("tina123@gmail.com","tina123");
//		System.out.println(log.password+"  "+log.username);
//		if(log.doLogIn()) {
//			System.out.println("access to homepage");
//		}
		
		Students st=new Students("Akash","A100");
		String [] sub= {"Chemistry","Physics","Maths"};
		Students st1=new Students("isha","B101",sub);
		Students st2=new Students("Arav","C107",sub,90);
		System.out.println(st1.name);
		System.out.println(Arrays.toString(st1.subjects));
		st.studentCredits("Akash");
		
		
		
		
	}

}
