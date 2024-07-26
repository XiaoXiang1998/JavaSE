package itxiang_51;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		// 鍵盤錄入一個字符串
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個字符串:");
		String line = scanner.nextLine();

		// 創建HashMap集合,鍵是Character,值是Integer
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		// 邊勵字符串,得到每一個字符
		for (int i = 0; i < line.length(); i++) {
			char key = line.charAt(i);

			// 拿得到的每一個字符作為鍵到HashMap集合中去找到對應的值,看其返回值
			Integer value = map.get(key);

			if (value == null) {
				// 如果返回值是null,說明該字符在HashMap中集合不存在,就把該字符作為鍵,1作為儲存值
				map.put(key, 1);
			} else {
				// 如果返回值不是null,說明該字符在HashMap中集合存在,把該值加1,然後重新存儲該字符和對應的值
				value++;
				map.put(key, value);
			}
		}

		// 邊勵HashMap集合,得到鍵和值,按照要求進行拼接
		StringBuilder sb = new StringBuilder();

		Set<Character> keySet = map.keySet();
		for (Character key : keySet) {
			Integer value = map.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		String result = sb.toString();
		// 輸出結果
		System.out.println(result);
	}
}
