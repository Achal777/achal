package core_java_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class Copytextfile {
	public static void main(String[] args) throws Exception {
		
		
		String source = "D:/Hello.txt";
		String target = "D:/b.txt";
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);
		
		int ch = reader.read ();
		while (ch!=-1) {
			writer.write (ch);
			  ch = reader.read();
			 
		}
		writer.close();
		reader.close();
		
		System.out.println("done");
		
	}
		}

	