package itxiang_80;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(12345);

		while (true) {
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);

			ds.receive(dp);

			System.out.println("數據是:" + new String(dp.getData(), 0, dp.getLength()));
		}
//		ds.close();
	}
}
