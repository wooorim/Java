package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws IOException{
		try {
			FileWriter file = new FileWriter("java.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));
			
			pw.print("apple");
			pw.print("orange");
			pw.print("melon");
			
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
