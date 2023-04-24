
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;

		try {
			serversocket = new ServerSocket(7777); // port번호
			socket = serversocket.accept(); //여기서 프로그램이 멈춘다. -> 서버는 기다리는 쪽
			//socket은 빨때까지 다 가지고 있다.

			Sender sender = new Sender(socket); //서버가 클라이언트에
			Receiver receiver = new Receiver(socket); // 

			sender.start();
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
