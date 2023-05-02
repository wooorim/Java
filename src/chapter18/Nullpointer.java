package chapter18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nullpointer {
	public static void function1() throws IOException { //throws 에러 난 부분을 function1를 호출한 부분에 던져! -> 이 경우는main함수
		BufferedWriter writer = null;
		writer.write('A'); //왜 컴파일 에러? 
	}

	public static void main(String[] args) throws IOException {
		try {
			function1();
		}catch(InputMismatchException e) {
			System.out.println("catch 잡았음");
		}
	}

}
