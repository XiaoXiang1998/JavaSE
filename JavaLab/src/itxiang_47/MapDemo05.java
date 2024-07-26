package itxiang_47;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo05 {
	public static void main(String[] args) {
		// 創建集合對象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素
		map.put("張無忌", "趙敏");
		map.put("郭靜", "黃蓉");
		map.put("楊過", "小龍女");

		// 獲取所有鍵值對象的集合
		Set<Map.Entry<String, String>> entrySet = map.entrySet();

		// 邊勵鍵值對象的集合,得到每一個鍵值對 對象
		for (Map.Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + "," + value);
		}

	}
}
