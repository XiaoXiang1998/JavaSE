package itxiang_79;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 創建發送端的Socket對象(DatagramSocket)
		// DatagramSocket()構造數據報套接字並將其綁定到本地機上的任何可用端口
		DatagramSocket ds = new DatagramSocket();

		// 創建數據,並把數據打包
		// DatagramPacket(byte[] buf,int length,InetAddress address,int port)
		// 構造一個數據包,發送長度為length的數據包到指定主機上的指定端口號
		byte[] bys = "hello,udp,我來了".getBytes();
//		int length = bys.length;
//
//		InetAddress address = InetAddress.getByName("172.20.10.3");
//		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("172.20.10.3"), 10086);
		// 調用DatagramSocket()對象的 方法發送數據
		ds.send(dp);

		// 關閉發送端
		// void close() 關閉此數據報套接字
		ds.close();
	}

}
