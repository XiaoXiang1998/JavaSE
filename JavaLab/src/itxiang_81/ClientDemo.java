package itxiang_81;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 創建客戶端的Socket對象
		// Socket(InetAddress address,int port) 創建流套將其連接到指定ip地址的指定端口號
//		Socket s = new Socket(InetAddress.getByName("172.20.10.3"), 10000);
		// Socket(String host,int port)創建流套並將其連接到指定主機上的端口號
		Socket s = new Socket("172.20.10.3", 10000);

		// 獲取輸出流,寫數據
		// OutputStream getOutputStream() 返回此套接字的輸出流
		OutputStream os = s.getOutputStream();
		os.write("Hello,tcp,我來了".getBytes());

		// 釋放資源
		s.close();
	}
}
