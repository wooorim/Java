package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile {

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("data.dat")){
			int dat = in.read();
			System.out.println(dat);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
