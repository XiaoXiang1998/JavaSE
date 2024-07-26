package itxiang_47;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {

	public static void main(String[] args) {
		// 創建集合對象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素
		map.put("張無忌", "趙敏");
		map.put("郭靜", "黃蓉");
		map.put("楊過", "小龍女");

		// 獲取所有鍵的集合 用keyset()方法實現
		Set<String> keySet = map.keySet();

		for (String key : keySet) {
			// 根據鍵去找值 用get(Object key)去實現
			String value = map.get(key);
			System.out.println(key + "," + value);
		}
	}

}
