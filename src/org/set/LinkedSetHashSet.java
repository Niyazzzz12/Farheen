package org.set;

import java.util.HashSet;
import java.util.Set;

public class LinkedSetHashSet {
	public static void main(String[] args) {
		Set<Integer>l=new HashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println("List 1 : "+l);

		Set<Integer>m=new HashSet<Integer>();
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		m.add(80);
		System.out.println("List 2 : "+m);
 
		l.removeAll(m);
		System.out.println("using removeAll() :" + l);
      
       
}
}