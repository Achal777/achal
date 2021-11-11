package core_java_io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Writefile {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("C:/java.txt");
		PrintWriter pw = new PrintWriter(writer);
				
				for (int i = 0; i < 5; i++) {
					pw.print(i + ": Line");
				}
		
		pw.close();
		writer.close();
		
		System.out.println("File is written");
					
					
				}
		}
