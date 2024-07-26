package itxiang_48;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// 創建HashMap集合對象
		HashMap<String, Student> hm = new HashMap<String, Student>();

		hm.put("001", new Student("林青霞", 30));
		hm.put("002", new Student("張曼玉", 35));
		hm.put("003", new Student("王祖賢", 33));

		// 方式一:鍵找值
		Set<String> keySet = hm.keySet();

		for (String key : keySet) {
			Student value = hm.get(key);
			System.out.println(key + "," + value.getName() + "," + value.getAge());
		}
		System.out.println("-----------");

		Set<Entry<String, Student>> entrySet = hm.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key + "," + value.getName() + "," + value.getAge());

		}
	}

}
