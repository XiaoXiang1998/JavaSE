package itxiang_60;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo02 {
	public static void main(String[] args) throws IOException {
		// 創建字符緩衝輸入流
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_60\\BufferedStreamDemo01.java"));
		// 根據目的地創建字符緩衝輸出對象
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_60\\abc.java"));

		// 讀寫數據,複製文件
		// 使用字符緩衝流特有功能實現
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 釋放資源
		bw.close();
		br.close();
	}
}
