package itxiang_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();

		// 自己封裝鍵盤錄入數據
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			// 輸入的數據是886發送數據結束
			if ("886".equals(line)) {
				break;
			}
			// 創建數據,並把數據打包
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("172.20.10.3"), 12345);

			// 調用方法發送數據
			ds.send(dp);
		}
		ds.close();
	}
}
