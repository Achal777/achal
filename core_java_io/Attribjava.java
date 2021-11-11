package core_java_io;

import java.io.File;
import java.util.Date;

public class Attribjava {
	public static void main(String[] args) {
		
   File f = new File ("C:/java.txt");
if (f.exists()) {
	   
   System.out.println("Name" + f.getAbsolutePath());
   System.out.println("Absolute path:"+ f.getAbsolutePath());
   System.out.println("Is readable" + f.canWrite());
   System.out.println("Is File" + f.canRead());
   System.out.println("Is Directory" + f.isDirectory());
   System.out.println("Last Modified at" + new Date(f.lastModified()));
   System.out.println("Length" + f.length() +" bytes long");

}
}
}
 