package chapter18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nullpointer {
	public static void function1() throws IOException { //throws ���� �� �κ��� function1�� ȣ���� �κп� ����! -> �� ����main�Լ�
		BufferedWriter writer = null;
		writer.write('A'); //�� ������ ����? 
	}

	public static void main(String[] args) throws IOException {
		try {
			function1();
		}catch(InputMismatchException e) {
			System.out.println("catch �����");
		}
	}

}
