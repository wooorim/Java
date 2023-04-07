package IOStream;

import java.io.FileWriter;
import java.io.Writer;

public class SimpleWriter {

	public static void main(String[] args) {
		try (Writer out = new FileWriter("data.txt")){
			out.write('A');
			out.write('วั');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
