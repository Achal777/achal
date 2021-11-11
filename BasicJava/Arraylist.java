package BasicJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {
		
	ArrayList v = new ArrayList ();
	v.add("one");
	v.add("Two");
	v.add("Three");
	v.add("four");
	
Iterator it=v.iterator();
while (it.hasNext()) {
	Object o = (Object) it.next();
	
	
     System.out.println(o);
}		
				
	}
	
	}
