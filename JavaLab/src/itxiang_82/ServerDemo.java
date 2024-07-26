package itxiang_82;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 創建服務器端的ServerSokcet對象
		// ServerSokcet(int port)創建綁定到指定窗口的服務器套接字
		ServerSocket ss = new ServerSocket(10000);

		// Socket accept()偵聽要連接到此套接字並接受他
		Socket s = ss.accept();

		// 獲取輸入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String data = new String(bys, 0, len);
		System.out.println("服務器:" + data);

		// 給出反饋
		OutputStream os = s.getOutputStream();
		os.write("數據已經收到".getBytes());

//		s.close();
		ss.close();
	}
}
