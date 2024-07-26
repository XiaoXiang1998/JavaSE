package itxiang_37;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {
		//創建集合對象
		ArrayList<String> array=new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//邊勵
		for (String string : array) {
			System.out.println(string);
		}
		System.out.println("--------------");
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()) {
			String string=iterator.next();
			System.out.println(string);
		}
		System.out.println("--------------");

		for(int i=0;i<array.size();i++) {
			String string=array.get(i);
			System.out.println(string);
		}
		
		System.out.println("-----------");
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
		
		for (String string : linkedList) {
			System.out.println(string);
		}
		System.out.println("-----------");

		Iterator<String> iterator1 = linkedList.iterator();
		while(iterator1.hasNext()) {
			String string=iterator1.next();
			System.out.println(string);
		}
		System.out.println("--------------");

		for(int i=0;i<linkedList.size();i++) {
			String string=linkedList.get(i);
			System.out.println(string);
		}
		
		
	}
}
