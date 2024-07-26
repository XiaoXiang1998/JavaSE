package itxiang_56;

import java.io.FileInputStream;

public class FileInputStreamDemo01 {
	public static void main(String[] args) throws Exception {
		// 創建字節輸入流對象
		// FileInputStream(String name)
		FileInputStream fis = new FileInputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56/fos.txt");
//		FileInputStream fis = new FileInputStream("C:\\JDBC\\123.csv");

		// 調用字節輸入流對象的讀數據方法
		// int read():從該數入流讀取一個字節的數據
//		int by = fis.read();
//		System.out.println(by);
//		System.out.println((char) by);
//		
		// 如果達到文件的末尾 -1
//		int by = fis.read();
//		while (by != -1) {
//			System.out.print((char) by);
//			by = fis.read();
//		}

		// 優化上面的程序
		int by;
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}

		// 釋放資源
		fis.close();
	}
}
