package itxiang_47;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
	public static void main(String[] args) {
		// 創建集合對象
		Map<String, String> map = new HashMap<String, String>();

		// 將指定的值與該映射中的指定鍵相關聯
		map.put("001", "林青霞");
		map.put("002", "張曼玉");
		map.put("003", "王祖賢");
		map.put("003", "柳炎");

		// 輸出集合對象
		System.out.println(map);
	}
}
