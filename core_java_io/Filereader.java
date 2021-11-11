package core_java_io;

import java.io.FileReader;

public class Filereader {
private static FileReader reader;

public static void main(String[] args) throws Exception {
	
	reader = new FileReader ("C:/java.txt");
		int ch = reader.read();
		char chr;
		
		while(ch!= -1){
			chr=(char)ch;
			System.out.println( chr);
		ch = reader.read();
		}	
}
}
