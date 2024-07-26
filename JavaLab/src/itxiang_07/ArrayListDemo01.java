package itxiang_07;

import java.util.ArrayList;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		//public ArrayList():創建一個空的集合對象
		ArrayList<String> arrayList=new ArrayList<String>();
		//添加元素
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
		
		
		//刪除指定的元素,返回刪除是否成功
//		System.out.println(arrayList.remove("World"));
//		System.out.println(arrayList.remove("Javaee"));
		
		//刪除指定索引處的元素,返回被刪除的元素
//		System.out.println(arrayList.remove(1));
		
		//IndexOutOfBoundsException
//		System.out.println(arrayList.remove(3));
		
		//修改指定索引處的元素,返回被修改的元素
//		System.out.println(arrayList.set(1, "Javaeeee"));
		
		//IndexOutOfBoundsException
//		System.out.println(arrayList.set(3, "Javaeeee"));
		
		//返回指定索引處的元素
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(2));
		//IndexOutOfBoundsException
//		System.out.println(arrayList.get(3));
		
		//返回集合中的元素的個數
		System.out.println(arrayList.size());

		//輸出集合
		System.out.println("array:"+arrayList);
	}
}
