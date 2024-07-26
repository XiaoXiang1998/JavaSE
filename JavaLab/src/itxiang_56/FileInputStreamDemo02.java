package itxiang_56;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		// 創建字節輸入流對象
		FileInputStream fis = new FileInputStream("C:\\JDBC\\etfData.csv");

		// 調用字節輸入流對象的讀數據方法
		// int read(byte[] b ):從該輸入流讀取最多 b.length個字節的數據到一個字節數組
		/*
		 * byte[] bys = new byte[5];
		 * 
		 * // 第一次讀取數據 int len = fis.read(bys); System.out.println(len); // String
		 * (byte[] bytes) // System.out.println(new String(bys)); System.out.println(new
		 * String(bys, 0, len));
		 * 
		 * // 第二次讀取數據
		 * 
		 * len = fis.read(bys); System.out.println(len); // String (byte[] bytes) //
		 * System.out.println(new String(bys)); System.out.println(new String(bys, 0,
		 * len));
		 * 
		 * // 第三次讀取數據
		 * 
		 * len = fis.read(bys); System.out.println(len); // String (byte[] bytes)
		 * System.out.println(new String(bys, 0, len));
		 */
		byte[] bys = new byte[1024]; // 1024極其整數倍
		int len;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		// 釋放資源
		fis.close();
	}
}
