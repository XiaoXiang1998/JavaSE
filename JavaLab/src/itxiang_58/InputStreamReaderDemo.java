package itxiang_58;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_58\\ConversionStreamDemo.java"));

		// int read():一次讀一個字符數據
//		int ch;
//		while ((ch = isr.read()) != -1) {
//			System.out.print((char) ch);
//		}

		char[] chs = new char[1024];
		int len;
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		// 釋放資源
		isr.close();
	}
}
