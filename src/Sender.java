import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread{
	Socket socket;
	DataOutputStream out;
	String name;
	
	public Sender(Socket socket) {
		
		this.socket = socket;
		
		try {
			out = new DataOutputStream(socket.getOutputStream()); //
			name = "["+socket.getInetAddress()+":"+socket.getPort()+"]";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		// while문 쓰레드 사용안하면 서브 while문만 계속 돌아가고 클라이언트에서 받을 수가 없다.
		while(out != null) {
			try {
				out.writeUTF(name + scanner.nextLine()); //Enter치면 보낸다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
