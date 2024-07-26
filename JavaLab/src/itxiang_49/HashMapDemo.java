package itxiang_49;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// 創建HashMap集合對象
		HashMap<Student, String> map = new HashMap<Student, String>();

		// 創建學生對象 添加到集合
		map.put(new Student("林青霞", 30), "台南");
		map.put(new Student("張曼玉", 35), "桃園");
		map.put(new Student("王祖賢", 33), "新竹");
		map.put(new Student("王祖賢", 33), "大阪");

		// 邊勵集合
		Set<Student> keySet = map.keySet();

		for (Student key : keySet) {

			String value = map.get(key);
			System.out.println(key.getName() + "," + key.getAge() + "," + value);
		}

		System.out.println("----------------");
		Set<Entry<Student, String>> entrySet = map.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			Student key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key.getName() + "," + key.getAge() + "," + value);
		}
	}

}
