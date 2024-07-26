package itxiang_59;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo02 {
	public static void main(String[] args) throws IOException {
		// 根據數據源創建字符輸入流對象
		FileReader fr = new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_59\\ConversionStreamDemo.java");

		// 根據目的地創建字符輸出流對象
		FileWriter fw = new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_59\\copy.java");

		// 讀寫數據,複製文件
//		int ch;
//		while ((ch = fr.read()) != -1) {
//			fw.write(ch);
//		}

		char[] chs = new char[1024];
		int len;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		fw.close();
		fr.close();
	}
}
