package itxiang_66;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyJavaDemo {
	public static void main(String[] args) throws IOException {
//		// 創建字符輸入流字符對象
//		BufferedReader br = new BufferedReader(
//				new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_66\\PrintStreamDemo.java"));
//
//		// 創建字符輸出流對象
//		BufferedWriter bw = new BufferedWriter(
//				new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_66\\Copy.java"));
//
//		// 讀寫數據,複製文件
//		String line;
//		while ((line = br.readLine()) != null) {
//			bw.write(line);
//			bw.newLine();
//			bw.flush();
//		}
//		bw.close();
//		br.close();
		// 創建字符輸入流字符對象
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_66\\PrintStreamDemo.java"));
		// 根據目的地創建字符輸出流對象
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_66\\Copy.java"),
				true);

		String line;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}
		pw.close();
		br.close();
	}
}
