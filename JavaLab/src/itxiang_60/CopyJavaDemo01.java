package itxiang_60;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo01 {
	public static void main(String[] args) throws IOException {
		// 根據數據源創建字符緩衝輸入對象
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_60\\BufferedStreamDemo01.java"));

		// 根據目的地創建字符緩衝輸出對象
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_60\\abc.java"));

		char[] chs = new char[1024];
		int len;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}

		// 釋放資源
		bw.close();
		br.close();
	}
}
