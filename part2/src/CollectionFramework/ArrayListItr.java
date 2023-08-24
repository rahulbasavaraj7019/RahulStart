package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListItr {
	

	public static void main(String[] args) {
	
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rahul");
		names.add("Mahendra");
		names.add("Sathish");
		names.add("virat");
		System.out.println(names);
//		for(int i=0;i<=names.size()-1;i++) {
//		System.out.println(names.get(i));
//		}
		//int i=0;
//		while(i<=names.size()-1) {
//			System.out.println(names.get(i));
//			i++;
//			
//		}
//		for(Object name:names) {
//			System.out.println(name);
//		}
		Iterator a =names.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
			
		}
		Collections.sort(names);
		System.out.println(names);
		Collections.sort(names,Collections.reverseOrder());
		System.out.println(names);
		
		}
		
		
	
	}


