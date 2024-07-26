package itxiang_57;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferStreamDemo {
	public static void main(String[] args) throws IOException {
		// 字節緩衝輸出流
//		FileOutputStream fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\bin\\itxiang_57\\bos.txt");
//		BufferedOutputStream bos=new BufferedOutputStream(fos);
//		BufferedOutputStream bos = new BufferedOutputStream(
//				new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_57\\bos.txt"));
//		// 寫數據
//		bos.write("hello\r\n".getBytes());
//		bos.write("Hello\r\n".getBytes());
//
//		bos.close();

		// 字節緩衝輸入流
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_57\\bos.txt"));
		// 一次讀取一個字節數據
//		int by;
//		while ((by = bis.read()) != -1) {
//			System.out.print((char) by);
//		}

		// 一次讀取一個字節數組的數據
		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		bis.close();
	}
}
