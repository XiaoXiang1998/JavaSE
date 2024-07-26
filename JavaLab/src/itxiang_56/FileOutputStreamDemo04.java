package itxiang_56;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
	public static void main(String[] args) {
		// 加入finally來釋放資源
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_56/fos.txt");
//			fos = new FileOutputStream("Z:\\Javahometrain\\JavaLab\\src\\itxiang_56/fos.txt");

			fos.write("Hello".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
