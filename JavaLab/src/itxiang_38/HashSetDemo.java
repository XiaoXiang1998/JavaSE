package itxiang_38;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		
		//添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
			
		hs.add("world");

		//邊勵
		for (String string : hs) {
			System.out.println(string);
		}
	}
}
