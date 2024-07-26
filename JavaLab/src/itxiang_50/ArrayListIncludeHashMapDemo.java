package itxiang_50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {

	public static void main(String[] args) {
		// 創建ArrayList集合
		ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();

		// 創建HashMap集合,並添加鍵值對元素
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("孫策", "大喬");
		map1.put("周瑜", "小喬");

		// 把HashMap作為元素添加到ArrayList集合
		arrayList.add(map1);

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("郭靜", "黃蓉");
		map2.put("楊過", "小龍女");
		// 把HashMap作為元素添加到ArrayList集合
		arrayList.add(map2);

		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("令狐沖", "任盈盈");
		map3.put("林平之", "岳靈珊");
		// 把HashMap作為元素添加到ArrayList集合
		arrayList.add(map3);

		// 邊勵ArrayList集合
		for (HashMap<String, String> hashMap : arrayList) {
			Set<String> keySet = hashMap.keySet();
			for (String key : keySet) {
				String value = hashMap.get(key);
				System.out.println(key + "," + value);
			}
		}

	}

}
