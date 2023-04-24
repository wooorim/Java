
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;

		try {
			serversocket = new ServerSocket(7777); // port��ȣ
			socket = serversocket.accept(); //���⼭ ���α׷��� �����. -> ������ ��ٸ��� ��
			//socket�� �������� �� ������ �ִ�.

			Sender sender = new Sender(socket); //������ Ŭ���̾�Ʈ��
			Receiver receiver = new Receiver(socket); // 

			sender.start();
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
