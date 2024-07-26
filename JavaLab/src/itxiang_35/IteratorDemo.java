package itxiang_35;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		//創建集合對象
		Collection<String> collection=new ArrayList<String>();
		
		//添加元素
		collection.add("Hello");
		collection.add("world");
		collection.add("Java");
		
		//Iterator<E> iterator():返回此集合˙中元素的迭代器,透過集合的iterator()方法得到
		Iterator<String> it = collection.iterator();
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		//用while循環改進判斷
		while(it.hasNext()) {
//			System.out.println(it.next());
			String s=it.next();
			System.out.println(s);
		}
		
	}

}
