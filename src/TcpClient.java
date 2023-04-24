
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		
		
		String serverIp = "127.0.0.1"; //�ڱ��ڽ��� IP Ư�� IP
		
		try {
			
			Socket socket = new Socket(serverIp, 7777); // ���� IP(����)�� ����
			// ���� �� socket = serverSocket.accept()�� �޴´�.
			
			System.out.println("������ ����Ǿ����ϴ�.");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
