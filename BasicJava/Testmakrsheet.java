package BasicJava;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class Testmakrsheet  {
	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();
		m1.setFname("Achal");
		m1.setLname("Saxena");
		m1.setRollNo("1");
		m1.setPhysics(78);
		m1.setBiology(68);
		m1.setMaths(55);

		Marksheet m2 = new Marksheet();
		m2.setFname("Palak");
		m2.setLname("Gupta");
		m2.setRollNo("2");
		m2.setPhysics(32);
		m2.setBiology(48);
		m2.setMaths(91);

		Marksheet m3 = new Marksheet();
		m3.setFname("Neha");
		m3.setLname("Sharma");
		m3.setRollNo("3");
		m3.setPhysics(67);
		m3.setBiology(45);
		m3.setMaths(67);

		Marksheet m4 = new Marksheet();
		m4.setFname("Ravi");
		m4.setLname("Yadav");
		m4.setRollNo("4");
		m4.setPhysics(65);
		m4.setBiology(25);
		m4.setMaths(98);

		Marksheet m5 = new Marksheet();
		m5.setFname("Achal");
		m5.setLname("Shukla");
		m5.setRollNo("5");
		m5.setPhysics(67);
		m5.setBiology(45);
		m5.setMaths(67);

		ArrayList l = new ArrayList();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		
		Orderbyname Achal = new Orderbyname();
		
		Collections.sort(l,Achal);
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Marksheet a = (Marksheet) it.next();

			System.out.println("data--" + a.getFname() + " " + a.getLname() + " " + a.getRollNo() + " " + a.getPhysics()
					+ " " + a.getBiology() + " " + a.getMaths());
			

		}
	}
}
