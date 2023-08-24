package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListtwo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		System.out.println(l1);
		al.add(4, 100);
		System.out.println(al);
		l1.addFirst(100);
		l1.addLast(100);
		l1.add(01);//default at last
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		
		
		
		
		
		
		
		

	}

}
