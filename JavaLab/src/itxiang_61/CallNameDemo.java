package itxiang_61;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
	public static void main(String[] args) throws IOException {
		// 創建字符緩衝輸入流對象
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_61\\names.txt"));

		// 創建ArrayList集合對象
		ArrayList<String> array = new ArrayList<String>();

		// 調用字符緩衝輸入流的對象讀數據
		String line;
		while ((line = br.readLine()) != null) {
			// 把讀取到的數據存儲到集合裡面來
			array.add(line);
		}
		// 釋放資源:
		br.close();

		// 使用Random產生一個隨機數,隨機數的範圍在:[0,集合的長度]
		Random random = new Random();
		int index = random.nextInt(array.size());

		// 把第6步產生的隨機數作為索引到ArrayList集合中獲取值
		String name = array.get(index);

		// 輸出數據
		System.out.println("點到誰:" + name);
	}
}
