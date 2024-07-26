package itxiang_83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
//		InputStream is = s.getInputStream();
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

//		s.close();
		ss.close();
	}
}
