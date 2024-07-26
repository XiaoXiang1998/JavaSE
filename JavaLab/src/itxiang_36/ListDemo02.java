package itxiang_36;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {

	public static void main(String[] args) {
		//創建集合對象
		List<String> list=new ArrayList<String>();
		
		list.add("Hello");
		list.add("world");
		list.add("java");
		
		//在此集合中的指定位置插入指定元素
//		list.add(1,"javaee");
//		list.add(11,"javaee"); 異常 越界
		
		//刪除指定索引處的元素,返回被刪除的元素
//		System.out.println(list.remove(1));
		
		//E set(int index,E element):修改指定索引處的元素,返回被修改的元素
//		System.out.println(list.set(1, "javaee"));
			
		
		//返回指定索引處的元素
		System.out.println(list.get(1));
		
//		System.out.println(list);
		
		//邊勵集合
		for(int i=0;i<list.size();i++) {
			String string=list.get(i);
			System.out.println(string);
		}
			
	}

}
