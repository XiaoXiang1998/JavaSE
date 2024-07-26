package itxiang_36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
	public static void main(String[] args) {
		//創建集合
		List<String> list=new ArrayList<String>();
		
		//添加元素
		list.add("Hello");
		list.add("world");
		list.add("java");
		list.add("world");

//		System.out.println(list);
		
		//迭代器的方式編立
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String string=iterator.next();
			System.out.println(string);
		}
	}
}
