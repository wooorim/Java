package IOStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class SimpleReader {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����: ");
		String src = sc.nextLine();

		try (Reader in = new FileReader(src)) {
			int ch;

			while (true) {
				ch = in.read();
				if (ch == -1) {
					break;
				}
				System.out.println((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
