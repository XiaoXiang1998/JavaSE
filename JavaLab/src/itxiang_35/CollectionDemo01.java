package itxiang_35;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {

	public static void main(String[] args) {
		//創建集合對象
		Collection<String> collection=new ArrayList<String>();
		
		//添加元素
//		System.out.println(collection.add("Hello"));
//		System.out.println(collection.add("world"));
//		System.out.println(collection.add("Hello"));
		collection.add("Hello");
		collection.add("world");
		collection.add("Java");
		
		//從集合中移除指定的元素
//		System.out.println(collection.remove("world"));
//		System.out.println(collection.remove("apple"));
		
		//清空集合中的元素
//		collection.clear();
		
		//判斷集合中是否存在指定的元素
//		System.out.println(collection.contains("Hello"));
//		System.out.println(collection.contains("Jvaee"));
		
		//集合的長度,也就是集合中元素的個數
		System.out.println(collection.size());
		
		//判斷集合是否為空
		System.out.println(collection.isEmpty());
		System.out.println(collection);
	}

}
