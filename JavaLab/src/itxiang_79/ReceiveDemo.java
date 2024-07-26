package itxiang_79;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// 創建接收端的Socket對象(DatagramSocket)
		// DatagramSocket(int port)構造數據報套接字並將其綁定到本地主機上的指定端口
		DatagramSocket ds = new DatagramSocket(10086);
		// 創建數據,用於接受數據
		// DatagramPacket(byte[] buf,int length)構造一個DatagramPacket用於接收長度為Length的數據包
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// 調用DatagramSocket()對象的 方法接收數據
		ds.receive(dp);

		// 解析數據包,並把數據在控制台顯示
		// byte[] getData()返回數據緩衝區
//		byte[] datas = dp.getData();
		// int getLength()返回要發送的數據的長度或接受到的數據的長度
//		int len = dp.getLength();
//		String dataString = new String(datas, 0, len);
//		System.out.println("數據是:" + dataString);
		System.out.println("數據是:" + new String(dp.getData(), 0, dp.getLength()));
		// 關閉接收端
		ds.close();
	}
}
