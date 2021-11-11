package BasicJava;

import java.util.Comparator;

public class Orderbyname implements Comparator <Marksheet> {
	
		
		public int compare (Marksheet m1, Marksheet m2) {
			int a;
			if (m1.getFname() == m2.getFname()) {
			a = m1.getLname().compareTo(m2.getLname());
		
			}
			else {
			a = m1.getFname().compareTo(m2.getFname());
			}
			return a;
		}
	}	
		
		
