import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
//������ ä���� �޴� �ڵ�

public class Receiver extends Thread{
	Socket socket;
	DataInputStream in;
	
	
	public Receiver(Socket socket) {
		
		this.socket = socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		//������ �ް�, ä���ؾߵǼ� ������ ���.
		while(in != null) {
			try {
				System.out.println(in.readUTF()); //UTF->�����ڵ� ����, ��¥ �� ������ �Ѵ� 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
