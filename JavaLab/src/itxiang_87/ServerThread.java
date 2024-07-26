package itxiang_87;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
	private Socket s;

	public ServerThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		// 接收數據,寫道文本文件
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//			BufferedWriter bw = new BufferedWriter(
//					new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_87\\Copy.java"));
			// 解決名稱衝突問題
			int count = 0;
			File file = new File("C:\\Javahometrain\\JavaLab\\src\\itxiang_87\\Copy[" + count + "].java");
			while (file.exists()) {
				count++;
				file = new File("C:\\Javahometrain\\JavaLab\\src\\itxiang_87\\Copy[" + count + "].java");
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			String line;
			while ((line = br.readLine()) != null) {
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
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
