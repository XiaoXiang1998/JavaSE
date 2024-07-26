package itxiang_56;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {

	public static void main(String[] args) throws IOException {
		// 根據數據源創建字節輸入流對象
		FileInputStream fis = new FileInputStream("D:\\images\\Satoru.jpg");

		// 根據目的地創建字節輸出流對象
		FileOutputStream fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56\\mn.jpg");

		// 讀寫數據,複製圖片(一次讀取一個字節數組,一次寫入一個字節數組)
		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		// 釋放資源
		fis.close();
		fos.close();
	}
}
