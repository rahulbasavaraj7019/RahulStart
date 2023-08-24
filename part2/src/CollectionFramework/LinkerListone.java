package CollectionFramework;
import java.util.*;

public class LinkerListone {
	public static void main(String[] args) {
		List l1=new LinkedList();
		l1.add(34);
		l1.add("Rahul");
		l1.add("Mahesh");
		l1.add("Ramesh");
		l1.add(43);
		l1.add(true);
		l1.add(null);
		l1.add(false);
		System.out.println(l1);
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
