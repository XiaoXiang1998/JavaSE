package itxiang_83;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 創建客戶端的Socket對象
		Socket s = new Socket("172.20.10.3", 10000);

		// 數據來自鍵盤錄入,直到輸入的數據是886,發送數據結束
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 封裝輸出流對象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}

			// 獲取輸出流對象
//			OutputStream os = s.getOutputStream();
//			os.write(line.getBytes());
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// 釋放資源
		s.close();
	}
}
