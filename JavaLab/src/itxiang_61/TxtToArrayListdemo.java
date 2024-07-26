package itxiang_61;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListdemo {
	public static void main(String[] args) throws IOException {
		// 創建字符緩衝輸入流對象
		BufferedReader br = new BufferedReader(new FileReader("C:\\JDBC\\etfData.csv"));

		// 創建集合對象
		ArrayList<String> arrayList = new ArrayList<String>();

		// 調用字符緩衝輸入流對象的方式的讀數據
		String line;
		while ((line = br.readLine()) != null) {
			// 把存儲到的字符串數據存儲到集合中
			arrayList.add(line);
		}
		arrayList.remove(0);
		// 釋放資源

		// 邊立即和
		for (String s : arrayList) {
			System.out.println(s);
		}

		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_61\\array.csv"));

		for (String s : arrayList) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
