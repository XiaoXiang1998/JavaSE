package itxiang_56;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTextDemo {
	public static void main(String[] args) throws IOException {
		// 根據數據源創建字節輸入流對象
//		FileInputStream fis = new FileInputStream("C:\\\\Javahometrain\\\\JavaLab\\\\src\\\\itxiang_56/fos.txt");
		FileInputStream fis = new FileInputStream("C:\\JDBC\\123.csv");

		// 根據目的地創建字節輸出流對象
		FileOutputStream fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56\\百里.csv");

		// 讀寫數據,複製文本文件(一次讀取一個字節,一次寫入一個字節)
		int by;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		// 釋放資源
		fos.close();
		fis.close();
	}
}
