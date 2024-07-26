package itxiang_56;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		// 創建字節輸出流對象
		// FileOutputStream(String name):創建文件輸出流已指定的名稱寫入文件
		FileOutputStream fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56/fos.txt");

		/*
		 * 做了三件事情 A:調用系統功能創建了文件 B:創建了字節輸出流對象 C:讓字節輸出流對象指向創建好的文件
		 */
		// void write(int b): 將指定的字節寫入此文件輸出流
		fos.write(97);
//		fos.write(57);
//		fos.write(55);

		// void close():關閉此文件輸出流並釋放與此流相關聯的任何系統資源 最後都要釋放資源
		fos.close();
	}
}
