package itxiang_60;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedWriterDemo02 {
	public static void main(String[] args) throws IOException {
		// 創建字符緩衝輸出流
//		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_60\\bw.txt2"));

		// 寫數據
//		for (int i = 0; i < 10; i++) {
//			bw.write("Hello" + i);
//			bw.newLine();
//		}
//
//		// 釋放資源
//		bw.close();

		// 創建字符緩衝輸入流
		BufferedReader br = new BufferedReader(new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_60\\bw.txt2"));

//		// public String readLine():讀一行文字
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

	}
}
