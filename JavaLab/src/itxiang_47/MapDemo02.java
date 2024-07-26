package itxiang_47;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
	public static void main(String[] args) {
		// 創建集合對象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素
		map.put("張無忌", "趙敏");
		map.put("郭靜", "黃蓉");
		map.put("楊過", "小龍女");

		// remove :根據鍵刪除鍵值對元素
//		System.out.println(map.remove("郭靜"));
//		System.out.println(map.remove("郭襄"));

		// clear:移除所有的鍵值對元素
//		map.clear();

		// containsKey :判斷集合是否包含指定的鍵
//		System.out.println(map.containsKey("郭靜"));
//		System.out.println(map.containsKey("郭襄"));

		// containsValue :判斷集合是否包含指定的值
//		System.out.println(map.containsValue("趙敏"));
//		System.out.println(map.containsValue("張無忌"));

//		System.out.println(map.isEmpty());

		// size:集合的長度
		System.out.println(map.size());

		// 輸出集合對象
		System.out.println(map);
	}
}
