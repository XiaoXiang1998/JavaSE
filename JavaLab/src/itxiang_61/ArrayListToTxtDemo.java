package itxiang_61;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
	public static void main(String[] args) throws IOException {
		// 1.創建集合對象
		ArrayList<String> arrayList = new ArrayList<String>();

		// 往集合中存儲元素
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");

		// 創建字符緩衝輸出對象
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_61\\array.txt"));

		// 邊立集合,得到美一個字符串數據
		for (String s : arrayList) {
			// 調用字符緩衝輸出流對象的方法寫數據
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
