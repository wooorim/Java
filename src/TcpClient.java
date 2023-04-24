
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		
		
		String serverIp = "127.0.0.1"; //자기자신의 IP 특수 IP
		
		try {
			
			Socket socket = new Socket(serverIp, 7777); // 상대방 IP(서버)와 연결
			// 서버 쪽 socket = serverSocket.accept()가 받는다.
			
			System.out.println("서버에 연결되었습니다.");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
