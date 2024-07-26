package itxiang_87;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 創建服務器端的ServerSokcet對象
		// ServerSokcet(int port)創建綁定到指定窗口的服務器套接字
		ServerSocket ss = new ServerSocket(10000);
		while (true) {
			// Socket accept()偵聽要連接到此套接字並接受他
			Socket s = ss.accept();

			// 為每一個客戶開啟一個線程
			new Thread(new ServerThread(s)).start();
		}

	}
}
