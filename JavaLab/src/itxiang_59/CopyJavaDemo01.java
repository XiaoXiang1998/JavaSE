package itxiang_59;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyJavaDemo01 {

	public static void main(String[] args) throws IOException {
		// 根據數據源創建字符輸入流對象
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_58\\ConversionStreamDemo.java"));

		// 根據目的地創建字符輸出流對象
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_59\\ConversionStreamDemo1.java"));

		// 讀寫數據,複製文件
		// 一次讀寫一個字符數據
//		int ch;
//		while ((ch = isr.read()) != -1) {
//			osw.write(ch);
//		}

		// 一次讀寫一個字符數組數據
		char[] chs = new char[1024];
		int ch;
		while ((ch = isr.read(chs)) != -1) {
			osw.write(chs, 0, ch);
		}

		osw.close();
		isr.close();
	}

}
