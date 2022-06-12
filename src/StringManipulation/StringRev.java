package StringManipulation;

import java.util.Collections;

public class StringRev {

	public static void main(String[] args) {
		String s="Naveen;Testing;Banglore;naveen@gmail.com;9846572331;India";
		String val[]=s.split(";");
		System.out.println(val.length);
		String rev="";
		for(int i=val.length-1;i>=0;i--) {
			rev=rev+val[i];
			
		}
		System.out.println(rev);
		
		String st="This is my selenium code";
//		String rep=st.replaceAll(" ", "");
//		System.out.println(rep);
//		int len=rep.length();
//		System.out.println(len);
//		String strev="";
//		for(int i=rep.length()-1;i>=0;i--) {
//			strev=strev+rep.charAt(i);
//		}
//		
//		System.out.println(strev);
	
		String m="";
//		String stsp[]=st.split(" ");
//		for(int i=stsp.length-1;i>=0;i--) {
//			String value=st;
//			for(int j=value.length()-1;j>=0;j--) {
//				m=m+value.charAt(j);
//			}
//			
//		}
//		System.out.println(m);
		
		for(int k=st.length()-1;k>=0;k--) {
			m=m+st.charAt(k);
			
		}
		System.out.println(m);
	}

}
