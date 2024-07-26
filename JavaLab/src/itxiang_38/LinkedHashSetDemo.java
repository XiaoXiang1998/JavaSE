package itxiang_38;

import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//創建集合對象
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		
		//添加元素
		linkedHashSet.add("Hello");
		linkedHashSet.add("world");
		linkedHashSet.add("java");
		
		linkedHashSet.add("world");

		//邊勵集合
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
	}

}
