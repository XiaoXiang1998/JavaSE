package itxiang_56;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		// 創建字節輸出流對象
		// FileOutputStream(String name):創建文件輸出流已指定的名稱寫入文件
		FileOutputStream fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56/fos2.txt");

		// FileOutputStream(File file):創建文件輸出流以寫入由指定的File對象表示的文件
//		File file = new File("C:\\\\Javahometrain\\\\JavaLab\\\\src\\\\itxiang_56/fos2.txt");
//		FileOutputStream fos2 = new FileOutputStream(file);
//		FileOutputStream fos2 = new FileOutputStream(
//				new File("C:\\\\Javahometrain\\\\JavaLab\\\\src\\\\itxiang_56/fos2.txt"));

		// void write(int b): 將指定的字節寫入此文件輸出流
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);
//		fos.write(100);
//		fos.write(101);

		// void write(byte[]b):將b.length字節從指定的字節數組寫入此文件輸出流
//		byte[] bys = { 97, 98, 99, 100, 101 };
		// byte[]getBytes():返回字符串對應的字節數組
		byte[] bytes = "abcde".getBytes();
//		fos.write(bytes);

		// void write(byte b,int off,int len):將len字節從指定的字節數組開始,從偏移量off開始寫入此文件輸出流
//		fos.write(bytes, 0, bytes.length);
		fos.write(bytes, 1, 3);
		// 釋放資源
		fos.close();

	}
}
