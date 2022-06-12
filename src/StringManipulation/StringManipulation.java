package StringManipulation;

import java.util.Collections;

public class StringManipulation {

	public static void main(String[] args) {
		
		String st="This is automation testing";
		String st1="This is automation testing";
		String st2="This is Automation Testing";
		System.out.println(st.equals(st2));
		System.out.println(st.equals(st1));
		
		String str="  Welcome to selenium  ";
		System.out.println(str.replace(" ", ""));
		
		String s="Automation";
		System.out.println(s.length());
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		
		System.out.println(st.charAt(st.length()-1));
		System.out.println(st.indexOf('i'));
		System.out.println(st.indexOf('i',st.indexOf('i')+1 ));
		System.out.println(st.indexOf('i',st.indexOf('i',st.indexOf('i')+1 )+1));
		System.out.println(st.replace('i', 'I'));
		System.out.println(st.contains("automation"));
		System.out.println(s.contains("t"));
		
		String name="showrya";
//		String nameval[]=name.split("");
//		System.out.println(nameval.length);
//		for(int i=nameval.length-1;i>=0;i--) {
//			String namearray=nameval[i];
//			System.out.print(namearray);
//		}
		
		int len=name.length();
		String nameval="";
		
		for(int i=name.length()-1;i>=0;i--) {
			 nameval=nameval+name.charAt(i);
			
		}
		System.out.println(nameval);
		
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
		
		
		
	}

}
