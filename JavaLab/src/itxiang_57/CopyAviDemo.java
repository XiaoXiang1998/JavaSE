package itxiang_57;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAviDemo {
	public static void main(String[] args) throws IOException {
		// 紀錄開始時間
		long startTime = System.currentTimeMillis();

		// 複製視頻
		method1();
		// 紀錄結束時間
		long endTime = System.currentTimeMillis();
		System.out.println("共耗時:" + (endTime - startTime) + "毫秒");

	}

	// 字節緩衝流一次讀寫一個字節數組
	public static void method1() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\video\\test.mp4"));

		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_57\\bos.mp4"));

		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bis.close();
		bos.close();
	}
}
