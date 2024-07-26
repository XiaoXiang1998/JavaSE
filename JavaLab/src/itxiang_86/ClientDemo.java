package itxiang_86;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 創建客戶端的Socket對象
		Socket s = new Socket("172.20.10.3", 10000);

		// 數據來自鍵盤錄入,直到輸入的數據是886,發送數據結束
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_85\\InetAddressDemo.java"));
		// 封裝輸出流對象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 自定義結束標記
//		bw.write("886");
//		bw.newLine();
//		bw.flush();

		// public void shutdownOutput() 輸出結束的標記
		s.shutdownOutput();

		// 接收反饋
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String data = brClient.readLine(); // 等待讀取數據
		System.out.println("服務器的反饋:" + data);
		// 釋放資源
		br.close();
		s.close();

	}
}
