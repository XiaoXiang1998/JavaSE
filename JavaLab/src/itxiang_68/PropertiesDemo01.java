package itxiang_68;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
	public static void main(String[] args) {
		// 創建集合對象
		Properties properties = new Properties();

		// 存儲元素
		properties.put("001", "林青霞");
		properties.put("002", "張曼玉");
		properties.put("003", "王祖賢");

		// 邊立即和
		Set<Object> keySet = properties.keySet();
		for (Object key : keySet) {

			Object value = properties.get(key);
			System.out.println(key + "," + value);
		}

		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "," + value);
		}

	}
}
