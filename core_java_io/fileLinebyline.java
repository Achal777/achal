package core_java_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class fileLinebyline {
public static void main(String[] args) throws IOException {
	
	FileReader reader = new FileReader("D:/aaaaa.txt");
	BufferedReader br = new BufferedReader(reader);
	
	String line = br.readLine();
	
	while(line != null) {
		System.out.println(line);
	line = br.readLine();	
	
	}
	reader.close();
	}
}
