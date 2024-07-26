package itxiang_50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		// 創建Hashmap集合
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// 創建ArrayList集合,並添加元素
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("諸葛亮");
		sgyy.add("趙雲");
		// 把ArrayList作為元素添加到HashMap集合
		hm.put("三國演義", sgyy);

		// 創建ArrayList集合,並添加元素
		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("唐僧");
		xyj.add("孫悟空");
		// 把ArrayList作為元素添加到HashMap集合
		hm.put("西遊記", xyj);
		// 創建ArrayList集合,並添加元素
		ArrayList<String> shz = new ArrayList<String>();
		shz.add("武松");
		shz.add("魯智深");
		// 把ArrayList作為元素添加到HashMap集合
		hm.put("水滸傳", shz);

		// 邊勵hashMap集合
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}

		}
	}
}
