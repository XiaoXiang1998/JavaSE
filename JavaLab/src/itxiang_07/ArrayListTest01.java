package itxiang_07;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		//往集合中添加字符串對象
		list.add("劉政風");
		list.add("左冷禪");	
		list.add("風清揚");
		
		//邊勵集合,首先要能夠獲取集合中的每一個元素 這個通過get(int index)
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		for(int i=0;i<list.size();i++) {
			String s =list.get(i);
			System.out.println(s);
		}

	}

}
