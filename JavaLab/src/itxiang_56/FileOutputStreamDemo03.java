package itxiang_56;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
	public static void main(String[] args) throws IOException {
		// 創建字節輸出流對象
		// FileOutputStream(String name):創建文件輸出流已指定的名稱寫入文件
//		FileOutputStream fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56/fos.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56/fos.txt", true); // 追加寫入的意思
																													// 不覆蓋

		// 寫數據
		for (int i = 0; i < 10; i++) {
			fos.write("hello".getBytes());
			fos.write("\r\n".getBytes());
		}
		// 釋放資源
		fos.close();
	}
}
