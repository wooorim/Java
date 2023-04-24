import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
//상대방의 채팅을 받는 코드

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
		//보내고 받고, 채팅해야되서 쓰레드 사용.
		while(in != null) {
			try {
				System.out.println(in.readUTF()); //UTF->유니코드 약자, 글짜 안 깨지게 한다 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
