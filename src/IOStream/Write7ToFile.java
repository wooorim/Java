package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.IIOException;

public class Write7ToFile {

	public static void main(String[] args) throws IOException{
		try (OutputStream out = new FileOutputStream("data.dat")){
			out.write(7);
		} catch (IIOException e) {
		e.printStackTrace();
		}
	}

}
