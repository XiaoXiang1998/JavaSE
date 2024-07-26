package itxiang_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
	public static void main(String[] args) {
		// 創建集合對象
		List<Integer> list = new ArrayList<Integer>();

		// 添加元素
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);

		// 將指定的列表按升序排序
//		Collections.sort(list);
		// 反轉指定列表中元素的順序
//		Collections.reverse(list);

		// 使用默認的隨機源隨機排列指定的列表
		Collections.shuffle(list);

		System.out.println(list);
	}
}
