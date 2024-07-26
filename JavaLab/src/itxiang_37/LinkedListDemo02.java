package itxiang_37;

import java.util.LinkedList;

public class LinkedListDemo02 {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
		
		//在該列表開頭插入指定的元素
//		linkedList.addFirst("javase");
		//將指定的元素追加到此列表的末尾
//		linkedList.addLast("javaee");
		
		//返回此列表中的第一個元素
		System.out.println(linkedList.getFirst());
		//返回此列表中的最後一個元素
		System.out.println(linkedList.getLast());
		
		
		//從此列表中刪除並返回第一個元素
		System.out.println(linkedList.removeFirst());
		
		//從此列表中刪除並返回最後一個元素
		System.out.println(linkedList.removeLast());

		System.out.println(linkedList);
	}
}
