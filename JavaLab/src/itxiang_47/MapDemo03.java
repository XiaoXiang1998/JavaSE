package itxiang_47;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo03 {
	public static void main(String[] args) {
		// 創建集合對象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素
		map.put("張無忌", "趙敏");
		map.put("郭靜", "黃蓉");
		map.put("楊過", "小龍女");

		// get:根據鍵獲取值
//		System.out.println(map.get("張無忌"));
//		System.out.println(map.get("張三封"));

		// Set<K> ketset():獲取所有鍵的集合
//		Set<String> keySet = map.keySet();
//
//		for (String string : keySet) {
//			System.out.println(string);
//		}

		// Collection<V> values():獲取所有值的集合
		Collection<String> values = map.values();

		for (String string : values) {
			System.out.println(string);
		}
	}
}
