package Test2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class BufferedIOStream {

	public static void main(String[] args) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sample.jpg"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sample2.jpg"));){
			byte data[] = new byte[1024];
			int len;
			
			while((len = bis.read(data)) != -1) {
				System.out.println(Arrays.toString(data));
				bos.write(data, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
