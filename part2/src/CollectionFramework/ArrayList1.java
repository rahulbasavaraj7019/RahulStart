package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		List al2 =new ArrayList();
		al1.add("Rahul");
		al1.add(110);
		al1.add(true);
		al1.add(null);
		al2.add(55);
		al2.add("India");
		al2.add(false);
		al2.add(66.00);
		System.out.println(al1);
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		System.out.println(al1.size());
		System.out.println(al1.equals(al2));
		System.out.println(al1.isEmpty());
		//al1.clear();
		//System.out.println(al1);
		al1.add("Rahul");
		al1.add(110);
		al1.add(true);
		al1.add(null);
		al2.addAll(al1);
		System.out.println(al1);//duplicates allowed
		System.out.println(al2);
		al2.remove(5);
		System.out.println(al2);
		
		
		
		
		
		
		
		
		

	}

}
