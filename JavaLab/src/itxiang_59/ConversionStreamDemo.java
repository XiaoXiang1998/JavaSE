package itxiang_59;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConversionStreamDemo {
	public static void main(String[] args) throws IOException {
//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream("C:\\Javahometrain\\JavaLab\\\\src\\itxiang_58\\bos.txt"));
//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream("C:\\Javahometrain\\JavaLab\\\\src\\itxiang_58\\bos.txt"), "UTF-8");
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_58\\bos2.txt"), "GBK");
		osw.write("台灣好愛你");
		osw.close();

//		InputStreamReader isr = new InputStreamReader(
//				new FileInputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_58\\bos2.txt"));
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_58\\bos2.txt"), "GBK");

		// 一次讀取一個字符數據
		int ch;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}
		isr.close();
	}
}
