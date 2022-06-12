package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListReversePrint {

	public static void main(String[] args) {
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("hello");
		ar.add('a');
		ar.add(true);
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		ar.remove(3);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		ar.add(4, 500);
		
		System.out.println(ar.get(4));
		for(Object e:ar) {
			System.out.println(e);
		}
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		Collections.reverse(ar);
		System.out.println(ar);
		
			for(Object e:ar) {
				
				System.out.println(e);
				
			}
			for (ListIterator<Object> itr = ar.listIterator(ar.size()); itr.hasPrevious(); /*no-op*/ ) {
			    Object val = itr.previous();
			    System.out.println(val); 
			}
		

	}

}
