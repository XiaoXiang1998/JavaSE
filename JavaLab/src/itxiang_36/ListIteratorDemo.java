package itxiang_36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//通過List集合中的ListIterator()方法得到
//		ListIterator<String> listIterator = list.listIterator();
//		while(listIterator.hasNext()) {
//			String string=listIterator.next();
//			System.out.println(string);
//		}
//		
//		System.out.println("-------");
//		while(listIterator.hasPrevious()) {
//			String string=listIterator.previous();
//			System.out.println(string);
//		}
		
		//獲取列表迭代器
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			String s=listIterator.next();
			if(s.equals("world")) {
				listIterator.add("Javaee");
			}
		}
		System.out.println(list);
	}

}
