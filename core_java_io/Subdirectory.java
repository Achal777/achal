package core_java_io;

import java.io.File;

public class Subdirectory {
public static void main(String[] args) {
	
	File directory = new File ("C:");
	
	String [] list = directory.list();
	for (int i = 0; i < list.length; i++) {
	
	System.out.println((i + 1) + " : " + list[i]);
	
	
}
}
}