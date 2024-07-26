package itxiang_86;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 創建服務器端的ServerSokcet對象
		// ServerSokcet(int port)創建綁定到指定窗口的服務器套接字
		ServerSocket ss = new ServerSocket(10000);

		// Socket accept()偵聽要連接到此套接字並接受他
		Socket s = ss.accept();

		// 接收數據
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		// 把數據寫入文本文件
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_86\\Copy.java"));

		String line;
		while ((line = br.readLine()) != null) { // 等待讀取數據
//			if ("886".equals(line)) {
//				break;
//			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 給出反饋
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bwServer.write("文件上傳成功");
		bwServer.newLine();
		bwServer.flush();
		// 釋放資源
		bw.close();
		ss.close();
	}
}
