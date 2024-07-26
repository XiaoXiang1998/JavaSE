package itxiang_82;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 創建客戶端的Socket對象
		Socket s = new Socket("172.20.10.3", 10000);

		// 獲取輸出流,寫數據
		// OutputStream getOutputStream() 返回此套接字的輸出流
		OutputStream os = s.getOutputStream();
		os.write("Hello,tcp,我來了".getBytes());

		// 接收服務器反饋
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String data = new String(bys, 0, len);
		System.out.println("客戶端:" + data);
		// 釋放資源
		s.close();
	}
}
