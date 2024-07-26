package itxiang_39;

import java.util.TreeSet;

public class TreeSetDemo01 {

	public static void main(String[] args) {
		//創建集合對象
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//添加元素
		ts.add(10);
		ts.add(40);
		ts.add(30);
		ts.add(50);
		ts.add(20);
		ts.add(30);

		for (Integer integer : ts) {
			System.out.println(integer);
		}
		
	}

}
